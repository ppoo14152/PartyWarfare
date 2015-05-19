import greenfoot.*;
import java.util.*;

/**
 * La clase indicador representa al contenedor de las estrellas que es necesario acumular para
 * utilizar uno de los diversos poderes que se tienen.
 * 
 * @autor Irvin Alexis Rodriguez Estrada 
 * @autor Irving Gerardo Cardenas Hernadez 
 * 
 * @versión (17.15.2015)
 */
public class Indicador extends Actor
{
    /**
     * Act - hace lo que Indicador quiere hacer. Este mÃ©todo se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    private GreenfootImage vacio; 
    private GreenfootImage uno;
    private GreenfootImage dos;
    private GreenfootImage tres;
    private GreenfootImage cuatro;
    private GreenfootImage full;
    private int cantidad;
    public Indicador() 
    {
        vacio=new GreenfootImage("coinsclear.png");
        uno=new GreenfootImage("coinsfull.5.png");
        dos=new GreenfootImage("coinsfull.4.png");
        tres=new GreenfootImage("coinsfull.3.png");
        cuatro=new GreenfootImage("coinsfull.2.png");
        full=new GreenfootImage("coinsfull.png");
        cantidad=0;
    }
    
    public void act()
    {
        if(cantidad>=5)
        {
            World w=getWorld();
            List l1=w.getObjectsAt(405,513,Power.class);
            ((Power)l1.get(0)).activaPower();
        }
    }
    
    public void aumenta()
    {
        cantidad++;
        if(cantidad==1)
        {
            setImage(uno);
        }
        else if(cantidad==2)
        {
            setImage(dos);
        }
        else if(cantidad==3)
        {
            setImage(tres);
        }
        else if(cantidad==4)
        {
            setImage(cuatro);
        }
        else
        {
            setImage(full);
        }
    }
    
    public void clear()
    {
        cantidad=0;
        setImage(vacio);
    }
}
