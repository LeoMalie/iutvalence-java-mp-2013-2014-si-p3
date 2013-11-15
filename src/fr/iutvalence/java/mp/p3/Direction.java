package fr.iutvalence.java.mp.p3;

import java.util.Random;

/**
 * Enum of the different representations of a direction
 * 
 * @author maliel
 * 
 */
public enum Direction
{
    /**
     * left movement
     */
    LEFT(-1),

    /**
     * right movement
     */
    RIGHT(1),

    /**
     * no move
     */
    FIXED(0);

    /**
     * Horizontal shift value
     */
    private final int horizontalShiftValue;

    /**
     * Internal constructor
     * @param horizontalShitValue
     *            horizontal shift value
     */
    Direction(int horizontalShitValue)
    {
        this.horizontalShiftValue = horizontalShitValue;
    }

    /**
     * This function provides to get the value according to the content
     * 
     * @return horizontal shift value
     */
    public int getHorizontalShiftValue()
    {
        return this.horizontalShiftValue;
    } 

    /**
     * This function provides to get a random direction
     * 
     * @return a random direction
     */
    public static Direction getRandomDirection()
    {
        // TODO FIXED use values() method to rewrite this one 
        // without necessarily knowing exactly what constants are defined
        
        return Direction.values()[new Random().nextInt(Direction.values().length)];
        
    }
}
