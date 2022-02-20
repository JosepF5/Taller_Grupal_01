
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
     * Objetos de la clase Song que representan los archivos de música que se
     * van a ingresar a la biblioteca principal.
     */
    public Song song1 = new Song("Beat it", 000, new Date(1990, 01, 02), "01:30", "Pop", "c1.png", "Michael Jackson");
    public Song song2 = new Song("Hurt", 001, new Date(1992, 05, 22), "00:20", "Country", "c2.png", "Johny Cash");
    public Song song3 = new Song("Mr. Tambourine", 002, new Date(1992, 07, 12), "04:10", "Rock", "c3.png", "Bob Dylan");
    public Song song4 = new Song("Bohemian Rapsody", 003, new Date(1995, 01, 05), "05:10", "Rock", "c4.png", "Queen");

    public Song[] main_library = new Song[100];

    public Music_Library() {
    }

    /**
     * El método CreatePlaylist tiene como objetivo crear una lista de
     * reproducción de música independiente de la biblioteca principal, allá
     * el usuario seleccionara archivos de su preferencia y creara una nueva
     * lista.
     *
     * @param main_library Representa la lista general de canciones de la
     * biblioteca principal.
     * @param numeros Representa el arreglo que contiene la ID de las canciones
     * seleccionadas por el usuario para la playlist.
     * @param len Representa la cantidad de canciones que el usuario ha
     * seleccionado.
     * @return Arraysong Representa una lista de canciones seleccionadas por el
     * usuario para la nueva Playlist.
     * @throws Exception
     *
     * @author [Marleny Fernández Sandoval - marleny.19.fer@gmail.com]
     *
     * @since [1.00.000]
     *
     */
    public Song[] CreatePlaylist(Song[] main_library, int[] numeros, int len) {
        /**
         * Arreglo de la clase Song que almacena la Playlist creada por el
         * usuario.
         */
        Song[] Arraysong = new Song[100];
        /**
         * Ciclo for que se encarga de buscar las canciones con las ID
         * especificadas por el usuario en el arreglo numeros en la Biblioteca
         * principal y almacenarlas en el arreglo Arraysong creando así la
         * Playlist.
         */
        for (int i = 0; i < len; i++) {
            Arraysong[i] = main_library[numeros[i]];
        }

        return Arraysong;

    }

    /**
     * El método SortDuration tiene como objetivo ordernar los elementos de la
     * playlist creada por el usuario por la duración de los archivos de audio.
     *
     * @param main_library Representa la playlist que el usuario desea ordenar
     * por duración.
     * @param order Representa el orden en el que el usuario desea se despliegue
     * la lista ordenada True - Ascendente, False - Descendente
     * @param tamaño Representa el tamaño del arreglo de la playlist.
     * @return SortArray El método retorna un arreglo que representa la lista
     * ordenada de los archivos de audio por duración.
     * @throws Exception
     *
     * @author [Marleny Fernández Sandoval - marleny.19.fer@gmail.com]
     *
     * @since [1.00.000]
     *
     */
    public Song[] SortDuration(Song[] main_library, boolean order, int tamano) {
        /**
         * Arreglo que almacena la Playlist ordenada por la duración de las
         * canciones.
         */
        Song[] SortArray = new Song[tamano];
        /**
         * Arreglo que almacena la duración de cada una de las canciones.
         */
        int[] durarray = new int[tamano];
        /**
         * Ciclo for que se encarga de tomar la duración de las canciones de la
         * Playlist convertirla de String a un entero y y almacenarla en
         * durarray.
         */
        for (int j = 0; j < tamano; j++) {
            String d = main_library[j].duration;
            String[] dur = d.split(":");
            int dur1 = Integer.parseInt(dur[0] + dur[1]);
            durarray[j] = dur1;

        }
        /**
         * Condicional que toma el orden en que el usuario desea ordenar la
         * Playlist por duración siendo true ascendente.
         */
        if (order == true) {
            /**
             * Método de ordenamiento ascendente del arreglo de enteros
             * durarray.
             */
            Arrays.sort(durarray);

        } /**
         * Condición en la que se toma el orden descendente para la Playlis, es
         * decir que order es false.
         */
        else {
            /**
             * Método de ordenamiento ascendente del arreglo de enteros
             * durarray.
             */
            Arrays.sort(durarray);
            /**
             * Arreglo auxiliar de tipo entero que almacena los valores enteros
             * ordenados de forma descendente.
             */
            int[] desarray = new int[durarray.length];
            /**
             * Ciclo for que se encarga de invertir el orden del arreglo
             * originalmente ordenado de forma ascendente.
             */
            for (int i = 0; i < durarray.length; i++) {
                desarray[i] = durarray[(durarray.length - 1) - i];
            }
            /**
             * Reemplazo del arreglo de ordenamiento por el arreglo auxiliar.
             */
            durarray = desarray;
        }

        /**
         * Con la matriz de enteros que representan las duraciones ordenadas de
         * las canciones de la Playlist el ciclo for se encarga de ubicar estas
         * duraciones en la Playlist original y crear un nuevo arreglo ordenado
         * por duración SortArray que contiene los objetos Song con todos sus
         * atributos.
         */
        for (int i = 0; i < tamano; i++) {
            String d1 = main_library[i].duration;
            String[] durd = d1.split(":");
            int dur1d = Integer.parseInt(durd[0] + durd[1]);
            for (int j = 0; j < tamano; j++) {
                if (dur1d == durarray[j]) {
                    SortArray[j] = main_library[i];
                }

            }
        }

        return SortArray;
    }

    /**
     * El método SortDate tiene como objetivo ordenar una lista de reproducción
     * de música independiente de la biblioteca principal creada por el usuario
     * llamada Playlist el método de ordenamiento de la Playlist es por fecha de
     * lanzamiento de la canción.
     *
     * @param main_library Playlist que se desea ordenar por fecha.
     * @param order Estado booleano por medio del cual se establece si el orden
     * es ascendente o descendente.
     * @param tamaño Tamaño del arreglo que se desea ordenar.
     * @return Retorna un arreglo ordenado por fecha.
     *
     * @author [Josep]
     *
     * @since [1.00.000]
     *
     */
    public Song[] SortDate(Song[] main_library, boolean order, int tamano) {
        /**
         * Arreglo que almacenará la Playlist ordenada por fecha.
         */
        Song[] SortArray = new Song[tamano];
        /**
         * Arreglo que almacenará las fechas de la Playlist.
         */
        int[] durarray = new int[tamano];
        /**
         * Ciclo for que busca las fechas de las canciones de la Playlist y las
         * adiciona en el arreglo durarray como un número entero.
         */
        for (int j = 0; j < tamano; j++) {
            int anio = main_library[j].date.getYear();
            int mes = main_library[j].date.getMonth();
            int dia = main_library[j].date.getDate();
            int dur1 = anio * 360 + mes * 30 + dia;
            durarray[j] = dur1;

        }
        /**
         * Si el orden ingresado es true el condicional permitiré el
         * ordenamiento del arreglo de forma ascendente.
         */
        if (order == true) {
            Arrays.sort(durarray);

        } /**
         * Si el orden ingresado es false entonces se ordenará de forma
         * descendente.
         */
        else {
            Arrays.sort(durarray);
            int[] desarray = new int[durarray.length];
            for (int i = 0; i < durarray.length; i++) {
                desarray[i] = durarray[(durarray.length - 1) - i];
            }
            durarray = desarray;
        }

        /**
         * Ciclo for que busca la fecha dentro de la Playlist y la compara con
         * los elementos del arreglo ordenado, una vez encontrado el elemento lo
         * asigna a la posición del arreglo durarray.
         */
        for (int i = 0; i < tamano; i++) {
            /**
             * Obtención de la fecha de las canciones de la Playlist.
             */
            int anio = main_library[i].date.getYear();
            int mes = main_library[i].date.getMonth();
            int dia = main_library[i].date.getDate();
            /**
             * Transformación de la fecha en un número entero.
             */
            int dur1 = anio * 360 + mes * 30 + dia;
            /**
             * Ciclo for que recorre el arreglo durarray ordenado y la Playlist.
             */
            for (int j = 0; j < tamano; j++) {
                /**
                 * Condicional que evalúa si la fecha es igual a la posición del
                 * arreglo durarray ordenado.
                 */
                if (dur1 == durarray[j]) {
                    /**
                     * Si las fechas coinciden entonces la canción del arreglo
                     * se almacena en esta posición.
                     */
                    SortArray[j] = main_library[i];
                }

            }
        }

        /**
         * Retorno del arreglo ordenado por fecha.
         */
        return SortArray;
    }

    /**
     * El método FilterGenre tiene como objetivo filtrar los elementos de la
     * playlist por el género de los archivos de audio.
     *
     * @param playlist Representa la lista de reproducción creada por el
     * usuario.
     * @param genre Representa el género de tipo "String" ingresado por el
     * usuario para filtrar.
     * @return arrayfiltergenre El método retorna un arreglo que representa la
     * lista de las canciones de la playlist que pertenecen al género a
     * filtrar.
     * @throws Exception
     *
     * @author [Marleny Fernández Sandoval - marleny.19.fer@gmail.com]
     *
     * @since [1.00.000]
     */
    public Song[] FilterGenre(Song[] playlist, String genre) {
        Song[] arrayfiltergenre = new Song[100];
        /*Arreglo en el que se almacenaran los objetos Song o canciones de la Playlist por el género deseado por el usuario.*/
        int u = 0;
        /*Índice para el almacenamiento en el arreglo arrayfiltergenre. */
        /**
         * Ciclo for que recorre la Playlist buscando las canciones con el
         * género especificado por el usuario.
         */
        for (int i = 0; i < playlist.length; i++) {
            /**
             * Condicional que evalua solo aquellas posiciones que contienen un
             * Objeto Song y verifica si corresponde con el género deseado para
             * almacenarlo en el arreglo arrayfiltergenre.
             */
            if (playlist[i] == null) {
                break;
            } else {
                if (playlist[i].genre.equals(genre)) {
                    arrayfiltergenre[u] = playlist[i];
                    u++;
                }
            }
        }

        return arrayfiltergenre;

    }

    /**
     * El método FilterDate tiene como objetivo filtrar los elementos de la
     * playlist por el año de registro de la canción de los archivos de audio.
     *
     * @param playlist Playlist que se desea filtrar.
     * @param date Año por el que se desea filtrar.
     * @return Retorna un arreglo con las canciones que tienen coincidencia con
     * el año de filtrado.
     *
     * @author [Josep]
     *
     * @since [1.00.000]
* *
     */
    public Song[] FilterDate(Song[] playlist, String date) {
        /**
         * Arreglo que almacena el filtro de la Playlist por año.
         */
        Song[] arrayfilterdate = new Song[100];
        /**
         * Variable que representa el índice del almacenamiento del arreglo
         * anterior.
         */
        int u = 0;
        /**
         * For que recorrre la Playlist y evalúa cuales de sus elementos
         * coinciden con el año filtrado.
         */
        for (int i = 0; i < playlist.length; i++) {
            /**
             * Condicional que evalúa cuales de los posiciones de la Playlist
             * tienen estado null y cuales no, para evitar aquellas que no
             * contengan ningun objeto.
             */
            if (playlist[i] == null) {
                break;
            } else {
                /**
                 * Condicional que evalua cuales de las posiciones de la
                 * Playlist contienen un objeto con el atributo año filtrado.
                 */
                if (((playlist[i].date.getYear())) == Integer.parseInt(date)) {
                    /**
                     * Almacenamiento del objeto en el arreglo de filtrado.
                     */
                    arrayfilterdate[u] = playlist[i];
                    /**
                     * Incremento del índice para almacenamiento de un nuevo
                     * objeto Song.
                     */
                    u++;
                }
            }
        }
        /**
         * Retorno del arreglo filtrado por año.
         */
        return arrayfilterdate;

    }


}
