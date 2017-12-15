/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manriqueamador_examen2;

import java.io.Serializable;

/**
 *
 * @author Usuario
 */
public class Planeta implements Serializable{
    
    private static final long SerialVersionUID = 17;
    
    private String nombre,tipoSuperficie;
    private boolean anillos;
    private double distanciaTierra,tempMedia;

    public Planeta(String nombre, String tipoSuperficie, boolean anillos, double distanciaTierra, double tempMedia) {
        this.nombre = nombre;
        this.tipoSuperficie = tipoSuperficie;
        this.anillos = anillos;
        this.distanciaTierra = distanciaTierra;
        this.tempMedia = tempMedia;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoSuperficie(String tipoSuperficie) {
        this.tipoSuperficie = tipoSuperficie;
    }

    public void setAnillos(boolean anillos) {
        this.anillos = anillos;
    }

    public void setDistanciaTierra(double distanciaTierra) {
        this.distanciaTierra = distanciaTierra;
    }

    public void setTempMedia(double tempMedia) {
        this.tempMedia = tempMedia;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public String getTipoSuperficie() {
        return tipoSuperficie;
    }

    public boolean isAnillos() {
        return anillos;
    }

    public double getDistanciaTierra() {
        return distanciaTierra;
    }

    public double getTempMedia() {
        return tempMedia;
    }
    
    
    
}
