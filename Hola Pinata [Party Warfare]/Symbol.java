import greenfoot.*;

/**
 * Escribe una descrición de la clase Symbol aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public abstract class Symbol extends Actor
{
    /**
     * Act - hace lo que Symbol quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    abstract public void mouseSobreSimbolo(World w);
    abstract public void empezarJuego(World w,GreenfootSound m);
}
