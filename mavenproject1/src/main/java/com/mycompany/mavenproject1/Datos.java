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
public class Datos implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private static Datos instancia;
    public ArrayList<Torneo> listado_torneos_futbol = new ArrayList<>();
    public ArrayList<Torneo> listado_torneos_basket = new ArrayList<>();
    public ArrayList<Torneo> listado_torneos_ajedrez = new ArrayList<>();
    public ArrayList<Torneo> listado_torneos_volley = new ArrayList<>();
    
    private Datos() {
        // Constructor privado para evitar la creación de nuevas instancias
    }
    
    public static Datos obtenerInstancia() {
        if (instancia == null) {
            instancia = new Datos();
        }
        return instancia;
    }
}