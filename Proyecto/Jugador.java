/**
 * Escribe una descrición de la clase Jugador aquí.
 * 
 * @author Irvin Alexis Rodriguez Estrada
 * @author Irving Gerardo Cardenaz Hernandez
 * @versión (Mayo 2015)
 */
public class Jugador  
{
    /*La Clase jugador es una clase externa de las SUPERCLASES ACTOR Y WORLD puesto que esta solo representa el
     jugador y su Informacion esencia para la dinamica del jugador*/
    
    /*VARIABLES DE INSTANCIA*/ 
    private int score;//PUNTUACION DEL JUGADOR
    private boolean bando;//BANDO EN EL QUE PERTENECE (FALSE=OBSCURIDAD,TRUE=LUZ)
    private String name;//NOMBRE DEL JUGADOR

    /**
     * Constructor para objetos de clase Jugador.
     */
    public Jugador()//Costructor de la Clase 
    {
        score=0;//Inicializa el score con 0
        bando=false;//*Inicializa el bando en false
        name="Unnamed";//Inicializa con un nombre por dafault
    }
    public void setScore(int unScore)//Pone un valor a score el parametro es un valor entero
    {
        score=unScore;
    }
    public void setBando(boolean unBando)
    {
        bando=unBando;
    }
    public void setName(String unNombre)
    {
        name=unNombre;
    }
    public int getScore()
    {
        return score;
    }
    public boolean getBando()
    {
        return bando;
    }
    public String getNombre()
    {
        return name;
    }
}
