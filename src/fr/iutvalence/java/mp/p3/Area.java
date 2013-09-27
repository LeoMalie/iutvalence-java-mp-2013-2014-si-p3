package fr.iutvalence.java.mp.p3;

//TODO FIXED comment is not understandable
/**
 * This class provides interactions for area
 * An area is supposed to be an array[][] :
 * 
 *  (0.0)______
 *      |     |
 *      |     |
 *      |     |
 *      |_____|(SIZEWIDTH,SIZEHEIGHT)
 * 
 * @author maliel
 *
 */
public class Area
{
    // TODO FIXED clarify what is "value of an area")
    // TODO FIXED constant name does not comply to naming conventions 
    /**
     * Width size of the array[SIZEWIDTH][].
     */
    private final static int SIZEWIDTH = 10;
    
    /**
     * Height size of the array[][SIZEHEIGHT].
     */
    private final static int SIZEHEIGHT = 20;  
    
    /**
     * Playfield
     */
    private Square[][] road;
    
    /**
     * Default area constructor.
     * Create an array[width][height] of empty squares.
     */
    public Area()
    {
        Square[][] road = new Square[SIZEWIDTH][SIZEHEIGHT];
        for(int x = 0; x < (road.length); x++ )
        {
         for(int y = 0; y < road[y].length; y++)
             road[x][y] = Square.EMPTY;
        }
    } 
    
    /**
     * This method provides to change the value of a square (EMPTY/USERCAR/BOTCAR)
     * @param pos the square position that this function use
     * @param s the new state that this function have to put in the square
     */
    public void changeSquare(Position pos, Square s)
    {
        this.road[pos.getX()][pos.getY()] = s;
    }
}
