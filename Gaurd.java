import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gaurd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gaurd extends Actor
{
    public Gaurd(){
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/2, image.getHeight()/2);
        setImage(image);
    }
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
