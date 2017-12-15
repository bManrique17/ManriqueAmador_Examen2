/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manriqueamador_examen2;

import java.util.ArrayList;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class NaveTripulada extends NaveEspacial{
    
    private String lugarDespeje;
    private ArrayList<Astronauta>listAstronautas = new ArrayList();

    public NaveTripulada(String lugarDespeje, String numSerie, Planeta planetaDestino, double velocidad) {
        super(numSerie, planetaDestino, velocidad);
        this.lugarDespeje = lugarDespeje;
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
