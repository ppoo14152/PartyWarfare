import greenfoot.*;

/**
 * Write a description of class PuntFondo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PuntFondo extends World
{

    /**
     * Constructor for objects of class PuntFondo.
     * 
     */
    public PuntFondo(GreenfootSound m)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        Boton r;
        r=new Return(m);
        addObject(r,700,500);
    }
}
