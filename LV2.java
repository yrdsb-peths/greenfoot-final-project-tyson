import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LV2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LV2 extends World
{

    /**
     * Constructor for objects of class LV2.
     * 
     */
    public LV2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
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
        addObject(B1,70,380);
        addObject(B2,70,250);
        addObject(B3,70,200);
        addObject(B4,70,200);
        addObject(B5,150,300);
        addObject(B6,230,300);
        addObject(B7,130,100);
        addObject(B8,130,150);
        addObject(B9,230,360);
        addObject(B10,330,200);
        addObject(B11,330,250);
        addObject(B12,255,45);
        addObject(B13,255,15);
        addObject(B14,360,380);
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
        addObject(b1,30,275);
        addObject(b2,30,100);
        addObject(b3,100,170);
        addObject(b4,115,272);
        addObject(b5,150,170);
        addObject(b6,200,170);
        addObject(b7,250,170);
        addObject(b8,300,170);
        addObject(b9,350,170);
        addObject(b11,230,70);
        addObject(b12,350,350);
    }
}
