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
public class NaveEspacial implements Serializable{
    
    private static final long SerialVersionUID = 17;
    
    private String numSerie;
    private Planeta planetaDestino;
    private double velocidad;
    
    public double[] calcularTiempo(){
        double [] valores = new double [2];
        return valores;
    }
    
    public NaveEspacial(String numSerie, Planeta planetaDestino, double velocidad) {
        this.numSerie = numSerie;
        this.planetaDestino = planetaDestino;
        this.velocidad = velocidad;
    }
    
    public NaveEspacial() {
    }

    public String getNumSerie() {
        return numSerie;
    }

    public Planeta getPlanetaDestino() {
        return planetaDestino;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public void setPlanetaDestino(Planeta planetaDestino) {
        this.planetaDestino = planetaDestino;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return numSerie;
    }
    
    
    
}
