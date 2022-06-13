import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Else if in movement is so you can move in 2 directions at once to break main barriers
 * wallCollison(); is for any collison the player should be interacting with
 * the unlocks are for how the player interacts with keys on the map. 
 */
public class Player extends Actor
{
    String facing = "right";
    SimpleTimer animationTime = new SimpleTimer();
    int imageIndex = 0;
    GreenfootImage[] leftCycle = new GreenfootImage[4];
    GreenfootImage[] rightCycle = new GreenfootImage[4];
    GreenfootImage[] upCycle = new GreenfootImage[4];
    GreenfootImage[] downCycle = new GreenfootImage[4];
    GreenfootSound Lock = new GreenfootSound("LockSound.wav");
    GreenfootSound SmallLock = new GreenfootSound("SmallLock.wav");
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Player()
    {
        for(int i =0; i < leftCycle.length; i++)
        {
            leftCycle[i] = new GreenfootImage("images/SpriteLeft/left0"+ i +".png");
            leftCycle[i].scale(35,35);
        }
        for(int i =0; i < rightCycle.length; i++)
        {
            rightCycle[i] = new GreenfootImage("images/SpriteRight/right0"+ i +".png");
            rightCycle[i].scale(35,35);
        }
        for(int i =0; i < upCycle.length; i++)
        {
            upCycle[i] = new GreenfootImage("images/SpriteUp/up0"+ i +".png");
            upCycle[i].scale(35,35);
        }
        for(int i =0; i < downCycle.length; i++)
        {
            downCycle[i] = new GreenfootImage("images/SpriteDown/down0"+ i +".png");
            downCycle[i].scale(35,35);
        }
        animationTime.mark();
        setImage(downCycle[1]);
    }
    public void animate() //Animation program
    {
        if(animationTime.millisElapsed() < 300)
        {
            return;
        }
        animationTime.mark();
        if(facing.equals("right"))
        {
            setImage(rightCycle[imageIndex]);
            imageIndex = (imageIndex + 1) % rightCycle.length; 
        }
        if(facing.equals("left"))
        {
            setImage(leftCycle[imageIndex]);
            imageIndex = (imageIndex + 1) % leftCycle.length; 
        }
        if(facing.equals("up"))
        {
            setImage(upCycle[imageIndex]);
            imageIndex = (imageIndex + 1) % upCycle.length; 
        }
        if(facing.equals("down"))
        {
            setImage(downCycle[imageIndex]);
            imageIndex = (imageIndex + 1) % downCycle.length; 
        }
    }
    public void act()
    {
        
        if(Greenfoot.isKeyDown("a"))
        {
            facing = "left";
            move(-2);
        }
        else if(Greenfoot.isKeyDown("d"))
        {
            facing = "right";
            move(2);
        }
        else if(Greenfoot.isKeyDown("w"))
        {
            facing = "up";
            setLocation(getX(),getY()-2);
        }
        else if(Greenfoot.isKeyDown("s"))
        {
            facing = "down";
            setLocation(getX(),getY()+2);
        }
        wallCollision();
        unlock();
        unlock2();
        animate();
        
    }
    public void wallCollision() 
    {
        //
        if(isTouching(Barrier.class)){
            if(facing.equals("right")){
                setLocation(getX()-2,getY());
            }
            if(facing.equals("left")){
                setLocation(getX()+2,getY());
            }
            if(facing.equals("up")){
                setLocation(getX(),getY()+2);
            }
            if(facing.equals("down")){
                setLocation(getX(),getY()-2);
            }
        }
        if(isTouching(Barrier2.class)){
            if(facing.equals("right")){
                setLocation(getX()-2,getY());
            }
            if(facing.equals("left")){
                setLocation(getX()+2,getY());
            }
            if(facing.equals("up")){
                setLocation(getX(),getY()+2);
            }
            if(facing.equals("down")){
                setLocation(getX(),getY()-3);
            }
        }
        if(isTouching(WallLength.class)){
            if(facing.equals("up")){
                setLocation(getX(),getY()+10);
            }
            if(facing.equals("down")){
                setLocation(getX(),getY()-5);
            }
        }
        if(isTouching(WallWidth.class)){
            if(facing.equals("left")){
                setLocation(getX()+5,getY());
            }
            if(facing.equals("right")){
                setLocation(getX()-5,getY());
            }
        }
        if(isTouching(GateV.class)){
            if(facing.equals("left")){
                setLocation(getX()+2,getY());
            }
            if(facing.equals("right")){
                setLocation(getX()-2,getY());
            }
        }
        if(isTouching(GateV2.class)){
            if(facing.equals("left")){
                setLocation(getX()+2,getY());
            }
            if(facing.equals("right")){
                setLocation(getX()-2,getY());
            }
        }
        if(isTouching(GateV3.class)){
            if(facing.equals("left")){
                setLocation(getX()+2,getY());
            }
            if(facing.equals("right")){
                setLocation(getX()-2,getY());
            }
        }
        if(isTouching(GateH.class)){
            if(facing.equals("up")){
                setLocation(getX(),getY()+10);
            }
            if(facing.equals("down")){
                setLocation(getX(),getY()-5);
            }
        }
    }
    
    public void unlock()
    {
        if(isTouching(Key.class))
        {
            LV2 world = (LV2) getWorld();
            world.removeGate();
            removeTouching(Key.class);
            Lock.play();
        }
    }
    public void unlock2()
    {
        //for Level 3
        if(isTouching(Key2.class))
        {
            LV3 world = (LV3) getWorld();
            world.removeGate();
            removeTouching(Key2.class);
            Lock.play();
        }
        if(isTouching(Key3.class))
        {
            LV3 world = (LV3) getWorld();
            world.removeGate2();
            removeTouching(Key3.class);
            Lock.play();
        }
        if(isTouching(SmallKey.class))
        {
            LV3 world = (LV3) getWorld();
            world.removeGate3();
            removeTouching(SmallKey.class);
            SmallLock.play();
        }
        if(isTouching(Key4.class))
        {
            removeTouching(Key4.class);
            Lock.play();
        }
        if(isTouching(SmallKey2.class))
        {
            LV3 world = (LV3) getWorld();
            world.removeGate4();
            removeTouching(SmallKey2.class);
            SmallLock.play();
        }
    }
}