package com.miet.springbootserver.model;


public class User {
  private String userName;
  private int id;
  private String address;

  public User(String userName, int id, String address) {
    this.userName = userName;
    this.id = id;
    this.address = address;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "User{" +
        "userName='" + userName + '\'' +
        ", id=" + id +
        ", address='" + address + '\'' +
        '}';
  }
}
