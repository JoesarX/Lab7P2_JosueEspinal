package lab7p2_josueespinal;

import java.io.Serializable;

public class Astronauta  implements Serializable{
    private String id;
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private String titulo;
    private String contextura;
    private int peso;
    private int misiones;
    private static final long SerialVersionUID = 777L;

    public Astronauta(){
    }

    public Astronauta(String id, String nombre, String apellido, String nacionalidad, String titulo, String contextura, int peso, int misiones) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.titulo = titulo;
        this.contextura = contextura;
        this.peso = peso;
        this.misiones = misiones;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContextura() {
        return contextura;
    }

    public void setContextura(String contextura) {
        this.contextura = contextura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getMisiones() {
        return misiones;
    }

    public void setMisiones(int misiones) {
        this.misiones = misiones;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " ID:" + id;
    }
    
}
