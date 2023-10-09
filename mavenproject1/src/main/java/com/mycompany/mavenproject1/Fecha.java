/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import javax.swing.*;

/**
 *
 * @author sano2
 */
public class Fecha {
    //atributos
    
    String dia, mes, año; // teniendo en cuenta que haremos todo con interfaces gráficas es mejor String
    
    public Fecha(){
    
    }
    
    public Fecha (String dia, String mes, String año){
        //constructor
        
        this.dia=dia;
        this.mes=mes;
        this.año=año; 
    }
    //setters
    public void setDia(String dia) {
        this.dia = dia;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public void setAño(String año) {
        this.año = año;
    }
    
    
    public boolean verificar_fecha(int dia, int mes, int año){
        //método que recibe dia, mes, año EN FORMA INTEGER como parámetros y retorna true si la fecha ingresada es válida
        //se llamaría desde otras clases como Fecha.verificar_fecha(dia, mes, año);
        
        boolean es_valido=false;
        if(dia<1 || dia>31){
            JOptionPane.showMessageDialog(null, "Ingrese un día valido, por favor");
        }else if(mes<1 || mes>12){
            JOptionPane.showMessageDialog(null, "Ingrese un mes válido, por favor");
        }else if(año<1900 || año>2100){
            JOptionPane.showMessageDialog(null, "Ingrese un año válido, por favor");
        }else{
            es_valido=true;
        }
        return es_valido;
    } 
}
