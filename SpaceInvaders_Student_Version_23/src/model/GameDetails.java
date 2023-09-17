package model;

import dao.GameDetailsDAOText;
import java.io.Serializable;
import java.sql.SQLException;

/**
 * <p>
 * The details for one game, including the user playing, the game settings the scoring (shots fired, ships destroyed,
 * score and previous high score)
 * </p>
 * <p>
 * Company: TAFE SA</p>
 *
 * @author Santi Ruiz
 * @author Julie Ruiz
 * @author Jeffrey Smith
 * @version 1.0 Initial version
 * @version 2.0 Updated to improve setting of highscore
 */
public class GameDetails implements Serializable {

    //constants
    public static final int POINTS_GAINED_FOR_SHIP_DESTROYED = 100;
    public static final int POINTS_LOST_FOR_WASTED_SHOT = 50;

    //instance variables
    private UserDetails userDetails;
    private GameSettings gameSettings;
    private int highScore;
    private int score;
    private int shipsDestroyed;
    private int shotsFired;
    private boolean newHighScore;

    //only 2 constructors required
    /**
     *  no arg constructor
     * @throws Exception
     */
    public GameDetails() throws Exception {
        //TODO
        this(new UserDetails(), new GameSettings());
    }

    /**
     * all args constructor
     * Calls resetTheScoringDetails to set local variables
     * @param user
     * @param gameSettings
     * @throws Exception
     */
    public GameDetails(UserDetails user, GameSettings gameSettings) throws Exception {

        //TODO
        this.userDetails = user;
        this.gameSettings = gameSettings;
        resetTheScoringDetails();

    }

    //Getters and Setters
    //TODO

    /**
     *
     * @return UserDetails
     */
    public UserDetails getUserDetails() {
        return this.userDetails;
    }

    /**
     * setUserDetails
     * @param userDetails
     */
    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    /**
     * 
     * @return GameSettings
     */
    public GameSettings getGameSettings() {
        return this.gameSettings;
    }

    /**
     * setGameSettings
     * @param gameSettings
     */
    public void setGameSettings(GameSettings gameSettings) {
        this.gameSettings = gameSettings;
    }

    /**
     * getHighScore
     * @return highScore
     */
    public int getHighScore() {
        return this.highScore;
    }

    /**
     * setHighScore
     * @param highScore
     */
    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }

    /**
     * getScore
     * @return score
     */
    public int getScore() {
        return this.score;
    }

    /**
     * setScore
     * @param score
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * getShipsDestroyed
     * @return shipsDestroyed
     */
    public int getShipsDestroyed() {
        return this.shipsDestroyed;
    }

    /**
     * setShipsDestroyed
     * @param shipsDestroyed
     */
    public void setShipsDestroyed(int shipsDestroyed) {
        this.shipsDestroyed = shipsDestroyed;
    }

    /**
     * getShotsFired
     * @return shotsFired
     */
    public int getShotsFired() {
        return this.shotsFired;
    }

    /**
     * setShotsFired
     * @param shotsFired
     */
    public void setShotsFired(int shotsFired) {
        this.shotsFired = shotsFired;
    }

    /**
     * 
     * @return newHighScore
     */
    public boolean isNewHighScore() {
        return this.newHighScore;
    }

    /**
     * setNewHighScore
     * @param newHighScore
     */
    public void setNewHighScore(boolean newHighScore) {
        this.newHighScore = newHighScore;
    }

    //toString method

    /**
     *
     * @return string output of object contents
     */
    @Override
    //TODO
    public String toString() {
        StringBuilder sb = new StringBuilder();
        //TODO
        sb.append(super.toString());
        sb.append("\n[");
        sb.append("\n\t");
        sb.append("userDetails: ");
        sb.append(this.userDetails);
        sb.append("\n\t");
        sb.append("gameSettings: ");
        sb.append(this.gameSettings);
        sb.append("\n\t");
        sb.append("highScore: ");
        sb.append(this.highScore);
        sb.append("\n\t");
        sb.append("score: ");
        sb.append(this.score);
        sb.append("\n\t");
        sb.append("shipsDestroyed: ");
        sb.append(this.shipsDestroyed);
        sb.append("\n\t");
        sb.append("shotsFired: ");
        sb.append(this.shotsFired);
        sb.append("\n\t");
        sb.append("newHighScore: ");
        sb.append(this.newHighScore);
        return sb.toString();
    }

    //equals method

    /**
     * Determines equality based on UserDetails and GameSettings
     * @param obj
     * @return boolean
     */
    @Override
    public boolean equals(Object obj) {
        //objects are equal if equal userDetails and gameSettings objects
        boolean result = false;

        //TODO
        // If input object is not a GameDetails object, return false
        if (!(obj instanceof GameDetails)) {
            return false;
        }

        GameDetails gameDetails = (GameDetails) obj;

        // Calls the equals override methods on game settings and user details
        // to verify if they equal
        result = gameDetails.getGameSettings().equals(this.getGameSettings())
            && gameDetails.getUserDetails().equals(this.getUserDetails());

        return result;
    }

    /**
     *
     * @return
     */
    public int calculateScoreChanges() {

        //missedShots = shotsFired - shipsDestroyed
        int missedShots = this.shotsFired - this.shipsDestroyed;

        //currentScore = shipsDestroyed*POINTS - missedShots*POINTS
        int currentScore = (this.shipsDestroyed * POINTS_GAINED_FOR_SHIP_DESTROYED)
            - (missedShots * POINTS_LOST_FOR_WASTED_SHOT);

        //set score to currentScore
        this.score = currentScore;

        // check if it's a new high score
        if (this.score > this.highScore) {
            /**
     *
     * @throws Exception
     */
    /**
     *
     * @throws Exception
     */
    newHighScore = true;
            this.highScore = this.score;
        } else {
            newHighScore = false;
        }

        //return currentScore, set to 0 if currentScore negative
        if (currentScore < 0) {
            currentScore = 0;
        }
        return currentScore;
    }

    public final void resetTheScoringDetails() throws Exception {
        GameDetailsDAOText.saveHighScore(this);
        //reset newHighScore flag
        newHighScore = false;

        // reset score, shipsDestroyed, shotsFired to 0
        this.score = 0;
        this.shipsDestroyed = 0;
        this.shotsFired = 0;

        //Load the previous high score for this user for these settings
        //If there is an error then set highscore to 0 and continue
        try {
            GameDetailsDAOText.loadHighScore(this);
        } catch (Exception ex) {
            this.highScore = 0;
        }
    }

    public void saveData() throws Exception {
        GameDetailsDAOText.saveData(this);
    }

    public void loadData() throws Exception {
        GameDetailsDAOText.loadData(this);
    }
}
