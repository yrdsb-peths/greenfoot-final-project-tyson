import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * First Level
 * Author:Tyson Pellatt
 * Date:June 13/2022
 */
public class LV1 extends LV
{
    private int timeLeft = 60;
    SimpleTimer gameTimer = new SimpleTimer();
    Label time = new Label(timeLeft,25);
    Label timeText = new Label("Time:",30);
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public LV1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        addObject(timeText,35,15);
        addObject(time,85,15);
        LV2 lv2 = new LV2();
        PortalEnd portal = new PortalEnd(lv2);
        
        addObject(portal,570,110);
        WallLength WU = new WallLength();
        WallLength WD = new WallLength();
        WallWidth WL = new WallWidth();
        WallWidth WR = new WallWidth();
        addObject(WL,0,200);
        addObject(WR,600,200);
        addObject(WU,300,0);
        addObject(WD,300,400);
        Player P1 = new Player();
        addObject(P1,30,360);
        Barrier B1 = new Barrier("1");
        Barrier B2 = new Barrier("1");
        Barrier B3 = new Barrier("1");
        Barrier B4 = new Barrier("1");
        Barrier B5 = new Barrier("1");
        Barrier B6 = new Barrier("1");
        Barrier B7 = new Barrier("1");
        Barrier B8 = new Barrier("1");
        Barrier B9 = new Barrier("1");
        Barrier B10 = new Barrier("1");
        Barrier B11 = new Barrier("1");
        Barrier B12 = new Barrier("1");
        Barrier B13 = new Barrier("1");
        Barrier B14 = new Barrier("1");
        Barrier B15 = new Barrier("1");
        Barrier B16 = new Barrier("1");
        Barrier B17 = new Barrier("1");
        addObject(B1,70,370);
        addObject(B2,70,300);
        addObject(B3,70,240);
        addObject(B4,70,180);
        addObject(B5,130,30);
        addObject(B6,160,150);
        addObject(B7,160,200);
        addObject(B8,310,150);
        addObject(B9,310,210);
        addObject(B10,354,280);
        addObject(B11,354,300);
        addObject(B12,310,90);
        addObject(B13,310,20);
        addObject(B14,425,200);
        addObject(B15,425,30);
        addObject(B16,530,100);
        addObject(B17,530,140);
        Barrier2 b1 = new Barrier2("1");
        Barrier2 b2 = new Barrier2("1");
        Barrier2 b3 = new Barrier2("1");
        Barrier2 b4 = new Barrier2("1");
        Barrier2 b5 = new Barrier2("1");
        Barrier2 b6 = new Barrier2("1");
        Barrier2 b7 = new Barrier2("1");
        Barrier2 b8 = new Barrier2("1");
        Barrier2 b9 = new Barrier2("1");
        Barrier2 b10 = new Barrier2("1");
        Barrier2 b11 = new Barrier2("1");
        Barrier2 b12 = new Barrier2("1");
        Barrier2 b13 = new Barrier2("1");
        Barrier2 b14 = new Barrier2("1");
        addObject(b1,30,70);
        addObject(b2,110,300);
        addObject(b3,200,127);
        addObject(b4,270,127);
        addObject(b5,200,222);
        addObject(b6,170,300);
        addObject(b7,230,300);
        addObject(b8,331,233);
        addObject(b9,400,322);
        addObject(b10,450,322);
        addObject(b11,450,245);
        addObject(b12,510,245);
        addObject(b13,570,245);
        addObject(b14,510,110);
        
    }
    public void act()
    {
        if(gameTimer.millisElapsed() >= 1000)
        {
            timeLeft--;
            time.setValue(timeLeft);
            gameTimer.mark();
        }
    }
}
