import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PCi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PCi extends Actor
{
    public PCi(){
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/2, image.getHeight()/2);
        setImage(image);
    }
    public void act()
    {
        if(isTouching(MainC.class)){
            Bedroom.post = true;
        }
    }
}
