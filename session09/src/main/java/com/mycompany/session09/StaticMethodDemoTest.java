/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.session09;

/**
 *
 * @author jeffs
 */
public class StaticMethodDemoTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 1;
        System.out.println("In main n1=" + n1 + " n2=" + n2);
        StaticMethodDemo.swap(n1, n2);
        System.out.println("In main n1=" + n1 + " n2=" + n2);
        double n3 = 2.5;
        double n4 = 10.3;
        System.out.println("In main n1=" + n3 + " n2=" + n4);
        StaticMethodDemo.swap(n3, n4);
        System.out.println("In main n1=" + n3 + " n2=" + n4);
    }

}
