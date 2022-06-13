import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Remove gate is the how the world will remove a gate from play 
 * when the player calls it.
 * Remove gate 2 adds a gate that was hidden while removing a seperate gate.
 */
public class LV3 extends LV
{
    public GateV gate;
    public GateV2 gate2;
    public GateH gate3;
    public GateV3 gate4;
    public SmallKey star;
    /**
     * Constructor for objects of class LV3.
     * 
     */
    public LV3()
    {
        LVEnd lastLV = new LVEnd();
        PortalEnd portal = new PortalEnd(lastLV);
        addObject(portal,30,350);
        WallLength WU = new WallLength();
        WallLength WD = new WallLength();
        WallWidth WL = new WallWidth();
        WallWidth WR = new WallWidth();
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
        addObject(B2,160,153);
        addObject(B3,160,103);
        addObject(B4,150,300);
        addObject(B5,240,220);
        addObject(B6,270,30);
        addObject(B7,360,100);
        addObject(B8,360,140);
        addObject(B9,30,100);
        addObject(B10,240,280);
        addObject(B11,360,280);
        addObject(B12,440,370);
        addObject(B13,515,280);
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
        addObject(b2,70,60);
        addObject(b3,30,60);
        addObject(b4,120,80);
        addObject(b5,120,175);
        addObject(b6,70,275);
        addObject(b8,120,275);
        addObject(b7,293,75);
        addObject(b8,320,75);
        addObject(b9,360,75);
        addObject(b10,263,175);
        addObject(b11,320,175);
        addObject(b12,370,175);
        addObject(b13,440,175);
        addObject(b14,570,175);
        addObject(b15,340,300);
        addObject(b16,400,257);
        addObject(b17,470,257);
        gate = new GateV("2");
        gate2 = new GateV2("2");
        gate4 = new GateV3("2");
        addObject(gate,150,360);
        addObject(gate2,150,220);
        addObject(gate4,500,210);
        Key2 K1 = new Key2();
        Key3 K2 = new Key3();
        Key4 K3 = new Key4();
        SmallKey2 star2 = new SmallKey2();
        addObject(K1,120,130);
        addObject(K2,300,30);
        addObject(K3,330,125);
        addObject(star2,470,380);
    }
    public void removeGate()
    {
        removeObject(gate);
    }
    public void removeGate2()
    {
        removeObject(gate2);
        gate3 = new GateH("2");
        addObject(gate3,505,175);
        star = new SmallKey();
        addObject(star,580,70);
    }
    public void removeGate3()
    {
        removeObject(gate3);
    }
    public void removeGate4()
    {
        removeObject(gate4);
    }
}
