


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
            option = k.readLine();
        } while (Integer.parseInt(option)<1||Integer.parseInt(option)>6);
        switch (option) {
            case "1":
                n = "0";
                i=0;
                while("0".equals(n))
                {
                    System.out.println("Las canciones de la biblioteca son:");
        
                    for ( j = 0; j < l; j++) {
                        System.out.println("El nombre de la canción es "+main_library[j].title+ " y su identificación es "+main_library[j].ID );
                    }
                    System.out.println("Ingrese la identificación de la canción para agregarla a la play list");
                    System.out.printf("Introduzca número %d: ", i+1);
                    numeros[i] = teclado.nextInt();
                    i++;
                    System.out.println("Desea continuar, ingrese 0 si desea continuar y 1 si desea salir");
                    String af = k.readLine();
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
                playlist=pl.CreatePlaylist(main_library, numeros,i);
                System.out.println("La playlist creada contiene las siguientes canciones");
                
                for (int o = 0; o < i; o++) {
                    System.out.println(playlist[o].title);
                }
                
                break;
            case "2":
                System.out.println("Ingrese el género musical por el que desea filtrar ");
                System.out.println("- Pop");
                System.out.println("- Country");
                System.out.println("- Rock");
                genero =k.readLine();
                filtergenre = m.FilterGenre(playlist, genero);
                System.out.println("La playlist filtrada por el género "+ genero + " es:");
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
