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
public class Astronauta {
    
    private String nombre,nacionalidad,experiencia,sexo;
    private double sueldo,peso;

    public Astronauta(String nombre, String nacionalidad, String experiencia, String sexo, double sueldo, double peso) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.experiencia = experiencia;
        this.sexo = sexo;
        this.sueldo = sueldo;
        this.peso = peso;
    }

    public Astronauta() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return nombre;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public String getSexo() {
        return sexo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public double getPeso() {
        return peso;
    }
    
    
    
}
