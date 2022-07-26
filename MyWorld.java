import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public static Bed bed;
    public static PC pc;
    private static Door door;
    public static arrow ar;
    public static Text text;
    public static MainC main;
    public Label knock;
    public Label open;
    public MyWorld()
    {    
        super(800, 600, 1);
        setBackground("room.png");
        bed = new Bed();
        pc = new PC();
        door = new Door();
        ar = new arrow();
        text = new Text();
        knock = new Label("There is knocking at the door....", 35);
        open = new Label("\"Can you please step outside?\"", 35);
        main = new MainC();
        addObject(bed, 76, 161);
        addObject(main, 83, 95);
        MainC.control = true;
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
