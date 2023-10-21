/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author sano2
 */
public class TorneoAjedrez extends Torneo{
    //atributo único
    int cant_min_participantes_por_equipo=1; // segun wikipedia son 5 que tienen que estar en el campo

    public TorneoAjedrez() {
    }
    //constructor
    public TorneoAjedrez(String nombre, String genero, String lugar, String caracter, String estado, int cant_equipos, int limite_edad, int valor_inscripcion, Fecha fecha_inicio_inscripcion, Fecha fecha_fin_inscripcion, Fecha fecha_inicio_torneo) {
        super(nombre, genero, lugar, caracter, estado, cant_equipos, limite_edad, valor_inscripcion, fecha_inicio_inscripcion, fecha_fin_inscripcion, fecha_inicio_torneo);
    }
    //setters
    public void setCant_min_participantes_por_equipo(int cant_min_participantes_por_equipo) {
        this.cant_min_participantes_por_equipo = cant_min_participantes_por_equipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setCaracter(String caracter) {
        this.caracter = caracter;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCant_equipos(int cant_equipos) {
        this.cant_equipos = cant_equipos;
    }

    public void setLimite_edad(int limite_edad) {
        this.limite_edad = limite_edad;
    }

    public void setValor_inscripcion(int valor_inscripcion) {
        this.valor_inscripcion = valor_inscripcion;
    }

    public void setFecha_inicio_inscripcion(Fecha fecha_inicio_inscripcion) {
        this.fecha_inicio_inscripcion = fecha_inicio_inscripcion;
    }

    public void setFecha_fin_inscripcion(Fecha fecha_fin_inscripcion) {
        this.fecha_fin_inscripcion = fecha_fin_inscripcion;
    }

    public void setFecha_inicio_torneo(Fecha fecha_inicio_torneo) {
        this.fecha_inicio_torneo = fecha_inicio_torneo;
    }
    
    
}
