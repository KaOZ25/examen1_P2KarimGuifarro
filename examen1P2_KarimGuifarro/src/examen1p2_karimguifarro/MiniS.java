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
public class MiniS extends Series{
    private String genero;
    private String duracion_cap;
    private String descripcion;

    public MiniS(String nombre, int cant_temp,String genero, String duracion_cap, String descripcion) {
        super(nombre, cant_temp);
        this.genero = genero;
        this.duracion_cap = duracion_cap;
        this.descripcion = descripcion;
    }
    

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDuracion_cap(String duracion_cap) {
        this.duracion_cap = duracion_cap;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getGenero() {
        return genero;
    }

    public String getDuracion_cap() {
        return duracion_cap;
    }

    public String getDescripcion() {
        return descripcion;
    }
    

    @Override
    public String toString() {
        return "MiniS{" + "genero=" + genero + ", duracion_cap=" + duracion_cap + ", descripcion=" + descripcion + '}';
    }
    
}
