import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LVEnd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LVEnd extends LV
{
    Label CongratsLabel = new Label("Thank you for",50);
    Label CongratsLabel2 = new Label("playing my game.",50);
    /**
     * Constructor for objects of class LVEnd.
     * 
     */
    public LVEnd()
    {
        WallLength WU = new WallLength();
        WallLength WD = new WallLength();
        WallWidth WL = new WallWidth();
        WallWidth WR = new WallWidth();
        addObject(WL,0,200);
        addObject(WR,600,200);
        addObject(WU,300,0);
        addObject(WD,300,400);
        Player P1 = new Player();
        addObject(P1,300,200);
        addObject(CongratsLabel, getWidth()/2,100);
        addObject(CongratsLabel2, getWidth()/2,140);
    }
}
