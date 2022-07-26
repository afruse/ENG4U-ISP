import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public Bed bed;
    public PC pc;
    public Door door;
    public MyWorld()
    {    
        super(800, 600, 1);
        bed = new Bed();
        pc = new PC();
        door = new Door();
        MainC main = new MainC();
        addObject(main, 400, 300);
        addObject(bed, 76, 161);
        addObject(pc, 450, 70);
        addObject(door, 680, 9);
    }
}
