/**
* Esta clase tiene como prop�sito la instanciaci�n de los objetos Song que representan las canciones del reproductor de audio
* con las caracter�sticas especificadas para el ejercicio.
* 
* @version [1.00.000 2022-02-14]
*
*
* @author [Marleny Fern�ndez Sandoval - marleny.19.fer@gmail.com]
*
* @since [1.00.000]
*
*/
import java.util.Date;

/**
 *
 * @author USUARIO
 */
public class Song {
    /**
     * T�tulo de la canci�n.
     */
    public String title;
    /**
     * Identificador de la canci�n.
     */
    public int ID;
    /**
     * Fecha de lanzamiento de la canci�n.
     */
    public Date date;
    /**
     * Duraci�n de la canci�n en formato "minutos: segundos".
     */
    public String duration;
    /**
     * G�nero de la canci�n.
     */
    public String genre;
    /**
     * Car�tula del album que contiene la canci�n. El formato de este archivo es "archivo.png".
     */
    public String cover;
    /**
     * Descripci�n de la canci�n que menciona al autor principal de la misma.
     */
    public String description;
    
    /**
     * Constructor que permite la instanciaci�n de objetos Song o canciones para la biblioteca principal.
     * @param title T�tulo de la canci�n.
     * @param ID ID de la canci�n.
     * @param date Fecha de lanzamiento de la canci�n.
     * @param duration Duraci�n de la canci�n.
     * @param genre G�nero de la canci�n.
     * @param cover Car�tula del album.
     * @param description Descripci�n de la canci�n.
     */
    public Song(String title, int ID, Date date, String duration, String genre, String cover, String description) {
        this.title = title;
        this.ID = ID;
        this.date = date;
        this.duration = duration;
        this.genre = genre;
        this.cover = cover;
        this.description = description;
    }


    


    
 
}
