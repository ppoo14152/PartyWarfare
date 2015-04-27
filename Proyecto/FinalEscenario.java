import greenfoot.*;
import java.awt.Color;

/**
 * Escribe una descrición de la clase FinalEscenario aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class FinalEscenario extends World
{

    /**
     * Constructor para objetos de clase FinalEscenario.
     * 
     */
    
    private GreenfootImage imagenfinal;
    private Letrero nombre;
    private Letrero score;
    private Letrero nombreM;
    private Letrero scoreM;
    private GreenfootSound musica;
    public FinalEscenario(boolean bando,Jugador jug,GreenfootSound m)
    {    
        // Crea un nuevo mundo de 600x400 celdas con un tamaño de celda de 1x1 pixeles.
        super(800, 600, 1);
        musica=m;
        musica.stop();
        if(bando==true)
        {
            imagenfinal=new GreenfootImage("Fondo17.jpg");
        }
        else
        {
            imagenfinal=new GreenfootImage("Fondo18.jpg");
        }
        setBackground(imagenfinal);
        nombre=new Letrero(jug.getNombre()+":",null);
        addObject(nombre,455,298);
        score=new Letrero(""+jug.getScore(),Color.WHITE);
        addObject(score,600,299);
        nombreM=new Letrero("NOMBRE",Color.RED);
        addObject(nombreM,448,266);
        scoreM=new Letrero("SCORE",Color.RED);
        addObject(scoreM,602,265);
    }
}
