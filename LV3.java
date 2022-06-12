import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LV3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LV3 extends LV
{
    public GateV gate;
    /**
     * Constructor for objects of class LV3.
     * 
     */
    public LV3()
    {
        GameEnd lastLV = new GameEnd();
        addObject(lastLV,30,350);
        WallLength WL = new WallLength();
        WallLength WR = new WallLength();
        WallWidth WU = new WallWidth();
        WallWidth WD = new WallWidth();
        addObject(WL,0,200);
        addObject(WR,600,200);
        addObject(WU,300,0);
        addObject(WD,300,400);
        Player P1 = new Player();
        addObject(P1,30,30);
        Barrier B1 = new Barrier("3");
        Barrier B2 = new Barrier("3");
        Barrier B3 = new Barrier("3");
        Barrier B4 = new Barrier("3");
        Barrier B5 = new Barrier("3");
        Barrier B6 = new Barrier("3");
        Barrier B7 = new Barrier("3");
        Barrier B8 = new Barrier("3");
        Barrier B9 = new Barrier("3");
        Barrier B10 = new Barrier("3");
        Barrier B11 = new Barrier("3");
        Barrier B12 = new Barrier("3");
        Barrier B13 = new Barrier("3");
        Barrier B14 = new Barrier("3");
        Barrier B15 = new Barrier("3");
        Barrier B16 = new Barrier("3");
        Barrier B17 = new Barrier("3");
        Barrier B18 = new Barrier("3");
        Barrier B19 = new Barrier("3");
        Barrier B20 = new Barrier("3");
        addObject(B1,70,380);
        
        Barrier2 b1 = new Barrier2("3");
        Barrier2 b2 = new Barrier2("3");
        Barrier2 b3 = new Barrier2("3");
        Barrier2 b4 = new Barrier2("3");
        Barrier2 b5 = new Barrier2("3");
        Barrier2 b6 = new Barrier2("3");
        Barrier2 b7 = new Barrier2("3");
        Barrier2 b8 = new Barrier2("3");
        Barrier2 b9 = new Barrier2("3");
        Barrier2 b10 = new Barrier2("3");
        Barrier2 b11 = new Barrier2("3");
        Barrier2 b12 = new Barrier2("3");
        Barrier2 b13 = new Barrier2("3");
        Barrier2 b14 = new Barrier2("3");
        Barrier2 b15 = new Barrier2("3");
        Barrier2 b16 = new Barrier2("3");
        Barrier2 b17 = new Barrier2("3");
        addObject(b1,30,275);
        
        gate = new GateV();
        //addObject(gate,130,30);
        Key K1 = new Key();
        //addObject(K1,400,380);
    }
    public void removeGate()
    {
        removeObject(gate);
    }
}
