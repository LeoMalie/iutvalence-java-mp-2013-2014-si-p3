package fr.iutvalence.java.mp.p3;

/**
 * This class provides to define a position (couple of integer values) X is
 * horizontal value Y is vertical value
 * 
 * @author maliel
 */
public class Position
{

    /**
     * Horizontal value
     */
    private int x;

    /**
     * Vertical value
     */
    private int y;

    /**
     * Default constructor, initialize a position (0,0)
     */
    public Position()
    {
        this.x = 0;
        this.y = 0;
    }

    /**
     * Constructor with only one value (used for moveUserCar())
     * 
     * @param x
     *            horizontal value
     */
    public Position(int x)
    {
        this.x = x;
        this.y = 0;
    }

    /**
     * Constructor with position values (x,y)
     * 
     * @param x
     *            horizontal value
     * @param y
     *            vertical value
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

    /**
     * This function provides to get the new player position according to the
     * direction chosen by the user
     * 
     * @param d
     *            (FIXED/RIGHT/LEFT) used to actualize player position
     * @return new user car position
     */
    public Position translateTo(Direction d)
    {
        int decallage = 0;
        switch (d)
        {
        case FIXED:
            decallage = 0;
            break;
        case RIGHT:
            decallage = 1;
            break;
        case LEFT:
            decallage = -1;
            break;
        }
        if (this.x + decallage <= Area.SIZE_WIDTH - 1 && this.x + decallage >= 0)
            this.x += decallage;
        return (new Position(this.x, 0));
    }

}
