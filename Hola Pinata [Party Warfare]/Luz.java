import greenfoot.*;

/**
 * Escribe una descrición de la clase Luz aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Luz extends Symbol
{
    /**
     * Act - hace lo que Luz quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    private World w1;
    private GreenfootSound m;
    public Luz(GreenfootSound m1)
    {
        w1=getWorld();
        m=m1;
    }
    public void act() 
    {
       mouseSobreSimbolo(w1);
       empezarJuego(w1,m); 
    }
    public void mouseSobreSimbolo(World w)
    {
       if(Greenfoot.mouseMoved(this))
        {
            setImage("SimbolLUX.2.png");
            
        }
        else if(Greenfoot.mouseMoved(w))
        {
            setImage("SimbolLUX.png");
        } 
    }
    public void empezarJuego(World w,GreenfootSound m) 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Jugador j=new Jugador();
            j.setBando(true);
            Enemigo e=new Enemigo();
            e.setBando(false);
            w=new EscogeE1(1,5,m,j,e);
            Greenfoot.setWorld(w);
        }
    }
}
