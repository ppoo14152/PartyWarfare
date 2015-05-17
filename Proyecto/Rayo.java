import greenfoot.*;

/**
 * Escribe una descrición de la clase Rayo aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Rayo extends Actor
{
    /**
     * Act - hace lo que Rayo quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    private int onetime; 
    private int y;
    private World w;
    final GreenfootImage explosion=new GreenfootImage("expfire.png");
    public Rayo()
    {
        onetime=1;
        y=0;
        w=null;
    }
    
    public void act() 
    {
        if(y<405)
        caida();
        if(y==404)
        {
            setImage(explosion);
            Greenfoot.delay(15);
            w=getWorld();
            w.removeObject(this);
        }
    } 
    
    public void caida()
    {
         if(onetime==1)
        {
            y=getY();
            onetime=0;
        }
        setLocation(getX(),y);
        y++;
    }
}
  

