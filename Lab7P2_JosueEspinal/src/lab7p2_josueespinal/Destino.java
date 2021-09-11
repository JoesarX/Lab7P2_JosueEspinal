package lab7p2_josueespinal;

public class Destino {
    private String nombre;
    private int distancia;
    private String superficie;
    private int saturacion;

    public Destino() {
    }

    public Destino(String nombre, int distancia, String superficie, int saturacion) {
        this.nombre = nombre;
        this.distancia = distancia;
        this.superficie = superficie;
        this.saturacion = saturacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) {
        this.superficie = superficie;
    }

    public int getSaturacion() {
        return saturacion;
    }

    public void setSaturacion(int saturacion) {
        this.saturacion = saturacion;
    }

    @Override
    public String toString() {
        return nombre + " - " + distancia + "km";
    }
    
}
