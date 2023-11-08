/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.io.Serializable;

/**
 *
 * @author sano2
 */
public class Persona implements Serializable {

    //se definen atributos
    
    String tipo, nombre, cedula, genero, telefono, correo;
    int edad;
    Fecha fecha_nacimiento;

    public Persona() {

    }

    public Persona(String tipo, String nombre, String cedula, String genero, String telefono, String correo, int edad, Fecha fecha_nacimiento) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.cedula = cedula;
        this.genero = genero;
        this.telefono = telefono;
        this.correo = correo;
        this.edad = edad;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setFecha_nacimiento(Fecha fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
     public String toString() {
    return " Participante: " + nombre;
}
    

}
