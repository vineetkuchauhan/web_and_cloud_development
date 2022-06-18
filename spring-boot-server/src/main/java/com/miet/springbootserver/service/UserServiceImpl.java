package com.miet.springbootserver.service;

import com.miet.springbootserver.model.User;
import com.miet.springbootserver.model.UserInfo;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Override
  public UserInfo createUser(User user) {
    System.out.println(user);
    int id = user.getId();
    UserInfo userInfo = new UserInfo(id);
    return userInfo;
  }
}
