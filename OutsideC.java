import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OutsideC here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OutsideC extends World
{
    private static Door_inC doorIn;
    public static Label second;
    public OutsideC()
    {
        super(800, 600, 1);
        doorIn = new Door_inC();
        addObject(doorIn, 680, 489);
        doorIn.turn(180);
        addObject(Outside.higher, 680, 232);
        addObject(MyWorld.main, 680, 320);
        MainC.control = false;
        addObject(MyWorld.text, 400, 400);
        addObject(Outside.first, 230, 520);
        addObject(Outside.second, 223, 560);
    }
    public void act(){
        
    }
    public void stepInside(){
        MyWorld world = new MyWorld();
        Greenfoot.setWorld(world);
    }
}
