/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_karimguifarro;

import java.util.ArrayList;

/**
 *
 * @author Karim Ozael
 */
public class Streaming {

    private String nombre;
    private float precio_men;
    private int calificacion;
    private String lanzamiento;
    private String empresa;
    private ArrayList<Series> series = new ArrayList();
     private ArrayList<Peliculas> pelis = new ArrayList();

    public Streaming() {
    }

    public Streaming(String nombre, float precio_men, int calificacion, String lanzamiento, String empresa) {
        this.nombre = nombre;
        this.precio_men = precio_men;
        this.calificacion = calificacion;
        this.lanzamiento = lanzamiento;
        this.empresa = empresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio_men() {
        return precio_men;
    }

    public void setPrecio_men(float precio_men) {
        this.precio_men = precio_men;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(String lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public ArrayList<Series> getSeries() {
        return series;
    }

    public void setSeries(ArrayList<Series> series) {
        this.series = series;
    }

    public ArrayList<Peliculas> getPelis() {
        return pelis;
    }

    public void setPelis(ArrayList<Peliculas> pelis) {
        this.pelis = pelis;
    }

    @Override
    public String toString() {
        return "Streaming{" + "nombre=" + nombre + ", precio_men=" + precio_men + ", calificacion=" + calificacion + ", lanzamiento=" + lanzamiento + ", empresa=" + empresa + ", series=" + series + ", pelis=" + pelis + '}';
    }

   

}
