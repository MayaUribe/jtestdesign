/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AyudaArgumentos.java
 *
 * Created on Feb 18, 2011, 8:22:08 PM
 */

package com.teg.vista.ayuda;

import java.awt.Frame;

/**
 *
 * @author maya
 */
public class AyudaVariables extends javax.swing.JDialog {

    /** Creates new form AyudaArgumentos */
    public AyudaVariables(Frame frame, Boolean modal) {
        super(frame, modal);
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloArgumentos = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        ejemploArgumentos = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        numero1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        numero2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        numero3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tituloArgumentos.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        tituloArgumentos.setText(org.openide.util.NbBundle.getMessage(AyudaVariables.class, "AyudaVariables.tituloArgumentos.text")); // NOI18N

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        ejemploArgumentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/teg/recursos/imagenes/ayudaVariables.png"))); // NOI18N
        ejemploArgumentos.setText(org.openide.util.NbBundle.getMessage(AyudaVariables.class, "AyudaVariables.ejemploArgumentos.text")); // NOI18N
        ejemploArgumentos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        numero1.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        numero1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/teg/recursos/imagenes/uno.png"))); // NOI18N
        numero1.setText(org.openide.util.NbBundle.getMessage(AyudaVariables.class, "AyudaVariables.numero1.text")); // NOI18N

        jLabel1.setText(org.openide.util.NbBundle.getMessage(AyudaVariables.class, "AyudaVariables.jLabel1.text")); // NOI18N

        jLabel2.setText(org.openide.util.NbBundle.getMessage(AyudaVariables.class, "AyudaVariables.jLabel2.text")); // NOI18N

        numero2.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        numero2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/teg/recursos/imagenes/dos.png"))); // NOI18N
        numero2.setText(org.openide.util.NbBundle.getMessage(AyudaVariables.class, "AyudaVariables.numero2.text")); // NOI18N

        jLabel3.setText(org.openide.util.NbBundle.getMessage(AyudaVariables.class, "AyudaVariables.jLabel3.text")); // NOI18N

        jLabel4.setText(org.openide.util.NbBundle.getMessage(AyudaVariables.class, "AyudaVariables.jLabel4.text")); // NOI18N

        numero3.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        numero3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/teg/recursos/imagenes/tres.png"))); // NOI18N
        numero3.setText(org.openide.util.NbBundle.getMessage(AyudaVariables.class, "AyudaVariables.numero3.text")); // NOI18N

        jLabel5.setText(org.openide.util.NbBundle.getMessage(AyudaVariables.class, "AyudaVariables.jLabel5.text")); // NOI18N

        jLabel6.setText(org.openide.util.NbBundle.getMessage(AyudaVariables.class, "AyudaVariables.jLabel6.text")); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(numero1)
                        .add(18, 18, 18)
                        .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel1)
                            .add(jLabel2)))
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(numero2)
                        .add(18, 18, 18)
                        .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel3)
                            .add(jLabel4)))
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(numero3)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jLabel5))
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(52, 52, 52)
                        .add(jLabel6)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .add(29, 29, 29)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(numero1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(jLabel1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel2)))
                .add(18, 18, 18)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(numero2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(jLabel3)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel4)))
                .add(18, 18, 18)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(numero3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(jLabel5)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel6)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        jLabel7.setText(org.openide.util.NbBundle.getMessage(AyudaVariables.class, "AyudaVariables.jLabel7.text")); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(96, 96, 96)
                        .add(ejemploArgumentos))
                    .add(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel7))))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(ejemploArgumentos)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 49, Short.MAX_VALUE)
                .add(jLabel7)
                .add(18, 18, 18)
                .add(jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton2.setText(org.openide.util.NbBundle.getMessage(AyudaVariables.class, "AyudaVariables.jButton2.text")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(tituloArgumentos)
                .addContainerGap(437, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jButton2)
                    .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(tituloArgumentos)
                .add(18, 18, 18)
                .add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jButton2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
}//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ejemploArgumentos;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel numero1;
    private javax.swing.JLabel numero2;
    private javax.swing.JLabel numero3;
    private javax.swing.JLabel tituloArgumentos;
    // End of variables declaration//GEN-END:variables

}