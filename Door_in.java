import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door_in here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door_in extends Actor
{
    /**
     * Act - do whatever the Door_in wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        Outside world = (Outside) getWorld();
        if(isTouching(MainC.class)){
            world.stepInside();
            world.removeObject(this);
        }
    }
}
