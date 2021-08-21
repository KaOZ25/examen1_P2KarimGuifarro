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
public class Peliculas {
    private String nombre,lanzamiento,duracion,lan_stream,plot;

    public Peliculas(String nombre, String lanzamiento, String duracion, String lan_stream, String plot) {
        this.nombre = nombre;
        this.lanzamiento = lanzamiento;
        this.duracion = duracion;
        this.lan_stream = lan_stream;
        this.plot = plot;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(String lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getLan_stream() {
        return lan_stream;
    }

    public void setLan_stream(String lan_stream) {
        this.lan_stream = lan_stream;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    @Override
    public String toString() {
        return "Peliculas{" + "nombre=" + nombre + ", lanzamiento=" + lanzamiento + ", duracion=" + duracion + ", lan_stream=" + lan_stream + ", plot=" + plot + '}';
    }
    
}
