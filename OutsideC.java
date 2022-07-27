import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OutsideC here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OutsideC extends World
{
    private static Door_inC doorIn;
    public static Label second;
    public OutsideC()
    {
        super(800, 600, 1);
        setBackground("outside.png");
        doorIn = new Door_inC();
        addObject(doorIn, 680, 489);
        doorIn.turn(180);
        addObject(Outside.higher, 680, 232);
        addObject(MyWorld.main, 680, 320);
        MainC.control = false;
        Outside.first.setValue("You: Why would I ever work for you");
        Outside.second.setValue("");
        addObject(MyWorld.text, 400, 400);
        addObject(Outside.first, 345, 520);
        addObject(Outside.second, 353, 560);
    }
    public void act(){
        if(Outside.textTimer.millisElapsed() > 4000){
            Outside.first.setValue("Charles: I managed to erase my link to the jobs");
            Outside.second.setValue("If you don't do this job I will expose you to police");
        }
        if(Outside.textTimer.millisElapsed() > 7000){
            Outside.first.setValue("You: I don't believe you");
            Outside.second.setValue("");
        }
        if(Outside.textTimer.millisElapsed() > 10000){
            Outside.first.setValue("Charles: It's your choice if you are");
            Outside.second.setValue("willing to risk it");
        }
        if(Outside.textTimer.millisElapsed() > 13000){
            Outside.first.setValue("You: ...");
            Outside.second.setValue("Alright I will do it, this is the last time");
        }
        if(Outside.textTimer.millisElapsed() > 16000){
            doParkour();
        }
    }
    public void stepInside(){
        MyWorld world = new MyWorld();
        Greenfoot.setWorld(world);
    }
    public void doParkour(){
        Parkour world = new Parkour();
        Greenfoot.setWorld(world);
    }
}
