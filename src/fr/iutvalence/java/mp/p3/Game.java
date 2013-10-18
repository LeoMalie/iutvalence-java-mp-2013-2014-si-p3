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
     * This function provides to move the user car (created in the area 
     * constructor), set EMPTY value in old car position and USER_CAR in the 
     * new
     */
    //private void moveUserCar()
//    {
//        this.area.changeSquare(this.area.userCar.getPosition(), AreaContent.EMPTY);
//        this.userCar.move();
//        changeSquare(this.userCar.getPosition(), AreaContent.USER_CAR);
//    }
    
    /**
     * This function will provide to start a game, for now just display 
     * the road with the standard output
     */
    public void play()
    {
        // Main loop
        while(this.playerAlive)
        {
            //this.moveUserCar();
            
            //TODO Remove in scrollRoad()
            this.area.initBotCar();
            
            // Road display
            System.out.println(this.area.toString());
            
            // TODO FIXED consider returning a boolean indicating a collision instead of using an
            // exception (used to notify errors)
            if (!this.area.scrollRoad())
               // Game over !
               this.playerAlive = false; 
            this.player.upScore();
        }
        // Score display
        System.out.println(this.player.getScore());
    }
    
    
}
