import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * If player touching this portal, go to next level. world change item
 * Author:Tyson Pellatt
 * Date:June 13/2022
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
        if(isTouching(Player.class)){
            Greenfoot.setWorld(nextLevel);
        }
    }
    
    
    
}
