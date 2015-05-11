import greenfoot.*;
import java.awt.Color;

/**
 * Es es la CLASE del Mundo donde se desarrolla el juego.
 * es una de las clases mas Importante puesto que se desarrolla el ambiente para el juego.
 * CONSTANTES DE LA CLASE "JUEGO".
 * int MEXICO representa el escenario de mexico.
 * int USA representa el escenario de estados unidos.
 * int FRANCE representa el escenario de francia.
 * int EGYPT representa el escenario de egipto.
 * int JAPAN representa el escenario de japon.
 * estas costantes sirven para un manejo mas rapido de los cambios internos de escenario de la clase.
 * VARIABLES DE INSTANCIA DE LA CLASE.
 * int dificultad: representa la dificultad de juego se maneja en 3 grados.
 * 1.FACIL.
 * 2.NORMAL.
 * 3.DIFICIL.
 * GreenfootSound musica representa la musica que se reproducira durante el juego.
 * @author Irvin Alexis Rodriguez Estrada
 * @author Irving Gerardo Cardenaz Hernandez
 * @version 23/04/2015
 */
public class Juego extends World
{
    final int MEXICO=1;
    final int USA=2;
    final int FRANCE=3;
    final int EGYPT=4;
    final int JAPAN=5;
    private int dificultad;
    private GreenfootSound musica;
    private SimpleTimer timer;
    /**
     * METODO CONSTRUCTOR
     * este es el costructor inicial del juego y este propone las instancias iniciales del mundo
     * @param escenario el ecsenario donde se desarrolla va el 1 al 5
     * @param jug es la informacion general del jugador (UNA CLASE JUGADOR)
     * @param ene es la informacion general del enemigo (UNA CLASE ENEMIGO)
     */
    public Juego(int escenario,Jugador jug,Enemigo ene)
    {    
        // Crea un nuevo mundo de 600x400 celdas con un tamaño de celda de 1x1 pixeles.
        super(800, 600, 1); 
        if(escenario==MEXICO)
        {
            dificultad=1;
            musica=new GreenfootSound("MEXICO.mp3");
            musica.playLoop();
            musica.setVolume(1);
            setBackground("Fondo16.jpg");
        }
        else if(escenario==USA)
        {
            dificultad=1;
            musica=new GreenfootSound("USA.mp3");
            musica.playLoop();
            musica.setVolume(1);
            setBackground("Fondo15.jpg");
        }
        else if(escenario==FRANCE)
        {
            dificultad=2;
            musica=new GreenfootSound("FRANCE.mp3");
            musica.playLoop();
            musica.setVolume(1);
            setBackground("Fondo14.jpg");
        }
        else if(escenario==EGYPT)
        {
            dificultad=2;
            musica=new GreenfootSound("EGYPT.mp3");
            musica.playLoop();
            musica.setVolume(1);
            setBackground("Fondo12.jpg");
        }
        else 
        {
            dificultad=3;
            musica=new GreenfootSound("JAPAN.mp3");
            musica.playLoop();
            musica.setVolume(1);
            setBackground("Fondo13.jpg");
        }
        if(jug.getBando()==true)
        {
            TorreLux j=new  TorreLux(true,dificultad,jug,musica);
            TorreDark e=new TorreDark(false,dificultad,jug,musica);
            addObject(j,34,284);
            addObject(e,766,285);
            Letrero oscuridadteam=new Letrero("Piñatas de la Oscuridad",Color.RED);
            addObject(oscuridadteam,607,90);
            Letrero luzteam=new Letrero("Piñatas de la Luz",Color.CYAN);
            addObject(luzteam,153,89);
        }
        else
        {
            TorreLux e=new  TorreLux(false,dificultad,jug,musica);
            TorreDark j=new TorreDark(true,dificultad,jug,musica);
            addObject(j,34,284);
            addObject(e,766,285);
            Letrero oscuridadteam=new Letrero("Piñatas de la Oscuridad",Color.RED);
            addObject(oscuridadteam,195,89);
            Letrero luzteam=new Letrero("Piñatas de la Luz",Color.CYAN);
            addObject(luzteam,648,88);
        }
        BotonW1 boton1=new BotonW1();
        addObject(boton1,293,508);
        BotonW2 boton2=new BotonW2();
        addObject(boton2,182,508);
        BotonW3 boton3=new BotonW3();
        addObject(boton3,69,508);
        Letrero dineroText=new Letrero("DINERO",Color.BLACK);
        addObject(dineroText,520,471);
        Letrero score=new Letrero("SCORE",Color.BLACK);
        addObject(score,666,469);
        timer=new SimpleTimer();
        Indicador indice=new Indicador();
        addObject(indice,601,563);
        Power pow=new Power();
        addObject(pow,405,513);
    }

    /**
     @
     */
    public void act()
    {
        Coins moneda=new Coins();

        if(timer.millisElapsed()>10300)
        {
            addObject(moneda,Greenfoot.getRandomNumber(800),146);
            timer.mark();
        }
    }
}
