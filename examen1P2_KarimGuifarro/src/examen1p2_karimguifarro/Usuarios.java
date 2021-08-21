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
public class Usuarios {

    private String usuario, contraseña, nombre, apellido, correo, num_telefonico, plan;
    private ArrayList<Streaming> suscripcion = new ArrayList();

    public Usuarios() {
    }

    public Usuarios(String usuario, String contraseña, String nombre, String apellido, String correo, String num_telefonico, String plan) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.num_telefonico = num_telefonico;
        this.plan = plan;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorrero(String correro) {
        this.correo = correro;
    }

    public String getNum_telefonico() {
        return num_telefonico;
    }

    public void setNum_telefonico(String num_telefonico) {
        this.num_telefonico = num_telefonico;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public ArrayList<Streaming> getSuscripcion() {
        return suscripcion;
    }

    public void setSuscripcion(ArrayList<Streaming> suscripcion) {
        this.suscripcion = suscripcion;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "usuario=" + usuario + ", contraseña=" + contraseña + ", nombre=" + nombre + ", apellido=" + apellido + ", correro=" + correo + ", num_telefonico=" + num_telefonico + ", plan=" + plan + ", suscripcion=" + suscripcion + '}';
    }

}
