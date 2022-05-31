import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
// will be using SpritSheet.png
public class Player extends Actor
{
    String facing = "right";
    GreenfootImage leftCycle = new GreenfootImage("images/SpriteLeft/left00.png");
    //GreenfootImage[] rightCycle = new GreenfootImage[4];
    //GreenfootImage[] upCycle = new GreenfootImage[4];
    //GreenfootImage[] downCycle = new GreenfootImage[4];
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Player()
    {
        /**
        for(int i =0; i < leftCycle.length; i++)
        {
            leftCycle = new GreenfootImage("images/SpriteLeft/left0" + i +".png");
            leftCycle.scale(35,35);
        }*/
        setImage(leftCycle);
    }
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left"))
        {
            facing = "left";
            move(-2);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            facing = "right";
            move(2);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            facing = "up";
            setLocation(getX(),getY()-2);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            facing = "down";
            setLocation(getX(),getY()+2);
        }
    }
    public void wallColision()
    {
        if(isTouching(Barrier.class)){
            if(facing.equals("right")){
                setLocation(getX()-2,getY());
            }
            if(facing.equals("left")){
                setLocation(getX()+2,getY());
            }
            if(facing.equals("up")){
                setLocation(getX(),getY()-2);
            }
            if(facing.equals("right")){
                setLocation(getX(),getY()+2);
            }
        }
    }
}