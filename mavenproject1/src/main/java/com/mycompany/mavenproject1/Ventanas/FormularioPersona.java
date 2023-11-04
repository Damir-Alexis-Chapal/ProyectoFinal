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
 * @author sano2
 */
public class FormularioPersona extends javax.swing.JFrame {

    /**
     * Creates new form FormularioPersona
     */
    public FormularioPersona() {
        initComponents();
        this.Team = null;
    }
    private final Equipo Team;

    public FormularioPersona(Equipo Team) {
        this.Team = Team;
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CampoNombre = new javax.swing.JTextField();
        CampoCedula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CampoTelefono = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CampoCorreo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CajaGenero = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BotonTecnico = new javax.swing.JRadioButton();
        BotonJugador = new javax.swing.JRadioButton();
        BotonLider = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        CajaDiaNacimiento = new javax.swing.JComboBox<>();
        CajaMesNacimiento = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        CajaAñoNacimiento = new javax.swing.JComboBox<>();
        BotonContinuar = new javax.swing.JButton();
        BotonAtras = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        CajaNumeroPersonas = new javax.swing.JTextField();
        CajaPersonasRegistradas = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        NombreEquipoNuevo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CampoEdad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NOMBRE");

        jLabel2.setText("CEDULA");

        jLabel3.setText("TELÉFONO");

        jLabel4.setText("CORREO");

        CajaGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FEMENINO", "MASCULINO", "MIXTO", " ", " " }));

        jLabel5.setText("GÉNERO");

        jLabel6.setText("ELIJA EL TIPO DE PARTICIPANTE");

        buttonGroup1.add(BotonTecnico);
        BotonTecnico.setText("TÉCNICO");

        buttonGroup1.add(BotonJugador);
        BotonJugador.setText("JUGADOR");

        buttonGroup1.add(BotonLider);
        BotonLider.setText("LIDER JUGADOR");

        jLabel10.setText("FECHA DE NACIMIENTO");

        jLabel11.setText("DIA");

        CajaDiaNacimiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        CajaMesNacimiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        jLabel12.setText("MES");

        jLabel13.setText("AÑO");

        CajaAñoNacimiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033" }));

        BotonContinuar.setText("CONTINUAR");
        BotonContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonContinuarActionPerformed(evt);
            }
        });

        BotonAtras.setText("ATRAS");
        BotonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtrasActionPerformed(evt);
            }
        });

        jLabel7.setText("# MIEMBROS");

        CajaNumeroPersonas.setEditable(false);
        CajaNumeroPersonas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CajaNumeroPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaNumeroPersonasActionPerformed(evt);
            }
        });

        CajaPersonasRegistradas.setEditable(false);
        CajaPersonasRegistradas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CajaPersonasRegistradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaPersonasRegistradasActionPerformed(evt);
            }
        });

        jLabel8.setText("# REGISTRADOS");

        NombreEquipoNuevo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel9.setText("EDAD");

        CampoEdad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CampoEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoEdadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CampoEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CampoCorreo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoTelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(CajaDiaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(CajaMesNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(CajaAñoNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CampoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(BotonTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(BotonJugador)
                                .addGap(18, 18, 18)
                                .addComponent(BotonLider))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(CajaGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(96, 96, 96))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(332, 332, 332)
                .addComponent(jLabel11)
                .addGap(106, 106, 106)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(87, 87, 87))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(NombreEquipoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(BotonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CajaNumeroPersonas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CajaPersonasRegistradas))
                .addGap(117, 117, 117))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NombreEquipoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CajaGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(14, 14, 14)
                        .addComponent(CampoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonTecnico)
                            .addComponent(BotonJugador)
                            .addComponent(BotonLider))
                        .addGap(27, 27, 27)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(9, 9, 9)
                        .addComponent(CampoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(jLabel13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CajaDiaNacimiento)
                    .addComponent(CajaMesNacimiento)
                    .addComponent(CajaAñoNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CajaPersonasRegistradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CajaNumeroPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotonContinuar, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(BotonAtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtrasActionPerformed
        this.dispose();
    }//GEN-LAST:event_BotonAtrasActionPerformed

    private void CajaNumeroPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaNumeroPersonasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CajaNumeroPersonasActionPerformed

    private void CajaPersonasRegistradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaPersonasRegistradasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CajaPersonasRegistradasActionPerformed

    private void CampoEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoEdadActionPerformed

    private void BotonContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonContinuarActionPerformed
//      
        //verifico que los campos de texto no estén vacios 
        if (CampoNombre.getText().isEmpty() || CampoEdad.getText().isEmpty() || CampoCedula.getText().isEmpty()
                || CampoTelefono.getText().isEmpty() || CampoCorreo.getText().isEmpty() || buttonGroup1.getSelection() == null) {

            JOptionPane.showMessageDialog(null, "Por favor llene todos los campos y seleccione las opciones");
        } else {

            int cantErrores = 0;

            int cantPersonasRegistradas = Integer.parseInt(CajaPersonasRegistradas.getText());;
            //el equipo se crea desde aqui
            Team.setNombre(NombreEquipoNuevo.getText());
            //creo un arraylist donde se ingresaran los participantes
            ArrayList<Persona> ListadoParticipantes = new ArrayList();

            //creo la persona y seteo sus atributos
            Persona NuevoParticipante = new Persona();
            NuevoParticipante.setNombre((String) CampoNombre.getText());
            NuevoParticipante.setCedula((String) CampoCedula.getText());

            if (FormularioTorneo.generoTorneo.equals((String) CajaGenero.getSelectedItem())) {
                NuevoParticipante.setGenero((String) CajaGenero.getSelectedItem());

            } else {
                cantErrores++;
            }

            NuevoParticipante.setTelefono((String) CampoTelefono.getText());
            NuevoParticipante.setCorreo((String) CampoCorreo.getText());

            if (FormularioTorneo.LimiteEdad >= Integer.parseInt(CampoEdad.getText())) {

                NuevoParticipante.setEdad(Integer.parseInt(CampoEdad.getText()));

            } else {
                cantErrores++;
            }

            //atributo fecha, en el formulario torneo explico su funcionamiento
            Fecha FechaNacimientoPersona = new Fecha();
            FechaNacimientoPersona.setDia(Integer.parseInt((String) CajaDiaNacimiento.getSelectedItem()));
            FechaNacimientoPersona.setAño(Integer.parseInt((String) CajaAñoNacimiento.getSelectedItem()));
            FechaNacimientoPersona.setMes(FechaNacimientoPersona.transformar_StringMes((String) CajaMesNacimiento.getSelectedItem()));

            //creo if´s anidados para verificar si la persona a ingresar es tecnico, jugador o lider
            NuevoParticipante.setFecha_nacimiento(FechaNacimientoPersona);
            if (cantErrores == 0) {
                if (BotonTecnico.isSelected()) {
                    FormularioEquipo.CampoTecnico.setText((String) CampoNombre.getText());
                    NuevoParticipante.setTipo("TECNICO");
                    Team.setTecnico(NuevoParticipante);
                    JOptionPane.showMessageDialog(null, "Registro exitoso del Tecnico");
                } else if (BotonLider.isSelected()) {
                    FormularioEquipo.CampoLider.setText((String) CampoNombre.getText());
                    NuevoParticipante.setTipo("LIDER_JUGADOR");
                    Team.setLider(NuevoParticipante);
                    JOptionPane.showMessageDialog(null, "Registro exitoso del Lider");
                } else if (BotonJugador.isSelected()) {
                    NuevoParticipante.setTipo("JUGADOR");
                    ListadoParticipantes.add(NuevoParticipante);
                    JOptionPane.showMessageDialog(null, "Registro exitoso del Jugador");
                }
                FormularioEquipo.MiembrosRegistrados++;
                Team.setListado_participantes(ListadoParticipantes);
                //ya que finalizó el proceso devuelvo al usuario al principio del programa
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Por favor ingrese los datos correctamente");
                cantErrores = 0;
            }

        }
    }//GEN-LAST:event_BotonContinuarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAtras;
    private javax.swing.JButton BotonContinuar;
    private javax.swing.JRadioButton BotonJugador;
    private javax.swing.JRadioButton BotonLider;
    private javax.swing.JRadioButton BotonTecnico;
    private javax.swing.JComboBox<String> CajaAñoNacimiento;
    private javax.swing.JComboBox<String> CajaDiaNacimiento;
    private javax.swing.JComboBox<String> CajaGenero;
    private javax.swing.JComboBox<String> CajaMesNacimiento;
    public static javax.swing.JTextField CajaNumeroPersonas;
    public static javax.swing.JTextField CajaPersonasRegistradas;
    private javax.swing.JTextField CampoCedula;
    private javax.swing.JTextField CampoCorreo;
    public static javax.swing.JTextField CampoEdad;
    private javax.swing.JTextField CampoNombre;
    private javax.swing.JTextField CampoTelefono;
    public static javax.swing.JLabel NombreEquipoNuevo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
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
