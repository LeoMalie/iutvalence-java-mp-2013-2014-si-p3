package fr.iutvalence.java.mp.p3;

/**
 * This class provides to define a position (couple of integer values)
 * X is horizontal value
 * Y is vertical value
 * @author maliel
 */
public class Position
{

    /**
     * Horizontal value
     */
    private final int x;
    
    /**
     * Vertical value
     */
    private final int y;
    
    /**
     * Default constructor, initialize a position (0,0)
     */
    public Position()
    {
        this.x = 0;
        this.y = 0;
    }
    
    /**
     * Constructor with position values (x,y)
     * @param x horizontal value
     * @param y vertical value
     */
    public Position(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    /**
     * @return the vertical position X
     */
    public int getX()
    {
        return this.x;
    }
    
    /**
     * @return the horizontal position Y
     */
    public int getY()
    {
        return this.y;
    }
}
