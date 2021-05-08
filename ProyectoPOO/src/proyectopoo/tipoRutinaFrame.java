/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author antho
 */
public class tipoRutinaFrame extends javax.swing.JFrame {

    public tipoRutinaFrame() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cRutinaSupB = new javax.swing.JButton();
        cRutinaAbB = new javax.swing.JButton();
        cRutinaPieB = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        correoOcultoTP = new javax.swing.JLabel();
        contraOcultaTP = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tipo de Rutina");

        cRutinaSupB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectopoo/superior.png"))); // NOI18N
        cRutinaSupB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cRutinaSupBActionPerformed(evt);
            }
        });

        cRutinaAbB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectopoo/abdomen.png"))); // NOI18N
        cRutinaAbB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cRutinaAbBActionPerformed(evt);
            }
        });

        cRutinaPieB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectopoo/piernas.png"))); // NOI18N
        cRutinaPieB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cRutinaPieBActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Volver");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 3));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tipo de Rutina");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cRutinaSupB, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(cRutinaAbB, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(cRutinaPieB, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(83, 83, 83))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(488, 488, 488)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(correoOcultoTP)
                            .addGap(156, 156, 156))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(156, 156, 156)
                            .addComponent(contraOcultaTP)))
                    .addContainerGap(489, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cRutinaPieB, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cRutinaSupB, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cRutinaAbB, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(318, 318, 318)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(correoOcultoTP)
                        .addComponent(contraOcultaTP))
                    .addContainerGap(318, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mainFrame frame = new mainFrame();
        frame.show();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    private void cRutinaSupBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cRutinaSupBActionPerformed

        crearRutinaFrame frame = new crearRutinaFrame();
        frame.contraOculta.setText(contraOcultaTP.getText());
        frame.correoOculto.setText(correoOcultoTP.getText());
        frame.contraOculta.setVisible(false);
        frame.correoOculto.setVisible(false);
        frame.show();
        frame.datoOculto.setText("superior");
        frame.datoOculto.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_cRutinaSupBActionPerformed

    private void cRutinaAbBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cRutinaAbBActionPerformed
        crearRutinaFrame frame = new crearRutinaFrame();
        frame.contraOculta.setText(contraOcultaTP.getText());
        frame.correoOculto.setText(correoOcultoTP.getText());
        frame.contraOculta.setVisible(false);
        frame.correoOculto.setVisible(false);
        frame.show();
        frame.datoOculto.setText("abdomen");
        frame.datoOculto.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_cRutinaAbBActionPerformed

    private void cRutinaPieBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cRutinaPieBActionPerformed
        crearRutinaFrame frame = new crearRutinaFrame();
        frame.contraOculta.setText(contraOcultaTP.getText());
        frame.correoOculto.setText(correoOcultoTP.getText());
        frame.contraOculta.setVisible(false);
        frame.correoOculto.setVisible(false);
        frame.show();
        frame.datoOculto.setText("piernas");
        frame.datoOculto.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_cRutinaPieBActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tipoRutinaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tipoRutinaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tipoRutinaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tipoRutinaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tipoRutinaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cRutinaAbB;
    private javax.swing.JButton cRutinaPieB;
    private javax.swing.JButton cRutinaSupB;
    public javax.swing.JLabel contraOcultaTP;
    public javax.swing.JLabel correoOcultoTP;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
