import greenfoot.*;

/**
 * Write a description of class AyudaFondo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AyudaFondo extends World
{

    /**
     * Constructor for objects of class AyudaFondo.
     * 
     */
    public AyudaFondo(GreenfootSound m)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        Boton r;
        r=new Return(m);
        addObject(r,700,500);
    }
}
