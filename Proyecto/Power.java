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
    private boolean jugador;
    private boolean enemigo;
    public Power(boolean jug,boolean ene)
    {
        low=new GreenfootImage("powerlow.png");
        high=new GreenfootImage("powerhigh.png");
        interruptor=0;
        jugador=jug;
        enemigo=ene;
    }

    public void act() 
    {

        if(Greenfoot.mouseClicked(this)&&interruptor==1)
        {
            World w=getWorld();
            activaPoder(jugador);
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

    public void activaPoder(boolean band)
    {
        aumentaDinero(band);
    }
    
    public void atraso(boolean band)
    {
       World w=getWorld();
        if(band==true)
        {
            List<GuerMalo> guerrerosdark=w.getObjects(GuerMalo.class);
            for(GuerMalo guer:guerrerosdark)
            {
                guer.cambiaDireccion();
            }
        }
        else
        {
            List<GuerBueno> guerreroslux=w.getObjects(GuerBueno.class);
            for(GuerBueno guer:guerreroslux)
            {
                guer.cambiaDireccion();
            }
        } 
    }
    
    public void aumentaSalud(boolean band)
    {
        World w=getWorld();
        if(band==true)
        {
            List l1=w.getObjects(TorreLux.class);
            ((TorreLux)l1.get(0)).masSalud();
        }
        else
        {
            List l1=w.getObjects(TorreDark.class);
            ((TorreDark)l1.get(0)).masSalud(); 
        }
    }
    
    public void aumentaDinero(boolean band)
    {
          World w=getWorld();
        if(band==true)
        {
            List l1=w.getObjects(TorreLux.class);
            ((TorreLux)l1.get(0)).aumentaDinero();
        }
        else
        {
            List l1=w.getObjects(TorreDark.class);
            ((TorreDark)l1.get(0)).aumentaDinero(); 
        }
    }
}
