import greenfoot.*;

/**
 * Escribe una descrición de la clase GuerreroDark1 aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class GuerreroDark1 extends GuerMalo
{
    /**
     * Act - hace lo que GuerreroDark1 quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    private GreenfootImage img1=new GreenfootImage("pin1.png");
    private GreenfootImage img2=new GreenfootImage("pin2.png");
    private GreenfootImage img3=new GreenfootImage("pin3.png");
    private GreenfootImage img4=new GreenfootImage("pin4.png");
    
    private int vida=100;
    private int band=0;
    private int band2=0;
    private int band3=0;
    private int dir;
    public GuerreroDark1(int unNum)
    {
        if(unNum==1)
        {
          img1.mirrorHorizontally();
          img2.mirrorHorizontally();
          img3.mirrorHorizontally();
          img4.mirrorHorizontally();
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
       if(isTouching(GuerBueno.class))
       {
            if(band2==0)
           {
              setImage(img3);
              band2=1;
           }
           else if(band2==1)
           {
              setImage(img4);
              band2=0;
           } 
           vida--;
       }
       else if(objectoEnFrente(dir)==true)
       {
           setImage(img2);
       }
       else if(isTouching(TorreLux.class))
       {
           if(band3==0)
           {
              setImage(img3);
              band3=1;
           }
           else if(band3==1)
           {
              setImage(img4);
              band3=0;
           }  
       }
       else
       {
           band=muevete(band,img1,img2,dir);
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
     
}
