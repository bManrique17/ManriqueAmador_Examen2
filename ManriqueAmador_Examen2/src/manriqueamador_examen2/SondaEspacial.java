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
public class SondaEspacial extends NaveEspacial{
    
    private String material;
    private double peso;

    public SondaEspacial(String material, double peso) {
        this.material = material;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return super.toString();
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
