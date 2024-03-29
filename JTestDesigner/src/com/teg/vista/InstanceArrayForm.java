/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * InstanceArrayForm.java
 *
 * Created on Jan 11, 2011, 3:24:34 PM
 */
package com.teg.vista;

import com.teg.dominio.ArregloInstancia;
import com.teg.logica.WidgetObjectLoading;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdom.JDOMException;
import org.metawidget.inspector.composite.CompositeInspector;
import org.metawidget.inspector.composite.CompositeInspectorConfig;
import org.metawidget.inspector.iface.Inspector;
import org.metawidget.inspector.propertytype.PropertyTypeInspector;
import org.metawidget.inspector.xml.XmlInspector;
import org.metawidget.inspector.xml.XmlInspectorConfig;
import org.metawidget.swing.SwingMetawidget;
import org.metawidget.swing.layout.GridBagLayoutConfig;
import org.metawidget.swing.layout.TabbedPaneLayoutDecorator;
import org.metawidget.swing.layout.TabbedPaneLayoutDecoratorConfig;
import org.metawidget.swing.widgetprocessor.binding.beansbinding.BeansBindingProcessor;
import org.metawidget.swing.widgetprocessor.binding.beansbinding.BeansBindingProcessorConfig;

/**
 *
 * @author danielbello
 */
public class InstanceArrayForm extends javax.swing.JDialog {

    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonGuardar;
    private javax.swing.JButton buttonCrearOtro;
    private javax.swing.JPanel buttonPanel;
    private SwingMetawidget metawidget;
    private WidgetObjectLoading widget = new WidgetObjectLoading();
    //private ArrayList<Object> listaObjetos = new ArrayList<Object>();
    private ArrayList listaObjetos = new ArrayList();
    private javax.swing.JTextField valorString;
    private javax.swing.JPanel objectContainer;
    private javax.swing.JLabel labelString;
    private Class claseComponente;
    private Inicio inicio;
    private Object objectInspect;
    private String pathFile;
    private String casoPrueba;
    private int arregloId;
    private boolean vieneDelAssert;
    ArregloInstancia arregloInstancia;

    /** Creates new form InstanceArrayForm */
    public InstanceArrayForm(java.awt.Frame parent, boolean modal) {

        super(parent, modal);
        initComponents();
    }

    InstanceArrayForm(java.awt.Frame parent, boolean modal, Class arrayComponente, String path, WidgetObjectLoading listWidget, Inicio inicio, int arregloId, boolean vieneDelAssert) {

        super(parent, modal);

        this.pathFile = path;
        this.widget = listWidget;
        this.claseComponente = arrayComponente;
        this.inicio = inicio;
        this.casoPrueba = inicio.getNombreCasoPrueba();
        this.arregloId = arregloId;
        this.vieneDelAssert = vieneDelAssert;

        initComponentsText();

    }

    InstanceArrayForm(java.awt.Frame parent, boolean modal, Object object, String path, WidgetObjectLoading listWidget, Inicio inicio, int arregloId, boolean vieneDelAssert) {

        super(parent, modal);

        this.widget = listWidget;
        this.objectInspect = object;
        this.pathFile = path;
        this.inicio = inicio;
        this.casoPrueba = inicio.getNombreCasoPrueba();
        this.arregloId = arregloId;
        this.vieneDelAssert = vieneDelAssert;
        initComponentsObject();

    }

    public void VisibleObject() {
        InspectObject(objectInspect);
        this.setVisible(true);
    }

