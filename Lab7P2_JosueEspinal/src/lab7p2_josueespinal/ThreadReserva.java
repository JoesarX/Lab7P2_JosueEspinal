
package lab7p2_josueespinal;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class ThreadReserva extends Thread{
    private JProgressBar d;
    private int consumo;
    private int combustible;
    private int distancia;
    private boolean flag;

    public ThreadReserva(JProgressBar d, int consumo, int combustible, int distancia) {
        this.d = d;
        this.consumo = consumo;
        this.combustible = combustible;
        this.distancia = distancia;
    }
    


    @Override
    public void run() {
        boolean vive = true;
        while (vive) {
            d.setMaximum(combustible);
            d.setValue(d.getValue() + 1);
            if (d.getValue() == combustible) {
                JOptionPane.showConfirmDialog(null, "Logro llegar usando el tanque de reserva, buen trabajo: ");
                vive = false;
                
            } else if (d.getValue() >= distancia) {
                JOptionPane.showConfirmDialog(null, "Logro llegar usando el tanque de reserva, buen trabajo: ");
                vive = false;
                int opcion = JOptionPane.showConfirmDialog(null, "Se ha agotado la reserva. A fallado la mision. ");
                
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
            }
        }

    }
}
