import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pillar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pillar extends Actor
{
    /**
     * Act - do whatever the Pillar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Pillar(){
        GreenfootImage image = getImage();
        image.scale(image.getHeight()*2, image.getWidth()*2);
        setImage(image);
    }
    public void act()
    {
        move(-2);
    }
}
