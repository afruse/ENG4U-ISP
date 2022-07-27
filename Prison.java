import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Prison here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Prison extends World
{

    /**
     * Constructor for objects of class Prison.
     * 
     */
    private Bars bars = new Bars();
    private SimpleTimer time = new SimpleTimer();
    public Prison()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        setBackground("Prison.png");
        MainC.control = false;
        addObject(MyWorld.main, 400, 300);
        addObject(bars, 400, 300);
        addObject(MyWorld.text, 400, 400);
        Outside.first.setValue("");
        Outside.second.setValue("");
        addObject(Outside.first, 345, 520);
        addObject(Outside.second, 353, 560);
        time.mark();
    }
    public void act(){
        if(Outside.textTimer.millisElapsed() > 0){
            Outside.first.setValue("\"You were finally hit by a rock and you");
            Outside.second.setValue(" passed out, you then woke up in a cell\"");
        }
        if(Outside.textTimer.millisElapsed() > 3000){
            Outside.first.setValue("\"They used everything you said and the");
            Outside.second.setValue("evidence they found to link you to some crimes\"");
        }
        if(Outside.textTimer.millisElapsed() > 6000){
            Outside.first.setValue("\"However Charles was let go due to");
            Outside.second.setValue("lack of evidence\"");
        }
        if(Outside.textTimer.millisElapsed() > 9000){
            Outside.first.setValue("\"You were eventually sued for defamation");
            Outside.second.setValue("and vandalism for quite a huge some of money\"");
        }
        if(Outside.textTimer.millisElapsed() > 12000){
            Outside.first.setValue("\"You are in crippling death and have to serve a");
            Outside.second.setValue(" pretty big scentence, you could never have won\"");
        }
        if(Outside.textTimer.millisElapsed() > 15000){
            Outside.first.setValue("THE END");
            Outside.second.setValue("");
        }
    }
}
