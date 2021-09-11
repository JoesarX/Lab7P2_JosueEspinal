package lab7p2_josueespinal;

public class Naves {
    private String nombre;
    private String identificador;
    private int despegue;
    private int aterrizaje;
    private int velocidad;
    private int distancia;
    private int consumo;
    private int combustible;
    private int reserva;

    public Naves(String nombre, String identificador, int despegue, int aterrizaje, int velocidad, int distancia, int consumo, int combustible, int reserva) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.despegue = despegue;
        this.aterrizaje = aterrizaje;
        this.velocidad = velocidad;
        this.distancia = distancia;
        this.consumo = consumo;
        this.combustible = combustible;
        this.reserva = reserva;
    }

    public int getReserva() {
        return reserva;
    }

    public void setReserva(int reserva) {
        this.reserva = reserva;
    }

   

    public Naves() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public int getDespegue() {
        return despegue;
    }

    public void setDespegue(int despegue) {
        this.despegue = despegue;
    }

    public int getAterrizaje() {
        return aterrizaje;
    }

    public void setAterrizaje(int aterrizaje) {
        this.aterrizaje = aterrizaje;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    @Override
    public String toString() {
        return nombre + " - Identificador: " + identificador;
    }
    
            
}
