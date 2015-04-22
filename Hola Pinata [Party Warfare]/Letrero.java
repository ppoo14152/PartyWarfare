import greenfoot.*;
import java.awt.*;

/**
 * Write a description of class Letrero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Letrero extends Actor
{
    /**
     * Act - do whatever the Letrero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String letter;
    public Letrero(String unletter,int x,int y) 
    {
        letter = unletter;
        GreenfootImage img = new GreenfootImage( x, y );
        img.setColor( new Color( 100, 100, 100 ));
        //img.fill();
        img.setColor( Color.RED );
        img.setFont( new Font("Comic Sans MS", Font.BOLD, 30) );
        img.drawString( letter, 10, 50);
        setImage( img );
    }    
}
