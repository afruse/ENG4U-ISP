import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Text here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Text extends Actor
{
    /**
     * Act - do whatever the Text wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Text(){
        GreenfootImage image = getImage();
        image.scale(800, image.getHeight()+15);
        setImage(image);
    }
    public void act()
    {
        // Add your action code here.
    }
}
