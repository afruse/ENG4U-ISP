import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public Bed bed;
    public PC pc;
    public Door door;
    public arrow ar;
    public Text text;
    public Label knock;
    public Label open;
    public MyWorld()
    {    
        super(800, 600, 1);
        bed = new Bed();
        pc = new PC();
        door = new Door();
        ar = new arrow();
        text = new Text();
        knock = new Label("There is knocking at the door....", 35);
        open = new Label("\"Can you please step outside?\"", 35);
        MainC main = new MainC();
        addObject(bed, 76, 161);
        addObject(main, 83, 95);
        addObject(pc, 450, 70);
        addObject(door, 680, 9);
        addObject(ar, 680, 100);
        addObject(text, 400, 400);
        addObject(knock, 230, 520);
        addObject(open, 223, 560);
    }
    public void stepOutside(){
        Outside world = new Outside();
        Greenfoot.setWorld(world);
    }
}
