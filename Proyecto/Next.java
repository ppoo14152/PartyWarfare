import greenfoot.*;

/**
 * Este boton  funciona dentro del menu de seleccion de escenario, al presionarlo
 * se cambia al siguiente escenario.
 * 
 * @author Irvin Alexis Rodriguez Estrada
 * @author Irving Gerardo Cardenaz Hernandez
 * @versión (Mayo 2015)
 */
public class Next extends Boton
{
    static int USA=1;
    static int FRANCE=2;
    static int EGYPT=3;
    static int JAPAN=4;
    static int MEXICO=5;
    private int Next;
    private GreenfootSound m;
    private World w;
    private Jugador jug;
    private Enemigo ene;
    public Next(int direccion,GreenfootSound m1,Jugador j,Enemigo e)
    {
        Next=direccion;
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
    
    /**
     * heredado de la clase abstracta Boton indica si el cursor est sobre el y manda una respuesta visual
     * 
     * @param w mundo actual
     */
     public void mouseSobreObjecto(World w)
    {
          if(Greenfoot.mouseMoved(this))
        {
            setImage("Next.png");
        }
        else if(Greenfoot.mouseMoved(w))
        {
            setImage("Next.png");
        }
    }
    
     /**
     * heredado de la clase abstracta Boton indica si el cursor est sobre el y manda una respuesta visual
     * 
     * @param w mundo actual
     */
     public void cambiaMundo(GreenfootSound m,World w)
    {
         if(Greenfoot.mouseClicked(this)||Greenfoot.isKeyDown("right"))
        {
            if(Next==USA)
            {
              
              w= new EscogeE2(2,1,m,jug,ene);
              Greenfoot.setWorld(w);
            }
            else if(Next==FRANCE)
            {
              
              w= new EscogeE3(3,2,m,jug,ene);
              Greenfoot.setWorld(w); 
            }
            else if(Next==EGYPT)
            {
               
              w= new EscogeE4(4,3,m,jug,ene);
              Greenfoot.setWorld(w);
            }
            else if(Next==JAPAN)
            {
              
              w= new EscogeE5(5,1,m,jug,ene);
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
