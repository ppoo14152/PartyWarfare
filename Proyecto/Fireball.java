import greenfoot.*;

/**
 * Escribe una descrición de la clase Fireball aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Fireball extends Actor
{
    /**
     * Act - hace lo que Fireball quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    private int onetime; 
    private int y;
    private World w;
    final GreenfootImage bola1=new GreenfootImage("fireball1.png");
    final GreenfootImage bola2=new GreenfootImage("fireball.png");
    final GreenfootImage bola3=new GreenfootImage("fireball2.png");
    final GreenfootImage explosion=new GreenfootImage("expfire.png");
    private int a;
    public Fireball()
    {
        onetime=1;
        y=0;
        w=null;
        a=0;
    }
    
    public void act() 
    {
        if(y<405)
        caida();
        
        if(a==0)
        {
            setImage(bola1);
            a=1;
        }
        else if(a==1)
        {
            setImage(bola2);
            a=2;
        }else
        {
            setImage(bola3);
            a=0;
        }
        
        if(y==404)
        {
            setImage(explosion);
            Greenfoot.delay(1);
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
