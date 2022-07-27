import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LaserStay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LaserStay extends Actor
{
    public void act()
    {
        move(-4);
        Parkour world = (Parkour) getWorld();
        if(isTouching(MainCPlat.class)){
            world.restart();
            world.removeObject(this);
        }
    }
}
