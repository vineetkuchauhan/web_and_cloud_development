package com.miet.soapdemo.endpoint;

import com.miet.soap_demo.GetUserRequest;
import com.miet.soap_demo.GetUserResponse;
import com.miet.soapdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class UserEndPoint {

  @Autowired
  private UserService userService;

  @PayloadRoot(namespace = "http://miet.com/soap-demo", localPart = "getUserRequest")
  @ResponsePayload
  public GetUserResponse getUserResponse(@RequestPayload GetUserRequest request){
    GetUserResponse response = new GetUserResponse();
    response.setUser(userService.getUsers(request.getName()));
    return response;
  }
}
