package com.example.functions.cleancode.commandquery;

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

public class TestUser {

  public static void main(String[] args) {

    User user = new User("Jone", "Dave", "US", 123456789); // Object will created without any parameter

    UserManagement userManagement = new UserManagement();

    //Command and query are mixed
    // User userDetais = userManagement.createUser(user);

    //command
    userManagement.createUser(user); // Create a user

    //query
    User userDetails = userManagement.getUser(); // Get user details

    System.out.println("User details are = " + userDetails);

//    user.updateUser(); // Update user details
//    user.deleteUser(); // Delete user details*/

  }
}
