import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;

/**
 * La clase vida representa la salud de las torres, la cual al ser atacada disminuye y cambia de color
 * dependiendo del da�o que haya recibido.
 * 
 * @author Irvin Alexis Rodriguez Estrada
 * @author Irving Gerardo Cardenaz Hernandez
 * @versión (Mayo 2015)
 */
public class Vida extends Actor
{
    /**
     * Act - hace lo que Vida quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    public Vida() 
    {
        GreenfootImage vida = new GreenfootImage(262, 20);
        vida.setColor(Color.GREEN);
        vida.fill();
        setImage(vida);
    }

    public int reduceVida(int dano,GreenfootImage vd)
    {
        if(basta(dano,vd)==false)
        {
            int vid=(vd.getWidth())-dano;
            GreenfootImage vida =new GreenfootImage(vid, 20);
            if(vid>176)
            {
                vida.setColor(Color.GREEN);
            }
            else if(vid>88)
            {
                vida.setColor(Color.ORANGE);
            }
            else
            {
                vida.setColor(Color.RED);
            }
            vida.fill();
            setImage(vida);
            return 0;
        }
        else
        {
            vd.clear();
            setImage(vd);
            return 1;
        }
    }
    
    public int incrementaVida(int inc,GreenfootImage vd)
    {
        if(tope(inc,vd)==false)
        {
            int vid=(vd.getWidth())+inc;
            GreenfootImage vida =new GreenfootImage(vid, 20);
            if(vid>176)
            {
                vida.setColor(Color.GREEN);
            }
            else if(vid>88)
            {
                vida.setColor(Color.ORANGE);
            }
            else
            {
                vida.setColor(Color.RED);
            }
            vida.fill();
            setImage(vida);
            return 0;
        }
        else
        {
            setImage(vd);
            return 1;
        }
        
    }

    public boolean basta(int dano,GreenfootImage vd)
    {
        if(vd.getWidth()<=dano)
            return true;
        else
            return false;
    }
    
    public boolean tope(int inc,GreenfootImage vd)
    {
        if(vd.getWidth()+inc>262)
          return true;
        else
          return false;
    }
   
}
