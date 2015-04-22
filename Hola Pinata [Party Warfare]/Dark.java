import greenfoot.*;

/**
 * Escribe una descrición de la clase Dark aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Dark extends Symbol
{
    /**
     * Act - hace lo que Dark quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
     private World w1;
     private GreenfootSound m;
    public Dark(GreenfootSound m1)
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
            setImage("SimbolOsc.2.png");
            
        }
        else if(Greenfoot.mouseMoved(w))
        {
            setImage("SimbolOsc.png");
        } 
    }
    public void empezarJuego(World w,GreenfootSound m) 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Jugador j=new Jugador();
            j.setBando(false);
            Enemigo e=new Enemigo();
            e.setBando(true);
            w=new EscogeE1(1,5,m,j,e);
            Greenfoot.setWorld(w);
        }
    }
}
