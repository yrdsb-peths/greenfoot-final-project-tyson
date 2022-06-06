import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleSc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleSc extends World
{
    Label titleLable = new Label("Fantasy Maze",75);
    /**
     * Constructor for objects of class TitleSc.
     * 
     */
    public TitleSc()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(titleLable, getWidth()/2,getHeight()/2);
        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            LV2 gameWorld = new LV2();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player player = new Player();
        addObject(player,431,51);
        Barrier barrier = new Barrier();
        addObject(barrier,488,50);
        PortalEnd portalEnd = new PortalEnd();
        addObject(portalEnd,554,46);
        Barrier2 barrier2 = new Barrier2();
        addObject(barrier2,444,95);
        barrier2.setLocation(457,92);
        Barrier2 barrier22 = new Barrier2();
        addObject(barrier22,500,93);
        barrier22.setLocation(508,92);
        Barrier2 barrier23 = new Barrier2();
        addObject(barrier23,572,92);
        player.setLocation(426,40);
        barrier.setLocation(485,31);
        portalEnd.setLocation(546,30);
        barrier2.setLocation(451,86);
        barrier.setLocation(483,23);
        Label L1 = new Label("Use WASD or Arrow keys to move",40);
        addObject(L1,300,283);
        Label L2 = new Label("Press SPACE to Start",40);
        addObject(L2,300,330);
        barrier2.setLocation(449,90);
    }
}
