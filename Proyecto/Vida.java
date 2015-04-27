import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;

/**
 * Escribe una descrición de la clase Vida aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
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

    public boolean basta(int dano,GreenfootImage vd)
    {
        if(vd.getWidth()<dano)
            return true;
        else
            return false;
    }
}
