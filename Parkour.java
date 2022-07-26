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
    private static SimpleTimer time1;
    public static Pillar pill;
    public static Pillar pill1;
    public Parkour()
    {    
        super(800, 600, 1, false);
        pill = new Pillar();
        pill1 = new Pillar();
        time = new SimpleTimer();
        time1 = new SimpleTimer();
        time.mark();
        time1.mark();
    }
    public void act(){
        if(time.millisElapsed() > 0){
            pillSpawn();
        }
        if(time.millisElapsed() > 2000){
            pillSpawn1();
            time1.mark();
        }
        if(time.millisElapsed() > 4000){
            removeObject(pill);
            time.mark();
        }
        if(time1.millisElapsed() > 4000){
            removeObject(pill1);
            time1.mark();
        }
    }
    public void pillSpawn(){
        int y = (600 + Greenfoot.getRandomNumber(200));
        addObject(pill, 860, y);
    }
    public void pillSpawn1(){
        int y = (600 + Greenfoot.getRandomNumber(200));
        addObject(pill1, 860, y);
    }
}
