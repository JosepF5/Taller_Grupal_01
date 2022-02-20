/**
* Esta clase tiene como propósito la instanciación de los objetos Song que representan las canciones del reproductor de audio
* con las características especificadas para el ejercicio.
* 
* @version [1.00.000 2022-02-14]
*
*
* @author [Marleny Fernández Sandoval - marleny.19.fer@gmail.com]
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
     * Título de la canción.
     */
    public String title;
    /**
     * Identificador de la canción.
     */
    public int ID;
    /**
     * Fecha de lanzamiento de la canción.
     */
    public Date date;
    /**
     * Duración de la canción en formato "minutos: segundos".
     */
    public String duration;
    /**
     * Género de la canción.
     */
    public String genre;
    /**
     * Carátula del album que contiene la canción. El formato de este archivo es "archivo.png".
     */
    public String cover;
    /**
     * Descripción de la canción que menciona al autor principal de la misma.
     */
    public String description;
    
    /**
     * Constructor que permite la instanciación de objetos Song o canciones para la biblioteca principal.
     * @param title Título de la canción.
     * @param ID ID de la canción.
     * @param date Fecha de lanzamiento de la canción.
     * @param duration Duración de la canción.
     * @param genre Género de la canción.
     * @param cover Carátula del album.
     * @param description Descripción de la canción.
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
