import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    
    public MyWorld()
    {    
        super(800, 600, 1);
        MainC main = new MainC();
        addObject(main, 400, 300);
    }
}
