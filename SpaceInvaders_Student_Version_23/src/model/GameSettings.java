package model;

import dao.GameSettingsDAOText;
import java.io.Serializable;
import java.sql.SQLException;

/**
 * <p>
 * Title: GameSettings</p>
 * <p>
 * Description: Stores data and methods for the game's settings</p>
 * <p>
 * Copyright: Copyright (c) 2005</p>
 * <p>
 * Company: TAFE SA</p>
 *
 * @author Santi Ruiz
 * @author Julie Ruiz
 * @author Jeffrey Smith
 * @version 1.0
 */
public class GameSettings implements Serializable {

    public static final double MOVE_SPEED = 300;
    public static final int FIRING_INTERVAL = 700;

    // Instance variables
    private double moveSpeed;
    private int firingInterval;

    /**
     * All argument constructor
     * @param moveSpeed
     * @param firingInterval
     */
    public GameSettings(double moveSpeed, int firingInterval) {
        this.moveSpeed = moveSpeed;
        this.firingInterval = firingInterval;
    }

    /**
     *  No argument constructor
     */
    public GameSettings() {
        this(MOVE_SPEED, FIRING_INTERVAL);
    }

    /**
     *  Get Move Speed
     * @return
     */
    public double getMoveSpeed() {
        return moveSpeed;
    }

    /**
     *  Set Move Speed
     * @param moveSpeed
     */
    public void setMoveSpeed(double moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    /**
     * Get Firing Interval
     * @return
     */
    public int getFiringInterval() {
        return firingInterval;
    }

    /**
     * Set Firing Interval
     * @param firingInterval
     */
    public void setFiringInterval(int firingInterval) {
        this.firingInterval = firingInterval;
    }

    /**
     * To String override
     * @return string containing object fields and values
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\n[");
        sb.append("\n\tmoveSpeed: ");
        sb.append(this.moveSpeed);
        sb.append("\n\tfiringInterval: ");
        sb.append(this.firingInterval);
        sb.append("\n]");
        return sb.toString();
    }

    /**
     * Test for object equality based on moveSpeed and firingInterval
     * @param o : Object to test against
     * @return boolean indicating if input object is equal to this object
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof GameSettings)) {
            return false;
        }
        GameSettings gameSettings = (GameSettings) o;
        return gameSettings.getMoveSpeed() == this.getMoveSpeed()
            && gameSettings.getFiringInterval() == this.getFiringInterval();
    }

    /**
     *
     * @param user
     * @throws Exception
     */
    public void saveData(UserDetails user) throws Exception {
        GameSettingsDAOText.saveData(user, this);
    }

    /**
     *
     * @param user
     * @throws Exception
     */
    public void loadData(UserDetails user) throws Exception {
        GameSettingsDAOText.loadData(user, this);
    }
}
