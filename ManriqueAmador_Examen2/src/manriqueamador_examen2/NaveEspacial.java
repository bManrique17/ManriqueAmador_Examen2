/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manriqueamador_examen2;

/**
 *
 * @author Usuario
 */
public class NaveEspacial {
    
    private String numSerie;
    private Planeta planetaDestino;
    private double velocidad;

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
