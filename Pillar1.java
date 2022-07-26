import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pillar1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pillar1 extends Actor
{
    public Pillar1(){
        GreenfootImage image = getImage();
        image.scale(image.getHeight()*2, image.getWidth()*2);
        setImage(image);
    }
    public void act()
    {
        move(-2);
    }
}
