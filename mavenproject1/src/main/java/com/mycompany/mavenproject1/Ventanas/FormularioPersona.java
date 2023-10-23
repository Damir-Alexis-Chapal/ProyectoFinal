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
        BotonFinalizar = new javax.swing.JButton();
        BotonAtras = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        CajaNumeroPersonas = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        CampoEdad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        NombreEquipoNuevo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("INGRESE NOMBRE COMPLETO DEL PARTICIPANTE");

        jLabel2.setText("INGRESE LA CÉDULA DEL PARTICIPANTE");

        CampoTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoTelefonoActionPerformed(evt);
            }
        });

        jLabel3.setText("INGRESE NÚMERO DE TELÉFONO DEL PARTICIPANTE");

        jLabel4.setText("INGRESE CORREO ELECTRÓNICO DEL PARTICIPANTE");

        CajaGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));

        jLabel5.setText("GÉNERO DEL PARTICIPANTE");

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

        BotonFinalizar.setText("CONTINUAR");
        BotonFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFinalizarActionPerformed(evt);
            }
        });

        BotonAtras.setText("ATRAS");

        jLabel7.setText("CANTIDAD PERSONAS ");

        CajaNumeroPersonas.setEditable(false);
        CajaNumeroPersonas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CajaNumeroPersonas.setText("0");

        jLabel8.setText("EDAD");

        CampoEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoEdadActionPerformed(evt);
            }
        });

        jLabel9.setText("EQUIPO");

        NombreEquipoNuevo.setEditable(false);
        NombreEquipoNuevo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NombreEquipoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreEquipoNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CampoNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(CampoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(NombreEquipoNuevo)))))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(97, 97, 97)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(CajaGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CampoEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(BotonTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BotonJugador)
                                    .addGap(18, 18, 18)
                                    .addComponent(BotonLider))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CampoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(CampoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(CajaDiaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(98, 98, 98)
                                .addComponent(jLabel13))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CajaMesNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CajaAñoNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(47, 47, 47))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(BotonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CajaNumeroPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CajaGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(NombreEquipoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonTecnico)
                            .addComponent(BotonJugador)
                            .addComponent(BotonLider))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CajaAñoNacimiento)
                            .addComponent(CajaDiaNacimiento)
                            .addComponent(CajaMesNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CampoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAtras, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(BotonFinalizar, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addComponent(CajaNumeroPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFinalizarActionPerformed

        //creo los contadores para usarlos en el ciclo while
        int cantPersonas = Integer.parseInt(CajaNumeroPersonas.getText());
        int cantPersonasRegistradas = 0;
        //desde aqui creo el nuevo equipo
        Equipo EquipoNuevo = new Equipo();
        EquipoNuevo.setNombre(NombreEquipoNuevo.getText());
        //creo un arraylist donde se ingresaran los participantes
        ArrayList<Persona> ListadoParticipantes = new ArrayList();

        //creo el bucle para que la ventana continue registrando una persona
        //mientras no se hayan registrado las que el usuario dio al principio
        while (cantPersonasRegistradas < cantPersonas) {
            //creo la persona y seteo sus atributos
            Persona NuevoParticipante = new Persona();
            NuevoParticipante.setNombre((String) CampoNombre.getText());
            NuevoParticipante.setCedula((String) CampoCedula.getText());
            NuevoParticipante.setGenero((String) CajaGenero.getSelectedItem());
            NuevoParticipante.setTelefono((String) CampoTelefono.getText());
            NuevoParticipante.setCorreo((String) CampoCorreo.getText());
            NuevoParticipante.setEdad(Integer.parseInt(CampoEdad.getText()));

            //atributo fecha, en el formulario torneo explico su funcionamiento
            Fecha FechaNacimientoPersona = new Fecha();
            FechaNacimientoPersona.setDia(Integer.parseInt((String) CajaDiaNacimiento.getSelectedItem()));
            FechaNacimientoPersona.setAño(Integer.parseInt((String) CajaAñoNacimiento.getSelectedItem()));
            FechaNacimientoPersona.setMes((CajaMesNacimiento.getSelectedIndex() + 1));

            //creo if´s anidados para verificar si la persona a ingresar es tecnico, jugador o lider
            NuevoParticipante.setFecha_nacimiento(FechaNacimientoPersona);
            if (BotonTecnico.isSelected()) {
                EquipoNuevo.setTecnico(NuevoParticipante);
                cantPersonasRegistradas++;
                JOptionPane.showMessageDialog(null, "Registro exitoso del Tecnico");
                CampoNombre.setText("");
                CampoCedula.setText("");
                CampoTelefono.setText("");
                CampoCorreo.setText("");
                CampoEdad.setText("");
            } else if (BotonLider.isSelected()) {
                EquipoNuevo.setLider(NuevoParticipante);
                cantPersonasRegistradas++;
                JOptionPane.showMessageDialog(null, "Registro exitoso del Lider");
                CampoNombre.setText("");
                CampoCedula.setText("");
                CampoTelefono.setText("");
                CampoCorreo.setText("");
                CampoEdad.setText("");
            } else if (BotonJugador.isSelected()) {
                ListadoParticipantes.add(NuevoParticipante);
                cantPersonasRegistradas++;
                JOptionPane.showMessageDialog(null, "Registro exitoso delJugador");
                CampoNombre.setText("");
                CampoCedula.setText("");
                CampoTelefono.setText("");
                CampoCorreo.setText("");
                CampoEdad.setText("");
            }

        }
        //seteo el listado de participantes al nuevo equipo y el nuevo equipo a la base de datos
        EquipoNuevo.setListado_participantes(ListadoParticipantes);
        BaseDeDatos.ListaDeEquipos.add(EquipoNuevo);
        JOptionPane.showMessageDialog(null, "Registro exitoso de todos los participantes,\n se ha completado la inscripción de su equipo");
        //ya que finalizó el proceso devuelvo al usuario al principio del programa
        this.dispose();
        InterfazPrincipal NuevoInicio = new InterfazPrincipal();
        NuevoInicio.setVisible(true);

    }//GEN-LAST:event_BotonFinalizarActionPerformed

    private void CampoEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoEdadActionPerformed

    private void CampoTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoTelefonoActionPerformed

    private void NombreEquipoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreEquipoNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreEquipoNuevoActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAtras;
    private javax.swing.JButton BotonFinalizar;
    private javax.swing.JRadioButton BotonJugador;
    private javax.swing.JRadioButton BotonLider;
    private javax.swing.JRadioButton BotonTecnico;
    private javax.swing.JComboBox<String> CajaAñoNacimiento;
    private javax.swing.JComboBox<String> CajaDiaNacimiento;
    private javax.swing.JComboBox<String> CajaGenero;
    private javax.swing.JComboBox<String> CajaMesNacimiento;
    public static javax.swing.JTextField CajaNumeroPersonas;
    private javax.swing.JTextField CampoCedula;
    private javax.swing.JTextField CampoCorreo;
    private javax.swing.JTextField CampoEdad;
    private javax.swing.JTextField CampoNombre;
    private javax.swing.JTextField CampoTelefono;
    public static javax.swing.JTextField NombreEquipoNuevo;
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
