import greenfoot.*;
import java.util.*;

/**
 * Escribe una descrición de la clase Coins aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Coins extends Actor
{
    /**
     * Act - hace lo que Coins quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    private int onetime; 
    private int y;
    private World w;
    private List l1;
    public Coins()
    {
        onetime=1;
        y=0;
        w=null;
        l1=null;
    }

    public void act() 
    {
        if(y<405)
        muevete();
        
        
        if(Greenfoot.mouseClicked(this))
        {
            w=getWorld();
            l1=w.getObjectsAt(601,563,Indicador.class);
            ((Indicador)l1.get(0)).aumenta();
            w.removeObject(this);
        }
    } 
    
    public void muevete()
    {
         if(onetime==1)
        {
            y=getY();
            onetime=0;
        }
        setLocation(getX(),y);
        y++;
    }
}
