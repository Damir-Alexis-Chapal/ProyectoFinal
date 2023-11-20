/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.io.Serializable;
import java.util.ArrayList;
import java.time.*;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author sano2
 */
public class Enfrentamiento implements Serializable {
    
    public Equipo equipo1, equipo2;
    public Fecha fecha;
    public LocalTime hora;
    public String lugar;
    public Juez juez;
    public String estado;
    public Resultado resultado;
    //la clase Resultado es una clase anónima definida en esta misma
    //clase (abajo del todo)
    
    public Enfrentamiento (){
    
    }
    //constructor sin resultado, acabajo hay un método generarResultado() que genera resultados aleatorios
    public Enfrentamiento(Equipo equipo1, Equipo equipo2, Fecha fecha, LocalTime hora, String lugar, Juez juez, String estado) {
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

    public void setHora(LocalTime hora) {
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

    public void generarResultadoFutbol() {
        //método para generar un resultado aleatorio que se seteará en
        //el enfrentamiento que estamos trabajando
        Resultado resultado=new Resultado();
        int puntos1=0,puntos2=0;
        
        Random r=new Random();
        puntos1=r.nextInt(5);
        puntos2=r.nextInt(5);
        resultado.puntaje1=puntos1;
        resultado.puntaje2=puntos2;
        
        
        this.resultado=resultado;
    }
    
    public void generarResultadoAjedrez() {
        //método para generar un resultado aleatorio que se seteará en
        //el enfrentamiento que estamos trabajando
        Resultado resultado=new Resultado();
        int puntos1=0,puntos2=0;
        boolean repita=false;
        
        do{
            Random r=new Random();
            puntos1=r.nextInt(4);
            puntos2=r.nextInt(4);
            
            
            if(puntos1==3||puntos2==3){
                repita=false;
            }else{
                repita=true;
            }
            
            if(puntos1==puntos2){
                repita=true;
            }
        }while(repita==true);
        
        
        
        
        resultado.puntaje1=puntos1;
        resultado.puntaje2=puntos2;
        
        
        this.resultado=resultado;
    }
    
    //clase anónima Resultado propia de la clase Enfrentamiento
    //solo se pueden crear objetos tipo Resultado dentro de esta clase
    public class Resultado implements Serializable{
    
        public int puntaje1, puntaje2;
        
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
        
        
        public String toString(){
            return puntaje1+" - "+ puntaje2;
        }
        
        
    }
    
    //
    
    public static ArrayList<Enfrentamiento> generarEnfrentamientos(ArrayList<Equipo> equipos, Torneo torneo) {
        // Crear un ArrayList vacío para almacenar los enfrentamientos
        ArrayList<Enfrentamiento> enfrentamientos = new ArrayList<>();
        // Recorrer el ArrayList de equipos con un bucle for
        for (int i = 0; i < equipos.size(); i++) {
        // Obtener el equipo actual
        Equipo equipo1 = equipos.get(i);
            
            // Recorrer el ArrayList de equipos desde el siguiente índice con otro bucle for
            for (int j = i + 1; j < equipos.size(); j++) {
                // Obtener el otro equipo
                Equipo equipo2 = equipos.get(j);
                // Crear un objeto de tipo Enfrentamiento con los dos equipos
                Enfrentamiento enfrentamiento = new Enfrentamiento();
                enfrentamiento.setEquipo1(equipo1);
                enfrentamiento.setEquipo2(equipo2);
                enfrentamiento.setEstado("ACTIVO");
                enfrentamiento.setLugar(torneo.lugar);
                
                //n siendo un numero random entre el size del listado y 0
                Random r=new Random();
                int n=r.nextInt(torneo.listado_jueces.size());
                enfrentamiento.juez=torneo.listado_jueces.get(n);
                
                Fecha fecha=new Fecha();
                //random para el dia de enfrentamiento entre 7 y 1 para sumarlo a la fecha de inicio
                int d=r.nextInt(7-1)+1;
                
                fecha.setDia(torneo.fecha_inicio_torneo.dia+d);
                fecha.setMes(torneo.fecha_inicio_torneo.mes);
                fecha.setAño(2023);
                fecha=Fecha.arreglar_fecha(fecha);
                
                
                
                enfrentamiento.setFecha(fecha);
                
                //h hora aleatoria entre las 20 y las 7
                int h=r.nextInt(20-7)+7;
                LocalTime hora= LocalTime.of(h, 0);
                enfrentamiento.setHora(hora);
                // Añadir el enfrentamiento al ArrayList de enfrentamientos
                enfrentamientos.add(enfrentamiento);
                
                //
            }
        }
        Collections.sort(enfrentamientos, new CompararFechaHora());
        //retorna la lista de enfrentamientos para el torneo
        return enfrentamientos;
    }
  
}
