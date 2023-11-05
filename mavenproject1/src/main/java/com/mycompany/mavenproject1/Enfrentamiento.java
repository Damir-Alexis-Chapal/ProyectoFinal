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
public class Enfrentamiento implements Serializable {
    
    Equipo equipo1, equipo2;
    Fecha fecha;
    String hora;
    String lugar;
    Juez juez;
    String estado;
    Resultado resultado;
    //la clase Resultado es una clase anónima definida en esta misma
    //clase (abajo del todo)
    
    public Enfrentamiento (){
    
    }
    //constructor sin resultado, acabajo hay un método generarResultado() que genera resultados aleatorios
    public Enfrentamiento(Equipo equipo1, Equipo equipo2, Fecha fecha, String hora, String lugar, Juez juez, String estado) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.juez = juez;
        this.estado = estado;
        
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setJuez(Juez juez) {
        this.juez = juez;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void generarResultado() {
        //método para generar un resultado aleatorio que se seteará en
        //el enfrentamiento que estamos trabajando
        Resultado resultado=new Resultado();
        //cosas aleatorias...guau (proceso para generar un resultado aleatorio)
        this.resultado=resultado;
    }
    
    //clase anónima Resultado propia de la clase Enfrentamiento
    //solo se pueden crear objetos tipo Resultado dentro de esta clase
    public class Resultado{
    
        int puntaje1, puntaje2;
        
        public Resultado(){
        
        }

        public Resultado(int puntaje1, int puntaje2) {
            this.puntaje1 = puntaje1;
            this.puntaje2 = puntaje2;
        }

        public void setPuntaje1(int puntaje1) {
            this.puntaje1 = puntaje1;
        }

        public void setPuntaje2(int puntaje2) {
            this.puntaje2 = puntaje2;
        }
        
        
    }
    
    
    
}
