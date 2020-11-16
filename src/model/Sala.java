
package model;

/**
 *
 * @author vinet
 */
public class Sala {
    private int numero;
    private Asiento asientos[][];

    public Sala(int numero, Asiento[][] asientos) {
        this.numero = numero;
        this.asientos = asientos;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Asiento[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(Asiento[][] asientos) {
        this.asientos = asientos;
    }
    
}
