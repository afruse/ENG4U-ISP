import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flashback here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flashback extends World
{

    /**
     * Constructor for objects of class Flashback.
     * 
     */
    public HCprop hc = new HCprop();
    private boolean butt = true; 
    public Flashback()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        setBackground("flash.jpg");
        Outside.first.setValue("\"Long time ago you used to work for the");
        Outside.second.setValue("person at the door. His name is Charles\"");
        addObject(MyWorld.text, 400, 400);
        addObject(Outside.first, 345, 520);
        addObject(Outside.second, 353, 560);
    }
    
    public void act(){
        if(Outside.textTimer.millisElapsed() > 5000){
            Outside.first.setValue("\"You were desperate for money,");
            Outside.second.setValue("you were dying on the street\"");
        }
        if(Outside.textTimer.millisElapsed() > 10000){
            Outside.first.setValue("\"That's why when Charles offered to pay");
            Outside.second.setValue("you for doing his dirty deeds you accepted\"");
            addObject(hc, 400, 200);
        }
        if(Outside.textTimer.millisElapsed() > 15000){
            Outside.first.setValue("\"You later quit while threatening to");
            Outside.second.setValue("expose him being linked to the crimes\"");
        }
        if(Outside.textTimer.millisElapsed() > 18000){
            Outside.first.setValue("\" You heavily regretted working for him");
            Outside.second.setValue("committing crimes taking advantage of lower class\"");
        }
        if(Outside.textTimer.millisElapsed() > 18000 && Greenfoot.isKeyDown("space")){
            Outside.textTimer.mark();
            stepOutsideC();
        }
/*            while(Outside.textTimer.millisElapsed() < 99999){
                if(Greenfoot.isKeyDown("space") && Outside.textTimer.millisElapsed() > 500){
                    Outside.first.setValue("\"That's why when Charles offered to pay");
                    Outside.second.setValue("you for doing his dirty deeds you accepted\"");
                    addObject(hc, 400, 200);
                    if(Outside.textTimer.millisElapsed() > 19000){
                        stepOutsideC();
                    }
                }
            }*/
    }
    private void stepOutsideC(){
        OutsideC world = new OutsideC();
        Greenfoot.setWorld(world);
    }
}
