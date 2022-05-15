package com.example.functions.cleancode.commandquery;

public class UserManagement {
  public void createUser(User user){
    //TODO: Create user in db
  }

  public User getUser(){
    return new User("Jone", "Dave", "US", 123456789);
  }
}
