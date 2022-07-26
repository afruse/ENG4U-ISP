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
    public arrow ar;
    public MyWorld()
    {    
        super(800, 600, 1);
        bed = new Bed();
        pc = new PC();
        door = new Door();
        ar = new arrow();
        MainC main = new MainC();
        addObject(main, 400, 300);
        addObject(bed, 76, 161);
        addObject(pc, 450, 70);
        addObject(door, 680, 9);
        addObject(ar, 680, 100);
    }
}
