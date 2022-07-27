import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bedroom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bedroom extends World
{
    private static DoorU door;
    private static PCi pc;
    private static SimpleTimer time;
    public static boolean post = false;
    public Bedroom()
    {    
        super(800, 600, 1);
        setBackground("room.png");
        door = new DoorU();
        pc = new PCi();
        time = new SimpleTimer();
        addObject(MyWorld.bed, 76, 161);
        addObject(MyWorld.main, 680, 105);
        MainC.control = true;
        addObject(pc, 450, 70);
        addObject(MyWorld.ar, 420, 200);
        addObject(door, 680, 9);
        addObject(MyWorld.text, 400, 400);
        addObject(Outside.first, 345, 520);
        addObject(Outside.second, 353, 560);
        Outside.first.setValue("");
        Outside.second.setValue("");
        time.mark();
    }
    public void act(){
        if(post){
            if(time.millisElapsed() > 0){
                Outside.first.setValue("\"You feel guilt from assisting Charles");
                Outside.second.setValue("get away with his fraudulent charity\"");
            }
            if(time.millisElapsed() > 3000){
                Outside.first.setValue("\"You decide to post about this in your");
                Outside.second.setValue("favourite media platform for bluddit\"");
            }
            if(time.millisElapsed() > 6000){
                Outside.first.setValue("\"Little did you know it would go viral\"");
                Outside.second.setValue("");
            }
            if(time.millisElapsed() > 9000){
                Outside.first.setValue("\"You inspire many to form a riot in front");
                Outside.second.setValue("of Charles' mansion while you lead them\"");
            }
            if(time.millisElapsed() > 12000){
                LastRun world = new LastRun();
                Greenfoot.setWorld(world);
            }
        }
    }
}
