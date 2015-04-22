import greenfoot.*;

/**
 * Escribe una descrición de la clase GuerreroLux1 aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class GuerreroLux1 extends Actor
{
    /**
     * Act - hace lo que GuerreroLux1 quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    private GreenfootImage img1=new GreenfootImage("b1.png");
    private GreenfootImage img2=new GreenfootImage("b2.png");
    private int band=0;
    private int dir;
    public GuerreroLux1(int unNum)
    {
        if(unNum==1)
        {
          img1.mirrorHorizontally();
          img2.mirrorHorizontally();
          dir=1;
        }
        else
        {
          dir=-1;
        }
        setImage(img1);
        
    }
    public void act() 
    {
       band=muevete(band);
       estaAlBorde();
    }
    public int muevete(int band)
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
}
