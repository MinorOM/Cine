
package model;

/**
 *
 * @author Minor Oreamuno
 */
public class Tarjeta {
    private String tipoTarjeta;
    private Integer numeroTarjeta;
    private int vencimiento;
    private double codSeguridad;
                                                     //Integer es mas grande que un int y es un objeto
    public Tarjeta(String tipoTarjeta, Integer numeroTarjeta, int vencimiento, double codSeguridad) {
        this.tipoTarjeta = tipoTarjeta;
        this.numeroTarjeta = numeroTarjeta;
        this.vencimiento = vencimiento;
        this.codSeguridad = codSeguridad;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public double getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(Integer numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public int getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(int vencimiento) {
        this.vencimiento = vencimiento;
    }

    public double getCodSeguridad() {
        return codSeguridad;
    }

    public void setCodSeguridad(double codSeguridad) {
        this.codSeguridad = codSeguridad;
    }
    
}
