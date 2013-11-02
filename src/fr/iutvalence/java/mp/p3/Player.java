package fr.iutvalence.java.mp.p3;

/**
 * Control interface, provides to get a direction from the player
 * Implemented by KeyboardPlayer (user) and RandomPlayer (bot)
 * @author maliel
 *
 */
//TODO FIXED you should separate the data associated with the player from the way the player
//interacts with the game : this is not the case for the moment
// 
abstract class Player
{
    /**
     * Get a direction according to the class of player selected
     * @return direction to move to
     */
    public abstract Direction getDirection();
}
