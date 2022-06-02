import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        PortalEnd gate = new PortalEnd();
        addObject(gate,570,110);
        WallLength WL = new WallLength();
        WallLength WR = new WallLength();
        WallWidth WU = new WallWidth();
        WallWidth WD = new WallWidth();
        addObject(WL,0,200);
        addObject(WR,600,200);
        addObject(WU,300,0);
        addObject(WD,300,400);
        Player P1 = new Player();
        addObject(P1,30,360);
        Barrier B1 = new Barrier();
        Barrier B2 = new Barrier();
        Barrier B3 = new Barrier();
        Barrier B4 = new Barrier();
        Barrier B5 = new Barrier();
        Barrier B6 = new Barrier();
        Barrier B7 = new Barrier();
        Barrier B8 = new Barrier();
        Barrier B9 = new Barrier();
        Barrier B10 = new Barrier();
        Barrier B11 = new Barrier();
        Barrier B12 = new Barrier();
        Barrier B13 = new Barrier();
        Barrier B14 = new Barrier();
        Barrier B15 = new Barrier();
        Barrier B16 = new Barrier();
        Barrier B17 = new Barrier();
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
        Barrier2 b1 = new Barrier2();
        Barrier2 b2 = new Barrier2();
        Barrier2 b3 = new Barrier2();
        Barrier2 b4 = new Barrier2();
        Barrier2 b5 = new Barrier2();
        Barrier2 b6 = new Barrier2();
        Barrier2 b7 = new Barrier2();
        Barrier2 b8 = new Barrier2();
        Barrier2 b9 = new Barrier2();
        Barrier2 b10 = new Barrier2();
        Barrier2 b11 = new Barrier2();
        Barrier2 b12 = new Barrier2();
        Barrier2 b13 = new Barrier2();
        Barrier2 b14 = new Barrier2();
        addObject(b1,30,70);
        addObject(b2,110,300);
        addObject(b3,200,127);
        addObject(b4,270,127);
        addObject(b5,200,222);
        addObject(b6,170,300);
        addObject(b7,230,300);
        addObject(b8,333,233);
        addObject(b9,400,322);
        addObject(b10,450,322);
        addObject(b11,450,245);
        addObject(b12,510,245);
        addObject(b13,570,245);
        addObject(b14,510,110);
    }
}
