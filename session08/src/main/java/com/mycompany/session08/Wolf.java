/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.session08;

/**
 *
 * @author jeffs
 */
public class Wolf extends Canine {

  public Wolf() {
    System.out.println("Wolf created");
  }

  @Override
  public String makeNoise() {
    return "howl";
  }
}
