/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.session05;

/**
 *
 * @author jeffs
 */
public class EngineTest {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Test no arg constructor
    System.out.println("Testing No Arg Constructor engine1");
    Engine engine1 = new Engine();
    System.out.println("engine1 " + engine1);

    // Test setters and getters
    System.out.println("\nTesting setters and getters");
    engine1.setEngineDescription("V6 Turbo");
    engine1.setPower(300.0);
    System.out.println("engineDescription = " + engine1.getEngineDescription());
    System.out.println("power = " + engine1.getPower());

    // Test all arg constructor
    System.out.println("\nTesting All Arg Constructor engine2");
    Engine engine2 = new Engine("V8 Supercharged", 500.0);
    System.out.println("engine2 " + engine2);
  }

}
