package com.example.functions.cleancode;

/**
 * Notes -
 * 1 - Small function
 * 2- Do one thing in single function
 * 3- Avoid side effect
 * 4- Pass at most 2 arguments
 * 5- Do not write more than 10-15 lines in single function
 * 6- Command and query separation
 * 7- Avoid switch statement
 * 8- Proper exception handling
 */
public class UserValidation {

  public boolean initializeSession(){
    try {
      boolean isValid = checkPassword("test","test");
      if(isValid){
        //Session.initialize();
        return true;
      }
    } catch (Exception e){
      System.out.println("Exception => " + e);
    }
    return false;
  }

  private boolean checkPassword(String userName, String password) {
    if (userName != null) {
      if (userName.equals("test") && password.equals("test")) {
        return true;
      }
    }
    return false;
  }
}
