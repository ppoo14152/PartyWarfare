import greenfoot.*;
import java.util.*;

/**
 * Escribe una descrición de la clase Power aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Power extends Actor
{
    /**
     * Act - hace lo que Power quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    private GreenfootImage low;
    private GreenfootImage high;
    private int interruptor;
    public Power()
    {
        low=new GreenfootImage("powerlow.png");
        high=new GreenfootImage("powerhigh.png");
        interruptor=0;
    }
    
    public void act() 
    {
        
        if(Greenfoot.mouseClicked(this)&&interruptor==1)
        {
            World w=getWorld();
            desactivaPower();
            List l1=w.getObjectsAt(601,563,Indicador.class);
            ((Indicador)l1.get(0)).clear();
        }
    }    
    
    public void activaPower()
    {
        setImage(high);
        interruptor=1;
    }
    
    public void desactivaPower()
    {
        setImage(low);
        interruptor=0;
    }
}
