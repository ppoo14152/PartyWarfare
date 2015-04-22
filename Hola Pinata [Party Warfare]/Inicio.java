import greenfoot.*;

/**
 * Write a description of class Inicio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inicio extends World
{

    /**
     * Constructor for objects of class Inicio.
     * 
     */
    
    public Inicio()//Es la Clase Costructora del Mundo inicio REPRODUCE SONIDO
    {    
        super(800, 600, 1);//Tamaño de la Pantalla
        
        GreenfootSound music=new GreenfootSound("Piñaton.mp3");
        music.playLoop();
        music.setVolume(80);
        
        Boton b1;//Boton Juego
        Boton b2;//Boton Puntaje
        Boton b3;//Boton Autores
        Boton b4;//Boten Informacion
    
        b1=new icoj(music);//Crea Boton de Jugar
        b2=new Icop(music);//Crea Boton de Puntaje
        b3=new Icoau(music);//Crea Boton de Autores
        b4=new Icoinf(music);//Crea Boton de Informacion
   
        addObject(b1,500,200);//Agrega el Boton Jugar
        addObject(b2,650,200);//Agrega el Boton Puntaje
        addObject(b3,500,400);//Agrega el Boton Autores 
        addObject(b4,650,400);//Agrega el Boton Informacion
 
      
    }
        
    public Inicio(GreenfootSound music)//Es la Clase Costructora del Mundo inicio REPRODUCE SONIDO
    {    
        super(800, 600, 1);//Tamaño de la Pantalla
        
        Boton b1;//Boton Juego
        Boton b2;//Boton Puntaje
        Boton b3;//Boton Autores
        Boton b4;//Boten Informacion
        
        b1=new icoj(music);//Crea Boton de Jugar
        b2=new Icop(music);//Crea Boton de Puntaje
        b3=new Icoau(music);//Crea Boton de Autores
        b4=new Icoinf(music);//Crea Boton de Informacion
  
        addObject(b1,500,200);//Agrega el Boton Jugar
        addObject(b2,650,200);//Agrega el Boton Puntaje
        addObject(b3,500,400);//Agrega el Boton Autores 
        addObject(b4,650,400);//Agrega el Boton Informacion

      
    }
    
}
