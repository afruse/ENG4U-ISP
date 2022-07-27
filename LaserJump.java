import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LaserJump here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LaserJump extends Actor
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
