package com.example.functions.cleancode;

public class TestSession {

  public static void main(String[] args) {
    UserValidation userValidation = new UserValidation();
    boolean response = userValidation.initializeSession();
    System.out.println("User is validated = " + response);
  }
}
