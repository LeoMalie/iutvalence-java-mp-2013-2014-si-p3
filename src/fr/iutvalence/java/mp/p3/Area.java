package fr.iutvalence.java.mp.p3;

/**
 * This class provides interactions for area An area is supposed to be an
 * array[][] :
 * 
 * (0.0)______ | | | | | | |_____|(SIZE_WIDTH,SIZE_HEIGHT)
 * 
 * @author maliel
 * 
 */
public class Area
{
    /**
     * Width size of the array[SIZE_WIDTH][].
     */
    public final static int SIZE_WIDTH = 10;

    /**
     * Height size of the array[][SIZE_HEIGHT].
     */
    public final static int SIZE_HEIGHT = 20;

    /**
     * Playfield
     */
    private AreaContent[][] road;

    /**
     * User car
     */
    private Car userCar;

    /**
     * Default area constructor. Create an array[width][height] of empty
     * squares.
     */
    public Area()
    {
        this.road = new AreaContent[SIZE_WIDTH][SIZE_HEIGHT];
        for (int x = 0; x < SIZE_WIDTH; x++)
        {
            for (int y = 0; y < SIZE_HEIGHT; y++)
                this.road[x][y] = AreaContent.EMPTY;
        }
        // Initialization user car
        this.userCar = new Car(true);
        changeContent(this.userCar.getPosition(), AreaContent.USER_CAR);
    }

    /**
     * This function provides to get the road
     * @return road
     */
    public AreaContent[][] getRoad()
    {
        return this.road;
    }
    
    /**
     * This method provides to change the value of a content
     * (EMPTY/USERCAR/BOTCAR)
     * 
     * @param pos
     *            the content position this function use
     * @param s
     *            the new content that this function have to put in the square
     */
    public void changeContent(Position pos, AreaContent s)
    {
        this.road[pos.getX()][pos.getY()] = s;
    }

    /**
     * This function provides to get the kind of a square(x,y) in the road
     * according to
     * 
     * @param x
     *            line value
     * @param y
     *            column value
     * @return Content in (EMPTY/USER_CAR/BOT_CAR)
     */
    public AreaContent getContent(int x, int y)
    {
        return this.road[x][y];
    }

    /**
     * This function provides to stock the road of the current area in a String
     * square by square. For each end of line, the function adds '\n' to have a
     * correct display of the road if needed to print it
     * 
     * @return String representing each squares of the road
     */
    @Override
    public String toString()
    {
        String testArea = "TEST ZONE DE JEU \n";
        for (int y = 0; y < SIZE_HEIGHT; y++)
        {
            for (int x = 0; x < SIZE_WIDTH; x++)
            {
                switch (this.getContent(x, y))
                {
                case USER_CAR:
                    testArea = testArea + "V";
                    break;
                case BOT_CAR:
                    testArea = testArea + "T";
                    break;
                case EMPTY:
                    testArea = testArea + ".";
                    break;
                default:
                    testArea = testArea + "?";
                    break;
                }
            }
            testArea = testArea + "\n";
        }
        testArea = testArea + "\0";
        return testArea;
    }
}
