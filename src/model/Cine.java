
package model;

/**
 *
 * @author Minor Oreamuno
 */
public class Cine {
   private Cartelera cartelera;

    public Cine(Cartelera cartelera) {
        this.cartelera = cartelera;
    }

    public Cartelera getCartelera() {
        return cartelera;
    }

    public void setCartelera(Cartelera cartelera) {
        this.cartelera = cartelera;
    }
   
}
