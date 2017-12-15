package manriqueamador_examen2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class adminArchivo {

    private ArrayList<Planeta> listPlanetas = new ArrayList();
    private ArrayList<Astronauta> listAstronautas = new ArrayList();
    private ArrayList<NaveTripulada> listNaves = new ArrayList();
    private ArrayList<SondaEspacial> listSondas = new ArrayList();
    File archivo;

    public adminArchivo(String path) {
        archivo = new File(path);
    }

    public ArrayList<Planeta> getListPlanetas() {
        return listPlanetas;
    }

    public ArrayList<Astronauta> getListAstronautas() {
        return listAstronautas;
    }

    public ArrayList<NaveTripulada> getListNaves() {
        return listNaves;
    }

    public ArrayList<SondaEspacial> getListSondas() {
        return listSondas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setListPlanetas(ArrayList<Planeta> listPlanetas) {
        this.listPlanetas = listPlanetas;
    }

    public void setListAstronautas(ArrayList<Astronauta> listAstronautas) {
        this.listAstronautas = listAstronautas;
    }

    public void setListNaves(ArrayList<NaveTripulada> listNaves) {
        this.listNaves = listNaves;
    }

    public void setListSondas(ArrayList<SondaEspacial> listSondas) {
        this.listSondas = listSondas;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void cargarArchivo() {
        try {
            listAstronautas = new ArrayList();
            listNaves = new ArrayList();
            listPlanetas = new ArrayList();
            listSondas = new ArrayList();
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                ArrayList<Object> objetos = new ArrayList();
                Object x;
                try {
                    while ((x = objeto.readObject()) != null) {
                        objetos.add(x);
                    }
                } catch (Exception e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();

                for (Object o : objetos) {
                    if (o instanceof Planeta) {
                        listPlanetas.add((Planeta) o);
                    } else {
                        if (o instanceof Astronauta) {
                            listAstronautas.add((Astronauta) o);
                        } else {
                            if (o instanceof NaveTripulada) {
                                listNaves.add((NaveTripulada) o);
                            } else {
                                listSondas.add((SondaEspacial) o);
                            }
                        }
                    }
                }
            }
        } catch (Exception ex) {
            //ex.printStackTrace();
        }
    }

    public void escribirArchivo() throws IOException {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Planeta p : listPlanetas) {
                bw.writeObject(p);
            }
            for (NaveTripulada n : listNaves) {
                bw.writeObject(n);
            }
            for (SondaEspacial s : listSondas) {
                bw.writeObject(s);
            }
            for (Astronauta a : listAstronautas) {
                bw.writeObject(a);
            }
            bw.flush();
        } catch (Exception ex) {

        }
        bw.close();
        fw.close();

    }

}
