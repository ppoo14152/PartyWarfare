import greenfoot.*;

/**
 * Escribe una descrici�n de la clase Tornado aqu�.
 * 
 * @autor (tu nombre) 
 * @versi�n (Un n�mero de versi�n o una fecha)
 */
public class Tornado extends Actor
{
    /**
     * Act - hace lo que Tornado quiere hacer. Este m�todo se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    private GreenfootImage img1;
    private GreenfootImage img2;
    private GreenfootImage img3;
    private GreenfootImage img4;
    private GreenfootImage img5;
    private GreenfootImage img6;
    private int select;
    private int direcion;
    public Tornado(int dir)
    {
        img1=new GreenfootImage("tornadu.png");
        img2=new GreenfootImage("tornadu.1.png");
        img3=new GreenfootImage("tornadu.2.png");
        img4=new GreenfootImage("tornadu.3.png");
        img5=new GreenfootImage("tornadu.4.png");
        img6=new GreenfootImage("tornadu.5.png");
        select=0;
        direcion=dir;
    }

    public void act() 
    {
        move(direcion);
        if(direcion==1)
        {
            if(getX()==657)
            {
                World w=getWorld();
                w.removeObject(this);
            }
        }
        else
        {
            if(getX()==160)
            {
                World w=getWorld();
                w.removeObject(this);
            } 
        }
        if(select==0)
        {
            setImage(img1);
            select=1; 
        }
        else if(select==1)
        {
            setImage(img2);
            select=2;
        }
        else if(select==2)
        {
            setImage(img3);
            select=3;
        }
        else if(select==3)
        {
            setImage(img4);
            select=4;
        }
        else if(select==4)
        {
            setImage(img5);
            select=5;
        }else
        {
            setImage(img6);
            select=0;   
        }
    }    
}
