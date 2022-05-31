import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
// will be using SpritSheet.png
public class Player extends Actor
{
    String facing = "right";
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left"))
        {
            facing = "left";
            move(-5);
        }
        if(Greenfoot.isKeyDown("a"))
        {
            facing = "left";
            move(-5);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            facing = "right";
            move(5);
        }
        if(Greenfoot.isKeyDown("d"))
        {
            facing = "right";
            move(5);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-2);
        }
        if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(),getY()-2);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+2);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(),getY()+2);
        }
    }
}
