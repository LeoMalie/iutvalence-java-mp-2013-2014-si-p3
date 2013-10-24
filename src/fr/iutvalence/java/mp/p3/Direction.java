package fr.iutvalence.java.mp.p3;

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
     * Deplacement horinzontal value
     */
    private final int valueDeplacement;

    /**
     * @param valueDeplacement
     *            deplacement horizontal value
     */
    Direction(int valueDeplacement)
    {
        this.valueDeplacement = valueDeplacement;
    }

    /**
     * This function provides to get the value according to the content
     * 
     * @return deplacement horizontal value
     */
    public int getValue()
    {
        return this.valueDeplacement;
    }

    /**
     * This function provides to get a random direction
     * 
     * @return a random direction
     */
    public static Direction getRandomDirection()
    {
        switch (1 + (int) (Math.random() * 3))
        {
        case 1:
            return Direction.LEFT;
        case 2:
            return Direction.RIGHT;
        default:
            return Direction.FIXED;
        }
    }
}
