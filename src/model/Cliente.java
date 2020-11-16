
package model;

/**
 *
 * @author Minor Oreamuno
 */
public class Cliente {
   private String nombre;
   private int Tarjeta;
   private String cliente;
   private int fechaNacimiento;

    public Cliente(String nombre, int Tarjeta, String cliente, int fechaNacimiento) {
        this.nombre = nombre;
        this.Tarjeta = Tarjeta;
        this.cliente = cliente;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTarjeta() {
        return Tarjeta;
    }

    public void setTarjeta(int Tarjeta) {
        this.Tarjeta = Tarjeta;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
   
}
