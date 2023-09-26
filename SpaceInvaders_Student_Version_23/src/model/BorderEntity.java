package model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 * Entity of the game which is a Border. Borders will have IDs so that we can query which border we are working with.
 * Extends Entity class with width, height and border id
 *
 * @author sruiz
 * @author jruiz
 * @author Jeffrey Smith
 * @version 1.0 initial version
 * @version 2.0 updated to get better consistency in the order of parameters
 *
 */
public class BorderEntity extends Entity {

    //constants
    public static final int DEFAULT_WIDTH = 0;
    public static final int DEFAULT_HEIGHT = 0;
    public static final String DEFAULT_ID = "None";

    //instance variables
    private int width;
    private int height;
    private String id;

    /**
     * no args constructor
     */
    public BorderEntity() {
        this(DEFAULT_ID);
    }

    /**
     *  id only constructor
     * @param id : String
     */
    public BorderEntity(String id) {
        this(id, DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }

    /**
     *  id, width and height constructor
     * @param id : String
     * @param width : int
     * @param height : int
     */
    public BorderEntity(String id, int width, int height) {
        this(id, DEF_X, DEF_Y, width, height);
    }

    /**
     * xPos, yPos, width and height constructor
     * @param initalXPos : int
     * @param initialYPos : int
     * @param width : int
     * @param height : int
     */
    public BorderEntity(int initalXPos, int initialYPos, int width, int height) {
        this(DEFAULT_ID, initalXPos, initialYPos, width, height);
    }

    /**
     * all args constructor
     * @param id : String
     * @param initalXPos : int
     * @param initialYPos : int
     * @param width : int
     * @param height : int
     */
    public BorderEntity(String id, int initalXPos, int initialYPos, int width, int height) {
        super(DEF_REF_TO_SPRITE_IMAGE_FILE, initalXPos, initialYPos);
        this.id = id;
        this.width = width;
        this.height = height;
    }

    //Getters and Setters

    /**
     * getWidth
     * @return width : int
     */
    public int getWidth() {
        return this.width;
    }

    /**
     * setWidth
     * @param width : int
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * getHeight
     * @return height : int
     */
    public int getHeight() {
        return this.height;
    }

    /**
     * setHeight
     * @param height : int
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * getId
     * @return id : int
     */
    public String getId() {
        return this.id;
    }

    /**
     * setId
     * @param id : int
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * toString Override
     * @return
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\n[");
        sb.append("\n\t");
        sb.append("ID: ");
        sb.append(this.id);
        sb.append("\n\t");
        sb.append("Width: ");
        sb.append(this.width);
        sb.append("\n\t");
        sb.append("Height: ");
        sb.append(this.height);
        sb.append("\n]");

        return sb.toString();
    }

    /**
     * Define the area of the Entity to use for collision detection. This default uses the location and size of sprite.
     *
     * @return the Rectangle this border covers
     */
    @Override
    protected Rectangle collisionArea() {
        return new Rectangle(this.getX(), this.getY(), this.width, this.height);
    }

    /**
     *
     * @param g
     */
    @Override
    public void draw(Graphics g) {

        g.setColor(Color.red);
        g.fillRect(this.getX(), this.getY(), width, height);
        g.drawRect(this.getX(), this.getY(), width, height);
    }

}
