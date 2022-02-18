/**
*Esta clase tiene como propósito el generar la descripción de una bliblioteca de archivos de música, y
*además se relacionan funcionalidades relacionadas con la misma.
* 
* @version [1.00.000 2022-02-14]
*
*
* @author [Marleny Fernández Sandoval - marleny.19.fer@gmail.com]
*
* @since [1.00.000]
*
*/

//package taller_3_modelado_de_objetos;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;


public class Music_Library {
    /**
     * Objetos de la clase Song que representan los archivos de m�sica que se van a ingresar a la biblioteca principal.
     */
    public Song song1 = new Song("Beat it", 000,new Date(1990,01,02) ,"01:30" , "Pop", "c1.png", "Michael Jackson");
    public Song song2 = new Song("Hurt", 001,new Date(1992,05,22) ,"00:20" , "Country", "c2.png", "Johny Cash");
    public Song song3 = new Song("Mr. Tambourine", 002,new Date(1992,07,12) ,"04:10" , "Rock", "c3.png", "Bob Dylan");
    public Song song4 = new Song("Bohemian Rapsody", 003,new Date(1995,01,05) ,"05:10" , "Rock", "c4.png", "Queen");
    
    public Song[] main_library = new Song[100];
    
    

    public Music_Library() {
    }
    
/**
* El método CreatePlaylist tiene como objetivo crear una lista de reproducción de música 
* independiente de la biblioteca principal, allí el usuario seleccionara archivos de su preferencia
* y creara una nueva lista.

* @param main_library Representa la lista general de canciones de la biblioteca principal.
* @param numeros Representa el arreglo que contiene la ID de las canciones seleccionadas por el usuario para la playlist.
* @param len Representa la cantidad de canciones que el usuario ha seleccionado. 
* @return Arraysong Representa una lista de canciones seleccionadas por el usuario para la nueva Playlist.
* @throws Exception
*
* @author [Marleny Fernández Sandoval - marleny.19.fer@gmail.com]
*
* @since [1.00.000]
*
*/
    public Song[] CreatePlaylist(Song[] main_library,int[] numeros, int len)
    {
        /**
         * Arreglo de la clase Song que almacena la Playlist creada por el usuario.
         */
        Song[] Arraysong= new Song[100];
        /**
         * Ciclo for que se encarga de buscar las canciones con las ID especificadas por el usuario en el arreglo numeros
         * en la Biblioteca principal y almacenarlas en el arreglo Arraysong creando as� la Playlist.
         */
        for (int i = 0; i < len; i++) {
           Arraysong[i]= main_library[numeros[i]]; 
        }
        
        return Arraysong;
        
    }
/**
* El método SortDuration tiene como objetivo ordernar los elementos de la playlist creada por el usuario por la duración 
* de los archivos de audio.
* 
* @param main_library Representa la playlist que el usuario desea ordenar por duración.
* @param order Representa el orden en el que el usuario desea se despliegue la lista ordenada True - Ascendente, False - Descendente
* @param tamaño Representa el tamaño del arreglo de la playlist.
* @return SortArray El método retorna un arreglo que representa la lista ordenada de los archivos de audio por duración.
* @throws Exception
*
* @author [Marleny Fernández Sandoval - marleny.19.fer@gmail.com]
*
* @since [1.00.000]
*
*/
    public Song[] SortDuration(Song[] main_library, boolean order, int tamaño)
    {
        /**
         * Arreglo que almacena la Playlist ordenada por la duraci�n de las canciones.
         */
        Song[] SortArray = new Song[tamaño];
        /**
         * Arreglo que almacena la duraci�n de cada una de las canciones.
         */
        int[] durarray = new int[tamaño];
        /**
         * Ciclo for que se encarga de tomar la duraci�n de las canciones de la Playlist convertirla de String a un entero y 
         * y almacenarla en durarray.
         */
        for (int j = 0; j < tamaño; j++) {
            String d = main_library[j].duration;
            String[] dur = d.split(":");
            int dur1=Integer.parseInt(dur[0]+ dur[1]);
            durarray[j]=dur1;
           
                
        }
        /**
         * Condicional que toma el orden en que el usuario desea ordenar la Playlist por duraci�n siendo true ascendente.
         */
        if(order== true)
        {
            /**
             * M�todo de ordenamiento ascendente del arreglo de enteros durarray.
             */
            Arrays.sort(durarray);
            
        }
        /**
         * Condici�n en la que se toma el orden descendente para la Playlis, es decir que order es false.
         */
        else
        {
            /**
             * M�todo de ordenamiento ascendente del arreglo de enteros durarray.
             */
            Arrays.sort(durarray);
            /**
             * Arreglo auxiliar de tipo entero que almacena los valores enteros ordenados de forma descendente.
             */
            int[] desarray = new int[durarray.length];
            /**
             * Ciclo for que se encarga de invertir el orden del arreglo originalmente ordenado de forma ascendente.
             */
            for(int i=0; i<durarray.length; i++) {
                desarray[i] = durarray[(durarray.length-1)-i];
            }
            /**
             * Reemplazo del arreglo de ordenamiento por el arreglo auxiliar.
             */
            durarray = desarray;
        }
            
        /**
         * Con la matriz de enteros que representan las duraciones ordenadas de las canciones de la Playlist el ciclo for 
         * se encarga de ubicar estas duraciones en la Playlist original y crear un nuevo arreglo ordenado por duraci�n SortArray
         * que contiene los objetos Song con todos sus atributos.
         */

        for (int i = 0; i < tamaño; i++) {
            String d1 = main_library[i].duration;
            String[] durd = d1.split(":");
            int dur1d=Integer.parseInt(durd[0]+ durd[1]);
            for (int j = 0; j <tamaño ; j++) {
                if(dur1d==durarray[j])
                {
                    SortArray[j]=main_library[i];
                }
                
            }
        }

        return SortArray;
    }

