import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class arrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class arrow extends Actor
{
    private SimpleTimer arr;
    private GreenfootImage[] arro;
    public arrow(){
        arr = new SimpleTimer();
        arro = new GreenfootImage[2];
        GreenfootImage image = new GreenfootImage("arrow/arrow.png");
        image.scale(image.getWidth()/3 + 5, image.getHeight()/3 + 5);
        arro[0] = image;
        image = new GreenfootImage("arrow/arrow_red.png");
        image.scale(image.getWidth()/3 + 5, image.getHeight()/3 + 5);
        arro[1] = image;
        setImage(arro[0]);
        arr.mark();
    }
    int curIndex = 0;
    
    void anime(){
        if(arr.millisElapsed() > 350){
            setImage(arro[curIndex]);
            curIndex++;
            curIndex %= 2;
            arr.mark();
        }
    }
    public void act()
    {
        anime();
    }
}
