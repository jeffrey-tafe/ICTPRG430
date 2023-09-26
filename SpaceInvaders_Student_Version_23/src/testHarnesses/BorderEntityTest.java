/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testHarnesses;

import model.BorderEntity;

public class BorderEntityTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("\n\nTest no arg constructor | border1");
        BorderEntity border1 = new BorderEntity();
        System.out.println("border1 " + border1);
        
        
        System.out.println("\n\nTest setters and getters | border1");
        border1.setId("123456");
        border1.setWidth(50);
        border1.setHeight(1);
        System.out.println("id: " + border1.getId());
        System.out.println("width: " + border1.getWidth());
        System.out.println("height: " + border1.getHeight());
        
        
        System.out.println("\n\nTest id only constructor | border2");
        BorderEntity border2 = new BorderEntity("789");
        System.out.println("border2 " + border2);
        
         
        System.out.println("\n\nTest id, width, height constructor | border3");
        BorderEntity border3 = new BorderEntity("001", 25, 2);
        System.out.println("border3 " + border3);
        
        
        System.out.println("\n\nTest xPos, yPos, width, height constructor | border4");
        BorderEntity border4 = new BorderEntity(10, 10, 30, 3);
        System.out.println("border4 " + border4);
        
        
        System.out.println("\n\nTest all arg constructor (id, xPos, yPos, width, height) | border5");
        BorderEntity border5 = new BorderEntity("007", 20, 15, 30, 3);
        System.out.println("border5 " + border5);
    }

}
