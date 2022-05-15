package com.example.functions.cleancode.commandquery;

public class User {

  private String firstName;
  private String lastName;
  private String address;
  private Integer mobileNumber;

  public User(String firstName, String lastName, String address, Integer mobileNumber) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.mobileNumber = mobileNumber;
  }

  @Override
  public String toString() {
    return "User{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", address='" + address + '\'' +
        ", mobileNumber=" + mobileNumber +
        '}';
  }
}
