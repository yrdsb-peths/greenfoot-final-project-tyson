import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Barrier here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Barrier extends Actor
{
    GreenfootImage wall = new GreenfootImage("images/wallsArt/moss2.png");
    /**
     * Act - do whatever the Barrier wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Barrier()
    {
        setImage(wall);
        wall.scale(40,40);
    }
    public void act()
    {
        // Add your action code here.
        
        
    }
}
