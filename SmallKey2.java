import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A key type that is small but can still be interacted with
 */
public class SmallKey2 extends Actor
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
        key1.scale(5,5);
    }
}
