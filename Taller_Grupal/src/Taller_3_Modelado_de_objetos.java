/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_3_modelado_de_objetos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Scanner;
import java.util.Timer;

/**
 *
 * @author USUARIO
 */
public class Taller_3_Modelado_de_objetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String n="0";
        int i=0;
        int j;
        
        Song[] main_library = new Song[3];
        Song[] sortLibrary = new Song[3];
        Music_Library m = new Music_Library();
        Music_Library pl = new Music_Library();
        main_library[0]= m.song1;
        main_library[1] = m.song2;
        main_library[2] = m.song3;
        
        BufferedReader k = new BufferedReader(new InputStreamReader(System.in));
        Song[] playlist = new Song[2];
        int[] numeros = new int[10];
        Scanner teclado = new Scanner(System.in);
        int l =main_library.length;
        System.out.println("El tamaño del arreglo es "+ l);
        

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
            System.out.println("Desea continuar, ingrese 0 si desea continuar 0 1 si desea salir");
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
        
        sortLibrary = m.SortDuration(main_library, false,l);
        System.out.println("La lista ordernada por duración es:");
        for (int o = 0; o < l; o++) {
            System.out.println(sortLibrary[o].title);
        }
        
        
    }
    
}
