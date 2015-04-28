import greenfoot.*;

/**
 * Escribe una descrición de la clase BotonHome aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class BotonHome extends Actor
{
    /**
     * Act - hace lo que BotonHome quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    private GreenfootSound musica;
    private World w;
    public BotonHome(GreenfootSound m) 
    {
        musica=m;
        w=getWorld();
    }
    
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
           cambiaMundo();
        }
    }
    
    public void cambiaMundo()
    {
         w=new Inicio(musica);
         Greenfoot.setWorld(w);
    }
}
