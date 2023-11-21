/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mavenproject1.Ventanas;

import com.mycompany.mavenproject1.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author angel
 */
public class VerDatos extends javax.swing.JFrame {
    
    //Se crea atributo torneo para poder llamarla cuando se desee
    public static Torneo torneo_en_cuestion;
    public static int numero_torneo;

    /**
     * Creates new form VerDatos
     */
    public VerDatos() {
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

        PanelDeFondo = new javax.swing.JPanel();
        CampoDato1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CampoDato2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CampoDato3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CampoDato4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CampoDato5 = new javax.swing.JTextField();
        BotonTablaDePosiciones = new javax.swing.JButton();
        BotonProximosEnfrentamientos = new javax.swing.JButton();
        BotonCerrar = new javax.swing.JButton();
        BotonVolver = new javax.swing.JButton();
        DiaInicioTorneo = new javax.swing.JComboBox<>();
        MesInicioTorneo = new javax.swing.JComboBox<>();
        AñoInicioTorneo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        BotonEditarFecha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelDeFondo.setPreferredSize(new java.awt.Dimension(1000, 600));

        CampoDato1.setEditable(false);
        CampoDato1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CampoDato1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CampoDato1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoDato1ActionPerformed(evt);
            }
        });

        jLabel2.setText("GÉNERO");

        CampoDato2.setEditable(false);
        CampoDato2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoDato2ActionPerformed(evt);
            }
        });

        jLabel3.setText("CARACTER");

        CampoDato3.setEditable(false);

        jLabel4.setText("LUGAR");

        CampoDato4.setEditable(false);

        jLabel5.setText("ESTADO");

        CampoDato5.setEditable(false);

        BotonTablaDePosiciones.setText("TABLA DE POSICIONES");
        BotonTablaDePosiciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonTablaDePosicionesActionPerformed(evt);
            }
        });

        BotonProximosEnfrentamientos.setText("ENFRENTAMIENTOS");
        BotonProximosEnfrentamientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonProximosEnfrentamientosActionPerformed(evt);
            }
        });

        BotonCerrar.setText("X");
        BotonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCerrarActionPerformed(evt);
            }
        });

        BotonVolver.setText("<");
        BotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverActionPerformed(evt);
            }
        });

        DiaInicioTorneo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        DiaInicioTorneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiaInicioTorneoActionPerformed(evt);
            }
        });

        MesInicioTorneo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        AñoInicioTorneo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033" }));

        jLabel7.setText("FECHA INICIO TORNEO");

        BotonEditarFecha.setText("EDITAR FECHA");
        BotonEditarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEditarFechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelDeFondoLayout = new javax.swing.GroupLayout(PanelDeFondo);
        PanelDeFondo.setLayout(PanelDeFondoLayout);
        PanelDeFondoLayout.setHorizontalGroup(
            PanelDeFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDeFondoLayout.createSequentialGroup()
                .addGroup(PanelDeFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDeFondoLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(CampoDato1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelDeFondoLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(PanelDeFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelDeFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CampoDato3, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(CampoDato5))
                        .addGroup(PanelDeFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelDeFondoLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(PanelDeFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(PanelDeFondoLayout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CampoDato2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelDeFondoLayout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CampoDato4))))
                            .addGroup(PanelDeFondoLayout.createSequentialGroup()
                                .addGap(289, 289, 289)
                                .addComponent(BotonVolver)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PanelDeFondoLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(DiaInicioTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MesInicioTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AñoInicioTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelDeFondoLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel7))
                    .addGroup(PanelDeFondoLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(BotonTablaDePosiciones)
                        .addGap(110, 110, 110)
                        .addGroup(PanelDeFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotonEditarFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonProximosEnfrentamientos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        PanelDeFondoLayout.setVerticalGroup(
            PanelDeFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDeFondoLayout.createSequentialGroup()
                .addGroup(PanelDeFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoDato1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(PanelDeFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CampoDato5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(CampoDato2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelDeFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDeFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(CampoDato3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelDeFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(CampoDato4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(81, 81, 81)
                .addComponent(jLabel7)
                .addGroup(PanelDeFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDeFondoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelDeFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DiaInicioTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MesInicioTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AñoInicioTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDeFondoLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(BotonEditarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(PanelDeFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonTablaDePosiciones, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonProximosEnfrentamientos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        getContentPane().add(PanelDeFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoDato2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoDato2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoDato2ActionPerformed

    private void BotonProximosEnfrentamientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonProximosEnfrentamientosActionPerformed
        Enfrentamientos.ver_enfrentamientos(torneo_en_cuestion);
    }//GEN-LAST:event_BotonProximosEnfrentamientosActionPerformed

    private void BotonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BotonCerrarActionPerformed

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
       this.dispose();
    }//GEN-LAST:event_BotonVolverActionPerformed

    private void BotonTablaDePosicionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonTablaDePosicionesActionPerformed
        //tablaDePosiciones.NombreTorneoCuestion.setText(torneo_en_cuestion.nombre);
        tablaDePosiciones.ver_ventana(torneo_en_cuestion);
        
    }//GEN-LAST:event_BotonTablaDePosicionesActionPerformed

    private void CampoDato1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoDato1ActionPerformed

    }//GEN-LAST:event_CampoDato1ActionPerformed

    private void BotonEditarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEditarFechaActionPerformed
        if(Datos.obtenerInstancia().listado_torneos_futbol.contains(torneo_en_cuestion)){
            Torneo remplazo=Datos.obtenerInstancia().listado_torneos_futbol.get(numero_torneo);
            Fecha fecha_remplazo=new Fecha();
            fecha_remplazo.setDia(Integer.parseInt((String)DiaInicioTorneo.getSelectedItem()));
            
            fecha_remplazo.setMes(Fecha.transformar_StringMes((String)MesInicioTorneo.getSelectedItem()));
            fecha_remplazo.setAño(Integer.parseInt((String)AñoInicioTorneo.getSelectedItem()));
            remplazo.setFecha_inicio_torneo(fecha_remplazo);
            
            ArrayList<Enfrentamiento>nuevos_enfrentamientos=Enfrentamiento.generarEnfrentamientos(remplazo.listado_equipos, remplazo);
            JOptionPane.showMessageDialog(null, "Se modificó la fecha de inicio de torneo y por ende se generaron de nuevo los enfrentamientos");
            remplazo.setListado_enfrentamientos(nuevos_enfrentamientos);
            Datos.obtenerInstancia().listado_torneos_futbol.set(numero_torneo, remplazo);
            
            
        }else if(Datos.obtenerInstancia().listado_torneos_volley.contains(torneo_en_cuestion)){
            Torneo remplazo=Datos.obtenerInstancia().listado_torneos_volley.get(numero_torneo);
            Fecha fecha_remplazo=new Fecha();
            fecha_remplazo.setDia(Integer.parseInt((String)DiaInicioTorneo.getSelectedItem()));
            fecha_remplazo.setMes(Integer.parseInt((String)MesInicioTorneo.getSelectedItem()));
            fecha_remplazo.setAño(Integer.parseInt((String)AñoInicioTorneo.getSelectedItem()));
            
            remplazo.setFecha_inicio_torneo(fecha_remplazo);
            
            ArrayList<Enfrentamiento>nuevos_enfrentamientos=Enfrentamiento.generarEnfrentamientos(remplazo.listado_equipos, remplazo);
            JOptionPane.showMessageDialog(null, "Se modificó la fecha de inicio de torneo y por ende se generaron de nuevo los enfrentamientos");
            remplazo.setListado_enfrentamientos(nuevos_enfrentamientos);
            Datos.obtenerInstancia().listado_torneos_volley.set(numero_torneo, remplazo);
        }else if(Datos.obtenerInstancia().listado_torneos_ajedrez.contains(torneo_en_cuestion)){
            Torneo remplazo=Datos.obtenerInstancia().listado_torneos_ajedrez.get(numero_torneo);
            Fecha fecha_remplazo=new Fecha();
            fecha_remplazo.setDia(Integer.parseInt((String)DiaInicioTorneo.getSelectedItem()));
            fecha_remplazo.setMes(Integer.parseInt((String)MesInicioTorneo.getSelectedItem()));
            fecha_remplazo.setAño(Integer.parseInt((String)AñoInicioTorneo.getSelectedItem()));
            
            remplazo.setFecha_inicio_torneo(fecha_remplazo);
            
            ArrayList<Enfrentamiento>nuevos_enfrentamientos=Enfrentamiento.generarEnfrentamientos(remplazo.listado_equipos, remplazo);
            JOptionPane.showMessageDialog(null, "Se modificó la fecha de inicio de torneo y por ende se generaron de nuevo los enfrentamientos");
            remplazo.setListado_enfrentamientos(nuevos_enfrentamientos);
            Datos.obtenerInstancia().listado_torneos_ajedrez.set(numero_torneo, remplazo);
        }else if(Datos.obtenerInstancia().listado_torneos_basket.contains(torneo_en_cuestion)){
            Torneo remplazo=Datos.obtenerInstancia().listado_torneos_basket.get(numero_torneo);
            Fecha fecha_remplazo=new Fecha();
            fecha_remplazo.setDia(Integer.parseInt((String)DiaInicioTorneo.getSelectedItem()));
            fecha_remplazo.setMes(Integer.parseInt((String)MesInicioTorneo.getSelectedItem()));
            fecha_remplazo.setAño(Integer.parseInt((String)AñoInicioTorneo.getSelectedItem()));
            
            remplazo.setFecha_inicio_torneo(fecha_remplazo);
            
            ArrayList<Enfrentamiento>nuevos_enfrentamientos=Enfrentamiento.generarEnfrentamientos(remplazo.listado_equipos, remplazo);
            JOptionPane.showMessageDialog(null, "Se modificó la fecha de inicio de torneo y por ende se generaron de nuevo los enfrentamientos");
            remplazo.setListado_enfrentamientos(nuevos_enfrentamientos);
            Datos.obtenerInstancia().listado_torneos_basket.set(numero_torneo, remplazo);
        }
    }//GEN-LAST:event_BotonEditarFechaActionPerformed

    private void DiaInicioTorneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiaInicioTorneoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DiaInicioTorneoActionPerformed
    
    public static void ver_datos(Torneo torneo, int n_torneo){ //le llega como parámetro el torneo que queremos consultar
        torneo_en_cuestion=torneo;
        numero_torneo=n_torneo;
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new VerDatos().setVisible(true);
                
                CampoDato1.setText(torneo.nombre);
                CampoDato2.setText(torneo.genero);
                CampoDato3.setText(torneo.caracter);
                CampoDato4.setText(torneo.lugar);
                CampoDato5.setText(torneo.estado);
                DiaInicioTorneo.setSelectedItem(torneo.fecha_inicio_torneo.dia);
                MesInicioTorneo.setSelectedItem(Fecha.transformar_intMes(torneo.fecha_inicio_torneo.mes));
                AñoInicioTorneo.setSelectedItem(torneo.fecha_inicio_torneo.año);
                
                
            }
        });
        
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> AñoInicioTorneo;
    private javax.swing.JButton BotonCerrar;
    private javax.swing.JButton BotonEditarFecha;
    private javax.swing.JButton BotonProximosEnfrentamientos;
    private javax.swing.JButton BotonTablaDePosiciones;
    private javax.swing.JButton BotonVolver;
    public static javax.swing.JTextField CampoDato1;
    public static javax.swing.JTextField CampoDato2;
    public static javax.swing.JTextField CampoDato3;
    public static javax.swing.JTextField CampoDato4;
    public static javax.swing.JTextField CampoDato5;
    public static javax.swing.JComboBox<String> DiaInicioTorneo;
    public static javax.swing.JComboBox<String> MesInicioTorneo;
    public javax.swing.JPanel PanelDeFondo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
