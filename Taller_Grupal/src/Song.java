/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_3_modelado_de_objetos;

import java.util.Date;

/**
 *
 * @author USUARIO
 */
public class Song {
    public String title;
    public int ID;
    public Date date;
    public String duration;
    public String genre;
    public String cover;
    public String description;

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
