import greenfoot.*;
import java.util.*;

/**
 * Subclase correspondiente a los guerreros del equipo de la luz.
 * 
 * @author Irvin Alexis Rodriguez Estrada
 * @author Irving Gerardo Cardenaz Hernandez
 * @versión (Mayo 2015)
 */
public abstract class  GuerBueno extends Guerrero
{
    /**
     * Act - hace lo que GuerBueno quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    public boolean objectoEnFrente(int dir)
    {
        if(dir>0)
        {
          List l1=this.getObjectsAtOffset(40,0,GuerBueno.class);
          if(l1.isEmpty()==false)
             return true;
            else
             return false;
        }
        else
        {
          List l1=this.getObjectsAtOffset(-40,0,GuerBueno.class);
          if(l1.isEmpty()==false)
             return true;
            else
             return false;  
        }
    }
    
    abstract public int retribulleDinero();
    
    abstract public int retribulleScore();
}
