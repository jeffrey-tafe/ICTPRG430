/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testHarnesses;

import java.sql.SQLException;
import model.GameDetails;
import model.UserDetails;
import model.GameSettings;

public class GameDetailsTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, Exception {

        //TODO
        System.out.println("\nTesting no arg constructor");
        GameDetails gd1 = new GameDetails();
        System.out.println(gd1);

        System.out.println("\nTesting setters and getters");
        UserDetails user1 = new UserDetails("julie.ruiz", "I<3Java");
        GameSettings gameSet1 = new GameSettings(500, 2000);
        gd1.setUserDetails(user1);
        gd1.setGameSettings(gameSet1);
        gd1.setHighScore(123456789);
        gd1.setNewHighScore(true);
        gd1.setScore(123456789);
        gd1.setShipsDestroyed(54);
        gd1.setShotsFired(700);
        
        System.out.println("UserDetails: " + gd1.getUserDetails());
        System.out.println("GameSettings: " + gd1.getGameSettings());
        System.out.println("highScore: " + gd1.getHighScore());
        System.out.println("score: " + gd1.getScore());
        System.out.println("shipsDestroyed: " + gd1.getShipsDestroyed());
        System.out.println("shotsFired: " + gd1.getShotsFired());
        System.out.println("isNewHighScore: " + gd1.isNewHighScore());
        
        System.out.println("\nTesting two arg constructor");
        UserDetails user2 = new UserDetails("jeffrey.smith", "JavaHurtsMyHead");
        GameSettings gameSet2 = new GameSettings(700, 1500);
        GameDetails gd2 = new GameDetails(user2, gameSet2);
        System.out.println(gd2);
        
        System.out.println("\nTesting Equality");
        
        GameDetails gd3 = new GameDetails();
        GameDetails gd4 = new GameDetails();
        
        UserDetails user3 = new UserDetails("jeffrey.smith", "JavaHurtsMyHead");
        UserDetails user4 = new UserDetails("jeffrey.smith", "JavaHurtsMyHead");
        GameSettings gameSet3 = new GameSettings(700, 1500);
        GameSettings gameSet4 = new GameSettings(700, 1600);
        GameDetails gd5 = new GameDetails(user3, gameSet3);
        GameDetails gd6 = new GameDetails(user4, gameSet4);
        
        System.out.println("Expected False: " + gd1.equals(gd2));
        System.out.println("Expected True: " + gd3.equals(gd4));
        System.out.println("Expected False: " + gd5.equals(gd6));
    }

}
