import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * First vertical gate
 * Author:Tyson Pellatt
 * Date:June 13/2022
 */
public class GateV extends Actor
{
    GreenfootImage wall = new GreenfootImage("images/GateItems/GateBlock.png");
    GreenfootImage lazer = new GreenfootImage("images/GateItems/LazerWall.jpg");
    /**
     * Act - do whatever the GateV wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public GateV(String type)
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
