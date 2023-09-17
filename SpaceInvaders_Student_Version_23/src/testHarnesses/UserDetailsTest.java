package testHarnesses;

import model.UserDetails;

public class UserDetailsTest {

    public static void main(String[] args) {
        // Test no arg constructor
        System.out.println("Testing No Arg Constructor userDetails1");
        UserDetails userDetails1 = new UserDetails();
        System.out.println("userDetails1 " + userDetails1);

        // Test setters and getters
        System.out.println("\nTesting setters and getters");
        userDetails1.setUserName("john.doe");
        userDetails1.setPassword("password123");
        userDetails1.setWantingIntroInfo(false);

        System.out.println("userName = " + userDetails1.getUserName());
        System.out.println("password = " + userDetails1.getPassword());
        System.out.println("wantingIntroInfo = " + userDetails1.isWantingIntroInfo());

        // Test all arg constructor
        System.out.println("\nTesting All Arg Constructor userDetails2");
        UserDetails userDetails2 = new UserDetails(
            "jane.doe", "secret123", true);
        System.out.println("userDetails2 " + userDetails2);

        // Test username only constructor
        System.out.println("\nTesting username only constructor (1 arg)");
        UserDetails userDetails3 = new UserDetails("john.doe");

        // Test usename and password constructor
        UserDetails userDetails4 = new UserDetails(
            "jane.doe", "secret345");

        System.out.println(userDetails1.equals(userDetails2)); // Should be false
        System.out.println(userDetails1.equals(userDetails3)); // Should be true
        System.out.println(userDetails2.equals(userDetails4)); // Should be true
    }
}
