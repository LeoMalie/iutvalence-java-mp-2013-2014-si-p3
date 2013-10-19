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
     * Current player pseudo.
     */
    private String name;
    
    /**
     * Player car
     */
    private Car userCar;
    
    /**
     * Player score
     */
    private int score;
    
    // TODO FIXED declare constants as constants (and comply with naming conventions)
    /**
     * Init score when a player is created
     */
    public static final int INIT_SCORE = 0;
     
    /**
     * This constructor provides to create a new player with a pseudo and a score = 0
     * @param userName chosen by the user
     */
    public Player(String userName)
    {
        this.name = userName;
        this.score = INIT_SCORE;
        this.userCar = new Car(AreaContent.USER_CAR);
    }
    
    /**
     * This function provides to grow up the player score
     */
    public void upScore()
    {
        this.score += 100;
    }
    
    /**
     * This function provides to get the player name
     * @return player name
     */
    public String getName()
    {
        return this.name;
    }
   
    /**
     * This function provides to get the player score
     * @return player score
     */
    public int getScore()
    {
        return this.score;
    }
    
    /**
     * This function provides to get the player car
     * @return player car
     */
    public Car getCar()
    {
        return this.userCar;
    }
    
    /**
     * This function provides to get a direction enter by the user keyboard
     * char "4" for a left movement, char "6" for a right movement
     * if other values, the function return FIXED (= no movement)
     * @return direction
     */
    // TODO FIXED consider for the moment that the player returns a random choice
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
