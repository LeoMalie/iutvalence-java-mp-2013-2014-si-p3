package fr.iutvalence.java.mp.p3;

/**
 * Test class for a ASCII display of the game
 * 
 * @author maliel
 * 
 */
public class AsciiDisplay implements Display
{
    /**
     * Score display
     * 
     * @param score
     *            score to display
     */
    public void displayScore(int score)
    {
        System.out.println(score);
    }

    /**
     * Area display
     * 
     * @param area
     *            road to display
     */
    public void displayArea(AreaContent[][] area)
    {
        String testArea = "TEST ZONE DE JEU \n";
        for (int y = 0; y < 20; y++)
        {
            for (int x = 0; x < 10; x++)
            {
                switch (area[x][y])
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
        System.out.println(testArea);
    }
}
