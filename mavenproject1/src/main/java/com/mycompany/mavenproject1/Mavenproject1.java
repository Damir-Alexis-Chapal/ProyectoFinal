/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;


import com.mycompany.mavenproject1.Ventanas.InterfazPrincipal;
import com.mycompany.mavenproject1.Ventanas.tablaDePosiciones;
import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexis Chapal & Santiago Navarro ;)
 */
public class Mavenproject1 implements Serializable {
    public static void main (String [] args){
        //POR FAVOR NO MODIFICAR EL NOMBRE DE ESTE ARCHIVO PORQUE EL PROGRAMA EXPLOTA
        
        
        //Se ejecuta la interfaz principal
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPrincipal().setVisible(true);
                //tablaDePosiciones.ver_ventana();
                
            }
        });
    }
    
}
