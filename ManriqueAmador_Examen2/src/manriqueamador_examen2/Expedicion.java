/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manriqueamador_examen2;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Expedicion extends Thread{
    
    private Planeta planeta;
    private NaveEspacial nave;
    private JLabel estado;

    public Expedicion(Planeta planeta, NaveEspacial nave, JLabel estado) {
        this.planeta = planeta;
        this.nave = nave;
        this.estado = estado;
    }
    
    

    public JLabel getEstado() {
        return estado;
    }

    public void setEstado(JLabel estado) {
        this.estado = estado;
    }
    
    

    public Planeta getPlaneta() {
        return planeta;
    }

    public NaveEspacial getNave() {
        return nave;
    }

    public void setPlaneta(Planeta planeta) {
        this.planeta = planeta;
    }

    public void setNave(NaveEspacial nave) {
        this.nave = nave;
    }

    @Override
    public void run() {
        double ida,vuelta;
        double [] datos = new double [2];
        datos = nave.calcularTiempo();
        ida = datos[0]*1000;
        vuelta = datos[1]*1000;
        
        System.out.println("IDA:"+ida);
        System.out.println("VUELTA:"+vuelta);
        long i = (new Double(ida)).longValue();
        long v = (new Double(vuelta)).longValue();
        
        estado.setText("Llegando al planeta "+planeta.getNombre()+"...");
        try {
            Thread.sleep(i);
        } catch (InterruptedException ex) {
            
        }
        JOptionPane.showMessageDialog(null, "La nave "+nave.getNumSerie() + " ha llegado al planeta "+planeta.getNombre());
        estado.setText("Regresando a la tierra...");
        try {
            Thread.sleep(v);
        } catch (InterruptedException ex) {
            
        }
        estado.setText("Finalizado");
        JOptionPane.showMessageDialog(null, "La nave "+nave.getNumSerie() + " ha regresado a la Tierra");
        
    }
    
    
    
}
