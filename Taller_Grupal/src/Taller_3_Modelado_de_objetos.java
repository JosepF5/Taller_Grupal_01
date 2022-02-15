
package taller_3_modelado_de_objetos;

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
        String n = "0";
        String p = "0";
        String genero;
        int i = 0;
        int j;
        
        
        Song[] main_library = new Song[4];
        Song[] sortLibrary = new Song[3];
        Music_Library m = new Music_Library();
        Music_Library pl = new Music_Library();
        Song[] playlist = null;
        Song[] filtergenre = null;
        int[] numeros = new int[10];
        int l = main_library.length;
        
        Scanner teclado = new Scanner(System.in);
        BufferedReader k = new BufferedReader(new InputStreamReader(System.in));
        
        main_library[0]= m.song1;
        main_library[1] = m.song2;
        main_library[2] = m.song3;
        main_library[3] = m.song4;
        
        
        System.out.println("---->  Biblioteca de reproducción de audio  <-----");
        while("0".equals(p))
        {
        System.out.println("Menú: ");
        System.out.println("1. Crear playlist");
        System.out.println("2. Filtrar por género");
        System.out.println("3. Filtrar por año");
        System.out.println("4. Ordenar por duración");
        System.out.println("5. Ordenar por fecha");
        System.out.println("6. Salir");
        System.out.println("Ingrese la opción que desea realizar: ");
        String option = k.readLine();
        
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
                    break;
                case "4":
                    sortLibrary = m.SortDuration(playlist, true, i);
                    System.out.println("La lista ordernada por duración es:");
                    for (int o = 0; o < i; o++) {
                        System.out.println(sortLibrary[o].title);
                    }
                    break;
                case "5":
                      
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
