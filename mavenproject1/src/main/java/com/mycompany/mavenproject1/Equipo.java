/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author sano2
 */
public class Equipo implements Serializable {
    //listado tanto de participantes como de enfrentamientos que tiene cada equipo
    //se deben poder consultar
    ArrayList<Persona> listado_participantes=new ArrayList<Persona>();
    ArrayList<Enfrentamiento> listado_enfrentamientos=new ArrayList<Enfrentamiento>();
    
    String nombre, genero;
    Persona lider, tecnico;
    int cant_participantes;
    
    public Equipo(){
    
    }

    public Equipo(String nombre, String genero, Persona lider, Persona tecnico, int cant_participantes) {
        this.nombre = nombre;
        this.genero = genero;
        this.lider = lider;
        this.tecnico = tecnico;
        this.cant_participantes = cant_participantes;
    }

    public void setListado_participantes(ArrayList<Persona> listado_participantes) {
        this.listado_participantes = listado_participantes;
    }

    public void setListado_enfrentamientos(ArrayList<Enfrentamiento> listado_enfrentamientos) {
        this.listado_enfrentamientos = listado_enfrentamientos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setLider(Persona lider) {
        this.lider = lider;
    }

    public void setTecnico(Persona tecnico) {
        this.tecnico = tecnico;
    }

    public void setCant_participantes(int cant_participantes) {
        this.cant_participantes = cant_participantes;
    }
    
    
}
