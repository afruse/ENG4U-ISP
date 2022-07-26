import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flashback here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flashback extends World
{

    /**
     * Constructor for objects of class Flashback.
     * 
     */
    public Flashback()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        setBackground("flash.jpg");
        Outside.first.setValue("\"Long time ago you used to work for the");
        Outside.second.setValue("person at the door. His name is Charles\"");
        addObject(MyWorld.text, 400, 400);
        addObject(Outside.first, 315, 520);
        addObject(Outside.second, 323, 560);
    }
}
