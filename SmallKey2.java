import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class key here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SmallKey2 extends Actor
{
    GreenfootImage key1 = new GreenfootImage("images/GateItems/starKey.jpg");
    /**
     * Act - do whatever the key wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //A key type that is small but can still be interacted with
    public void act()
    {
        // Add your action code here.
        setImage(key1);
        key1.scale(5,5);
    }
}
