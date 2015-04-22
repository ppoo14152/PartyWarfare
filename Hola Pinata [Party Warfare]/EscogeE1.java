import greenfoot.*;

/**
 * Escribe una descrición de la clase EscogeE1 aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class EscogeE1 extends World
{

    /**
     * Constructor para objetos de clase EscogeE1.
     * 
     */
    public EscogeE1(int next,int prev,GreenfootSound m,Jugador jug,Enemigo ene)
    {    
        // Crea un nuevo mundo de 600x400 celdas con un tamaño de celda de 1x1 pixeles.
        super(800, 600, 1); 
        Next n;
        Prev p;
        Play pl;
        n=new Next(next,m,jug,ene);
        p=new Prev(prev,m,jug,ene);
        pl=new Play(m,1,jug,ene);
        addObject(n,693,465);
        addObject(p,118,484);
        addObject(pl,544,410);
    }
}
