import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Remove gate is the how the world will remove a gate from play 
 * when the player calls it.
 */
public class LV2 extends LV
{
    public GateV gate;
    
    /**
     * Constructor for objects of class LV2.
     * 
     */
    public LV2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        LV3 lv3 = new LV3();
        PortalEnd portal = new PortalEnd(lv3);
        addObject(portal,30,220);
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
        Barrier B1 = new Barrier("2");
        Barrier B2 = new Barrier("2");
        Barrier B3 = new Barrier("2");
        Barrier B4 = new Barrier("2");
        Barrier B5 = new Barrier("2");
        Barrier B6 = new Barrier("2");
        Barrier B7 = new Barrier("2");
        Barrier B8 = new Barrier("2");
        Barrier B9 = new Barrier("2");
        Barrier B10 = new Barrier("2");
        Barrier B11 = new Barrier("2");
        Barrier B12 = new Barrier("2");
        Barrier B13 = new Barrier("2");
        Barrier B14 = new Barrier("2");
        Barrier B15 = new Barrier("2");
        Barrier B16 = new Barrier("2");
        Barrier B17 = new Barrier("2");
        Barrier B18 = new Barrier("2");
        Barrier B19 = new Barrier("2");
        Barrier B20 = new Barrier("2");
        addObject(B1,70,380);
        addObject(B2,70,250);
        addObject(B3,70,200);
        addObject(B4,70,200);
        addObject(B5,150,300);
        addObject(B6,260,300);
        addObject(B7,130,100);
        addObject(B8,130,150);
        addObject(B9,260,360);
        addObject(B10,330,200);
        addObject(B11,330,250);
        addObject(B12,255,45);
        addObject(B13,255,15);
        addObject(B14,360,380);
        addObject(B15,500,200);
        addObject(B16,410,300);
        addObject(B17,500,260);
        addObject(B18,500,170);
        addObject(B19,360,130);
        addObject(B20,360,90);
        Barrier2 b1 = new Barrier2("2");
        Barrier2 b2 = new Barrier2("2");
        Barrier2 b3 = new Barrier2("2");
        Barrier2 b4 = new Barrier2("2");
        Barrier2 b5 = new Barrier2("2");
        Barrier2 b6 = new Barrier2("2");
        Barrier2 b7 = new Barrier2("2");
        Barrier2 b8 = new Barrier2("2");
        Barrier2 b9 = new Barrier2("2");
        Barrier2 b10 = new Barrier2("2");
        Barrier2 b11 = new Barrier2("2");
        Barrier2 b12 = new Barrier2("2");
        Barrier2 b13 = new Barrier2("2");
        Barrier2 b14 = new Barrier2("2");
        Barrier2 b15 = new Barrier2("2");
        Barrier2 b16 = new Barrier2("2");
        Barrier2 b17 = new Barrier2("2");
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
        addObject(b13,400,170);
        addObject(b14,260,70);
        addObject(b15,530,360);
        addObject(b16,510,60);
        addObject(b17,460,60);
        gate = new GateV("1");
        addObject(gate,130,30);
        Key K1 = new Key();
        addObject(K1,400,380);
    }
    public void removeGate()
    {
        removeObject(gate);
    }
}
