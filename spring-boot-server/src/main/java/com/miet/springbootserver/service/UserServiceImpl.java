package com.miet.springbootserver.service;

import com.miet.springbootserver.model.User;
import com.miet.springbootserver.model.UserInfo;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  // This is like in memory cache / in-memory database
  public static Map<Integer, User> users = new HashMap<>();

  @Override
  public UserInfo createUser(User user) {
    saveUser(user);
    int id = user.getId();
    UserInfo userInfo = new UserInfo(id, "User is created");
    return userInfo;
  }

  @Override
  public User getUser(int id) {
    User user = users.get(id);
    return user;
  }

  @Override
  public UserInfo updateUser(int id, String name) {

    //Todo
    // Check given id is existing in in-memory db
    // If yes, the pull that record
    // Update name in user object
    // save user in in-memory db
    // return user id

    User user = users.get(id);

    if(user != null){
      user.setUserName(name);
      users.put(id, user);
      return new UserInfo(id, "User is updated");
    } else {
      return new UserInfo(id, "Id is not found");
    }
  }

  private void saveUser(User user) {
    users.put(user.getId(), user);
  }
}
