import greenfoot.*;

/**
 * Escribe una descrición de la clase Prev aquí.
 * 
 * @author Irvin Alexis Rodriguez Estrada
 * @author Irving Gerardo Cardenaz Hernandez
 * @versión (Mayo 2015)
 */
public class Prev extends Boton
{
    /**
     * Act - hace lo que Prev quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    static int USA=2;
    static int FRANCE=3;
    static int EGYPT=4;
    static int JAPAN=5;
    static int MEXICO=1;
    private int Pre;
    private GreenfootSound m;
    private World w;
    private Jugador jug;
    private Enemigo ene;
    public Prev(int direccion,GreenfootSound m1,Jugador j,Enemigo e)
    {
        Pre=direccion;
        m=m1;
        w=getWorld();
        jug=j;
        ene=e;
    }
    public void act() 
    {
        mouseSobreObjecto(w);
        cambiaMundo(m,w);
    } 
      public void mouseSobreObjecto(World w)
    {
          if(Greenfoot.mouseMoved(this))
        {
            setImage("Previus.png");
        }
        else if(Greenfoot.mouseMoved(w))
        {
            setImage("Previus.png");
        }
    }
    public void cambiaMundo(GreenfootSound m,World w)
    {
        if(Greenfoot.mouseClicked(this)||Greenfoot.isKeyDown("left"))
        {
            if(Pre==USA)
            {
              
              w= new EscogeE2(2,1,m,jug,ene);
              Greenfoot.setWorld(w);
            }
            else if(Pre==FRANCE)
            {
              
              w= new EscogeE3(3,2,m,jug,ene);
              Greenfoot.setWorld(w); 
            }
            else if(Pre==EGYPT)
            {
            
              w= new EscogeE4(4,3,m,jug,ene);
              Greenfoot.setWorld(w);
            }
            else if(Pre==JAPAN)
            {
              
              w= new EscogeE5(5,4,m,jug,ene);
              Greenfoot.setWorld(w);
            }
            else
            {
             
              w= new EscogeE1(1,5,m,jug,ene);
              Greenfoot.setWorld(w);
            }
        }
          
    }
}