    private void initComponentsObject() {
        objectContainer = new javax.swing.JPanel();
        buttonPanel = new javax.swing.JPanel();
        buttonCancelar = new javax.swing.JButton();
        buttonGuardar = new javax.swing.JButton();
        buttonCrearOtro = new javax.swing.JButton();



        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        buttonPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        objectContainer.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonCancelar.setText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        buttonGuardar.setText("Guardar");
        buttonGuardar.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGuardarActionPerformed(evt);
            }
        });

        buttonCrearOtro.setText("Crear Otro");
        buttonCrearOtro.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCrearOtroActionPerformed(evt);
            }
        });

        setLayout(new BorderLayout());

        objectContainer.setLayout(new FlowLayout(FlowLayout.CENTER));


        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(buttonGuardar);
        buttonPanel.add(buttonCancelar);
        buttonPanel.add(buttonCrearOtro);


        getContentPane().add(objectContainer, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);

        setTitle("Editor de Objetos Genericos");
        setSize(500, 500);

    }

    private void initComponentsText() {

        objectContainer = new javax.swing.JPanel();
        buttonPanel = new javax.swing.JPanel();
        buttonCancelar = new javax.swing.JButton();
        buttonGuardar = new javax.swing.JButton();
        buttonCrearOtro = new javax.swing.JButton();
        valorString = new javax.swing.JTextField();
        labelString = new javax.swing.JLabel();
        valorString.setPreferredSize(new Dimension(100, 50));
        valorString.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        valorString.setLocation(100, 100);
        labelString.setSize(new Dimension(20, 20));
        labelString.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        labelString.setText("Este campo es de valor tipo: " + claseComponente.getName());
        labelString.setLocation(52, 52);


        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        buttonPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        objectContainer.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonCancelar.setText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        buttonGuardar.setText("Guardar");
        buttonGuardar.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGuardarStringActionPerformed(evt);
            }
        });

        buttonCrearOtro.setText("Crear Otro");
        buttonCrearOtro.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCrearOtroStringActionPerformed(evt);
            }
        });

        setLayout(new BorderLayout());

        objectContainer.setLayout(new FlowLayout(FlowLayout.CENTER));
        objectContainer.add(valorString);
        objectContainer.add(labelString);

        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(buttonGuardar);
        buttonPanel.add(buttonCancelar);
        buttonPanel.add(buttonCrearOtro);


        getContentPane().add(objectContainer, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);

        setTitle("Editor de Objetos Genericos");
        setSize(500, 500);

    }

    private boolean verificarDato(Class clase) {

        boolean verificado = false;
        if (clase.getName().equals("java.lang.Integer")
                || clase.getName().equals("java.lang.Float")
                || clase.getName().equals("java.lang.Double")
                || clase.getName().equals("java.lang.Long")
                || clase.getName().equals("java.lang.Short")
                || clase.getName().equals("java.lang.Byte")
                || clase.getName().equals("java.lang.Character")
                || clase.getName().equals("java.lang.String")
                || clase.getName().equals("java.lang.Boolean")) {
            verificado = true;
        }

        return verificado;
    }

    private void InspectObject(Object instance) {

        metawidget = new SwingMetawidget();

        // asociamor al metawidget la instancia que va a manejar el "binding" de propiedades
        metawidget.addWidgetProcessor(new BeansBindingProcessor(
                new BeansBindingProcessorConfig().setUpdateStrategy(UpdateStrategy.READ_WRITE)));

        CompositeInspectorConfig inspectorConfig = null;

        try {
            XmlInspectorConfig xmlConfig = new XmlInspectorConfig();

            File file = new File(pathFile + "/" + "metawidgetData.xml");


            xmlConfig.setInputStream(new FileInputStream(new File(pathFile + "/" + "metawidgetData.xml")));
            PropertyTypeInspector inspector = new PropertyTypeInspector();

            inspectorConfig = new CompositeInspectorConfig().setInspectors(
                    new Inspector[]{new PropertyTypeInspector(),
                        new XmlInspector(xmlConfig)});

        } catch (FileNotFoundException ex) {
        }

        GridBagLayoutConfig nestedLayoutConfig = new GridBagLayoutConfig().setNumberOfColumns(2);
        nestedLayoutConfig.setRequiredAlignment(2);
        TabbedPaneLayoutDecoratorConfig layoutConfig = new TabbedPaneLayoutDecoratorConfig().setLayout(
                new org.metawidget.swing.layout.GridBagLayout(nestedLayoutConfig));

        metawidget.setMetawidgetLayout(new TabbedPaneLayoutDecorator(layoutConfig));

        metawidget.setInspector(new CompositeInspector(inspectorConfig));

        metawidget.setPreferredSize(new java.awt.Dimension(500,500));

        metawidget.setToInspect(instance);

        objectContainer.add(metawidget);
        objectContainer.validate();

        //this.repaint();


    }

    

    private void instanciaCampos(Object claseInstancia) throws InstantiationException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {


        Field[] campos = claseInstancia.getClass().getDeclaredFields();
        for (Field field : campos) {
            boolean flag = false;
            if (!field.getType().isPrimitive() && verificarDato(field.getType()) == false) {
                Method[] metodosClase = claseInstancia.getClass().getDeclaredMethods();
                for (Method method : metodosClase) {
                    if (method.getParameterTypes().length > 0) {
                        if (method.getParameterTypes()[0].getName().equals(field.getType().getName())
                                && (method.getReturnType().getName() == null ? "void" == null : method.getReturnType().getName().equals("void"))
                                && flag == false) {
                            Object campoInstance = field.getType().newInstance();
                            claseInstancia.getClass().getMethod(method.getName(), field.getType()).invoke(claseInstancia, campoInstance);
                            flag = true;
                            instanciaCampos(campoInstance);

                        }
                    }
                }
            }
        }
    }

    private Object instanciarNuevoObjeto(Class clase) throws
            InstantiationException, IllegalAccessException,
            NoSuchMethodException, IllegalArgumentException,
            InvocationTargetException, JDOMException, IOException {



        Object claseInstancia = clase.newInstance();

        Field[] campos = clase.getDeclaredFields();
        for (Field field : campos) {
            boolean flag = false;
            if (!field.getType().isPrimitive() && verificarDato(field.getType()) == false) {
                Method[] metodosClase = clase.getDeclaredMethods();
                for (Method method : metodosClase) {

                    if (method.getParameterTypes().length == 1
                            && method.getParameterTypes()[0].getName().equals(field.getType().getName())
                            && (method.getReturnType().getName() == null ? "void" == null : method.getReturnType().getName().equals("void"))
                            && flag == false) {
                        Object campoInstance = field.getType().newInstance();
                        clase.getMethod(method.getName(), field.getType()).invoke(claseInstancia, campoInstance);
                        flag = true;
                        instanciaCampos(campoInstance);
                    }
                }
            }
        }


        return claseInstancia;
    }

    private Object getNuevoObjeto() {
        Class claseNueva = objectInspect.getClass();

        Object nuevoObjeto = null;
        try {
            nuevoObjeto = instanciarNuevoObjeto(claseNueva);
        } catch (InstantiationException ex) {
            Logger.getLogger(InstanceListForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(InstanceListForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(InstanceListForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(InstanceListForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(InstanceListForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JDOMException ex) {
            Logger.getLogger(InstanceListForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(InstanceListForm.class.getName()).log(Level.SEVERE, null, ex);
        }

        return nuevoObjeto;
    }

    private void buttonGuardarActionPerformed(java.awt.event.ActionEvent evt) {

        listaObjetos.add(metawidget.getToInspect());
     
        //Object[] arreglo = listaObjetos.toArray();
       arregloInstancia = new ArregloInstancia();

       arregloInstancia.setArreglo(listaObjetos.toArray());
       arregloInstancia.setClaseComponente(objectInspect.getClass().getName());

       widget.setArregloInstancia(arregloInstancia);

        this.crearXML(listaObjetos.toArray(), casoPrueba, objectInspect.getClass().getName());

        this.dispose();


    }

    public void crearXML(Object[] arreglo, String casoPrueba, String nombreClase) {
        try {
            arregloId++;
            File casoPruebaFile = new File(System.getProperty("user.home")
                    + System.getProperty("file.separator") + casoPrueba
                    + System.getProperty("file.separator"));

            File metadata = new File(casoPruebaFile.getPath()
                    + System.getProperty("file.separator") + "metadata"
                    + System.getProperty("file.separator"));

            FileOutputStream fos = new FileOutputStream(metadata.getPath()
                    + System.getProperty("file.separator")
                    + "arreglo" + arregloId + ".xml");

            XStream xstream = new XStream(new DomDriver());
            xstream.alias(nombreClase + "-array", Object[].class);

            xstream.toXML(arreglo, fos);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(InstanceForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void buttonGuardarStringActionPerformed(java.awt.event.ActionEvent evt) {

        arregloInstancia = new ArregloInstancia();

        if (claseComponente.getName().equals("java.lang.Integer")
                || claseComponente.getName().equals("int")) {
            Integer integer = new Integer(Integer.parseInt(valorString.getText()));
            listaObjetos.add(integer);

        } else {
            if (claseComponente.getName().equals("java.lang.Float")
                    || claseComponente.getName().equals("float")) {
                Float floatable = new Float(Float.parseFloat(valorString.getText()));
                listaObjetos.add(floatable);
            } else {
                if (claseComponente.getName().equals("java.lang.Character")
                        || claseComponente.getName().equals("char")) {
                    Character character = new Character(valorString.getText().toCharArray()[0]);
                    listaObjetos.add(character);
                } else {
                    if (claseComponente.getName().equals("java.lang.Byte")
                            || claseComponente.getName().equals("byte")) {
                        Byte byter = new Byte(Byte.parseByte(valorString.getText()));
                        listaObjetos.add(byter);
                    } else {
                        if (claseComponente.getName().equals("java.lang.Double")
                                || claseComponente.getName().equals("double")) {
                            Double doubler = new Double(Double.parseDouble(valorString.getText()));
                            listaObjetos.add(doubler);
                        } else {
                            if (claseComponente.getName().equals("java.lang.Boolean")
                                    || claseComponente.getName().equals("boolean")) {
                                Boolean booleano = Boolean.parseBoolean(valorString.getText());
                                listaObjetos.add(booleano);
                            } else {
                                if (claseComponente.getName().equals("java.lang.Short")
                                        || claseComponente.getName().equals("short")) {
                                    Short shorter = new Short(Short.parseShort(valorString.getText()));
                                    listaObjetos.add(shorter);
                                } else {
                                    if (claseComponente.getName().equals("java.lang.Long")
                                            || claseComponente.getName().equals("long")) {
                                        Long longer = new Long(Long.parseLong(valorString.getText()));
                                        listaObjetos.add(longer);
                                        if (claseComponente.getName().equals("java.lang.String")) {
                                            String string = valorString.getText();
                                            listaObjetos.add(string);
                                        }
                                    }
                                }
                            }
                        }
                    }

                }

            }
        }

        //Object[] arreglo = listaObjetos.toArray();



        arregloInstancia.setArreglo(listaObjetos.toArray());
        arregloInstancia.setClaseComponente(claseComponente.getName());

        widget.setArregloInstancia(arregloInstancia);


        this.dispose();
    }

    private void buttonCrearOtroActionPerformed(java.awt.event.ActionEvent evt) {

        listaObjetos.add(metawidget.getToInspect());
        objectContainer.removeAll();
        Object object = getNuevoObjeto();
        this.repaint();
        InspectObject(object);
    }

    private void buttonCrearOtroStringActionPerformed(java.awt.event.ActionEvent evt) {

        listaObjetos.add(valorString.getText());
        valorString.setText("");
    }

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
