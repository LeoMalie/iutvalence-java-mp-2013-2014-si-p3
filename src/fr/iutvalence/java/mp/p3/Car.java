package fr.iutvalence.java.mp.p3;

// TODO FIXED comment is not understandable
/**
 * This class provides operations with a car
 * @author maliel
 *
 */
public class Car
{
    /**
     * Horizontal position of the car
     */
    private int positionX;
    
    /**
     * Vertical position of the car
     */
    private int positionY;
    
    /**
     * moveCarX provides to get the new position of the car
     * @param d direction given by the player
     * @return new positionX for the car
     */
    public int moveCarX(Direction d)
    {
        switch(d)
        {
           case LEFT : 
               this.positionX = this.positionX - 1;
           case RIGHT :
               this.positionX = this.positionX + 1;
           default :
               break;
        }
        return this.positionX;     
    }
    
    /**
     * moveCarY provides to get the new position of an enemy car. No parameters
     * because the movement is automatic.
     * @return new positionY for the car
     */
    public int moveCarY()
    {
        this.positionY = this.positionY + 1;
        return this.positionY;
    }
}
