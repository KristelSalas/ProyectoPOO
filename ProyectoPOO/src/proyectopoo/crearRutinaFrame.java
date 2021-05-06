/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.DefaultListModel;


/**
 *
 * @author antho
 */
public class crearRutinaFrame extends javax.swing.JFrame {

DefaultListModel model = new DefaultListModel();

    /**
     * Creates new form crearRutinaFrame
     */
    public crearRutinaFrame() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
        
    }

    public void llenarCheckbox() {
    String[] superior = {"Bench Press","Aperturas con Máquina","Chest Press con Máquina","Chest Press con Mancuernas","Aperturas con Mancuernas","Push Up","Extensión de Codo","Press Francés con Mancuernas","Jalón Abierto","Remo con Mancuerna Individual"};
    String[] abdomen = {"Planck Frontal","Plack Swiss Ball","Planck Lateral","Abdominal McGuill","Birdog","Planck Swiss Ball Dinámico","Abdominal Normal","Elevación de Piernas","Planck Taps","Planck Hips"};
    String[] piernas = {"Sentadilla Copa Sumo","Sentadilla Libre","Extensión de Rodilla","Desplante con Máquina","Sentadilla con Máquina","Desplante con Mancuernas","Sentadilla con Mancuernas","Leg Press","Flexión de Rodilla","Peso Muerto"};
    
    String llenar = datoOculto.getText();
    
    
    if (llenar == "superior"){
        jCheckBox1.setText(superior[0]);
        jCheckBox2.setText(superior[1]);
        jCheckBox3.setText(superior[2]);
        jCheckBox4.setText(superior[3]);
        jCheckBox5.setText(superior[4]);
        jCheckBox6.setText(superior[5]);
        jCheckBox7.setText(superior[6]);
        jCheckBox8.setText(superior[7]);
        jCheckBox9.setText(superior[8]);
        jCheckBox10.setText(superior[9]);
    } else if (llenar == "abdomen"){
        jCheckBox1.setText(abdomen[0]);
        jCheckBox2.setText(abdomen[1]);
        jCheckBox3.setText(abdomen[2]);
        jCheckBox4.setText(abdomen[3]);
        jCheckBox5.setText(abdomen[4]);
        jCheckBox6.setText(abdomen[5]);
        jCheckBox7.setText(abdomen[6]);
        jCheckBox8.setText(abdomen[7]);
        jCheckBox9.setText(abdomen[8]);
        jCheckBox10.setText(abdomen[9]);
    }
    else {
        jCheckBox1.setText(piernas[0]);
        jCheckBox2.setText(piernas[1]);
        jCheckBox3.setText(piernas[2]);
        jCheckBox4.setText(piernas[3]);
        jCheckBox5.setText(piernas[4]);
        jCheckBox6.setText(piernas[5]);
        jCheckBox7.setText(piernas[6]);
        jCheckBox8.setText(piernas[7]);
        jCheckBox9.setText(piernas[8]);
        jCheckBox10.setText(piernas[9]);
    }
    
        
        
  
    
    
    }
    
    public void my_update(String str) {
        jTextField1.setText(str);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        datoOculto = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crear Rutina");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jLabel1.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel1.setText("Nombre de la Rutina:");

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 3));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jCheckBox1.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(51, 51, 51));
        jCheckBox1.setText("Ejercicio");
        jCheckBox1.setBorder(null);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(51, 51, 51));
        jCheckBox2.setText("Ejercicio");
        jCheckBox2.setBorder(null);
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(51, 51, 51));
        jCheckBox3.setText("Ejercicio");
        jCheckBox3.setBorder(null);
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jCheckBox4.setForeground(new java.awt.Color(51, 51, 51));
        jCheckBox4.setText("Ejercicio");
        jCheckBox4.setBorder(null);
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jCheckBox5.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jCheckBox5.setForeground(new java.awt.Color(51, 51, 51));
        jCheckBox5.setText("Ejercicio");
        jCheckBox5.setBorder(null);
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jCheckBox6.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jCheckBox6.setForeground(new java.awt.Color(51, 51, 51));
        jCheckBox6.setText("Ejercicio");
        jCheckBox6.setBorder(null);
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        jCheckBox7.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jCheckBox7.setForeground(new java.awt.Color(51, 51, 51));
        jCheckBox7.setText("Ejercicio");
        jCheckBox7.setBorder(null);
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });

        jCheckBox8.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jCheckBox8.setForeground(new java.awt.Color(51, 51, 51));
        jCheckBox8.setText("Ejercicio");
        jCheckBox8.setBorder(null);
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });

        jCheckBox9.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jCheckBox9.setForeground(new java.awt.Color(51, 51, 51));
        jCheckBox9.setText("Ejercicio");
        jCheckBox9.setBorder(null);
        jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox9ActionPerformed(evt);
            }
        });

        jCheckBox10.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jCheckBox10.setForeground(new java.awt.Color(51, 51, 51));
        jCheckBox10.setText("Ejercicio");
        jCheckBox10.setBorder(null);
        jCheckBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox10ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jList1);

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

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 51));
        jButton2.setText("Iniciar Rutina");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 3));
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(datoOculto)
                        .addGap(168, 168, 168))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox10)
                                    .addComponent(jCheckBox9)
                                    .addComponent(jCheckBox8)
                                    .addComponent(jCheckBox5)
                                    .addComponent(jCheckBox7)
                                    .addComponent(jCheckBox6)
                                    .addComponent(jCheckBox4)
                                    .addComponent(jCheckBox3)
                                    .addComponent(jCheckBox2)
                                    .addComponent(jCheckBox1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox4)
                        .addGap(7, 7, 7)
                        .addComponent(jCheckBox5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox10))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(datoOculto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox1.isSelected()){
        
        String name = jCheckBox1.getText();
        model.addElement(name);
        
        jList1.setModel(model);
            
        }
        else{
        String name = jCheckBox1.getText();
        model.removeElement(name);
        
        jList1.setModel(model);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if (jCheckBox2.isSelected()){
        
        String name = jCheckBox2.getText();
        
        model.addElement(name);
        
        jList1.setModel(model);
            
        }
        else{
        String name = jCheckBox2.getText();
        model.removeElement(name);
        
        jList1.setModel(model);
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        if (jCheckBox3.isSelected()){
        
        String name = jCheckBox3.getText();
        
        model.addElement(name);
        
        jList1.setModel(model);
            
        }
        else{
        String name = jCheckBox3.getText();
        model.removeElement(name);
        
        jList1.setModel(model);
        }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        if (jCheckBox4.isSelected()){
        
        String name = jCheckBox4.getText();
        
        model.addElement(name);
        
        jList1.setModel(model);
            
        }
        else{
        String name = jCheckBox4.getText();
        model.removeElement(name);
        
        jList1.setModel(model);
        }
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        if (jCheckBox5.isSelected()){
        
        String name = jCheckBox5.getText();
        
        model.addElement(name);
        
        jList1.setModel(model);
            
        }
        else{
        String name = jCheckBox5.getText();
        model.removeElement(name);
        
        jList1.setModel(model);
        }
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        if (jCheckBox6.isSelected()){
        
        String name = jCheckBox6.getText();
        
        model.addElement(name);
        
        jList1.setModel(model);
            
        }
        else{
        String name = jCheckBox6.getText();
        model.removeElement(name);
        
        jList1.setModel(model);
        }
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        if (jCheckBox7.isSelected()){
        
        String name = jCheckBox7.getText();
        
        model.addElement(name);
        
        jList1.setModel(model);
            
        }
        else{
        String name = jCheckBox7.getText();
        model.removeElement(name);
        
        jList1.setModel(model);
        }
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        if (jCheckBox8.isSelected()){
        
        String name = jCheckBox8.getText();
        
        model.addElement(name);
        
        jList1.setModel(model);
            
        }
        else{
        String name = jCheckBox8.getText();
        model.removeElement(name);
        
        jList1.setModel(model);
        }
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox9ActionPerformed
        if (jCheckBox9.isSelected()){
        
        String name = jCheckBox9.getText();
        
        model.addElement(name);
        
        jList1.setModel(model);
            
        }
        else{
        String name = jCheckBox9.getText();
        model.removeElement(name);
        
        jList1.setModel(model);
        }
    }//GEN-LAST:event_jCheckBox9ActionPerformed

    private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox10ActionPerformed
        if (jCheckBox10.isSelected()){
        
        String name = jCheckBox10.getText();
        
        model.addElement(name);
        
        jList1.setModel(model);
            
        }
        else{
        String name = jCheckBox10.getText();
        model.removeElement(name);
        
        jList1.setModel(model);
        }
    }//GEN-LAST:event_jCheckBox10ActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        llenarCheckbox();
    }//GEN-LAST:event_formWindowGainedFocus

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tipoRutinaFrame frame = new tipoRutinaFrame();
        frame.show();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.out.println(model);
    }//GEN-LAST:event_jButton2ActionPerformed

   
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public  void main(String args[]) {
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
            java.util.logging.Logger.getLogger(crearRutinaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crearRutinaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crearRutinaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crearRutinaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crearRutinaFrame().setVisible(true);
                
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel datoOculto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public javax.swing.JCheckBox jCheckBox1;
    public javax.swing.JCheckBox jCheckBox10;
    public javax.swing.JCheckBox jCheckBox2;
    public javax.swing.JCheckBox jCheckBox3;
    public javax.swing.JCheckBox jCheckBox4;
    public javax.swing.JCheckBox jCheckBox5;
    public javax.swing.JCheckBox jCheckBox6;
    public javax.swing.JCheckBox jCheckBox7;
    public javax.swing.JCheckBox jCheckBox8;
    public javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables


}
