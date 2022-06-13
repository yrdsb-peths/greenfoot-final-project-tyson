import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * World barrier that goes along the left and right of the screen
 */
public class WallWidth extends Actor
{
    GreenfootImage wall = new GreenfootImage("images/wallsArt/moss2.png");
    /**
     * Act - do whatever the WallWidth wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public WallWidth()
    {
        setImage(wall);
        wall.scale(5,400);
    }
    public void act()
    {
        // Add your action code here.
        
        
    }
}
