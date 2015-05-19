import greenfoot.*;
import java.util.*;

/**
 * Escribe una descrición de la clase Nuclear aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Nuclear extends Actor
{
    /**
     * Act - hace lo que Nuclear quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    private GreenfootImage img1;
    private GreenfootImage img2;
    private GreenfootImage img3;
    private GreenfootImage img4;
    private GreenfootImage img5;
    private GreenfootImage img6;
    private GreenfootImage img7;
    private GreenfootImage img8;
    private GreenfootImage img9;
    private GreenfootImage img10;
    private int cambio;
    public Nuclear()
    {
        img1=new GreenfootImage("nuke1.png");
        img2=new GreenfootImage("nuke2.png");
        img3=new GreenfootImage("nuke3.png");
        img4=new GreenfootImage("nuke4.png");
        img5=new GreenfootImage("nuke5.png");
        img6=new GreenfootImage("nuke6.png");
        img7=new GreenfootImage("nuke7.png");
        img8=new GreenfootImage("nuke8.png");
        img9=new GreenfootImage("nuke9.png");
        img10=new GreenfootImage("nuke10.png");
        cambio=0;
    }

    public void act() 
    {
        if(cambio==0)
        {
            setImage(img1);
            cambio=1;
        }
        else if(cambio==1)
        {
            setImage(img1);
            cambio=2;
        }
        else if(cambio==2)
        {
            setImage(img3);
            cambio=3;
        }
        else if(cambio==3)
        {
            setImage(img4);
            cambio=4;
        }
        else if(cambio==4)
        {
            setImage(img5);
            cambio=5;
        }
        else if(cambio==5)
        {
            setImage(img6);
            cambio=6;
        }
        else if(cambio==6)
        {
            setImage(img7);
            cambio=7;
        }
        else if(cambio==7)
        {
            setImage(img8);
            cambio=8;
        }
        else if(cambio==8)
        {
            setImage(img9);
            cambio=9;
        }
        else 
        {
            setImage(img10);
            World w=getWorld();
            w.removeObject(this);
            List<Guerrero> guerreros=w.getObjects(Guerrero.class);
            if(guerreros.isEmpty()==false)
            {
                for(Guerrero guer:guerreros)
                {
                    guer.muere();
                }
            }
        }
    }    
}
