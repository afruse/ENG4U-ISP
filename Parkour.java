import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Parkour here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Parkour extends World
{
    private static SimpleTimer time;
    public static Pillar pill;
    public Parkour()
    {    
        super(800, 600, 1, false);
        pill = new Pillar();
        time = new SimpleTimer();
        time.mark();
    }
    public void act(){
        if(time.millisElapsed() > 500){
            pillSpawn();
        }
        if(time.millisElapsed() > 6000){
            removeObject(pill);
            time.mark();
        }
    }
    public void pillSpawn(){
        int y = (600 + Greenfoot.getRandomNumber(70));
        addObject(pill, 860, y);
    }
}
