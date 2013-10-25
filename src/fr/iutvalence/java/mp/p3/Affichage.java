package fr.iutvalence.java.mp.p3;

/**
 * This class provides to display the score and the road
 * @author maliel
 *
 */
public class Affichage
{
    /**
     * Score display
     * @param Score score to display
     */
    public void afficherScore(int Score)
    {
        System.out.println(Score);
    }
   
    /**
     * Area display
     * @param Area road to display
     */
    public void afficherZone(AreaContent[][] Area)
    {
        String testArea = "TEST ZONE DE JEU \n";
        for (int y = 0; y < 20; y++)
        {
            for (int x = 0; x < 10; x++)
            {
                switch (Area[x][y])
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
