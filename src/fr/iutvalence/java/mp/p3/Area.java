package fr.iutvalence.java.mp.p3;

//TODO (fix) comment is not understandable
/**
 * This class provides to operate Area
 * An area is supposed to be an array[][] :
 * ______
 * |     |
 * |     |
 * |     |
 * |_____|
 * 
 * @author maliel
 *
 */
public class Area
{
    // TODO (fix) clarify what is "value of an area")
    // TODO (fix) constant name does not comply to naming conventions 
    /**
     * Maximum value for an area (also default value).
     */
    private final static int sizeMax = 100;
    
    /**
     * Current value for the area.
     */
    private final int size;
    
    /**
     * Default area constructor (with sizeMax).
     * Create an array[sizeMax/2][sizeMax] of empty squares.
     */
    public Area()
    {
        //TODO Define square state (EMPTY, USERCAR, CAR), it should be an enum (class SquareArea ?)
        //TODO Create an array[sizeMax/2][sizeMax]
    }
    
    /**
     * Area constructor with a custom size.
     * @param customSize custom size
     */
    public Area(int customSize)
    {
        //TODO Create an array[customSize/2][customSize]
    }
    
    /**
     * This function gets the size of current Area (private declaration for size)
     * @return size of Area.
     */
    public int getSize()
    {
       return this.size;
    }
    
}
