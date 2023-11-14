package model;

/**
 * <p>
 * Title: Collection of Entity objects</p>
 * <p>
 * Description: Organises for a collection of entities that we want to treat as a group. Acts as a farcade for the
 * collection of entities but adds functionality applicable to all entities in the list, such as Move</p>
 * <p>
 * Copyright: Copyright (c) 2004</p>
 * <p>
 * Company: TAFE SA</p>
 *
 * @author Santi Ruiz
 * @author Julie Ruiz
 * @author Jeffrey Smith
 * @version 1.0 - Initial Version
 * @version 2.0 - Changed collision checking to use new version of Entity Collision check
 */
import java.awt.Graphics2D;
import model.events.EntityDiedEvent;
import model.events.EntityEventListener;
import model.events.EntityHitEvent;
import model.events.EntityMoveEvent;

/**
 *
 * @author sruiz
 */
public class EntityListArray implements EntityListInterface, EntityEventListener {

    /**
     * set constant MAX_SIZE 100
     */
    public static final int MAX_SIZE = 100;

    /**
     * The entities in the array. Make it protected to allow sub-classes access but no one else.
     */
    protected Entity[] entities;
    /**
     * The entities to be removed on next game cycle
     */
    protected Entity[] removeEntities;

    /**
     * The number of entities in the entities array
     */
    protected int numEntities;

    /**
     * The number of entities in the removeEntities array
     */
    protected int numRemoveEntities;

    /**
     * Sets up the array entities and removeEntities of MAX_SIZE set numEntities to 0
     *
     */
    public EntityListArray() {
        this.entities = new Entity[MAX_SIZE];
        this.removeEntities = new Entity[MAX_SIZE];
        this.numEntities = 0;
    }

    /**
     * Clear the array by creating a new array of entities and removeEntities
     */
    @Override
    public void clear() {
        this.entities = new Entity[MAX_SIZE];
        this.removeEntities = new Entity[MAX_SIZE];
        this.numEntities = 0;
    }

    /**
     * Add an entity
     *
     * @param e the entity to be added to the array increase the number of entities
     */
    @Override
    public void add(Entity e) {

        // Insert new entity at numEntities place then increment count
        this.entities[this.numEntities] = e;
        this.numEntities++;

        // We make sure the array gets told about events on each of its entities
        e.addEntityEventListener(this);
    }

    /**
     * Increase the speed of all members of the array by a certain percentage
     *
     * @param percentIncr as whole number
     */
    @Override
    public void increaseSpeed(int percentIncr) {
        //loop through each entity in the array entities and
        //Increase the speed of all members of the array by percentIncr
        //using setHorizontalMovement and setVerticalMovement

        for (int i = 0; i < this.numEntities; i++) {

            // If space is empty, skip to next loop iteration
            if (entities[i] == null) {
                continue;
            }

            // Create shorthand reference to entity
            Entity e = entities[i];

            // Get old speeds
            double oldSpeedX = e.getHorizontalMovement();
            double oldSpeedY = e.getVerticalMovement();

            // Get new speeds
            double newSpeedX = oldSpeedX + (oldSpeedX * (percentIncr / 100));
            double newSpeedY = oldSpeedY + (oldSpeedY * (percentIncr / 100));

            // Set updated speeds
            e.setHorizontalMovement(newSpeedX);
            e.setVerticalMovement(newSpeedY);
        }

    }

    /**
     * Move all entities in the array according to time passed delta using updateState
     *
     * @param delta Time passed since last updateState (ms)
     */
    @Override
    public void updateState(long delta) {
        //loop through each entity in the array entities and updateState
        for (int i = 0; i < this.numEntities; i++) {
            // Call the updatState method from the entity class
            this.entities[i].updateState(delta);
        }

        // If an entity needs to be removed from the array
        // then it would have been added to the removeEntities array and now needs to be removed.
        // Loop through each entity in the removeEntities array and remove the entity from the current
        // EntitListArray object by calling this.remove
        for (int i = 0; i < this.numRemoveEntities; i++) {
            // Call the updatState method from the entity class
            this.remove(this.removeEntities[i]);
        }
        
        // clear the removeEntities array by creating a new array of removeEntities
        this.removeEntities = new Entity[MAX_SIZE];
        this.numRemoveEntities = 0;

    }

