import greenfoot.*;
import java.util.*;

/**
 * Este objeto es el guerrero más fuerte del equipo de la oscuridad
 * se mueve y ataca a sus enemigos;para llevarlo al campo de batalla se 
 * requieren x monedas.
 * 
 * @author Irvin Alexis Rodriguez Estrada
 * @author Irving Gerardo Cardenaz Hernandez
 * @versión (Mayo 2015)
 */
public class GuerreroDark3 extends GuerMalo
{
    /**
     * Act - hace lo que GuerreroDark3 quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    private GreenfootImage img1=new GreenfootImage("jin1.png");
    private GreenfootImage img2=new GreenfootImage("jin2.png");
    private GreenfootImage img3=new GreenfootImage("jin3.png");
    private int vida=100;
    private int band=0;
    private int band2=0;
    private int dir;
    private int dineroguerra=0;
    private int scoreguerra=0;
    private int cambio;
    public GuerreroDark3(int unNum) 
    {
        if(unNum==1)
        {
            img1.mirrorHorizontally();
            img2.mirrorHorizontally();
            img3.mirrorHorizontally();
            dir=1;
        }
        else
        {
            dir=-1;
        }
        cambio=0;
        setImage(img1);

    }  

    public void act() 
    {
        if(isTouching(GuerBueno.class))
        {
            if(band2==0)
            {
                setImage(img2);
                band2=1;
            }
            else if(band2==1)
            {
                setImage(img3);
                band2=0;
            } 
            int activa=Greenfoot.getRandomNumber(20);
            if(activa==5)
            {
                dineroguerra=dineroguerra+200;
            }
            vida--;
        }
        else if(objectoEnFrente(dir)==true&&cambio==0)
        {
            setImage(img2);
        }
        else if(isTouching(TorreLux.class))
        {
            if(band2==0)
            {
                setImage(img2);
                band2=1;
            }
            else if(band2==1)
            {
                setImage(img3);
                band2=0;
            }  
            int activa=Greenfoot.getRandomNumber(50);
            if(activa==5)
            {
                scoreguerra=scoreguerra+Greenfoot.getRandomNumber(90);
            }
        }
        else
        {
            band=muevete(band,img1,img2,dir);
        }
        if(vida<0)
        {
            muere();
        }
        else
        {
            estaAlBorde();
        }
    } 

    public boolean objectoEnFrente(int dir)
    {
        if(dir>0)
        {
            List l1=this.getObjectsAtOffset(70,0,GuerMalo.class);
            if(l1.isEmpty()==false)
                return true;
            else
                return false;
        }
        else
        {
            List l1=this.getObjectsAtOffset(-70,0,GuerMalo.class);
            if(l1.isEmpty()==false)
                return true;
            else
                return false;  
        }
    }

    public int retribulleDinero()
    {
        int dinero=0;
        dinero=dineroguerra;
        dineroguerra=0;
        return dinero;
    }
    
    public int retribulleScore()
    {
        int score=0;
        score=scoreguerra;
        scoreguerra=0;
        return score;
    }
    
        public void cambiaDireccion()
    {
        if(dir==1)
        {
            img1.mirrorHorizontally();
            img2.mirrorHorizontally();
            img3.mirrorHorizontally();
            dir=-1;
        }
        else
        {
            img1.mirrorHorizontally();
            img2.mirrorHorizontally();
            img3.mirrorHorizontally();
            dir=1;
        }
        cambio=1;
    }
}
