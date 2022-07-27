import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Before here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Before extends World
{
    private SimpleTimer time;
    public Before()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        time = new SimpleTimer();
        setBackground("flash.jpg");
        Outside.first.setValue("\"You join the riot, however there seems to be");
        Outside.second.setValue("huge amount of rocks being hurled at you\"");
        addObject(MyWorld.text, 400, 400);
        addObject(Outside.first, 345, 520);
        addObject(Outside.second, 353, 560);
        time.mark();
    }
    
    public void act(){
        if(time.millisElapsed() > 3000){
            Outside.first.setValue("\"The more you manage to dodge while speaking");
            Outside.second.setValue("out on Charles, the more impact you make\"");
        }
        if(time.millisElapsed() > 6000){
            Outside.first.setValue("\"However if you get hit by the rocks you will");
            Outside.second.setValue("get arrested, so it's eventually inevitable\"");
        }
        if(time.millisElapsed() > 9000){
            LastRun world = new LastRun();
            Greenfoot.setWorld(world);
        }
    }
}
