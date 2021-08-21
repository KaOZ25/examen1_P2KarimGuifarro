/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_karimguifarro;

/**
 *
 * @author Karim Ozael
 */
public class Series {
   private String nombre,clasificacion;
   private int cant_temp,cant_actores;

    public Series() {
    }

    public Series(String nombre, int cant_temp) {
        this.nombre = nombre;
        this.cant_temp = cant_temp;
    }

   

    public Series(String nombre, String clasificacion, int cant_temp, int cant_actores) {
        this.nombre = nombre;
        this.clasificacion = clasificacion;
        this.cant_temp = cant_temp;
        this.cant_actores = cant_actores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getCant_temp() {
        return cant_temp;
    }

    public void setCant_temp(int cant_temp) {
        this.cant_temp = cant_temp;
    }

    public int getCant_actores() {
        return cant_actores;
    }

    public void setCant_actores(int cant_actores) {
        this.cant_actores = cant_actores;
    }

    @Override
    public String toString() {
        return "Series{" + "nombre=" + nombre + ", clasificacion=" + clasificacion + ", cant_temp=" + cant_temp + ", cant_actores=" + cant_actores + '}';
    }
   
}
