/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mavenproject1.Ventanas;

import com.mycompany.mavenproject1.CompararPuntos;
import com.mycompany.mavenproject1.Datos;
import com.mycompany.mavenproject1.Enfrentamiento;
import com.mycompany.mavenproject1.Equipo;
import com.mycompany.mavenproject1.Torneo;
import static com.mycompany.mavenproject1.Ventanas.Enfrentamientos.torneo_cuestion;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexis Chapal
 */
public class tablaDePosiciones extends javax.swing.JFrame {

    public static Torneo torneo_cuestion;
    /**
     * 
     * Creates new form tablaDePosiciones
     */
    public tablaDePosiciones() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaDePosiciones = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BotonAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("TORNEO X");

        tablaDePosiciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "", null, null, null, null},
                {"2", null, null, null, null, null},
                {"3", null, null, null, null, null},
                {"4", null, null, null, null, null},
                {"5", null, null, null, null, null},
                {"6", null, null, null, null, null},
                {"7", null, null, null, null, null},
                {"8", null, null, null, null, null},
                {"9", null, null, null, null, null},
                {"10", null, null, null, null, null},
                {"11", null, null, null, null, null},
                {"12", null, null, null, null, null},
                {"13", null, null, null, null, null},
                {"14", null, null, null, null, null},
                {"15", null, null, null, null, null},
                {"16", null, null, null, null, null},
                {"17", null, null, null, null, null},
                {"18", null, null, null, null, null},
                {"19", null, null, null, null, null},
                {"20", null, null, null, null, null}
            },
            new String [] {
                "POSICIÓN", "EQUIPO", "PUNTOS", "GANADOS", "EMPATADOS", "PERDIDOS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaDePosiciones);

        jLabel2.setText("LOGO BIEN PERRON");

        jLabel3.setText("una imagen bien perrona");

        BotonAtras.setText("ATRAS");
        BotonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2)
                        .addGap(281, 281, 281)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(405, 405, 405)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonAtras)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addGap(100, 100, 100)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(BotonAtras)
                .addGap(62, 62, 62))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtrasActionPerformed
        this.dispose();
    }//GEN-LAST:event_BotonAtrasActionPerformed
    public static void ver_ventana(Torneo torneo1){
        torneo_cuestion=torneo1;
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tablaDePosiciones().setVisible(true);
                
                if(Datos.obtenerInstancia().listado_torneos_futbol.contains(torneo_cuestion)){
                    for(int i=0;i<Datos.obtenerInstancia().listado_torneos_futbol.size();i++){
                    
                    if(Datos.obtenerInstancia().listado_torneos_futbol.get(i).nombre.equals(torneo_cuestion.nombre)){
                        
                        ArrayList<Equipo>lista_equipos=Datos.obtenerInstancia().listado_torneos_futbol.get(i).listado_equipos;
                        ArrayList<Enfrentamiento>lista_enfrentamientos=Datos.obtenerInstancia().listado_torneos_futbol.get(i).listado_enfrentamientos;
                        
                                    
                        for(int j=0;j<lista_equipos.size();j++){
                            for(int z=0;z<lista_enfrentamientos.size();z++){
                                
                                Collections.sort(lista_equipos, new CompararPuntos());
                                torneo_cuestion.setListado_equipos(lista_equipos);
                               
                            }
                            
                        }
                        Datos.obtenerInstancia().listado_torneos_futbol.set(i, torneo_cuestion);
                    }
                    
                }
                }else if(Datos.obtenerInstancia().listado_torneos_volley.contains(torneo_cuestion)){
                    for(int i=0;i<Datos.obtenerInstancia().listado_torneos_volley.size();i++){
                    
                    if(Datos.obtenerInstancia().listado_torneos_volley.get(i).nombre.equals(torneo_cuestion.nombre)){
                        
                        ArrayList<Equipo>lista_equipos=Datos.obtenerInstancia().listado_torneos_volley.get(i).listado_equipos;
                        ArrayList<Enfrentamiento>lista_enfrentamientos=Datos.obtenerInstancia().listado_torneos_volley.get(i).listado_enfrentamientos;
                        
                                    
                        for(int j=0;j<lista_equipos.size();j++){
                            for(int z=0;z<lista_enfrentamientos.size();z++){
                                
                                Collections.sort(lista_equipos, new CompararPuntos());
                                torneo_cuestion.setListado_equipos(lista_equipos);
                               
                            }
                            
                        }
                        Datos.obtenerInstancia().listado_torneos_volley.set(i, torneo_cuestion);
                    }
                    
                }
                }else if(Datos.obtenerInstancia().listado_torneos_ajedrez.contains(torneo_cuestion)){
                    for(int i=0;i<Datos.obtenerInstancia().listado_torneos_ajedrez.size();i++){
                    
                    if(Datos.obtenerInstancia().listado_torneos_ajedrez.get(i).nombre.equals(torneo_cuestion.nombre)){
                        
                        ArrayList<Equipo>lista_equipos=Datos.obtenerInstancia().listado_torneos_ajedrez.get(i).listado_equipos;
                        ArrayList<Enfrentamiento>lista_enfrentamientos=Datos.obtenerInstancia().listado_torneos_ajedrez.get(i).listado_enfrentamientos;
                        
                                    
                        for(int j=0;j<lista_equipos.size();j++){
                            for(int z=0;z<lista_enfrentamientos.size();z++){
                                
                                Collections.sort(lista_equipos, new CompararPuntos());
                                torneo_cuestion.setListado_equipos(lista_equipos);
                               
                            }
                            
                        }
                        Datos.obtenerInstancia().listado_torneos_ajedrez.set(i, torneo_cuestion);
                    }
                    
                }
                }else if(Datos.obtenerInstancia().listado_torneos_basket.contains(torneo_cuestion)){
                    for(int i=0;i<Datos.obtenerInstancia().listado_torneos_basket.size();i++){
                    
                    if(Datos.obtenerInstancia().listado_torneos_basket.get(i).nombre.equals(torneo_cuestion.nombre)){
                        
                        ArrayList<Equipo>lista_equipos=Datos.obtenerInstancia().listado_torneos_basket.get(i).listado_equipos;
                        ArrayList<Enfrentamiento>lista_enfrentamientos=Datos.obtenerInstancia().listado_torneos_basket.get(i).listado_enfrentamientos;
                        
                                    
                        for(int j=0;j<lista_equipos.size();j++){
                            for(int z=0;z<lista_enfrentamientos.size();z++){
                                
                                Collections.sort(lista_equipos, new CompararPuntos());
                                torneo_cuestion.setListado_equipos(lista_equipos);
                               
                            }
                            
                        }
                        Datos.obtenerInstancia().listado_torneos_basket.set(i, torneo_cuestion);
                    }
                    
                }
                }
                
                
                settear_tabla();
                
            }
        });
    }
    /**
     * @param args the command line arguments
     */
    public static void settear_tabla(){
        
        if(torneo_cuestion.listado_equipos.size()==0){
            JOptionPane.showMessageDialog(null, "ESTAMOS VACÍOS");
        }
        //HACER VERIFICACION POR SI ESTÁ VACÍO
        for(int i=0;i<torneo_cuestion.listado_equipos.size();i++){
            tablaDePosiciones.setValueAt(torneo_cuestion.listado_equipos.get(i).nombre,i ,1 );
            tablaDePosiciones.setValueAt(torneo_cuestion.listado_equipos.get(i).puntos,i ,2 );
            tablaDePosiciones.setValueAt(torneo_cuestion.listado_equipos.get(i).ganados,i ,3 );
            tablaDePosiciones.setValueAt(torneo_cuestion.listado_equipos.get(i).empatados,i ,4 );
            tablaDePosiciones.setValueAt(torneo_cuestion.listado_equipos.get(i).perdidos,i ,5);
            
        }
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAtras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable tablaDePosiciones;
    // End of variables declaration//GEN-END:variables
}
