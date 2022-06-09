import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GateV here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GateV extends Actor
{
    GreenfootImage wall = new GreenfootImage("images/GateItems/GateBlock.png");
    /**
     * Act - do whatever the GateV wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setImage(wall);
        wall.scale(25,70);
        
    }
}
