/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mavenproject1.Ventanas;

import com.mycompany.mavenproject1.*;
import static com.mycompany.mavenproject1.Ventanas.FormularioEquipo.CantidadParticipantes;
import static com.mycompany.mavenproject1.Ventanas.FormularioEquipo.MiembrosRegistrados;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;

/**
 *
 * @author sano2
 */
public class FormularioTorneo extends javax.swing.JFrame {

    /**
     * Creates new form FormularioTorneo
     */
    //variables para validar la cantidad de equipos
    public static int NumEquipos;
    public static int NumEquiposRegistrados = 0;
    //variables para validar las personas
    public static int LimiteEdad;
    public static String generoTorneo;

    public FormularioTorneo() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CampoNombreTorneo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CajaDiaInicioInscripciones = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CajaMesInicioInscripciones = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        CajaAñoInicioInscripciones = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CajaDiaCierreInscripciones = new javax.swing.JComboBox<>();
        CajaMesCierreInscripciones = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CajaAñoCierreInscripciones = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        CajaDiaInicioTorneo = new javax.swing.JComboBox<>();
        CajaMesInicioTorneo = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        CajaAñoInicioTorneo = new javax.swing.JComboBox<>();
        CajaCaracter = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        CajaGenero = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        CajaLugar = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        CajaTipoTorneo = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        CajaNumeroEquipos = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        CampoLimiteEdad = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        CajaValorInscripcion = new javax.swing.JTextField();
        BotonAtras = new javax.swing.JButton();
        BotonRegistrarEquipos = new javax.swing.JButton();
        BotonGuardarDatos = new javax.swing.JButton();
        BotonRegistrarJueces = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("INGRESE EL NOMBRE DEL TORNEO");

        CampoNombreTorneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNombreTorneoActionPerformed(evt);
            }
        });

        jLabel2.setText("FECHA DE INICIO DE INSCRIPCIONES");

        CajaDiaInicioInscripciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel3.setText("DIA");

        jLabel4.setText("MES");

        CajaMesInicioInscripciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        jLabel5.setText("AÑO");

        CajaAñoInicioInscripciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033" }));

        jLabel6.setText("FECHA DE CIERRE DE INSCRIPCIONES");

        jLabel7.setText("DIA");

        CajaDiaCierreInscripciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        CajaMesCierreInscripciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        jLabel8.setText("MES");

        jLabel9.setText("AÑO");

        CajaAñoCierreInscripciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033" }));

        jLabel10.setText("FECHA DE INICIO DEL TORNEO");

        jLabel11.setText("DIA");

        CajaDiaInicioTorneo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        CajaMesInicioTorneo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        jLabel12.setText("MES");

        jLabel13.setText("AÑO");

        CajaAñoInicioTorneo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033" }));

        CajaCaracter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Municipal", "Departamental", "Nacional", "Internacional" }));
        CajaCaracter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaCaracterActionPerformed(evt);
            }
        });

        jLabel14.setText("CARACTER DEL TORNEO");

        jLabel15.setText("GÉNERO PERMITIDO EN EL TORNEO");

        CajaGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FEMENINO", "MASCULINO", "MIXTO" }));

        jLabel16.setText("LUGAR DONDE SE LLEVARÁ A CABO EL TORNEO");

        CajaLugar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UQ", "COMFENALCO", "CENTENARIO", "C.CAFÉ", "S.JOSE", "INEM" }));

        jLabel17.setText("DEPORTE AL QUE SE JUGARÁ");

        CajaTipoTorneo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fútbol Sala", "VolleyBall", "Baloncesto", "Ajedrez" }));

        jLabel18.setText("NUMERO DE EQUIPOS");

        CajaNumeroEquipos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        CajaNumeroEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaNumeroEquiposActionPerformed(evt);
            }
        });

        jLabel19.setText("LIMITE DE EDAD");

        CampoLimiteEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoLimiteEdadActionPerformed(evt);
            }
        });

        jLabel20.setText("VALOR DE LA INSCRIPCION");

        BotonAtras.setText("ATRAS");
        BotonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtrasActionPerformed(evt);
            }
        });

        BotonRegistrarEquipos.setText("REGISTRAR EQUIPOS");
        BotonRegistrarEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarEquiposActionPerformed(evt);
            }
        });

        BotonGuardarDatos.setText("GUARDAR DATOS");
        BotonGuardarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarDatosActionPerformed(evt);
            }
        });

        BotonRegistrarJueces.setText("REGISTRAR JUECES");
        BotonRegistrarJueces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarJuecesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addGap(92, 92, 92)
                        .addComponent(jLabel13)
                        .addGap(79, 79, 79))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(88, 88, 88)
                        .addComponent(jLabel9)
                        .addGap(84, 84, 84))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(99, 99, 99)
                        .addComponent(jLabel5)
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(CajaDiaCierreInscripciones, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CajaMesCierreInscripciones, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CajaAñoCierreInscripciones, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CampoNombreTorneo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(jLabel10))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jLabel6))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(CajaDiaInicioInscripciones, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CajaMesInicioInscripciones, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CajaAñoInicioInscripciones, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CampoLimiteEdad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BotonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CajaDiaInicioTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(CajaMesInicioTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(CajaAñoInicioTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(BotonRegistrarEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(CajaValorInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(CajaTipoTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel14))
                                    .addComponent(jLabel16))))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(CajaLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(CajaGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(CajaCaracter, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(CajaNumeroEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(149, 149, 149))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(314, 314, 314)
                .addComponent(BotonGuardarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonRegistrarJueces, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(CajaTipoTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel14)))
                    .addComponent(CampoNombreTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CajaCaracter, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(CajaValorInscripcion)
                    .addComponent(CampoLimiteEdad))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CajaDiaInicioInscripciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CajaMesInicioInscripciones, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CajaAñoInicioInscripciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CajaGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CajaLugar, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(CajaAñoCierreInscripciones)
                    .addComponent(CajaDiaCierreInscripciones)
                    .addComponent(CajaMesCierreInscripciones, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CajaNumeroEquipos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CajaDiaInicioTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CajaMesInicioTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CajaAñoInicioTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAtras)
                    .addComponent(BotonRegistrarEquipos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonGuardarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonRegistrarJueces))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoNombreTorneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNombreTorneoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoNombreTorneoActionPerformed

    private void BotonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtrasActionPerformed
        this.dispose();
    }//GEN-LAST:event_BotonAtrasActionPerformed

    private void CampoLimiteEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoLimiteEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoLimiteEdadActionPerformed

    private void BotonRegistrarEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarEquiposActionPerformed
        //verifico que los campos de texto no estén vacios 
        if (CampoNombreTorneo.getText().isEmpty() || CampoLimiteEdad.getText().isEmpty() || CajaValorInscripcion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor llene todos los campos");
        } else {

            //le doy valor a las variables usadas para verificar a las personas y a los equipos
            NumEquipos = Integer.parseInt((String) CajaNumeroEquipos.getSelectedItem());

            LimiteEdad = Integer.parseInt(CampoLimiteEdad.getText());
            generoTorneo = (String) CajaGenero.getSelectedItem();

            //creo un nuevo torneo usando los campos del formulario
            Torneo NuevoTorneo = new Torneo();
            //seteo los datos del torneo
            NuevoTorneo.setNombre("" + CampoNombreTorneo.getText());
            NuevoTorneo.setGenero("" + CajaGenero.getSelectedItem());
            NuevoTorneo.setLugar("" + CajaLugar.getSelectedItem());
            NuevoTorneo.setCaracter("" + CajaCaracter.getSelectedItem());
            NuevoTorneo.setCant_equipos((int) CajaNumeroEquipos.getSelectedIndex() + 1);
            NuevoTorneo.setLimite_edad(Integer.parseInt(CampoLimiteEdad.getText()));
            NuevoTorneo.setValor_inscripcion(Integer.parseInt(CajaValorInscripcion.getText()));
            //creo un objeto fecha para el inicio inscripciones

            Fecha FechaInicioInscripcionesTorneo = new Fecha();
            FechaInicioInscripcionesTorneo.setDia(Integer.parseInt((String) CajaDiaInicioInscripciones.getSelectedItem()));
            FechaInicioInscripcionesTorneo.setAño(Integer.parseInt((String) CajaAñoInicioInscripciones.getSelectedItem()));
            FechaInicioInscripcionesTorneo.setMes(FechaInicioInscripcionesTorneo.transformar_StringMes((String) CajaMesInicioInscripciones.getSelectedItem()));

            NuevoTorneo.setFecha_inicio_inscripcion(FechaInicioInscripcionesTorneo);

            //creo un objeto fecha para el cierre inscripciones
            Fecha FechaCierreInscripcionesTorneo = new Fecha();
            FechaCierreInscripcionesTorneo.setDia(Integer.parseInt((String) CajaDiaCierreInscripciones.getSelectedItem()));
            FechaCierreInscripcionesTorneo.setAño(Integer.parseInt((String) CajaAñoCierreInscripciones.getSelectedItem()));
            FechaCierreInscripcionesTorneo.setMes(FechaCierreInscripcionesTorneo.transformar_StringMes((String) CajaMesCierreInscripciones.getSelectedItem()));

            NuevoTorneo.setFecha_fin_inscripcion(FechaCierreInscripcionesTorneo);

            //creo un objeto fecha para el inicio del torneo
            Fecha FechaInicioTorneo = new Fecha();
            FechaInicioTorneo.setDia(Integer.parseInt((String) CajaDiaInicioTorneo.getSelectedItem()));
            FechaInicioTorneo.setAño(Integer.parseInt((String) CajaAñoInicioTorneo.getSelectedItem()));
            FechaInicioTorneo.setMes(FechaInicioTorneo.transformar_StringMes((String) CajaMesInicioTorneo.getSelectedItem()));

            NuevoTorneo.setFecha_inicio_torneo(FechaInicioTorneo);

            //una vez guardados los datos continuamos a la ventana de registrar equipos para el torneo
            //envio y seteo en la siguiente ventana el nombre del torneo para que se vea mejor
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {

                    if (NumEquipos == NumEquiposRegistrados) {
                        //guardo el torneo según el tipo que sea
                        if (CajaTipoTorneo.getSelectedItem().equals("Fútbol Sala")) {
                            Datos.listado_torneos_futbol.add(NuevoTorneo);
                        } else if (CajaTipoTorneo.getSelectedItem().equals("VolleyBall")) {
                            Datos.listado_torneos_volley.add(NuevoTorneo);
                        } else if (CajaTipoTorneo.getSelectedItem().equals("Baloncesto")) {
                            Datos.listado_torneos_basket.add(NuevoTorneo);
                        } else if (CajaTipoTorneo.getSelectedItem().equals("Ajedrez")) {
                            Datos.listado_torneos_ajedrez.add(NuevoTorneo);
                        }
                        JOptionPane.showMessageDialog(null, "¡Registro exitoso de todos los equipos participantes"
                                + "\n El torneo " + CampoNombreTorneo.getText() + " ha sido creado con exito!");
                        NumEquiposRegistrados = 0;
                        FormularioTorneo.this.dispose();

                    } else {
                        FormularioEquipo NuevoEquipo = new FormularioEquipo(NuevoTorneo);
                        NuevoEquipo.NombreTorneo.setText(CampoNombreTorneo.getText());
                        NuevoEquipo.setVisible(true);
                    }
                }

                private void dispose() {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }
            });
        }
    }//GEN-LAST:event_BotonRegistrarEquiposActionPerformed

    private void BotonRegistrarJuecesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarJuecesActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioJuez().setVisible(true);
            }
        });
    }//GEN-LAST:event_BotonRegistrarJuecesActionPerformed

    private void BotonGuardarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarDatosActionPerformed
        //Basket 5, volley 6, futbol 5, ajedrez 1
    }//GEN-LAST:event_BotonGuardarDatosActionPerformed

    private void CajaCaracterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaCaracterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CajaCaracterActionPerformed

    private void CajaNumeroEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaNumeroEquiposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CajaNumeroEquiposActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAtras;
    private javax.swing.JButton BotonGuardarDatos;
    private javax.swing.JButton BotonRegistrarEquipos;
    private javax.swing.JButton BotonRegistrarJueces;
    private javax.swing.JComboBox<String> CajaAñoCierreInscripciones;
    private javax.swing.JComboBox<String> CajaAñoInicioInscripciones;
    private javax.swing.JComboBox<String> CajaAñoInicioTorneo;
    private javax.swing.JComboBox<String> CajaCaracter;
    private javax.swing.JComboBox<String> CajaDiaCierreInscripciones;
    private javax.swing.JComboBox<String> CajaDiaInicioInscripciones;
    private javax.swing.JComboBox<String> CajaDiaInicioTorneo;
    public static javax.swing.JComboBox<String> CajaGenero;
    private javax.swing.JComboBox<String> CajaLugar;
    private javax.swing.JComboBox<String> CajaMesCierreInscripciones;
    private javax.swing.JComboBox<String> CajaMesInicioInscripciones;
    private javax.swing.JComboBox<String> CajaMesInicioTorneo;
    public static javax.swing.JComboBox<String> CajaNumeroEquipos;
    private javax.swing.JComboBox<String> CajaTipoTorneo;
    private javax.swing.JTextField CajaValorInscripcion;
    public static javax.swing.JTextField CampoLimiteEdad;
    public static javax.swing.JTextField CampoNombreTorneo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
