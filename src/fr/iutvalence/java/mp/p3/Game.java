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
     * @return true if no collision, else false
     */
    public boolean moveUserCar()
    {
        // wtf ! doesn't work...
        Direction randomDirection = Direction.getRandomDirection();
        
        if (this.player.getCar().getPosition().getX() + randomDirection.getValue() >= 0 &&
            this.player.getCar().getPosition().getX() + randomDirection.getValue() <= Area.SIZE_WIDTH - 1)
        {
            if (this.area.getContent(this.player.getCar().getPosition().getX() + randomDirection.getValue(), 0) == AreaContent.EMPTY)
            {                
                this.area.changeContent(this.player.getCar().getPosition(), AreaContent.EMPTY);
                this.player.getCar().moveCar(randomDirection);
                this.area.changeContent(this.player.getCar().getPosition(), AreaContent.USER_CAR);
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return true;
        }
        
    }
    
    /**
     * This function provides to scroll the road 
     * Line + 1 <-- line
     * @return boolean if collision return false, else true
     */
    public boolean scrollRoad()
    {       
        int indiceLigne = Area.SIZE_HEIGHT - 1;
        int indiceColonne = 0;
        Car a = new Car(AreaContent.BOT_CAR);
        this.area.changeContent(a.getPosition(), AreaContent.BOT_CAR); 
        for (int i = 0; i < Area.SIZE_WIDTH; i++)
        {
            if (this.area.getContent(i, indiceLigne) == AreaContent.BOT_CAR)
                this.area.changeContent(new Position(i, indiceLigne), AreaContent.EMPTY);
        }
        indiceLigne--;
        while (indiceLigne >= 0)
        {
            while (indiceColonne < Area.SIZE_WIDTH)
            {
                if (this.area.getContent(indiceColonne, indiceLigne) == AreaContent.BOT_CAR)
                {
                    switch(this.area.getContent(indiceColonne, indiceLigne + 1))
                    {
                        case EMPTY :  
                            this.area.changeContent(new Position(indiceColonne, indiceLigne + 1), this.area.getContent(indiceColonne, indiceLigne));
                            this.area.changeContent(new Position(indiceColonne, indiceLigne), AreaContent.EMPTY);
                            break;
                        case BOT_CAR :
                            this.area.changeContent(new Position(indiceColonne, indiceLigne), AreaContent.EMPTY);
                            break;
                        case USER_CAR :
                            return false;
                    }
                }
                indiceColonne++;
            }
            indiceColonne = 0;
            indiceLigne--;
        }
        return true;
    }
    
    /**
     * This function will provide to start a game, for now just display 
     * the road with the standard output
     */
    public void play()
    {
        // Main loop
        while(this.playerAlive)
        {           
            // Road display
            System.out.println(this.area.toString());  
            // TODO FIXED consider returning a boolean indicating a collision instead of using an
            // exception (used to notify errors)
            if (!this.scrollRoad() || !this.moveUserCar())
               // Game over !
               this.playerAlive = false; 
            this.player.upScore();
        }
        // Score display
        System.out.println(this.player.getScore());
    }
    
    
}