    /**
     * draw all entities in the array using draw
     *
     * @param g The graphics context to draw to
     */
    @Override
    public void draw(Graphics2D g) {
        //loop through each entity in the array entities and draw
        for (int i = 0; i < this.numEntities; i++) {
            // Call the draw method from the entity class
            this.entities[i].draw(g);
        }
    }

    /**
     *
     * @param delta Time passed since last updateState (ms)
     * @param g The graphics context to draw to
     */
    @Override
    public void moveAndDraw(long delta, Graphics2D g) {
        //loop through each entity in the array entities and updateState and draw

        // Iterate through entity array
        for (int i = 0; i < this.numEntities; i++) {
            // Update the entity state
            this.entities[i].updateState(delta);

            // Call the draw method from the entity class
            this.entities[i].draw(g);
        }
    }

    /**
     * Check if this entity collides with any entity in this entity array.
     *
     * @param other The entity to check collision against
     * @return null if there is no collision, return the entity if there is a collision
     */
    @Override
    public Entity collidesWith(Entity other) {

        //loop through each entity in the array entities
        //if one of the entities in the list collides with the entity 'other'
        //return the entity it collides with.
        //Note: need to make use of the Entity class collidesWith method
        // Iterate through entity array
        for (int i = 0; i < this.numEntities; i++) {
            if (entities[i].collidesWith(other)) {
                return entities[i];
            }
        }

        return null;
    }

    /**
     * Manage event listener registration
     *
     * @param l the listener to add
     */
    @Override
    public void addEntityEventListener(EntityEventListener l) {

        //loop through each entity in the array entities and addEntityEventListener l
        for (int i = 0; i < this.numEntities; i++) {
            entities[i].addEntityEventListener(l);
        }
    }

    /**
     * Remove an entity from the array
     *
     * @param e The entity to remove
     */
    @Override
    public void remove(Entity e) {
        //create a newArray of Entity
        Entity[] newArray = new Entity[MAX_SIZE];
        //count the numNewEntries
        int newNumEntities = 0;

        //The approach is to create a new array with all the entitiies from the existing array except for the one
        //that we want to remove (e). Once this new array is created then we replace the old array with the new one.
        //Hence we have a new version with e removed.
        //loop through each entity in the array entities
        //if the entity is not equal to e then add the entity to the newArray
        //and increment numNewEntries
        for (int i = 0; i < this.numEntities; i++) {
            if(!this.entities[i].equals(e)) {
                newArray[newNumEntities] = this.entities[i];
                newNumEntities++;
            }
        }
        
        //set the entities array to the newArray
        //set numEntities to newNumEntities
        this.entities = newArray;
        this.numEntities = newNumEntities;
    }

    /**
     * Number of entities
     *
     * @return numEntities
     */
    @Override
    public int getNumEntities() {

        return numEntities;
    }

    /**
     * if there are no entities in the list return null return one of the entities in the array - choosing it randomly
     *
     * @return Entity
     */
    @Override
    public Entity getRandom() {

        //if there are no entities in the list return null
        if (this.entities[0] == null) {
            return null;
        } //generate a random integer by rounding Math.random() * (this.numEntities - 1)
        else {
            double random = Math.random() * (this.numEntities - 1);
            int index = (int) random;
            return this.entities[index];
        }

    }

    /*
        Registers an entity for removal next time the state of the list is updated
     */

    /**
     *
     * @param e
     */

    public void registerEntityForRemoval(Entity e) {
        removeEntities[numRemoveEntities] = e;
        numRemoveEntities++;
    }

    // Entity Event Handling Methods
    // By default no Action is taken by the array for entity events

    /**
     *
     * @param e
     */
    @Override
    public void collisionHasOccured(EntityHitEvent e) {
    }

    /**
     *
     * @param e
     */
    @Override
    public void entityMoved(EntityMoveEvent e) {
    }

    /**
     *
     * @param e
     */
    @Override
    public void entityDied(EntityDiedEvent e) {
        this.remove((Entity) e.getSource());
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        String result = "";
        result = super.toString() + ", NumEntities = " + this.numEntities + ", NumRemoveEntities = " + this.numRemoveEntities;
        result = result + "\nEntites:";
        for (int i = 0; i < numEntities; i++) {
            result = result + "\n" + this.entities[i];
        }
        result = result + "\nRemoveEntities:";
        for (int i = 0; i < numRemoveEntities; i++) {
            result = result + "\n" + this.removeEntities[i];
        }
        return result;
    }
}
