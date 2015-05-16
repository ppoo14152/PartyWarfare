import greenfoot.*;
import java.util.*;

/**
 * La subclase "Torre".
 * 
 * @author Irvin Alexis Rodriguez Estrada
 * @author Irving Gerardo Cardenaz Hernandez
 * @versión (Mayo 2015)
 */
public class Torre extends Actor
{
    /**
     * Act - hace lo que Torres quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
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

    public void rebilitado(int inc,boolean b,Vida vid)
    {
        int interup;
        interup=vid.incrementaVida(inc,vid.getImage());
        if(interup==0)
        {
            if(b==true)
                vid.setLocation(vid.getX()+inc/2,48);
            else
                vid.setLocation(vid.getX()-inc/2,48);
        }

    }

}
