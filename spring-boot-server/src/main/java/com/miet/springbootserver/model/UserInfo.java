package com.miet.springbootserver.model;

public class UserInfo {

  private int id;

  public UserInfo(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "UserInfo{" +
        "id=" + id +
        '}';
  }
}
