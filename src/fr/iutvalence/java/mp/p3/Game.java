package fr.iutvalence.java.mp.p3;

/**
 * This class represents a round of the game.
 * @author maliel
 */
public class Game
{ 
    /**
     * The current area for this round.
     */
    private Area area;
   
    /**
     * Is this player alive ?
     */
    private boolean playerAlive;
    
    /**
     * Current player for this round	
     */
    private Player player;
      
    /**
     * Constructor for a new game with userName .The result is a game with an username 
     * chosen by the player, a score equals to 0, and a default number of lives.
     * @param userName userName chosen by the user
     */
    public Game(String userName)
    {
    	this.playerAlive = true;
    	this.player = new Player(userName);
    	this.area = new Area();
    }
    
    /**
     * This function will provide to start a game, for now just display 
     * the road with the standard output
     */
    public void play()
    {
        // User car creation and placement
        Car b = new Car(Square.USER_CAR);
        this.area.changeSquare(b.getPosition(), Square.USER_CAR); 
        // Main loop
        while(this.playerAlive)
        {
            // Enemy car creation and placement
            Car a = new Car(Square.BOT_CAR);
            this.area.changeSquare(a.getPosition(), Square.BOT_CAR);
            // Road display
            System.out.println(this.area.toString());
            
            // TODO (fix) consider returning a boolean indicating a collision instead of using an
            // exception (used to notify errors)
            try
            {
                this.area.scrollRoad();
            }
            catch (UserBotCrashException e)
            {
                // Game over !
                this.playerAlive = false;
            }  
            this.player.upScore();
        }
        // Score display
        System.out.println(this.player.getScore());
    }
    
    
}
