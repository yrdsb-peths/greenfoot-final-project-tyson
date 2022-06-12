import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Barrier here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Barrier extends Actor
{
    GreenfootImage wall = new GreenfootImage("images/wallsArt/moss2.png");
    GreenfootImage branch = new GreenfootImage("images/wallsArt/SakuraBlock1.png");
    GreenfootImage rock = new GreenfootImage("images/wallsArt/asteroid1.png");
    /**
     * Act - do whatever the Barrier wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Barrier(String type)
    {
        if(type.equals("1")){
            setImage(wall);
            wall.scale(25,70);    
        }else if(type.equals("2")){
            setImage(branch);
            branch.scale(25,70);
        }else if(type.equals("3")){
            setImage(rock);
            rock.scale(25,70);
        }
        
    }
    public void act()
    {
        // Add your action code here.
        
        
    }
}
