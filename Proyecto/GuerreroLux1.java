import greenfoot.*;

/**
 * Escribe una descrición de la clase GuerreroLux1 aquí.
 * 
 * @author Irvin Alexis Rodriguez Estrada
 * @author Irving Gerardo Cardenaz Hernandez
 * @versión (Mayo 2015)
 */
public class GuerreroLux1 extends GuerBueno
{
    /**
     * Act - hace lo que GuerreroLux1 quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    private GreenfootImage i1=new GreenfootImage("b1.png");
    private GreenfootImage i2=new GreenfootImage("b2.png");
    private GreenfootImage i3=new GreenfootImage("b3.png");
    private int vida=50;
    private int band=0;
    private int band2=0;
    private int band3=0;
    private int dir;
    private int dineroguerra=0;
    private int scoreguerra=0;
    public GuerreroLux1(int unNum)
    {
        if(unNum==1)
        {
            i1.mirrorHorizontally();
            i2.mirrorHorizontally();
            i3.mirrorHorizontally();
            dir=1;
        }
        else
        {
            dir=-1;
        }
        setImage(i1);

    }

    public void act() 
    {
        if(isTouching(GuerMalo.class))
        {
            if(band2==0)
            {
                setImage(i1);
                band2=1;
            }
            else if(band2==1)
            {
                setImage(i3);
                band2=0;
            } 
            int activa=Greenfoot.getRandomNumber(80);
            if(activa==5)
            {
                dineroguerra=dineroguerra+200;
            }
            vida--;
        }
        else if(objectoEnFrente(dir)==true)
        {
            setImage(i1);
        }
        else if(isTouching(TorreDark.class))
        {
            if(band3==0)
            {
                setImage(i1);
                band3=1;
            }
            else if(band3==1)
            {
                setImage(i3);
                band3=0;
            } 
            int activa=Greenfoot.getRandomNumber(50);
            if(activa==5)
            {
                scoreguerra=scoreguerra+Greenfoot.getRandomNumber(90);
            }
        }
        else
        {
            band=muevete(band,i1,i2,dir);
        }
        if(vida<0)
        {
            muere();
        }
        else
        {
            estaAlBorde();
        }
    }

    public int retribulleDinero()
    {
        int dinero=0;
        dinero=dineroguerra;
        dineroguerra=0;
        return dinero;
    }
    
    public int retribulleScore()
    {
        int score=0;
        score=scoreguerra;
        scoreguerra=0;
        return score;
    }
}
