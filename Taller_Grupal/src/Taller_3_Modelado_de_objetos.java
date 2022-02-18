


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Taller_3_Modelado_de_objetos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        /**
         * Variable de validaci�n para seguir ingresando nuevas canciones a la Playlist.
         */
        String n = "0";
        String p = "0";
        String genero;
        String date="";
        boolean orden1;
        int i = 0;
        int j;
        /**
         * Arreglo de la clase Song que representa la Biblioteca principal de archivos de m�sica.
         */
        Song[] main_library = new Song[4];
        /**
         * Arreglo de la clase Song que representa el arreglo ordenado de la Playlist creada.
         */
        Song[] sortLibrary = new Song[3];
        /**
         * Objeto de la clase Music_Library que permite el acceso a los diferentes m�todos de creaci�n de Playlist, filtrado y ordenamiento.
         */
        Music_Library m = new Music_Library();
        Music_Library pl = new Music_Library();
        /**
         * Arreglo de la clase Song que almacenar� la Playlist creada por el usuario.
         */
        Song[] playlist = null;
        /**
         * Arreglo de la clase Song que almacenar� el filtro de los archivos de m�sica filtrados por un g�nero especificado por
         * el usuario.
         */
        Song[] filtergenre = null;
        /**
         * Arreglo que almacena los ID de las canciones que el usuario desea para su Playlist.
         */
        int[] numeros = new int[10];
        /**
         * Variable que representa el tama�o del arreglo de la biblioteca principal.
         */
        int l = main_library.length;
        /**
         * Variable que representa la opci�n del men� que desea el usuario, por defecto se establece en cero para que el usuario
         * pueda ingresar por primera vez al men�.
         */
        String option="0";
        /**
         * Objeto de tipo Scanner que permite el ingreso de datos por teclado.
         */
        Scanner teclado = new Scanner(System.in);
        /**
         * Objeto de tipo BufferedReader que permite el ingreso de datos por teclado.
         */
        BufferedReader k = new BufferedReader(new InputStreamReader(System.in));
        /**
         * Almacenamiento de los objetos que representan los archivos de audio en la Biblioteca principal.
         */
        main_library[0]= m.song1;
        main_library[1] = m.song2;
        main_library[2] = m.song3;
        main_library[3] = m.song4;
        
        
        System.out.println("---->  Biblioteca de reproducción de audio  <-----");
        /**
         * Ciclo While que permite la validaci�n de los datos ingresados por teclado dentro de las opciones permitidas.
         */
        while(Integer.parseInt(option)!=6){
        do {
            System.out.println("Menú: ");
            System.out.println("1. Crear playlist");
            System.out.println("2. Filtrar por género");
            System.out.println("3. Filtrar por año");
            System.out.println("4. Ordenar por duración");
            System.out.println("5. Ordenar por fecha");
            System.out.println("6. Salir");
            System.out.println("Ingrese la opción que desea realizar: ");
            option = k.readLine();/*Ingreso de datos por teclado de las opciones presentadas en el men�. */
        } while (Integer.parseInt(option)<1||Integer.parseInt(option)>6);
        /**
         * El Switch Case contiene todos los m�todos presentados en el men� de opciones.
         */
        switch (option) {
            /**
             * Caso n�mero 1, permite la creaci�n de la Playlist.
             */
            case "1":
                n = "0"; /*Variable de validaci�n del ciclo While que permite el ingreso de canciones a la Playlist. */
                i=0; /* Indice de incremento de las posiciones para el almacenamiento de las Id de las canciones en el arreglo numeros.*/
                while("0".equals(n))
                {
                    System.out.println("Las canciones de la biblioteca son:");
                    /**
                     * Ciclo for que permite la visualizaci�n de todas las canciones de la Biblioteca principal del reproductor.
                     */
                    for ( j = 0; j < l; j++) {
                        System.out.println("El nombre de la canción es "+main_library[j].title+ " y su identificación es "+main_library[j].ID );
                    }
                    System.out.println("Ingrese la identificación de la canción para agregarla a la play list");
                    System.out.printf("Introduzca número %d: ", i+1);
                    /**
                     * Arreglo que almacena las ID de las canciones seleccionadas para la Playlist.
                     */
                    numeros[i] = teclado.nextInt();
                    i++;
                    System.out.println("Desea continuar, ingrese 0 si desea continuar y 1 si desea salir");
                    String af = k.readLine();/* Toma de datos por teclado para continuar o terminar la acci�n de agregar canciones a la Playlist.*/
                    /**
                     * Condicional de validaci�n que permite continuar agregando nuevas canciones a la Playlist.
                     */
                    if("0".equals(af))
                    {
                        System.out.println("Usted desea continuar");
                        n=af;
                    }
                    else
                    {
                        System.out.println("Usted desea salir");
                        n=af;
                    }
                }
                /**
                 * Implementaci�n del m�todo Crear Playlist con la lista de ID ingresada por el usuario.
                 */
                playlist=pl.CreatePlaylist(main_library, numeros,i);
                System.out.println("La playlist creada contiene las siguientes canciones");
                /**
                 * Impresi�n de los t�tulos de las canciones agregadas a la Playlist.
                 */
                for (int o = 0; o < i; o++) {
                    System.out.println(playlist[o].title);
                }
                
                break;
                /**
                 * Caso n�mero 2, Permite el filtro de la Playlist por g�nero.
                 */
            case "2":
                /**
                 * Men� de los g�neros musicales presentes en la biblioteca principal.
                 */
                System.out.println("Ingrese el género musical por el que desea filtrar ");
                System.out.println("- Pop");
                System.out.println("- Country");
                System.out.println("- Rock");
                genero =k.readLine(); /*Captura por teclado del g�nero que desea filtrar el usuario.*/
                /**
                 * Implementaci�n del m�todo de Filtrado por g�nero que devulve el grupo de canciones en un arreglo 
                 * con el g�nero deseado.
                 */
                filtergenre = m.FilterGenre(playlist, genero);
                System.out.println("La playlist filtrada por el género "+ genero + " es:");
                /**
                 * Ciclo for que imprime las canciones de la Playlist con el g�nero deseado.
                 */
                for (int o = 0; o < filtergenre.length; o++) {
                    /**
                     * Condicional que verifica unicamente las posiciones que contengan un objeto Song para imprimir su t�tulo.
                     */
                    if(filtergenre[o]== null)
                    {
                        break;
                    }
                    else
                    {
                    System.out.println(filtergenre[o].title);
                    }
                }
                break;
            case "3":
                System.out.println("Ingrese el anio que desea filtrar ");
                date =k.readLine();
                filtergenre = m.FilterDate(playlist, date);
                System.out.println("La playlist filtrada por anio "+ date + " es:");
                for (int o = 0; o < filtergenre.length; o++) {
                    if(filtergenre[o]== null)
                    {
                        break;
                    }
                    else
                    {
                    System.out.println(filtergenre[o].title);
                    }
                }
                break;
            case "4":
                System.out.println("Ingrese el orden en el que desea organizar los archivos");
                System.out.println("a --> Ascendente ");
                System.out.println("d --> Descendente ");
                String orden = k.readLine();
                if("a".equals(orden))
                {
                    orden1 = true;
                }
                else
                {
                    orden1 = false;
                }
                sortLibrary = m.SortDuration(playlist, orden1, i);
                System.out.println("La lista ordernada por duración es:");
                for (int o = 0; o < i; o++) {
                    System.out.println(sortLibrary[o].title);
                }
                break;
            case "5":
                System.out.println("Ingrese el orden en el que desea organizar los archivos");
                System.out.println("a --> Ascendente ");
                System.out.println("d --> Descendente ");
                String orden2 = k.readLine();
                if("a".equals(orden2))
                {
                    orden1 = true;
                }
                else
                {
                    orden1 = false;
                }
                sortLibrary = m.SortDate(playlist, orden1, i);
                System.out.println("La lista ordernada por fecha es:");
                for (int o = 0; o < i; o++) {
                    System.out.println(sortLibrary[o].title);
                }
                break;
            case "6":
                p = "6";
                break;
            default:
                throw new AssertionError();
        }
        }
        }
    }
