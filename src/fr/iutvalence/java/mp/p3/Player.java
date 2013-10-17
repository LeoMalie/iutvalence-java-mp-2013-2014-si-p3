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
    /**
     * Current player username.
     */
    private String name;
     
    // TODO (fix) detail comment (how is the player?)
    /**
     * This constructor provides to create a new player
     * @param userName chosen by the user
     */
    public Player(String userName)
    {
        this.name = userName;
    }
    
    /**
     * This function provides to get a direction enter by the user keyboard
     * char "4" for a left movement, char "6" for a right movement
     * if other values, the function return FIXED (= no movement)
     * @return direction
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
