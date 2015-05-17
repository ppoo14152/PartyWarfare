import greenfoot.*;

/**
 * Escribe una descrición de la clase Tanque aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Tanque extends Actor
{
    /**
     * Act - hace lo que Tanque quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    private GreenfootImage tank;
    private GreenfootImage tankattack;
    private int ponimage;
    private int dir;
    public Tanque(boolean band)
    {
        if(band==true)
        {
            tank=new GreenfootImage("tanquedark.png");
            tankattack=new GreenfootImage("tanquedark.1.png");
            dir=1;
        }
        else
        {
            tank=new GreenfootImage("tanquelux.png");
            tankattack=new GreenfootImage("tanquelux.1.png");
            tank.mirrorHorizontally();
            tankattack.mirrorHorizontally();
            dir=-1;
        }
        ponimage=1;
    }
    
    public void act() 
    {
        if(ponimage==1)
        {
            setImage(tank);
            ponimage=0;
        }
        move(dir);
    }    
}
