import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Parkour here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Parkour extends World
{
    private LaserJump jump;
    private LaserStay stay;
    private SimpleTimer time;
    private Gaurd gaurd;
    public static MainCPlat main;
    public Parkour()
    {    
        super(800, 600, 1, false);
        setBackground("platform.png");
        jump = new LaserJump();
        stay = new LaserStay();
        time = new SimpleTimer();
        gaurd = new Gaurd();
        main = new MainCPlat();
        addObject(main, 200, 500);
        time.mark();
    }
    public void act(){
        if(time.millisElapsed() > 1000){
            addObject(jump, 900, 500);
        }
        if(time.millisElapsed() > 4500){
            removeObject(jump);
            addObject(stay, 900, 200);
        }
        if(time.millisElapsed() > 9000){
            removeObject(stay);
            addObject(gaurd, 900, 500);
        }
        if(time.millisElapsed() > 12000){
            Bedroom world = new Bedroom();
            Greenfoot.setWorld(world);
        }
    }
    
    public void restart(){
        Parkour world = new Parkour();
        Greenfoot.setWorld(world);
    }
}
