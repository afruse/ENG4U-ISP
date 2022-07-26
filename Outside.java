import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Outside here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Outside extends World
{
    public static Door_in doorIn;
    public static HigherC higher;
    public static Label first;
    public static Label second;
    public static SimpleTimer textTimer;
    public Outside()
    {
        super(800, 600, 1);
        doorIn = new Door_in();
        higher = new HigherC();
        first = new Label("You: Oh...", 35);
        second = new Label("it's you...", 35);
        addObject(doorIn, 680, 489);
        doorIn.turn(180);
        addObject(higher, 300, 100);
        addObject(MyWorld.main, 680, 320);
        MainC.control = false;
        addObject(MyWorld.text, 400, 400);
        addObject(first, 230, 520);
        addObject(second, 223, 560);
        textTimer = new SimpleTimer();
        textTimer.mark();
    }
    public void act(){
        if(textTimer.millisElapsed() > 2200){
            first.setValue("???: Yes... and I");
            second.setValue(" have a job for you");
        }
        if(Greenfoot.isKeyDown("space") || Greenfoot.isKeyDown("up")){
            textTimer.mark();
            flashBack();
        }
    }
    public void stepInside(){
        MyWorld world = new MyWorld();
        Greenfoot.setWorld(world);
    }
    public void flashBack(){
        Flashback world = new Flashback();
        Greenfoot.setWorld(world);
    }
}