    public Song[] SortDate(Song[] main_library, boolean order, int tamaño)
    {
        Song[] SortArray = new Song[tamaño];
        int[] durarray = new int[tamaño];
        for (int j = 0; j < tamaño; j++) {
            int anio = main_library[j].date.getYear();
            int mes = main_library[j].date.getMonth();
            int dia = main_library[j].date.getDate();
            int dur1=anio*360+mes*30+dia;
            durarray[j]=dur1;
           
                
        }
        if(order== true)
        {
            Arrays.sort(durarray);
            
        }
        else
        {
            Arrays.sort(durarray);
            int[] desarray = new int[durarray.length];
            for(int i=0; i<durarray.length; i++) {
                desarray[i] = durarray[(durarray.length-1)-i];
            }
            durarray = desarray;
        }
            
        

        for (int i = 0; i < tamaño; i++) {
            int anio = main_library[i].date.getYear();
            int mes = main_library[i].date.getMonth();
            int dia = main_library[i].date.getDate();
            int dur1=anio*360+mes*30+dia;
            for (int j = 0; j <tamaño ; j++) {
                if(dur1==durarray[j])
                {
                    SortArray[j]=main_library[i];
                }
                
            }
        }

        return SortArray;
    }
    
/**
* El método FilterGenre tiene como objetivo filtrar los elementos de la playlist por el género
* de los archivos de audio.
* 
* @param playlist Representa la lista de reproducción creada por el usuario.
* @param genre Representa el género de tipo "String" ingresado por el usuario para filtrar.
* @return arrayfiltergenre El método retorna un arreglo que representa la lista de las canciones
* de la playlist que pertenecen al género a filtrar.
* @throws Exception
*
* @author [Marleny Fernández Sandoval - marleny.19.fer@gmail.com]
*
* @since [1.00.000]
*/
    public Song[]  FilterGenre(Song[] playlist,String genre)
    {
        Song[] arrayfiltergenre = new Song[100]; /*Arreglo en el que se almacenaran los objetos Song o canciones de la Playlist por el g�nero deseado por el usuario.*/
        int u = 0; /*�ndice para el almacenamiento en el arreglo arrayfiltergenre. */
        /**
         * Ciclo for que recorre la Playlist buscando las canciones con el g�nero especificado por el usuario.
         */
        for (int i = 0; i < playlist.length; i++) {
            /**
             * Condicional que evalua solo aquellas posiciones que contienen un Objeto Song y verifica si corresponde
             * con el g�nero deseado para almacenarlo en el arreglo arrayfiltergenre.
             */
            if(playlist[i]== null)
            {
                break;
            }
            else
            {
                if(playlist[i].genre.equals(genre))
                {
                    arrayfiltergenre[u]= playlist[i];
                    u++;
                }
            }
        }
        
        return arrayfiltergenre;
        
    }
    public Song[]  FilterDate(Song[] playlist,String date)
    {
        Song[] arrayfilterdate = new Song[100];
        int u = 0;
        for (int i = 0; i < playlist.length; i++) {
            if(playlist[i]== null)
            {
                break;
            }
            else
            {
                if(((playlist[i].date.getYear()))==Integer.parseInt(date))
                {
                    arrayfilterdate[u]= playlist[i];
                    u++;
                }
            }
        }
        
        return arrayfilterdate;
        
    }
    
    
}
