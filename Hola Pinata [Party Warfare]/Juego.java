import greenfoot.*;

/**
 * Escribe una descrición de la clase Juego aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Juego extends World
{

    /**
     * Constructor para objetos de clase Juego.
     * 
     */
    static int MEXICO=1;
    static int USA=2;
    static int FRANCE=3;
    static int EGYPT=4;
    static int JAPAN=5;
    GreenfootSound m;
    public Juego(int img,Jugador jug,Enemigo ene)
    {    
        // Crea un nuevo mundo de 600x400 celdas con un tamaño de celda de 1x1 pixeles.
        super(800, 600, 1); 
        if(img==MEXICO)
        {
            m=new GreenfootSound("MEXICO.mp3");
            m.playLoop();
            m.setVolume(70);
            setBackground("Fondo16.jpg");
        }
        else if(img==USA)
        {
            m=new GreenfootSound("USA.mp3");
            m.playLoop();
            m.setVolume(70);
            setBackground("Fondo15.jpg");
        }
        else if(img==FRANCE)
        {
            m=new GreenfootSound("FRANCE.mp3");
            m.playLoop();
            m.setVolume(70);
            setBackground("Fondo14.jpg");
        }
        else if(img==EGYPT)
        {
            m=new GreenfootSound("EGYPT.mp3");
            m.playLoop();
            m.setVolume(70);
            setBackground("Fondo12.jpg");
        }
        else 
        {
            m=new GreenfootSound("JAPAN.mp3");
            m.playLoop();
            m.setVolume(70);
            setBackground("Fondo13.jpg");
        }
        if(jug.getBando()==true)
        {
            TorreLux j=new  TorreLux(true);
            TorreDark e=new TorreDark(false);
            addObject(j,34,284);
            addObject(e,766,285);
        }
        else
        {
            TorreLux e=new  TorreLux(false);
            TorreDark j=new TorreDark(true);
            addObject(j,34,284);
            addObject(e,766,285);
        }
        BotonW1 boton1=new BotonW1();
        addObject(boton1,293,508);
    }
}
