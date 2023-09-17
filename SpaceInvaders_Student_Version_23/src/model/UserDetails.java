package model;

import dao.UserDetailsDAOText;
import java.io.Serializable;
import java.sql.SQLException;

/**
 * <p>
 * Title: UserDetails</p>
 * <p>
 * Description: contains data and methods for user details</p>
 * <p>
 * Copyright: Copyright (c) 2006</p>
 * <p>
 * Company: TAFE SA</p>
 *
 * @author Santi Ruiz
 * @author Julie Ruiz
 * @author Jeffrrey Smith
 * @version 2.0
 *
 */
public class UserDetails implements Serializable {

    public static final String DEFAULT_USERNAME = "NO NAME";
    public static final String DEFAULT_PASSWORD = null;
    public static final boolean DEFAULT_INFO = true;

    // Instance Variables
    private String userName;
    private String password;
    private boolean wantingIntroInfo;


    /**
     * All args constructor
     * @param userName
     * @param password
     * @param wantingIntroInfo
     */
    public UserDetails(String userName, String password, boolean wantingIntroInfo) {
        this.userName = userName;
        this.password = password;
        this.wantingIntroInfo = wantingIntroInfo;
    }

    /**
     * Username and password constructor
     * @param userName
     * @param password
     */
    public UserDetails(String userName, String password) {
        this(userName, password, DEFAULT_INFO);
    }

    /**
     * Username only constructor
     * @param userName
     */
    public UserDetails(String userName) {
        this(userName, DEFAULT_PASSWORD, DEFAULT_INFO);
    }

    /**
     * No args constructor
     */
    public UserDetails() {
        this(DEFAULT_USERNAME, DEFAULT_PASSWORD, DEFAULT_INFO);
    }

    /**
     * Get username
     * @return username
     */
    public String getUserName() {
        return userName;
    }

    /**
     * set Username
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Get password
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set password
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Is wantingIntroInfo
     * @return wantingIntroInfo
     */
    public boolean isWantingIntroInfo() {
        return wantingIntroInfo;
    }

    /**
     * Set wantingIntroInfo
     * @param wantingIntroInfo
     */
    public void setWantingIntroInfo(boolean wantingIntroInfo) {
        this.wantingIntroInfo = wantingIntroInfo;
    }


    /**
     * toString method for debugging
     * @return
     */
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\n[");
        sb.append("\n\tuserName: ");
        sb.append(this.userName);
        sb.append("\n\tpassword: ");
        sb.append(this.password);
        sb.append("\n\twantingIntroInfo: ");
        sb.append(this.wantingIntroInfo);
        sb.append("\n]");
        return sb.toString();

    }

    
    /**
     * Testing if the input object is the same as this object using username
     * @param o Object
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof UserDetails)) {
            return false;
        }
        UserDetails userDetails = (UserDetails) o;
        return userDetails.getUserName().equals(this.getUserName());
    }

    /**
     * saveData
     *
     * @throws SQLException
     */
    public void saveData() throws Exception {
        UserDetailsDAOText.saveData(this);
    }

    /**
     * loadData
     *
     * @throws SQLException
     */
    public void loadData() throws Exception {
        UserDetailsDAOText.loadData(this);
    }

}
