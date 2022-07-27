import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LastRun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LastRun extends World
{
    private Rock rock;
    private SimpleTimer time;
    public LastRun()
    {    
        super(800, 600, 1, false);
        setBackground("run.png");
        rock = new Rock();
        time = new SimpleTimer();
        time.mark();
        addObject(Parkour.main, 200, 500);
    }
    public void act(){
        throwRocks();
        if(time.millisElapsed() > 2500){
            removeObject(rock);
            time.mark();
        }
    }
    public void throwRocks(){
        int y = 800 - Greenfoot.getRandomNumber(500);
        addObject(rock, 880, y);
    }
}
