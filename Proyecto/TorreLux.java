import greenfoot.*;
import java.util.*;

/**
 * Escribe una descrición de la clase Jugador aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class TorreLux extends Torre
{
    /**
     * Act - hace lo que Jugador quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    private int rango;
    private boolean bd;
    private int n=0;
    private int activaRango;
    private int d;
    private int NuevaVida=1;
    private Vida vid;
    private int finish;
    public TorreLux(boolean band,int dif)
    {
        bd=band;
        activaRango=1;
        d=dif;
    }
    public void act() 
    {
        if(NuevaVida==1)
        {
            vid=creaVida(bd);
            NuevaVida=0;
        }
        if(activaRango==1)
        {
           rango=Greenfoot.getRandomNumber(351)+50;
           activaRango=0;
        }
        
        if(bd==true)
        {
           actuaJugador();
        }
        else
        {
           n=actuaEnemigo(n);
           if(n==0)
           activaRango=1;
           n++;
        }
          if(isTouching(GuerMalo.class))
        {
            int atk=Greenfoot.getRandomNumber(35);
            if(atk==5)
            finish=afectado(10,bd,vid);
            if(finish==1)
            {
                World w=getWorld();
                w.showText("GAME OVER",400,300);
                Greenfoot.stop();
            }
        }
    } 
    public void actuaJugador()
    {
         World w=getWorld();
        List l1=w.getObjectsAt(293,508,BotonW1.class);
        if(Greenfoot.mouseClicked(l1.get(0)))
        {
            GuerreroLux1 g1=new GuerreroLux1(1);
            w.addObject(g1,58,413);
        }
        List l2=w.getObjectsAt(182,508,BotonW2.class);
        if(Greenfoot.mouseClicked(l2.get(0)))
        {
            GuerreroLux2 g1=new GuerreroLux2(1);
            w.addObject(g1,62,407);
        }
        List l3=w.getObjectsAt(69,508,BotonW3.class);
        if(Greenfoot.mouseClicked(l3.get(0)))
        {
            GuerreroLux3 g1=new GuerreroLux3(1);
            w.addObject(g1,58,413);
        }
    }
    public int actuaEnemigo(int n)
    {
        World w=getWorld();
        if(n>rango)
        {
           if(noHayObjectos(0)==true)
           {
              int Guerrero=Greenfoot.getRandomNumber(6);
              if(d==1)
              {
               if(Guerrero==0||Guerrero==1||Guerrero==2)
               {
                      GuerreroLux1 g1=new GuerreroLux1(0);
                      w.addObject(g1,731,413);
               }
               else if(Guerrero==3||Guerrero==4)
               {
                      GuerreroLux2 g1=new GuerreroLux2(0);
                      w.addObject(g1,731,413);
               }
               else
               {
                      GuerreroLux3 g1=new GuerreroLux3(0);
                      w.addObject(g1,731,413);
               }
              }
               if(d==2)
              {
               if(Guerrero==0||Guerrero==1)
               {
                      GuerreroLux1 g1=new GuerreroLux1(0);
                      w.addObject(g1,731,413);
               }
               else if(Guerrero==2||Guerrero==3)
               {
                      GuerreroLux2 g1=new GuerreroLux2(0);
                      w.addObject(g1,731,413);
               }
               else
               {
                      GuerreroLux3 g1=new GuerreroLux3(0);
                      w.addObject(g1,731,413);
               }
              }
               if(d==3)
              {
               if(Guerrero==0)
               {
                      GuerreroLux1 g1=new GuerreroLux1(0);
                      w.addObject(g1,731,413);
               }
               else if(Guerrero==1||Guerrero==2)
               {
                      GuerreroLux2 g1=new GuerreroLux2(0);
                      w.addObject(g1,731,413);
               }
               else
               {
                      GuerreroLux3 g1=new GuerreroLux3(0);
                      w.addObject(g1,731,413);
               }
              }
           }
           n=0;
        } 
        return n;
    }

}
