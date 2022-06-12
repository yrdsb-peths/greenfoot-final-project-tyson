import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Barrier2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Barrier2 extends Actor
{
    GreenfootImage wall = new GreenfootImage("images/wallsArt/moss2.png");
    GreenfootImage branch = new GreenfootImage("images/wallsArt/SakuraBlock2.png");
    GreenfootImage rock = new GreenfootImage("images/wallsArt/asteroid2.png");
    /**
     * Act - do whatever the Barrier2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Barrier2(String type)
    {
        if(type.equals("1")){
            setImage(wall);
            wall.scale(70,25);    
        }else if(type.equals("2")){
            setImage(branch);
            branch.scale(70,25);
        }else if(type.equals("3")){
            setImage(rock);
            rock.scale(70,25);
        }
    }
    public void act()
    {
        // Add your action code here.
        
        
    }
}
