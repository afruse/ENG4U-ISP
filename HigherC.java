import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HigherC here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HigherC extends Actor
{
    private SimpleTimer timer;
    private GreenfootImage[] idle;
    private GreenfootImage[] run;
    public HigherC(){
        idle = new GreenfootImage[2];
        run = new GreenfootImage[2];
        GreenfootImage image = new GreenfootImage("sprite_char_2/char_2_sprite_1.png");
        image.scale(image.getWidth()/3 + 5, image.getHeight()/3 + 5);
        idle[0] = image;
        image = new GreenfootImage("sprite_char_2/char_2_sprite_2.png");
        image.scale(image.getWidth()/3 + 5, image.getHeight()/3 + 5);
        idle[1] = image;
        image = new GreenfootImage("sprite_char_2/char_2_run_sprite_1.png");
        image.scale(image.getWidth()/3 + 5, image.getHeight()/3 + 5);
        run[0] = image;
        image = new GreenfootImage("sprite_char_2/char_2_run_sprite_2.png");
        image.scale(image.getWidth()/3 + 5, image.getHeight()/3 + 5);
        run[1] = image;
        setImage(idle[0]);
        timer = new SimpleTimer();
        timer.mark();
    }
    
    int curIndex = 0;
    
    private void animeIdle(){
        if(timer.millisElapsed() > 320){
            setImage(idle[curIndex]);
            curIndex++;
            curIndex %= 2;
            timer.mark();
        }
    }
    private void animeRun(){
        if(timer.millisElapsed() > 170){
            setImage(run[curIndex]);
            curIndex++;
            curIndex %= 2;
            timer.mark();
        }
    }
    public void act()
    {
        if(getX() < 680){
            setLocation(getX() + 4, getY());
            animeRun();
        }
        else if(getX() == 680 && getY() < 230){
            setLocation(getX(), getY() + 4);
            animeRun();
        }
        else{
            animeIdle();
        }
    }
}
