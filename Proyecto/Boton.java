import greenfoot.*;

/**
 * Write a description of class Boton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Boton extends Actor
{
    /**
     * Act - do whatever the Boton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    abstract public void mouseSobreObjecto(World w);
    abstract public void cambiaMundo(GreenfootSound m, World w);
}
