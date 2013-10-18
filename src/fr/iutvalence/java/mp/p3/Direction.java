package fr.iutvalence.java.mp.p3;

/**
 * Enum of the different representations of a direction
 * @author maliel
 *
 */
public enum Direction
{
    /**
     * left movement 
     */
    LEFT,
    
    /** 
     * right movement
     */
    RIGHT,
    
    /**
     * no move
     */
    FIXED;
    
    /**
     * This function provides to get a random direction
     * @return a random direction
     */
    public static Direction getRandomDirection()
    { 
        switch(1 + (int)(Math.random() * 3))
        {
            case 1 :
                return Direction.LEFT;
            case 2 :
                return Direction.RIGHT;
            default :
                return Direction.FIXED;
        }
    }
}
