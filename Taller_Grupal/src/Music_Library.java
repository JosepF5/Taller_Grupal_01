/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

/**
 *
 * @author Marleny Fernández Sandoval
 */
public class Music_Library {
    
    public Song song;
    
    Date fecha = new Date(95,01,01);
    public Song song1 = new Song("Beat it", 000,fecha ,"01:30" , "pop", "c1.png", "Michael Jackson");
    public Song song2 = new Song("Hurt", 001,fecha ,"00:20" , "Country", "c1.png", "Johny Cash");
    public Song song3 = new Song("Mr. Tambourine", 002,fecha ,"04:10" , "Rock", "c1.png", "Bob Dylan");
    
    public Song[] main_library = new Song[100];
    

    public Music_Library() {
    }
    
    public Song[] CreatePlaylist(Song[] main_library,int[] numeros)
    {
        
        Song[] Arraysong= new Song[100];
        for (int i = 0; i < numeros.length; i++) {
           Arraysong[i]= main_library[numeros[i]]; 
        }
        
        return Arraysong;
        
    }
    
    public Song[] SortDuration(Song[] main_library, boolean order, int tamaño)
    {
        Song[] SortArray = new Song[tamaño];
        int[] durarray = new int[tamaño];
        for (int j = 0; j < tamaño; j++) {
            String d = main_library[j].duration;
            String[] dur = d.split(":");
            int dur1=Integer.parseInt(dur[0]+ dur[1]);
            durarray[j]=dur1;
            System.out.println(dur1);
                
        }
        if(order== true)
        {
            Arrays.sort(durarray);
            for (int i = 0; i < durarray.length; i++) {
                System.out.println(durarray[i]);
            }
            
        }

        for (int i = 0; i < tamaño; i++) {
            String d1 = main_library[i].duration;
            String[] durd = d1.split(":");
            int dur1d=Integer.parseInt(durd[0]+ durd[1]);
            for (int j = 0; j <main_library.length ; j++) {
                if(dur1d==durarray[j])
                {
                    SortArray[j]=main_library[i];
                }
                
            }
        }

        return SortArray;
    }
    

    
    
}
