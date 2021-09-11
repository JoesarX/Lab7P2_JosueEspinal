package lab7p2_josueespinal;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListaAstro {

    private ArrayList<Astronauta> astro = new ArrayList<Astronauta>();
    private File archivo = null;

    public ListaAstro(String path) {
        archivo = new File(path);
    }

    public ListaAstro() {
    }

    public ArrayList<Astronauta> getAstro() {
        return astro;
    }

    public void setAstro(ArrayList<Astronauta> astro) {
        this.astro = astro;
    }

    
    public void addAstro(Astronauta astronauta) {
        astro.add(astronauta);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void escribirArchivo() throws IOException {
        
        try {
            FileOutputStream fw = null;
            ObjectOutputStream bw = null;
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Astronauta a : astro) {
                bw.writeObject(a);
            }

            bw.flush();
            bw.close();
            fw.close();
        } catch (Exception ex) {
        } finally {

        }
    }

    public void cargarArchivo() {
        try {
            astro = new ArrayList();
            Astronauta temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Astronauta) objeto.readObject()) != null) {
                        astro.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
