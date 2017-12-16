/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manriqueamador_examen2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class NaveTripulada extends NaveEspacial implements Serializable{
    
    private static final long SerialVersionUID = 17;
    
    private String lugarDespeje;
    private ArrayList<Astronauta>listAstronautas = new ArrayList();

    public NaveTripulada(String lugarDespeje, String numSerie, Planeta planetaDestino, double velocidad) {
        super(numSerie, planetaDestino, velocidad);
        this.lugarDespeje = lugarDespeje;
    }
    
    @Override
    public double [] calcularTiempo(){
        double [] valores = new double [2];
        double ida,vuelta;
        double sumaPesosI = 0,sumaPesosV = 0,sumatoria=0;
        for (Astronauta a : this.listAstronautas) {
            sumatoria += a.getPeso();
        }
        
        sumaPesosI=(sumatoria*sumatoria)/100;
        sumaPesosV=sumatoria/100;
        ida =  ( this.getPlanetaDestino().getDistanciaTierra() / (this.getVelocidad() * sumaPesosI)  );
        
        vuelta = ( this.getPlanetaDestino().getDistanciaTierra() / (this.getVelocidad() * sumaPesosV)  );
        
        valores[0] = ida;
        valores[1] = vuelta;
        return valores;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
    public void setLugarDespeje(String lugarDespeje) {
        this.lugarDespeje = lugarDespeje;
    }

    public void setListAstronautas(ArrayList<Astronauta> listAstronautas) {
        this.listAstronautas = listAstronautas;
    }

    public NaveTripulada() {
    }

    public String getLugarDespeje() {
        return lugarDespeje;
    }

    public ArrayList<Astronauta> getListAstronautas() {
        return listAstronautas;
    }
    private static final Logger LOG = Logger.getLogger(NaveTripulada.class.getName());
    
    
    
}
