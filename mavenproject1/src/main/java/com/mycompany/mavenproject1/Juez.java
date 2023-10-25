/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.*;

/**
 *
 * @author sano2
 */
//clase juez que hereda los atributos de persona
public class Juez extends Persona{
    String licencia;
    //ArrayList para poder consultar todos los enfrentamientos de cada juez;
    ArrayList<Enfrentamiento> lista_enfrentamientos=new ArrayList<>(); 
    
    public Juez(){
    
    }
    public Juez(String licencia,TipoPersona tipo, String nombre, String cedula, String genero, String telefono, String correo, int edad, Fecha fecha_nacimiento) {
        super(tipo, nombre, cedula, genero, telefono, correo, edad, fecha_nacimiento);
        this.licencia = licencia;
    }

    public void setLista_enfrentamientos(ArrayList<Enfrentamiento> lista_enfrentamientos) {
        this.lista_enfrentamientos = lista_enfrentamientos;
    }
    

    public void setLicencia(String licencia) {
        this.licencia = licencia;
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
    
    
}
