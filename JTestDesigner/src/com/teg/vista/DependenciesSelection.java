/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * DependenciesSelection.java
 *
 * Created on Jan 18, 2011, 12:42:00 PM
 */
package com.teg.vista;

import com.teg.dominio.CasoPrueba;
import com.teg.logica.XmlManager;
import com.teg.vista.customlist.ClassMember;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 *
 * @author danielbello
 */
public class DependenciesSelection extends javax.swing.JInternalFrame {
    
    private ArrayList<Method> metodosSet = new ArrayList<Method>();
    private CasoPrueba casoPrueba = new CasoPrueba();
    private Inicio inicio;
    private java.util.List<ClassMember> metodosTodos;

    /** Creates new form DependenciesSelection */
    public DependenciesSelection() {
        initComponents();
    }

    DependenciesSelection(ArrayList<Method> metodosSet, CasoPrueba casoPrueba, Inicio inicio, java.util.List<ClassMember> metodosTodos) {

        this.metodosSet = metodosSet;
        this.inicio = inicio;
        this.metodosTodos = metodosTodos;
        initComponents();
        this.myInits();
        panelSeleccion.setListData(metodosSet.toArray());
        this.casoPrueba = casoPrueba;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelSeleccion = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        checkDependencias = new javax.swing.JCheckBox();
        atras = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel1.setText("Se han identificado dependencias en los siguientes metodos: ");

        panelSeleccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelSeleccionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(panelSeleccion);

        jLabel2.setText("Seleccione los metodos a los que desea aplicar dependencias");

        checkDependencias.setText("No deseo aplicar dependencias");
        checkDependencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkDependenciasActionPerformed(evt);
            }
        });

        atras.setText("Atras");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        siguiente.setText("Siguiente");
        siguiente.setEnabled(false);
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .add(77, 77, 77)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(checkDependencias)
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(jLabel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                        .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .add(69, 69, 69))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .add(atras)
                .add(303, 303, 303)
                .add(siguiente)
                .add(47, 47, 47))
        );

        jPanel1Layout.linkSize(new java.awt.Component[] {checkDependencias, jLabel1, jLabel2, jScrollPane1}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(38, 38, 38)
                .add(jLabel1)
                .add(26, 26, 26)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 222, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(checkDependencias)
                .add(26, 26, 26)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(atras)
                    .add(siguiente))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(new java.awt.Component[] {checkDependencias, jLabel1, jLabel2}, org.jdesktop.layout.GroupLayout.VERTICAL);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkDependenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkDependenciasActionPerformed

        if (checkDependencias.isSelected()) {
            panelSeleccion.setEnabled(false);
            siguiente.setEnabled(true);
            siguiente.setText("Ejecutar");
        } else {
            if (panelSeleccion.isSelectionEmpty()) {
                siguiente.setEnabled(false);
            } else {
                siguiente.setEnabled(true);
            }
            panelSeleccion.setEnabled(true);
            siguiente.setText("Siguiente");
        }

}//GEN-LAST:event_checkDependenciasActionPerformed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed

        if (checkDependencias.isSelected()) {
            // generacion de codigo
            XmlManager xmlManager = new XmlManager();
            xmlManager.setInicio(inicio);
            xmlManager.crearCasoPrueba(this.inicio.getNombreCasoPrueba(), casoPrueba.getEscenariosPrueba());

        } else {
            // inyeccion de dependencias
            Object[] lista = panelSeleccion.getSelectedValues();
            ArrayList<Method> metodosSetSeleccionados = getMetodosSeleccionados(lista);

            this.inicio.dependenciesSelectionToEditor(this, metodosSet, metodosSetSeleccionados, casoPrueba, metodosTodos);
        }

}//GEN-LAST:event_siguienteActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed

        this.inicio.dependenciesSelectionToCaseTest(this, metodosSet, casoPrueba.getEscenariosPrueba(), metodosTodos);

    }//GEN-LAST:event_atrasActionPerformed

    private void panelSeleccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSeleccionMouseClicked

        if ((panelSeleccion.isSelectionEmpty()) && (!checkDependencias.isSelected())) {
            siguiente.setEnabled(false);
        } else {
            siguiente.setEnabled(true);
        }

    }//GEN-LAST:event_panelSeleccionMouseClicked

    private ArrayList<Method> getMetodosSeleccionados(Object[] lista) {

        ArrayList<Method> methods = new ArrayList<Method>();

        for (Object object : lista) {

            String nombreMetodo = object.toString();

            for (Method method : metodosSet) {

                if (method.toString().equals(nombreMetodo)) {
                    methods.add(method);
                }
            }
        }

        return methods;
    }

    public final void myInits() {

        javax.swing.plaf.InternalFrameUI ifu = this.getUI();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) ifu).setNorthPane(null);

        int w2 = this.getSize().width;
        int h2 = this.getSize().height;
        this.inicio.setSize(new Dimension(w2, h2));

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        int w = this.inicio.getSize().width;
        int h = this.inicio.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;

        this.inicio.setLocation(x, y);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JCheckBox checkDependencias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList panelSeleccion;
    private javax.swing.JButton siguiente;
    // End of variables declaration//GEN-END:variables
}
