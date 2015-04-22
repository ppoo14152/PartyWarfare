import greenfoot.*;
import java.util.*;

/**
 * Escribe una descrición de la clase Jugador aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class TorreLux extends Actor
{
    /**
     * Act - hace lo que Jugador quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    private int rango;
    private boolean bd;
    private int n=0;
    private int activaRango;
    public TorreLux(boolean band)
    {
        bd=band;
        activaRango=1;
    }
    public void act() 
    {
        if(activaRango==1)
        {
           rango=Greenfoot.getRandomNumber(251)+50;
           activaRango=0;
        }
        
        if(bd==true)
        {
           actuaJugador();
        }
        else
        {
           n=actuaEnemigo(n);
           if(n==0)
           activaRango=1;
           n++;
        }
    } 
    public void actuaJugador()
    {
        World w=getWorld();
        List l1=w.getObjectsAt(293,508,BotonW1.class);
        if(Greenfoot.mouseClicked(l1.get(0)))
        {
            GuerreroLux1 g1=new GuerreroLux1(1);
            w.addObject(g1,54,414);
        }
    }
    public int actuaEnemigo(int n)
    {
        
        if(n>rango)
        {
           World w=getWorld();
           GuerreroLux1 g1=new GuerreroLux1(0);
           w.addObject(g1,731,413);
           n=0;
        } 
        return n;
    }
}
