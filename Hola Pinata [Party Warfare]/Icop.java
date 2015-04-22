import greenfoot.*;

/**
 * Write a description of class Icop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Icop extends Boton
{
    /**
     * Act - do whatever the Icop wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private GreenfootSound m;
    private World m2;
    public Icop(GreenfootSound m1)
    {
        m=m1;
        m2=getWorld();
    }
    public void act() 
    {
        mouseSobreObjecto(m2);
        cambiaMundo(m,m2);
    }  
    public void mouseSobreObjecto(World w)
    {
          if(Greenfoot.mouseMoved(this))
        {
            setImage("ICO2.2.png");
        }
        else if(Greenfoot.mouseMoved(w))
        {
            setImage("ICO2.png");
        }
    }
    public void cambiaMundo(GreenfootSound m,World w)
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("Click.mp3");
            w=new PuntFondo(m);
            Greenfoot.setWorld(w);
        } 
    }
}
