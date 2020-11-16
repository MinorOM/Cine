
package model;

/**
 *
 * @author Minor Oreamuno
 */
public class Factura {
    private double totalPagado;
    private int hora;
    private int sala;

    public Factura(double totalPagado, int hora, int sala) {
        this.totalPagado = totalPagado;
        this.hora = hora;
        this.sala = sala;
    }

    public double getTotalPagado() {
        return totalPagado;
    }

    public void setTotalPagado(double totalPagado) {
        this.totalPagado = totalPagado;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }
    
}
