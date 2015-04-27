import greenfoot.*;

/**
 * Escribe una descrición de la clase Guerrero aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
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
       Greenfoot.delay(15);
       World w=getWorld();
       w.removeObject(this); 
    }
   
}
