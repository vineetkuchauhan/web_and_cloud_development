package com.miet.springbootserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/servers")
public class ServerController {
  /***
   * This end point is only for reading some information
   * @param name
   * @return
   */
  @GetMapping(value = "/info", consumes = "text/plain", produces = "text/plain")
  public String getInfo(@RequestParam(value="name", defaultValue = "linux") String name){
    return String.format("Hello %s!", name);
  }

  @PostMapping(value = "/info", consumes = "application/json")
  public String postInfo(@RequestParam(value="name", defaultValue = "linux") String name,
      @RequestBody String userName){
    System.out.println(userName);
    return String.format("Hello %s!", name);
  }
}
