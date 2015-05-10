import greenfoot.*;
import java.util.*;
import java.awt.Color;

/**
 * Escribe una descrición de la clase Jugador aquí.
 * 
 * @author Irvin Alexis Rodriguez Estrada
 * @author Irving Gerardo Cardenaz Hernandez
 * @versión (Mayo 2015)
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
    private int dinero;
    private Letrero countdinero;
    private Letrero countscore;
    private int valorinicial;
    private List<GuerBueno>guerreros;
    private int score;
    private Jugador jugador;
    private GreenfootSound musica;
    private Records records;
    public TorreLux(boolean band,int dif,Jugador jug,GreenfootSound m)
    {
        if(band==true)
        {
            dinero=2500;
        }
        else
        {
            dinero=0;
        }
        jugador=jug;
        score=0;
        bd=band;
        activaRango=1;
        d=dif;
        records=new Records();
        musica=m;
    }

    public void act() 
    {
        if(bd==true&&valorinicial==0)
        {
            escribeValorDeDineroInicial();
            escribeScoreInicial();
            valorinicial++;
        }

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
                if(bd==false)
                {
                    List torre=w.getObjects(TorreDark.class);
                    score=((TorreDark)torre.get(0)).getScore();
                }
                jugador.setScore(score);
                records.guardaRecords(score);
                w=new FinalEscenario(bd,jugador,musica);
                Greenfoot.setWorld(w);
            }
        }
    } 

    public void actuaJugador()
    {
        World w=getWorld();
        List l1=w.getObjectsAt(293,508,BotonW1.class);
        if(Greenfoot.mouseClicked(l1.get(0))&&dinero>200&&((BotonW1)(l1.get(0))).estasActivado()==true)
        {
            GuerreroLux1 g1=new GuerreroLux1(1);
            w.addObject(g1,58,413);
            dinero=dinero-200;
            countdinero.modificaLetrero(""+dinero,Color.white);
        }
        List l2=w.getObjectsAt(182,508,BotonW2.class);
        if(Greenfoot.mouseClicked(l2.get(0))&&dinero>600&&((BotonW2)(l2.get(0))).estasActivado()==true)
        {
            GuerreroLux2 g1=new GuerreroLux2(1);
            w.addObject(g1,62,407);
            dinero=dinero-600;
            countdinero.modificaLetrero(""+dinero,Color.white);
        }
        List l3=w.getObjectsAt(69,508,BotonW3.class);
        if(Greenfoot.mouseClicked(l3.get(0))&&dinero>1000&&((BotonW3)(l3.get(0))).estasActivado()==true)
        {
            GuerreroLux3 g1=new GuerreroLux3(1);
            w.addObject(g1,58,413);
            dinero=dinero-1000;
            countdinero.modificaLetrero(""+dinero,Color.white);
        }
       
        w=getWorld();
        guerreros=w.getObjects(GuerBueno.class);
        for(GuerBueno guer:guerreros)
        {
            dinero=dinero+guer.retribulleDinero();
            countdinero.modificaLetrero(""+dinero,Color.white);
            score=score+guer.retribulleScore();
            countscore.modificaLetrero(""+score,Color.white);
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

    public void escribeValorDeDineroInicial()
    {
        World w=getWorld();
        countdinero=new Letrero(""+dinero,Color.WHITE);
        w.addObject(countdinero,504,508);
    }
    
      public void escribeScoreInicial()
    {
       World w=getWorld();
       countscore=new Letrero(""+score,Color.WHITE);
       w.addObject(countscore,672,506); 
    }
    
    public int getScore()
    {
        return score;
    }
}
