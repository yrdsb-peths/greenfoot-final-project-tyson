import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PortalEnd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PortalEnd extends Actor
{
    public LV nextLevel;
    
    public PortalEnd(LV nextLevel){
        this.nextLevel = nextLevel;
    }
    
    /**
     * Act - do whatever the PortalEnd wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // If player touching this portal, go to next level
        if(isTouching(Player.class)){
            Greenfoot.setWorld(nextLevel);
        }
    }
    
    
    
}
