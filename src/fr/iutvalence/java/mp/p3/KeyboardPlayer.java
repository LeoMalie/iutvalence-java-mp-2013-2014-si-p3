package fr.iutvalence.java.mp.p3;

import java.util.Scanner;

/**
 * This class provides interactions with a movement (a horizontal direction :
 * LEFT/RIGHT/FIXED) from the player
 * 
 * @author maliel
 * 
 */

public class KeyboardPlayer implements Player
{
    /**
     * Keyboard entry for left movement
     */
    public final static int LEFT = 4;
    
    /**
     * Keyboard entry for right movement
     */
    public final static int RIGHT = 6;

    /**
     * This function provides to get a direction enter by the user keyboard char
     * "4" for a left movement, char "6" for a right movement if other values,
     * the function return FIXED (= no movement)
     * 
     * @return direction
     */
    @Override
    public Direction getDirection()
    {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice)
        {
        case LEFT :
            sc.close();
            return Direction.LEFT;
        case RIGHT :
            sc.close();
            return Direction.RIGHT;
        default:
            sc.close();
            return Direction.FIXED;
        }
    }
}
