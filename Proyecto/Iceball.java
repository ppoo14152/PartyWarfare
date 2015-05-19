import greenfoot.*;

/**
 * La clase iceball o bola de nieve, al igual que la clase fireball es un poder, 
 * al ser seleccionada aparece bolas de nieve que caen y eliminan a los personajes que toque.
 * 
 * @autor Irvin Alexis Rodriguez Estrada 
 * @autor Irving Gerardo Cardenas Hernadez 
 * 
 * @versión (17.15.2015)
 */
public class Iceball extends Actor
{
    /**
     * Act - hace lo que Iceball quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    private int onetime; 
    private int y;
    private World w;
    final GreenfootImage explosion=new GreenfootImage("expice.png");
    public Iceball()
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
   
