package fr.iutvalence.java.mp.p3;

// TODO FIXED comment is not understandable
/**
 * This class provides operations with a car
 * @author maliel
 *
 */
// TODO Create constructor for enemy car
public class Car
{
    /**
     * Width size of the array[SIZEWIDTH][].
     */
    private final static int SIZEWIDTH = 10;
    
    /**
     * Height size of the array[][SIZEHEIGHT].
     */
    private final static int SIZEHEIGHT = 20;  
    
    /**
     * Player car value
     */
    public static final int PLAYER = 1;
    
    /**
     * Enemy car value
     */
    public static final int ENEMY = 2;
    
    /**
     * Value for a destroyed car
     */
    public static final boolean DEAD = false;
    
    /**
     * Value for an "alive" car
     */
    public static final boolean ALIVE = true;
    
    /**
     * Car position
     */
    private Position position;
    
    /**
     * Car type (USERCAR/BOTCAR)
     */
    private Square typeCar;
    
    /**
     * State car value (DEAD/ALIVE)
     */
    private boolean stateCar;
    
    /**
     * Provides to create an USERCAR
     */
    public Car()
    {
        this.stateCar = ALIVE;
        this.position = new Position(SIZEWIDTH / 2, SIZEHEIGHT - 1);
        this.typeCar = Square.USERCAR;
    }
    
    /**
     * @return car position
     */
    public Position getPos()
    {
        return this.position;
    }
    
    /**
     * @return car state
     */
    public boolean getState()
    {
        return this.stateCar;
    }
    
    /**
     * @return car type
     */
    public Square getType()
    {
        return this.typeCar;
    }
    
    /**
     * Destroy a car (ALIVE to DEAD)
     */
    public void destroyCar()
    {
        this.stateCar = DEAD;
    }    
}
