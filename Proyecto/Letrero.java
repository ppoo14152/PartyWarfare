import greenfoot.*;
import java.awt.*;

/**
 * Escribe una descrición de la clase Letrero aquí.
 * 
 * @author Irvin Alexis Rodriguez Estrada
 * @author Irving Gerardo Cardenaz Hernandez
 * @version (Mayo 2015)
 */
public class Letrero extends Actor
{
    /**
     * Act - hace lo que Letrero quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    GreenfootImage texto;
    public Letrero(String unTexto,Color color)
    {
        texto=new GreenfootImage(unTexto,34,color,null);
        setImage(texto);
    }
    
    public void modificaLetrero(String unTexto,Color color)
    {
        texto.clear();
        texto=new GreenfootImage(unTexto,34,color,null);
        setImage(texto);
    }
    
}
