package model;

/**
 *
 * @author vinet
 */
public class Asiento {

    private int numero;   // numero 
    private char linea;  // letra 

    public Asiento(int nAsiento, char linea) {
        this.numero = nAsiento;
        this.linea = linea;
    }

    public int getnAsiento() {
        return numero;
    }

    public void setnAsiento(int nAsiento) {
        this.numero = nAsiento;
    }

    public char getLinea() {
        return linea;
    }

    public void setLinea(char linea) {
        this.linea = linea;
    }

}
