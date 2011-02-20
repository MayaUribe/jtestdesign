package com.teg.vista;

import com.teg.dominio.CasoPrueba;
import com.teg.dominio.EscenarioPrueba;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.beans.PropertyVetoException;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JInternalFrame;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author maya
 */
public class Inicio extends javax.swing.JFrame {

    private ArrayList<String> nombresJar = new ArrayList<String>();
    private ArrayList<File> jarsRuta = new ArrayList<File>();
    private MenuPrincipal menuPrincipal;
    private ClassManager classManager;
    private UpdateCasoPrueba updateCasoPrueba;
    private ArrayList<File> archivosJavaDoc = new ArrayList<File>();
    private String nombreCasoPrueba;
    private File directorioCasoPrueba;

    /** Creates new form Inicio */
    public Inicio() {
        try {
            initComponents();
            menuPrincipal = new MenuPrincipal(this);
            this.menuPrincipal.setVisible(Boolean.TRUE);
            this.jDesktopPane.add(this.menuPrincipal);
            this.menuPrincipal.setMaximum(true);

            // Get the size of the screen
            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

            // Determine the new location of the window
            int w = this.getSize().width;
            int h = this.getSize().height;
            int x = (dim.width - w) / 2;
            int y = (dim.height - h) / 2;

            // Move the window
            this.setLocation(x, y);

        } catch (PropertyVetoException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane = new javax.swing.JDesktopPane();
        tapa = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        seleccionarJar = new javax.swing.JMenuItem();
        anadirJarAlClasspath = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        jDesktopPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jDesktopPane.setNextFocusableComponent(jMenuBar1);
        jDesktopPane.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout tapaLayout = new javax.swing.GroupLayout(tapa);
        tapa.setLayout(tapaLayout);
        tapaLayout.setHorizontalGroup(
            tapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );
        tapaLayout.setVerticalGroup(
            tapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        tapa.setBounds(40, 440, 850, 50);
        jDesktopPane.add(tapa, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenu1.setText("Archivo");

        seleccionarJar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/teg/recursos/imagenes/open.png"))); // NOI18N
        seleccionarJar.setText("Abrir");
        seleccionarJar.setEnabled(false);
        seleccionarJar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarJarActionPerformed(evt);
            }
        });
        jMenu1.add(seleccionarJar);

        anadirJarAlClasspath.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/teg/recursos/imagenes/add.png"))); // NOI18N
        anadirJarAlClasspath.setText("Añadir JAR al Classpath");
        anadirJarAlClasspath.setEnabled(false);
        anadirJarAlClasspath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anadirJarAlClasspathActionPerformed(evt);
            }
        });
        jMenu1.add(anadirJarAlClasspath);
        jMenu1.add(jSeparator1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/teg/recursos/imagenes/quit.png"))); // NOI18N
        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 951, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seleccionarJarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarJarActionPerformed

        JFileChooser fc = new JFileChooser();
        fc.addChoosableFileFilter(new Extension());
        int returnVal = fc.showOpenDialog(Inicio.this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {

            File jarFile = fc.getSelectedFile();
            String jarString = jarFile.getPath();
            File jar = new File(jarString);
            this.copyToLib(jar);
            this.jarsRuta.add(jar);
            this.setJarsRuta(jarsRuta);
            this.nombresJar.add(jar.getName());
            this.classManager.getJarLista().setListData(nombresJar.toArray());
        }

    }//GEN-LAST:event_seleccionarJarActionPerformed

    private void anadirJarAlClasspathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anadirJarAlClasspathActionPerformed

        JFileChooser fc = new JFileChooser();
        fc.addChoosableFileFilter(new Extension());
        int returnVal = fc.showOpenDialog(Inicio.this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {

            File jarFile = fc.getSelectedFile();
            String jarString = jarFile.getPath();
            File jar = new File(jarString);
            this.copyToLib(jar);
            this.jarsRuta.add(jar);
            this.setJarsRuta(jarsRuta);
            //this.nombresJar.add(jar.getName());
            //this.classManager.getJarLista().setListData(nombresJar.toArray());
        }

    }//GEN-LAST:event_anadirJarAlClasspathActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        this.setVisible(false);
        this.dispose();
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    public File getJava(String nombreCasoPrueba){
        File javaTest = null;

        File miCasoPrueba = new File(System.getProperty("user.home")
                + System.getProperty("file.separator") + nombreCasoPrueba
                + System.getProperty("file.separator"));

        File src = new File(miCasoPrueba.getPath()
                + System.getProperty("file.separator") + "src"
                + System.getProperty("file.separator"));

        File com = new File(src.getPath()
                + System.getProperty("file.separator") + "com"
                + System.getProperty("file.separator"));

        File paquete = new File(com.getPath()
                + System.getProperty("file.separator") + "codeGeneratorTest"
                + System.getProperty("file.separator"));

        File java = new File(paquete.getPath()
                + System.getProperty("file.separator") + nombreCasoPrueba
                + ".java");
        
        javaTest = new File(java.getPath());

        return javaTest;
    }

    public void copyToLib(File jar) {

        File miCasoPrueba = new File(System.getProperty("user.home")
                + System.getProperty("file.separator") + nombreCasoPrueba
                + System.getProperty("file.separator"));

        File lib = new File(miCasoPrueba.getPath()
                + System.getProperty("file.separator") + "lib"
                + System.getProperty("file.separator"));

        String srcFile = jar.getPath();
        String dstFile = lib.getPath() + System.getProperty("file.separator") + jar.getName();
        
        try {
            FileUtils.copyFile(new File(srcFile), new File(dstFile));
        } catch (IOException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ArrayList<File> leerDirectorio(final String nombreDirectorio, ArrayList<File> archivos) {

        final File directorio = new File(nombreDirectorio);

        if (directorio.exists() && directorio.isDirectory()) {

            final File[] nombreFicherosFile = directorio.listFiles();

            for (File file : nombreFicherosFile) {
                if (!file.getName().equals("class-use")) {
                    if (file.isDirectory()) {
                        archivos = leerDirectorio(file.getPath(), archivos);
                    } else {
                        archivos.add(file);
                    }
                }
            }
        } else {
            System.out.println("Error: " + nombreDirectorio + " no existe o no corresponde a un directorio");
        }
        return archivos;
    }

    public void principalToClassManager(JInternalFrame menuPrincipal, ArrayList<File> archivosJavaDoc, String nombreCasoPrueba) {
        try {
            menuPrincipal.setVisible(false);
            this.setArchivosJavaDoc(archivosJavaDoc);
            this.setNombreCasoPrueba(nombreCasoPrueba);
            ClassManager clazzManager = new ClassManager(this, jarsRuta, nombresJar);
            clazzManager.setVisible(Boolean.TRUE);
            this.getjDesktopPane().add(clazzManager);
            clazzManager.setMaximum(Boolean.TRUE);
            this.classManager = clazzManager;

        } catch (PropertyVetoException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void principalToUpdate(JInternalFrame menuPrincipal, String nombreCasoPrueba) {
        try {
            menuPrincipal.setVisible(false);
            this.setNombreCasoPrueba(nombreCasoPrueba);
            updateCasoPrueba = new UpdateCasoPrueba(this, nombreCasoPrueba);
            updateCasoPrueba.setVisible(Boolean.TRUE);
            this.getjDesktopPane().add(updateCasoPrueba);
            updateCasoPrueba.setMaximum(Boolean.TRUE);

        } catch (PropertyVetoException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void classToMethods(JInternalFrame classManager, ArrayList<Class> clases) {
        try {
            classManager.setVisible(false);

            MethodsManager methodsManager = new MethodsManager(this, clases);
            methodsManager.setVisible(Boolean.TRUE);
            this.getjDesktopPane().add(methodsManager);
            methodsManager.setMaximum(Boolean.TRUE);

        } catch (PropertyVetoException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void methodsToCaseTest(JInternalFrame methodsManager, ArrayList<Method> metodos) {
        try {
            methodsManager.setVisible(false);

            CaseTestEditor caseTest = new CaseTestEditor(metodos, this);
            caseTest.setVisible(Boolean.TRUE);
            this.getjDesktopPane().add(caseTest);
            caseTest.setMaximum(Boolean.TRUE);
            caseTest.cargarMetodos();

        } catch (PropertyVetoException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void caseTestToMethods(JInternalFrame caseTestEditor, ArrayList<Class> clases) {
        try {
            caseTestEditor.setVisible(false);
            MethodsManager methodsManager = new MethodsManager(this, clases);
            methodsManager.setVisible(true);
            this.getjDesktopPane().add(methodsManager);
            methodsManager.setMaximum(true);

        } catch (PropertyVetoException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void caseTestToDependenciesSelection(JInternalFrame caseTestEditor, ArrayList<Method> metodos, CasoPrueba casoPrueba) {
        try {
            caseTestEditor.setVisible(false);
            DependenciesSelection dependencies = new DependenciesSelection(metodos, casoPrueba, this);
            dependencies.setVisible(true);
            this.getjDesktopPane().add(dependencies);
            dependencies.setMaximum(true);

        } catch (PropertyVetoException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void dependenciesSelectionToCaseTest(JInternalFrame dependencies, ArrayList<Method> metodos, ArrayList<EscenarioPrueba> escenariosPrueba) {
        try {
            dependencies.setVisible(false);
            CaseTestEditor caseTest = new CaseTestEditor(metodos, this);
            caseTest.setVisible(true);
            this.getjDesktopPane().add(caseTest);
            caseTest.setMaximum(true);
            caseTest.cargarMetodos();
            caseTest.setEscenariosPrueba(escenariosPrueba);

        } catch (PropertyVetoException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void dependenciesEditorToSelection(JInternalFrame editor, ArrayList<Method> metodosSet, CasoPrueba casoPrueba) {
        try {
            editor.setVisible(false);
            DependenciesSelection selection = new DependenciesSelection(metodosSet, casoPrueba, this);
            selection.setVisible(true);
            this.getjDesktopPane().add(selection);
            selection.setMaximum(true);

        } catch (PropertyVetoException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void dependenciesSelectionToEditor(JInternalFrame dependenciesSelection, ArrayList<Method> metodosSet, ArrayList<Method> metodosSetSeleccionados, CasoPrueba casoPrueba) {
        try {
            dependenciesSelection.setVisible(false);
            DependenciesEditor editor = new DependenciesEditor(metodosSet, metodosSetSeleccionados, this, casoPrueba);
            editor.setVisible(true);
            this.getjDesktopPane().add(editor);
            editor.setMaximum(true);

        } catch (PropertyVetoException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void methodsToClass(JInternalFrame methodsManager) {
        try {
            methodsManager.setVisible(false);
            classManager = new ClassManager(this, jarsRuta, nombresJar);
            this.classManager.getJarLista().setListData(nombresJar.toArray());
            classManager.setVisible(true);
            this.getjDesktopPane().add(classManager);
            classManager.setMaximum(true);

        } catch (PropertyVetoException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void classToPrincipal(JInternalFrame classManager) {
        try {
            classManager.setVisible(false);
            this.jarsRuta.clear();
            this.nombresJar.clear();
            MenuPrincipal menu = new MenuPrincipal(this);
            menu.setVisible(Boolean.TRUE);
            jDesktopPane.add(menu);
            menu.setMaximum(true);

            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

            int w = this.getSize().width;
            int h = this.getSize().height;
            int x = (dim.width - w) / 2;
            int y = (dim.height - h) / 2;

            this.setLocation(x, y);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateToPrincipal(JInternalFrame updateCasoPrueba) {
        try {
            updateCasoPrueba.setVisible(false);
            MenuPrincipal menu = new MenuPrincipal(this);
            menu.setVisible(Boolean.TRUE);
            jDesktopPane.add(menu);
            menu.setMaximum(true);

            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

            int w = this.getSize().width;
            int h = this.getSize().height;
            int x = (dim.width - w) / 2;
            int y = (dim.height - h) / 2;

            this.setLocation(x, y);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Class> getClasesManager() {
        ArrayList<Class> clases = classManager.getClases();

        return clases;
    }

    public ArrayList<Class> obtenerClasesJars(){

        ArrayList<Class> clases = classManager.obtenerClasesJar();

        return clases;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                Estilo estilo = new Estilo();
                estilo.setLookAndFeel();
                new Inicio().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem anadirJarAlClasspath;
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem seleccionarJar;
    private javax.swing.JPanel tapa;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the jarsRuta
     */
    public ArrayList<File> getJarsRuta() {
        return jarsRuta;
    }

    /**
     * @param jarsRuta the jarsRuta to set
     */
    public void setJarsRuta(ArrayList<File> jarsRuta) {
        this.jarsRuta = jarsRuta;
    }

    /**
     * @return the jDesktopPane
     */
    public javax.swing.JDesktopPane getjDesktopPane() {
        return jDesktopPane;
    }

    /**
     * @param jDesktopPane the jDesktopPane to set
     */
    public void setjDesktopPane(javax.swing.JDesktopPane jDesktopPane) {
        this.jDesktopPane = jDesktopPane;
    }

    /**
     * @return the archivosJavaDoc
     */
    public ArrayList<File> getArchivosJavaDoc() {
        return archivosJavaDoc;
    }

    /**
     * @param archivosJavaDoc the archivosJavaDoc to set
     */
    public void setArchivosJavaDoc(ArrayList<File> archivosJavaDoc) {
        this.archivosJavaDoc = archivosJavaDoc;
    }

    /**
     * @return the seleccionarJar
     */
    public javax.swing.JMenuItem getSeleccionarJar() {
        return seleccionarJar;
    }

    /**
     * @param seleccionarJar the seleccionarJar to set
     */
    public void setSeleccionarJar(javax.swing.JMenuItem seleccionarJar) {
        this.seleccionarJar = seleccionarJar;
    }

    /**
     * @return the nombreCasoPrueba
     */
    public String getNombreCasoPrueba() {
        return nombreCasoPrueba;
    }

    /**
     * @param nombreCasoPrueba the nombreCasoPrueba to set
     */
    public void setNombreCasoPrueba(String nombreCasoPrueba) {
        this.nombreCasoPrueba = nombreCasoPrueba;
    }

    /**
     * @return the directorioCasoPrueba
     */
    public File getDirectorioCasoPrueba() {
        return directorioCasoPrueba;
    }

    /**
     * @param directorioCasoPrueba the directorioCasoPrueba to set
     */
    public void setDirectorioCasoPrueba(File directorioCasoPrueba) {
        this.directorioCasoPrueba = directorioCasoPrueba;
    }

    /**
     * @return the anadirJarAlClasspath
     */
    public javax.swing.JMenuItem getAnadirJarAlClasspath() {
        return anadirJarAlClasspath;
    }

    /**
     * @param anadirJarAlClasspath the anadirJarAlClasspath to set
     */
    public void setAnadirJarAlClasspath(javax.swing.JMenuItem anadirJarAlClasspath) {
        this.anadirJarAlClasspath = anadirJarAlClasspath;
    }
}
