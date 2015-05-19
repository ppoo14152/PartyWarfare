import greenfoot.*;

/**
 * Este boton inicializa el juego, nos llevará a la pantalla de selección de equipo y después
 * a la pantalla de selección de escenario.
 * 
 * @author Irvin Alexis Rodriguez Estrada
 * @author Irving Gerardo Cardenaz Hernandez
 * @versión (Mayo 2015)
 */
public class icoj extends Boton
{
    /**
     * Act - do whatever the icoj wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootSound m;
    private World m2;
    public icoj(GreenfootSound m1)
    {
        m=m1;
        m2=getWorld();
    }
    public void act() 
    {
        mouseSobreObjecto(m2);
        cambiaMundo(m,m2);
    }  
    
    /**
     * heredado de la clase abstracta Boton indica si el cursor est sobre el y manda una respuesta visual
     * 
     * @param w mundo actual
     */
    public void mouseSobreObjecto(World w)
    {
          if(Greenfoot.mouseMoved(this))
        {
            setImage("ICO1.2.png");
        }
        else if(Greenfoot.mouseMoved(w))
        {
            setImage("ICO1.png");
        }
    }
    
     /**
     * heredado de la clase abstracta Boton indica si el cursor est sobre el y manda una respuesta visual
     * 
     * @param w mundo actual
     */
    public void cambiaMundo(GreenfootSound m,World w)
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("Click.mp3");
            w=new EscBando(m);
            Greenfoot.setWorld(w);
        } 
    }
}
