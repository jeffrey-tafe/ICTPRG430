/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.session09;

/**
 *
 * @author jeffs
 */
public class StaticMethodDemo {

    public static void swap(int num1, int num2) {
        int temp;
        System.out.println("in method swap int BEFORE swapping num1=" + num1 + " num2=" + num2);
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("in method swap int AFTER swapping num1=" + num1 + " num2=" + num2);
    }

    public static void swap(double num1, double num2) {
        double temp;
        System.out.println("in method swap double BEFORE num1=" + num1 + " num2=" + num2);
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("in method swap double AFTER num1=" + num1 + " num2=" + num2);
    }
}
