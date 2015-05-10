/**
 * Escribe una descrición de la clase Enemigo aquí.
 * 
 * @author Irvin Alexis Rodriguez Estrada
 * @author Irving Gerardo Cardenaz Hernandez
 * @versión (Mayo 2015)
 */
public class Enemigo  
{
    // instance variables - reemplace el ejemplo a continuación por uno propio
    boolean band;

    /**
     * Constructor para objetos de clase Enemigo.
     */
    public Enemigo()
    {
        band=false;
    }
    public void setBando(boolean unBando)
    {
        band=unBando;
    }
    public boolean getBando()
    {
        return band;
    }
}
