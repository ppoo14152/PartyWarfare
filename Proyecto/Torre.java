import greenfoot.*;
import java.util.*;

/**
 * Escribe una descrición de la clase Torres aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Torre extends Actor
{
    /**
     * Act - hace lo que Torres quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    private int vid=100;
    private Vida vd;
    public boolean noHayObjectos(int num)
    {
        if(num==0)
        {
            List l1=this.getIntersectingObjects(GuerBueno.class);
            if(l1.isEmpty()==true)
                return true;
            else
                return false;
        }
        else
        {
            List l1=this.getIntersectingObjects(GuerMalo.class);
            if(l1.isEmpty()==true)
                return true;
            else
                return false;
        }
        
    }
    public Vida creaVida(boolean b)
    {
        World w=getWorld();
        vd=new Vida();
        if(b==true)
        w.addObject(vd,187,48);
        else
        w.addObject(vd,620,48);
        return vd;
    }
     public int afectado(int dano,boolean b,Vida vid)
    {
        int alert;
        alert=vid.reduceVida(dano,vid.getImage());
        if(b==true)
        vid.setLocation(vid.getX()-dano/2,48);
        else
        vid.setLocation(vid.getX()+dano/2,48);
        return alert;
    }
}
