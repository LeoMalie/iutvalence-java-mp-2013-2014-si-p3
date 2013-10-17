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
 *      |_____|(SIZE_WIDTH,SIZE_HEIGHT)
 * 
 * @author maliel
 *
 */
public class Area
{
    // TODO FIXED clarify what is "value of an area")
    // TODO FIXED constant name does not comply to naming conventions 
    /**
     * Width size of the array[SIZE_WIDTH][].
     */
    private final static int SIZE_WIDTH = 10;
    
    /**
     * Height size of the array[][SIZE_HEIGHT].
     */
    private final static int SIZE_HEIGHT = 20;  
    
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
        this.road = new Square[SIZE_WIDTH][SIZE_HEIGHT];
        for(int x = 0; x < SIZE_WIDTH; x++ )
        {
         for(int y = 0; y < SIZE_HEIGHT; y++)
             this.road[x][y] = Square.EMPTY;
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
    
    /**
     * This function provides to get the kind of a square(x,y) in the road
     * according to
     * @param x line value
     * @param y column value
     * @return Square in (EMPTY/USER_CAR/BOT_CAR)
     */
    public Square getKindSquare(int x, int y)
    {
        return this.road[x][y];
    }
    
    /**
     * This function provides to scroll the road 
     * Line + 1 <-- line
     * @exception UserBotCrashException if we have 2 values for 1 square
     */
    public void scrollRoad() throws UserBotCrashException
    {       
        int indiceLigne = SIZE_HEIGHT - 1;
        int indiceColonne = 0;
        for (int i = 0; i < SIZE_WIDTH; i++)
        {
            if (this.road[i][indiceLigne] == Square.BOT_CAR)
                this.road[i][indiceLigne] = Square.EMPTY;
        }
        indiceLigne--;
        while (indiceLigne >= 0)
        {
            while (indiceColonne < SIZE_WIDTH)
            {
                if (this.road[indiceColonne][indiceLigne] == Square.BOT_CAR)
                {
                    try
                    {
                        switch(this.road[indiceColonne][indiceLigne + 1])
                        {
                            case EMPTY :  
                                this.road[indiceColonne][indiceLigne + 1] = this.road[indiceColonne][indiceLigne];
                                this.road[indiceColonne][indiceLigne] = Square.EMPTY;
                                break;
                            case BOT_CAR :
                                this.road[indiceColonne][indiceLigne] = Square.EMPTY;
                                break;
                            case USER_CAR :
                                throw new UserBotCrashException();
                        }
                    }
                    catch (UserBotCrashException e){}
                }
                indiceColonne++;
            }
            indiceColonne = 0;
            indiceLigne--;
        }
    }

    /**
     * This function provides to stock the road of the current area in a 
     * String square by square. For each end of line, the function adds '\n'
     * to have a correct display of the road if needed to print it
     * @return String representing each squares of the road
     */
    @Override
    public String toString()
    {
        String testArea = "TEST ZONE DE JEU \n";
        for(int y = 0; y < SIZE_HEIGHT; y++)
        {
            for(int x = 0; x < SIZE_WIDTH; x++)
            {
                switch(this.getKindSquare(x,y)) 
                {
                    case USER_CAR : testArea = testArea + "V"; break;
                    case BOT_CAR : testArea = testArea + "T"; break;
                    case EMPTY : testArea = testArea + "."; break;
                }  
            }
            testArea = testArea + "\n";
        }
        testArea = testArea + "\0";
        return testArea;
    }
    
    
}
