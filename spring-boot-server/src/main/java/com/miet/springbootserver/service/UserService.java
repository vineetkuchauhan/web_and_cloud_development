package com.miet.springbootserver.service;

import com.miet.springbootserver.model.User;
import com.miet.springbootserver.model.UserInfo;

public interface UserService {
  public UserInfo createUser(User user);
}
