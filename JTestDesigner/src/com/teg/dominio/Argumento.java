package com.teg.dominio;

/**
 *
 * @author maya
 */
public class Argumento {

    private String claseOrigen;
    private String nombre;
    private String tipo;
    private String valor;
    private boolean complejo;
    private boolean arreglo;
    private boolean mapa;
    private boolean generarXstream;

    /**
     *
     * @param nombre the nombre to set
     * @param tipo the tipo to set
     */
    public Argumento(String nombre, String tipo, String valor, boolean complejo, boolean arreglo, boolean mapa) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.valor = valor;
        this.complejo = complejo;
        this.arreglo = arreglo;
        this.mapa = mapa;
    }

    public Argumento() {
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the valor
     */
    public String getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(String valor) {
        this.valor = valor;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the complejo
     */
    public boolean isComplejo() {
        return complejo;
    }

    /**
     * @param complejo the complejo to set
     */
    public void setComplejo(boolean complejo) {
        this.complejo = complejo;
    }

    /**
     * @return the arreglo
     */
    public boolean isArreglo() {
        return arreglo;
    }

    /**
     * @param arreglo the arreglo to set
     */
    public void setArreglo(boolean arreglo) {
        this.arreglo = arreglo;
    }

    /**
     * @return the mapa
     */
    public boolean isMapa() {
        return mapa;
    }

    /**
     * @param mapa the mapa to set
     */
    public void setMapa(boolean mapa) {
        this.mapa = mapa;
    }

    /**
     * @return the generarXstream
     */
    public boolean isGenerarXstream() {
        return generarXstream;
    }

    /**
     * @param generarXstream the generarXstream to set
     */
    public void setGenerarXstream(boolean generarXstream) {
        this.generarXstream = generarXstream;
    }

    /**
     * @return the claseOrigen
     */
    public String getClaseOrigen() {
        return claseOrigen;
    }

    /**
     * @param claseOrigen the claseOrigen to set
     */
    public void setClaseOrigen(String claseOrigen) {
        this.claseOrigen = claseOrigen;
    }

    
    
}
