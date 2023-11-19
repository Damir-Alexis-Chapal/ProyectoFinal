/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Comparator;

/**
 *
 * @author sano2
 */
public class CompararPuntos implements Comparator<Equipo>{
    @Override
    public int compare(Equipo equipo1, Equipo equipo2){
        return equipo1.puntos-equipo2.puntos;
        
    }
    
}
