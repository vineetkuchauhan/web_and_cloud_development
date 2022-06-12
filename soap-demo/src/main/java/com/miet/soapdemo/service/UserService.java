package com.miet.soapdemo.service;

import com.miet.soap_demo.User;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class UserService {
  private static final Map<String, User> users = new HashMap<>();

  @PostConstruct
  public void initialize() {

    User user1 = new User();
    user1.setName("Peter");
    user1.setEmpId(1111);
    user1.setSalary(12000);
    user1.setPhone(987282323);

    User user2 = new User();
    user2.setName("Sam");
    user2.setEmpId(1223);
    user2.setSalary(32100);
    user2.setPhone(772228848);

    User user3 = new User();
    user3.setName("Jared");
    user3.setEmpId(12356);
    user3.setSalary(52000);

    users.put(user1.getName(), user1);
    users.put(user2.getName(), user2);
    users.put(user3.getName(), user3);
  }

  public User getUsers(String name) {
    return users.get(name);
  }
}
