import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleSc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleSc extends World
{
    Label titleLable = new Label("Fantasy Maze",50);
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
            LV1 gameWorld = new LV1();
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
        addObject(player,550,51);
        Barrier barrier = new Barrier("1");
        addObject(barrier,488,50);
        Barrier2 barrier22 = new Barrier2("3");
        addObject(barrier22,500,93);
        barrier22.setLocation(508,92);
        Barrier2 barrier23 = new Barrier2("2");
        addObject(barrier23,572,92);
        player.setLocation(426,40);
        barrier.setLocation(485,31);

        Label L1 = new Label("Use Arrow keys to move",40);
        addObject(L1,300,283);
        Label L2 = new Label("Press SPACE to Start",40);
        addObject(L2,300,330);
        player.setLocation(540,46);
    }
}
