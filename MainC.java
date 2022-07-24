import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainC here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainC extends Actor
{
    /**
     * Act - do whatever the MainC wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public MainC(){
        setImage("sprite_char_1/char_1_sprite_1.png");
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("up")){
            move(4);
        }
        if(Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("down")){
            move(-4);
        }
        if(Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("left")){
            turn(-2);
        }
        if(Greenfoot.isKeyDown("d") || Greenfoot.isKeyDown("right")){
            turn(2);
        }
    }
}
