import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GateH here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GateH extends Actor
{
    GreenfootImage wall = new GreenfootImage("images/GateItems/GateBlock.png");
    GreenfootImage lazer = new GreenfootImage("images/GateItems/LazerWall2.png");
    /**
     * Act - do whatever the GateH wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public GateH(String type)
    {
        if(type.equals("1")){
            setImage(wall);
            wall.scale(50,20);    
        }else if(type.equals("2")){
            setImage(lazer);
            lazer.scale(50,20);
        }
    }
    public void act()
    {
    }
}
