package com.miet.springbootserver.controller;

import com.miet.springbootserver.model.User;
import com.miet.springbootserver.model.UserInfo;
import com.miet.springbootserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "users")
public class UserController {
  @Autowired
  private UserService userService;

  //  @PostMapping(path="users", consumes = MediaType.APPLICATION_JSON_VALUE)
//  public String create(@RequestBody User newUser){
//    System.out.println(newUser);
//    return newUser.getUserName();
//  }

//  @PostMapping(path="users", consumes = MediaType.APPLICATION_JSON_VALUE)
//  @ResponseStatus(code = HttpStatus.CREATED)
//  public User create(@RequestBody User newUser){
//    System.out.println(newUser);
//    return newUser;
//  }

//  @PostMapping(path="users", consumes = MediaType.APPLICATION_JSON_VALUE)
//  @ResponseStatus(code = HttpStatus.CREATED)
//  @ResponseBody
//  public UserInfo create(@RequestBody User newUser){
//    UserService userService = new UserServiceImpl();
//    UserInfo userInfo = userService.createUser(newUser);
//    return userInfo;
//  }

  @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
  @ResponseStatus(code = HttpStatus.CREATED)
  @ResponseBody
  public UserInfo create(@RequestBody User newUser){
    UserInfo userInfo = userService.createUser(newUser);
    return userInfo;
  }

  @GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
  @ResponseStatus(code = HttpStatus.OK)
  @ResponseBody
  public User getUser(@RequestParam int id){
    User user = userService.getUser(id);
    return user;
  }

  @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
  @ResponseStatus(code = HttpStatus.OK)
  @ResponseBody
  public UserInfo updateUser(@RequestParam int id, @RequestBody User user){

    UserInfo userInfo = userService.updateUser(id, user.getUserName());
    return userInfo;
  }

}
