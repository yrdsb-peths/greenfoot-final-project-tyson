import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A key type that is small but can still be interacted with,
 * removes the newly added gate after the Key3 in LV3
 * Author:Tyson Pellatt
 * Date:June 13/2022
 */
public class SmallKey extends Actor
{
    GreenfootImage key1 = new GreenfootImage("images/GateItems/starKey.jpg");
    /**
     * Act - do whatever the key wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setImage(key1);
        key1.scale(7,7);
    }
}
