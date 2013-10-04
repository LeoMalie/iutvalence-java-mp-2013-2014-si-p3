package fr.iutvalence.java.mp.p3;

import java.util.Scanner;

// TODO FIXED detail comment (what is a movement?)
/**
 * This class provides interactions with a movement (a horizontal direction : LEFT/RIGHT/FIXED) from the player
 * @author maliel
 *
 */
public class Player
{
    // TODO (fix) comply with naming conventions   
    /**
     * Current player username.
     */
    private String playerUsername;
     
    // TODO (fix) detail comment
    /**
     * Constructor for a define player
     * @param userName chosen by the user
     */
    public Player(String userName)
    {
        this.playerUsername = userName;
    }
    
    // TODO (fix) fix comment
    /**
     * this function provides to get a direction enter by the user keyboard
     * 4 for a left movement, 6 for a right movement
     * if other values, the function return FIXED (= no movement)
     * @return a direction
     */
    public Direction getDirection()
    {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        sc.close(); 
        switch (choice)
        {
            case '4' :
                return Direction.LEFT;
            case '6' :
                return Direction.RIGHT;
            default :
                return Direction.FIXED;
        }               
    }
}
