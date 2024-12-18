/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ar.edu.unlar.paradigmas.TrabajoFinal.gui.forms.Gestion;


import ar.edu.unlar.paradigmas.TrabajoFinal.gui.IFormularioControl;
import ar.edu.unlar.paradigmas.TrabajoFinal.TrabajoFinal;
import ar.edu.unlar.paradigmas.TrabajoFinal.gui.Principal;

/**
 *
 * @author WinUser
 */
public class GestionMotivo extends javax.swing.JInternalFrame implements IFormularioControl {

    private int filaseleccionada;

    /**
     * Creates new form GrillaMotivo
     */
    public GestionMotivo() {
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

        motivoController = new ar.edu.unlar.paradigmas.TrabajoFinal.controllers.MotivoController();
        grillaMotivo = new ar.edu.unlar.paradigmas.TrabajoFinal.gui.forms.Gestion.Grillas.GrillaMotivo(TrabajoFinal.motivos);
        motivo = new ar.edu.unlar.paradigmas.TrabajoFinal.Objects.Motivo();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablegrilla = new javax.swing.JTable();
        jButtonNuevo = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonCerrar = new javax.swing.JButton();

        jTablegrilla.setModel(grillaMotivo);
        jScrollPane1.setViewportView(jTablegrilla);

        jButtonNuevo.setText("Nuevo");
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });

        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonCerrar.setText("Cerrar");
        jButtonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButtonNuevo)
                .addGap(18, 18, 18)
                .addComponent(jButtonModificar)
                .addGap(18, 18, 18)
                .addComponent(jButtonEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCerrar)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNuevo)
                    .addComponent(jButtonModificar)
                    .addComponent(jButtonEliminar)
                    .addComponent(jButtonCerrar))
                .addGap(0, 61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed
        showAbm(1);
    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        filaseleccionada = jTablegrilla.getSelectedRow();
        motivo = TrabajoFinal.motivos.get(filaseleccionada);
        showAbm(2);
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        showAbm(3);
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButtonCerrarActionPerformed

    @Override
    public void showAbm(int accion) {
        // TODO add your handling code here:
        ABMMotivo abmMotivo = new ABMMotivo(accion, motivo, this);
        Principal.desktopPane.add(abmMotivo);
        abmMotivo.setVisible(true);
    }
    
    @Override
    public void refrescarGrilla(){
        grillaMotivo.fireTableDataChanged();
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ar.edu.unlar.paradigmas.TrabajoFinal.gui.forms.Gestion.Grillas.GrillaMotivo grillaMotivo;
    private javax.swing.JButton jButtonCerrar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablegrilla;
    private ar.edu.unlar.paradigmas.TrabajoFinal.Objects.Motivo motivo;
    private ar.edu.unlar.paradigmas.TrabajoFinal.controllers.MotivoController motivoController;
    // End of variables declaration//GEN-END:variables
}
