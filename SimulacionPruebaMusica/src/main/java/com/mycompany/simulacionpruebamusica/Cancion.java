/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simulacionpruebamusica;

/**
 *
 * @author pc
 */
public class Cancion {
    String Artista, Titulo;
    int Duracion;
    boolean Descargado, Favorito;
    
    //constructor 
    public Cancion(String Artista, String Titulo, int Duracion, boolean Descargado, boolean Favorito) {
        this.Artista = Artista;
        this.Titulo = Titulo;
        this.Duracion = Duracion;
        this.Descargado = Descargado;
        this.Favorito = Favorito;
    }
    
    //constructor vacio
    public Cancion() {
    }

    //Metodo gett
    public String getArtista() {
        return Artista;
    }

    public String getTitulo() {
        return Titulo;
    }

    public int getDuracion() {
        return Duracion;
    }

    public boolean isDescargado() {
        return Descargado;
    }

    public boolean isFavorito() {
        return Favorito;
    }

    //metodo set
    public void setArtista(String Artista) {
        this.Artista = Artista;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setDuracion(int Duracion) {
        this.Duracion = Duracion;
    }

    public void setDescargado(boolean Descargado) {
        this.Descargado = Descargado;
    }

    public void setFavorito(boolean Favorito) {
        this.Favorito = Favorito;
    }

    @Override
    public String toString() {
        return "Cancion{" + "Artista=" + Artista + ", Titulo=" + Titulo + ", Duracion=" + Duracion + ", Descargado=" + Descargado + ", Favorito=" + Favorito + '}';
    }
    
    
    public void CalculoMusica(){
        int minutos = this.Duracion/60;
        int segundos = this.Duracion%60;
        System.out.println("Duracion: "+minutos+':'+segundos);
        
    
    }
    public String DuracionMUsica(){
    if (Duracion >= 300){
        return "La musica es larga";
    }
    else{
        return "La musica es corta";
                }
    }
    
    public void AdelantarMUsica (int segundos){
        System.out.println("Adelantado la musica"+ segundos+" segundos.");
    
    }
    
}
