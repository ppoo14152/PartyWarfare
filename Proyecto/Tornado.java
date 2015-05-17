import greenfoot.*;

/**
 * Escribe una descrición de la clase Tornado aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Tornado extends Actor
{
    /**
     * Act - hace lo que Tornado quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    private GreenfootImage img1;
    private GreenfootImage img2;
    private int select;
    private int direcion;
    public Tornado(int dir)
    {
        img1=new GreenfootImage("tornadu.png");
        select=1;
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
        if(select==1)
        {
            img1.mirrorHorizontally();
            setImage(img1);
            select=0; 
        }
        else
        {
            img1.mirrorHorizontally();
            setImage(img1);
            select=1;
        }
    }    
}
