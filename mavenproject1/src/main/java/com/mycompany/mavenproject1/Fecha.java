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
    
    int dia, mes, año; // teniendo en cuenta que haremos operaciones es mejor integer
    
    public Fecha(){
    
    }
    
    public Fecha (int dia, int mes, int año){
        //constructor
        
        this.dia=dia;
        this.mes=mes;
        this.año=año; 
    }
    //setters
    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    
    public static boolean verificar_fecha(int dia, int mes, int año){
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
    
    public static int transformar_StringMes(String mes){
        //método que recibe String mes (en español) como "Enero" y retorna su valor en int
        int mes_int=0;
        if (mes.equals("Enero")){
            mes_int =1;
        }else if(mes.equals("Febrero")){
            mes_int=2;
        }else if(mes.equals("Marzo")){
            mes_int=3;
        }else if(mes.equals("Abril")){
            mes_int=4;
        }else if(mes.equals("Mayo")){
            mes_int=5;
        }else if(mes.equals("Junio")){
            mes_int=6;
        }else if(mes.equals("Julio")){
            mes_int=7;
        }else if(mes.equals("Agosto")){
            mes_int=8;
        }else if(mes.equals("Septiembre")){
            mes_int=9;
        }else if(mes.equals("Octubre")){
            mes_int=10;
        }else if(mes.equals("Noviembre")){
            mes_int=11;
        }else if(mes.equals("Diciembre")){
            mes_int=12;
        }
        return mes_int;
        
    }
    
    public static String transformar_intMes(int mes){
        //método que recibe un int y lo transforma en un String del nombre del mes
        String StringMes="";
        if(mes==1){
            StringMes="Enero";
        }else if(mes==2){
            StringMes="Febrero";
        }else if(mes==3){
            StringMes="Marzo";
        }else if(mes==4){
            StringMes="Abril";
        }else if(mes==5){
            StringMes="Mayo";
        }else if(mes==6){
            StringMes="Junio";
        }else if(mes==7){
            StringMes="Julio";
        }else if(mes==8){
            StringMes="Agosto";
        }else if(mes==9){
            StringMes="Septiembre";
        }else if(mes==10){
            StringMes="Octubre";
        }else if(mes==11){
            StringMes="Noviembre";
        }else if(mes==12){
            StringMes="Diciembre";
        }
        return StringMes;
    }
}
