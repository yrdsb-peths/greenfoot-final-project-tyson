import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GateV2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GateV2 extends Actor
{
    GreenfootImage wall = new GreenfootImage("images/GateItems/GateBlock.png");
    GreenfootImage lazer = new GreenfootImage("images/GateItems/LazerWall.jpg");
    /**
     * Act - do whatever the GateV2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public GateV2(String type)
    {
        if(type.equals("1")){
            setImage(wall);
            wall.scale(25,70);    
        }else if(type.equals("2")){
            setImage(lazer);
            lazer.scale(25,70);
        }
    }
    public void act()
    {
    }
}
