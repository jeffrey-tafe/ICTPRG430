package com.mycompany.session08;


public class AddressTest {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    // Test no arg constructor
    System.out.println("Testing No Arg Constructior address1");
    Address address1 = new Address();
    System.out.println("address1 " + address1);

    // Test setters and getters
    System.out.println("\nTesting setters and getters");
    address1.setStreetNumber("30");
    address1.setStreetName("Tindall");
    address1.setSuburb("Enfield");
    address1.setState("SA");
    address1.setCountry("Australia");
    address1.setPostCode("5085");

    System.out.println("streetNumber = " + address1.getStreetNumber());
    System.out.println("streetName = " + address1.getStreetName());
    System.out.println("suburb = " + address1.getSuburb());
    System.out.println("state = " + address1.getState());
    System.out.println("country = " + address1.getCountry());
    System.out.println("postCode = " + address1.getPostCode());

    // Test all arg constructor
    System.out.println("\nTesting All Arg Constructor book2");
    Address address2 = new Address(
            "15", "Carlton Crescent", "Pennington", "SA", "Australia", "5008");
    System.out.println("Address2 " + address2);

  }

}
