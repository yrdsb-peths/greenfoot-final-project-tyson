import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Second key
 * Author:Tyson Pellatt
 * Date:June 13/2022
 */
public class Key2 extends Actor
{
    GreenfootImage key1 = new GreenfootImage("images/GateItems/Key.png");
    /**
     * Act - do whatever the key wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setImage(key1);
        key1.scale(25,25);
    }
}
