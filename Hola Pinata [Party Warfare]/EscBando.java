import greenfoot.*;

/**
 * Escribe una descrición de la clase EscBando aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class EscBando extends World
{

    /**
     * Constructor para objetos de clase EscBando.
     * 
     */
    public EscBando(GreenfootSound m)
    {    
        // Crea un nuevo mundo de 600x400 celdas con un tamaño de celda de 1x1 pixeles.
        super(800, 600, 1); 
        Symbol s1;
        Symbol s2;
        s1=new Luz(m);
        s2=new Dark(m);
        addObject(s1,212,376);
        addObject(s2,619,361);
    }
}
