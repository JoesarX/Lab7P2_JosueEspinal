package lab7p2_josueespinal;

import javax.swing.JProgressBar;
import javax.swing.JOptionPane;

public class ThreadTanque extends Thread {

    private JProgressBar d;
    private JProgressBar r;
    private int consumo;
    private int combustible;
    private int distancia;
    private int reserva;

    private boolean flag;

    public ThreadTanque(JProgressBar d, JProgressBar r, int consumo, int combustible, int distancia, int reserva) {
        this.d = d;
        this.r = r;
        this.consumo = consumo;
        this.combustible = combustible;
        this.distancia = distancia;
        this.reserva = reserva;
        this.flag = flag;
    }

    public ThreadTanque(JProgressBar d, int consumo, int combustible, int distancia) {
        this.d = d;
        this.consumo = consumo;
        this.combustible = combustible;
        this.distancia = distancia;
    }

    public ThreadTanque(JProgressBar d) {
        this.d = d;
    }

    public ThreadTanque() {
    }

    public JProgressBar getD() {
        return d;
    }

    public void setD(JProgressBar d) {
        this.d = d;
    }

    public JProgressBar getR() {
        return r;
    }

    public void setR(JProgressBar r) {
        this.r = r;
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

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getReserva() {
        return reserva;
    }

    public void setReserva(int reserva) {
        this.reserva = reserva;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
    

    @Override
    public void run() {
        boolean vive = true;
        int recorrido = combustible * consumo;
        while (vive) {
            
            d.setMaximum(combustible);
            d.setValue(d.getValue() + 1);
            if (d.getValue() == recorrido) {
                vive = false;
   
            } else if (d.getValue() >= distancia) {
                vive = false;
                
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
            }
        }
        
        

    }
}
