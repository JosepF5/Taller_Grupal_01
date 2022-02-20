
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
         * Variable de validación para seguir ingresando nuevas canciones a la
         * Playlist.
         */
        String n = "0";
        String p = "0";
        /**
         * Variable que representa el género de los objetos Song.
         */
        String genero;
        /**
         * Variable que representa el género del objeto Song.
         */
        String date = "";
        /**
         * Variable que almacena el estado de ordenamiento para la Playlist.
         */
        boolean orden1;
        int i = 0;
        int j;
        /**
         * Arreglo de la clase Song que representa la Biblioteca principal de
         * archivos de música.
         */
        Song[] main_library = new Song[4];
        /**
         * Arreglo de la clase Song que representa el arreglo ordenado de la
         * Playlist creada.
         */
        Song[] sortLibrary = new Song[3];
        /**
         * Objeto de la clase Music_Library que permite el acceso a los
         * diferentes métodos de creación de Playlist, filtrado y ordenamiento.
         */
        Music_Library m = new Music_Library();
        Music_Library pl = new Music_Library();
        /**
         * Arreglo de la clase Song que almacenará la Playlist creada por el
         * usuario.
         */
        Song[] playlist = null;
        /**
         * Arreglo de la clase Song que almacenará el filtro de los archivos de
         * música filtrados por un género especificado por el usuario.
         */
        Song[] filtergenre = null;
        /**
         * Arreglo que almacena los ID de las canciones que el usuario desea
         * para su Playlist.
         */
        int[] numeros = new int[10];
        /**
         * Variable que representa el tamaño del arreglo de la biblioteca
         * principal.
         */
        int l = main_library.length;
        /**
         * Variable que representa la opción del menú que desea el usuario, por
         * defecto se establece en cero para que el usuario pueda ingresar por
         * primera vez al menú.
         */
        String option = "0";
        /**
         * Objeto de tipo Scanner que permite el ingreso de datos por teclado.
         */
        Scanner teclado = new Scanner(System.in);
        /**
         * Objeto de tipo BufferedReader que permite el ingreso de datos por
         * teclado.
         */
        BufferedReader k = new BufferedReader(new InputStreamReader(System.in));
        /**
         * Almacenamiento de los objetos que representan los archivos de audio
         * en la Biblioteca principal.
         */
        main_library[0] = m.song1;
        main_library[1] = m.song2;
        main_library[2] = m.song3;
        main_library[3] = m.song4;

        System.out.println("---->  Biblioteca de reproducciÃ³n de audio  <-----");
        /**
         * Ciclo While que permite la validación de los datos ingresados por
         * teclado dentro de las opciones permitidas.
         */
        while (Integer.parseInt(option) != 6) {
            do {
                System.out.println("MenÃº: ");
                System.out.println("1. Crear playlist");
                System.out.println("2. Filtrar por gÃ©nero");
                System.out.println("3. Filtrar por aÃ±o");
                System.out.println("4. Ordenar por duraciÃ³n");
                System.out.println("5. Ordenar por fecha");
                System.out.println("6. Salir");
                System.out.println("Ingrese la opciÃ³n que desea realizar: ");
                option = k.readLine();/*Ingreso de datos por teclado de las opciones presentadas en el menú. */
            } while (Integer.parseInt(option) < 1 || Integer.parseInt(option) > 6);
            /**
             * El Switch Case contiene todos los métodos presentados en el menú
             * de opciones.
             */
            switch (option) {
                /**
                 * Caso número 1, permite la creación de la Playlist.
                 */
                case "1":
                    n = "0";
                    /*Variable de validación del ciclo While que permite el ingreso de canciones a la Playlist. */
                    i = 0;
                    /* Indice de incremento de las posiciones para el almacenamiento de las Id de las canciones en el arreglo numeros.*/
                    while ("0".equals(n)) {
                        System.out.println("Las canciones de la biblioteca son:");
                        /**
                         * Ciclo for que permite la visualización de todas las
                         * canciones de la Biblioteca principal del reproductor.
                         */
                        for (j = 0; j < l; j++) {
                            System.out.println("El nombre de la canciÃ³n es " + main_library[j].title + " y su identificaciÃ³n es " + main_library[j].ID);
                        }
                        System.out.println("Ingrese la identificaciÃ³n de la canciÃ³n para agregarla a la play list");
                        System.out.printf("Introduzca nÃºmero %d: ", i + 1);
                        /**
                         * Arreglo que almacena las ID de las canciones
                         * seleccionadas para la Playlist.
                         */
                        numeros[i] = teclado.nextInt();
                        i++;
                        System.out.println("Desea continuar, ingrese 0 si desea continuar y 1 si desea salir");
                        String af = k.readLine();/* Toma de datos por teclado para continuar o terminar la acción de agregar canciones a la Playlist.*/
                        /**
                         * Condicional de validación que permite continuar
                         * agregando nuevas canciones a la Playlist.
                         */
                        if ("0".equals(af)) {
                            System.out.println("Usted desea continuar");
                            n = af;
                        } else {
                            System.out.println("Usted desea salir");
                            n = af;
                        }
                    }
                    /**
                     * Implementación del método Crear Playlist con la lista de
                     * ID ingresada por el usuario.
                     */
                    playlist = pl.CreatePlaylist(main_library, numeros, i);
                    System.out.println("La playlist creada contiene las siguientes canciones");
                    /**
                     * Impresión de los títulos de las canciones agregadas a la
                     * Playlist.
                     */
                    for (int o = 0; o < i; o++) {
                        System.out.println(playlist[o].title);
                    }

                    break;
                /**
                 * Caso número 2, Permite el filtro de la Playlist por género.
                 */
                case "2":
                    /**
                     * Menú de los géneros musicales presentes en la biblioteca
                     * principal.
                     */
                    System.out.println("Ingrese el gÃ©nero musical por el que desea filtrar ");
                    System.out.println("- Pop");
                    System.out.println("- Country");
                    System.out.println("- Rock");
                    genero = k.readLine();
                    /*Captura por teclado del género que desea filtrar el usuario.*/
                    /**
                     * Implementación del método de Filtrado por género que
                     * devulve el grupo de canciones en un arreglo con el género
                     * deseado.
                     */
                    filtergenre = m.FilterGenre(playlist, genero);
                    System.out.println("La playlist filtrada por el gÃ©nero " + genero + " es:");
                    /**
                     * Ciclo for que imprime las canciones de la Playlist con el
                     * género deseado.
                     */
                    for (int o = 0; o < filtergenre.length; o++) {
                        /**
                         * Condicional que verifica unicamente las posiciones
                         * que contengan un objeto Song para imprimir su título.
                         */
                        if (filtergenre[o] == null) {
                            break;
                        } else {
                            System.out.println(filtergenre[o].title);
                        }
                    }
                    break;
                case "3":
                    /**
                     * Caso tres que permite el ordenamiento por año de la
                     * Playlist.
                     */
                    System.out.println("Ingrese el año que desea filtrar ");
                    /**
                     * Captura del año de filtrado por teclado.
                     */
                    date = k.readLine();
                    /**
                     * LLamado del método del filtrado por año que ingresa la
                     * Playlist que se desea ordenar, y el año a filtrar y
                     * devuelve un arreglo con los objetos Song que coinciden
                     * con este año.
                     */
                    filtergenre = m.FilterDate(playlist, date);
                    System.out.println("La playlist filtrada por anio " + date + " es:");
                    /**
                     * Ciclo for que recorre el arreglo filtrado.
                     */
                    for (int o = 0; o < filtergenre.length; o++) {
                        /**
                         * Condicional que evalúa las posiciones que contienen
                         * objetos son y cuales no.
                         */
                        if (filtergenre[o] == null) {
                            break;
                        } else {
                            /**
                             * Impresión de los objetos Song del arreglo del
                             * filtro de la Playlist por año.
                             */
                            System.out.println(filtergenre[o].title);
                        }
                    }
                    break;
                case "4":
                    /**
                     * Caso 4 que permite el ordenamiento de la Playlist por
                     * duración de las canciones que lo componen.
                     */
                    System.out.println("Ingrese el orden en el que desea organizar los archivos");
                    System.out.println("a --> Ascendente ");
                    System.out.println("d --> Descendente ");
                    /**
                     * Ingreso por teclado del orden en que se desea implementar
                     * el método.
                     */
                    String orden = k.readLine();
                    /**
                     * Validación de la opción ingresada para asignar el estado
                     * booleano adecuado al orden necesario para el método.
                     */
                    if ("a".equals(orden)) {
                        orden1 = true;
                    } else {
                        orden1 = false;
                    }
                    /**
                     * Llamado del método de ordenamiento por duración de la
                     * Playlist que ingresa la Playlist, el tipo de orden y el
                     * tamaño de la Playlist, y devuelve el un arreglo con los
                     * archivos del filtro.
                     */
                    sortLibrary = m.SortDuration(playlist, orden1, i);
                    System.out.println("La lista ordernada por duración es:");
                    /**
                     * Ciclo for que permite recorrer e imprimir los valores del
                     * filtro por duración.
                     */
                    for (int o = 0; o < i; o++) {
                        System.out.println(sortLibrary[o].title);
                    }
                    break;
                case "5":
                    /**
                     * Caso 5 que permite el ordenamiento de la Playlist por año
                     * de las canciones que lo componen.
                     */
                    System.out.println("Ingrese el orden en el que desea organizar los archivos");
                    System.out.println("a --> Ascendente ");
                    System.out.println("d --> Descendente ");
                    /**
                     * Ingreso de año del filtro por teclado.
                     */
                    String orden2 = k.readLine();
                    /**
                     * Validación del orden del filtro para asignación del
                     * estado booleano del orden.
                     */
                    if ("a".equals(orden2)) {
                        orden1 = true;
                    } else {
                        orden1 = false;
                    }
                    /**
                     * Llamado del método de ordenamiento por año, al que se
                     * ingresa la Playlist que se desea ordenar, el sentido del
                     * orden y el tamaño de la Playlist y devuelve un arreglo
                     * con los objetos song que coinciden con el filtro.
                     */
                    sortLibrary = m.SortDate(playlist, orden1, i);
                    System.out.println("La lista ordernada por fecha es:");
                    /**
                     * Ciclo for que recorre el arreglo filtrado e imprime el
                     * título de los objetos Song.
                     */
                    for (int o = 0; o < i; o++) {
                        System.out.println(sortLibrary[o].title);
                    }
                    break;
                case "6":
                    /**
                     * Caso que permite salir del menú.
                     */
                    p = "6";
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}
