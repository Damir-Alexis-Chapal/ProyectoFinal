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
public class CompararFechaHora implements Comparator<Enfrentamiento>{
    @Override
    public int compare(Enfrentamiento enfrentamiento1, Enfrentamiento enfrentamiento2){
        int n=0;
        
        n=enfrentamiento1.fecha.año-enfrentamiento2.fecha.año;
        if(n==0){
            n=enfrentamiento1.fecha.mes-enfrentamiento2.fecha.mes;
            if(n==0){
                n=enfrentamiento1.fecha.dia-enfrentamiento2.fecha.dia;
                if(n==0){
                   n=enfrentamiento1.hora.getHour()-enfrentamiento2.hora.getHour();

                }
            }
        }
        return n;
        
    }
    
}
