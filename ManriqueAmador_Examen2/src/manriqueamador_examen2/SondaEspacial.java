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
public class SondaEspacial extends NaveEspacial implements Serializable{
    
    private static final long SerialVersionUID = 17;
    
    private String material;
    private double peso;

    public SondaEspacial(String material, double peso, String numSerie, Planeta planetaDestino, double velocidad) {
        super(numSerie, planetaDestino, velocidad);
        this.material = material;
        this.peso = peso;
    }

    

    @Override
    public String toString() {
        return super.toString();
    }
    
    @Override
    public double [] calcularTiempo(){
        double [] valores = new double [2];
        double ida,vuelta;
        ida = this.getPlanetaDestino().getDistanciaTierra()/this.getVelocidad();
        vuelta = 9.8*ida;
        valores[0] = ida;
        valores[1] = vuelta;
        return valores;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getMaterial() {
        return material;
    }

    public double getPeso() {
        return peso;
    }
    
    
}
