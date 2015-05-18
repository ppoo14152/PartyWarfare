import greenfoot.*;

/**
 * Esta clase representa a las piñatas guerreras del juego, en la cual se incluye a las
 * subclases de "guermalo" que representa al equipo de la oscuridad,y la subclase "guerbueno",
 * la cual hace referencia al equipo de la luz.
 * 
 * @author Irvin Alexis Rodriguez Estrada
 * @author Irving Gerardo Cardenaz Hernandez
 * @versión (Mayo 2015)
 */
public class Guerrero extends Actor
{
    /**
     * Act - hace lo que Guerrero quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    
    private GreenfootImage bum=new GreenfootImage("bum.png");
     public int muevete(int band,GreenfootImage img1,GreenfootImage img2,int dir)
    {
        move(dir);
        if(band==0)
        {
            setImage(img2);
            band=1;
        }
        else if(band==1)
        {
            setImage(img1);
            band=0;
        } 
        return band;
    }
    public void estaAlBorde()
    {
        if(isAtEdge())
        {
            World w=getWorld();
            w.removeObject(this);
        }
    } 
    public void muere()
    {
       setImage(bum);
       Greenfoot.delay(4);
       World w=getWorld();
       w.removeObject(this); 
    }
    
}
