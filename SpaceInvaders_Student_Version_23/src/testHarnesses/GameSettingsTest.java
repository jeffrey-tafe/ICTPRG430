
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testHarnesses;

import model.GameSettings;

public class GameSettingsTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Test no arg constructor
        System.out.println("Testing No Arg Constructor gameSettings1");
        GameSettings gameSettings1 = new GameSettings();
        System.out.println("gameSettings1 " + gameSettings1);

        // Test setters and getters
        System.out.println("\nTesting setters and getters");
        gameSettings1.setMoveSpeed(400);
        gameSettings1.setFiringInterval(500);

        System.out.println("moveSpeed = " + gameSettings1.getMoveSpeed());
        System.out.println("firingInterval = " + gameSettings1.getFiringInterval());

        // Test all arg constructor
        System.out.println("\nTesting All Arg Constructor gameSettings2");
        GameSettings gameSettings2 = new GameSettings(400, 800);
        System.out.println("gameSettings2 " + gameSettings2);

        // Test equality
        GameSettings gameSettings3 = new GameSettings(400, 500);
        GameSettings gameSettings4 = new GameSettings(300, 700);

        System.out.println(gameSettings1.equals(gameSettings2)); // Should be false
        System.out.println(gameSettings1.equals(gameSettings3)); // Should be true
        System.out.println(gameSettings2.equals(gameSettings4)); // Should be false
    }

}
