import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Outside here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Outside extends World
{
    public static Door_in doorIn;
    public static HigherC higher;
    public Outside()
    {
        super(800, 600, 1);
        doorIn = new Door_in();
        higher = new HigherC();
        addObject(doorIn, 680, 489);
        doorIn.turn(180);
        addObject(higher, 300, 100);
        addObject(MyWorld.main, 680, 320);
        MainC.control = false;
        addObject(MyWorld.text, 400, 400);
    }
    public void stepInside(){
        MyWorld world = new MyWorld();
        Greenfoot.setWorld(world);
    }
}
