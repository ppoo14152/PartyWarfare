import greenfoot.*;

/**
 * Escribe una descrición de la clase Play aquí.
 * 
 * @author Irvin Alexis Rodriguez Estrada
 * @author Irving Gerardo Cardenaz Hernandez
 * @versión (Mayo 2015)
 */
public class Play extends Actor
{
    /**
     * Act - hace lo que Play quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    static int MEXICO=1;
    static int USA=2;
    static int FRANCE=3;
    static int EGYPT=4;
    static int JAPAN=5;
    private GreenfootSound m;
    private int ply;
    private Jugador jug;
    private Enemigo ene;
    public Play(GreenfootSound m1,int num,Jugador j,Enemigo e)
    {
       m=m1; 
       ply=num;
       jug=j;
       ene=e;
    }
    public void act() 
    {
         if(Greenfoot.mouseClicked(this))
        {
            if(ply==MEXICO)
            {
              World w=getWorld();
              m.pause();
              w= new Juego(1,jug,ene);
              Greenfoot.setWorld(w);
            }
            else if(ply==USA)
            {
              World w=getWorld();
              m.pause();
              w= new Juego(2,jug,ene);
              Greenfoot.setWorld(w);
            }
             else if(ply==FRANCE)
            {
              World w=getWorld();
              m.pause();
              w= new Juego(3,jug,ene);
              Greenfoot.setWorld(w);
            }
             else if(ply==EGYPT)
            {
              World w=getWorld();
              m.pause();
              w= new Juego(4,jug,ene);
              Greenfoot.setWorld(w);
            }
             else 
            {
              World w=getWorld();
              m.pause();
              w= new Juego(5,jug,ene);
              Greenfoot.setWorld(w);
            }
        }
    }
    }
