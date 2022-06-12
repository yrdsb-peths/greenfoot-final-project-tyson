import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WallLength here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WallLength extends Actor
{
    GreenfootImage wall = new GreenfootImage("images/wallsArt/moss2.png");
    /**
     * Act - do whatever the WallLength wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public WallLength()
    {
        setImage(wall);
        wall.scale(600,5);
    }
    public void act()
    {
        // Add your action code here.
        
        
    }
}
