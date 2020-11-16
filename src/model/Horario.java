
package model; 
import java.util.*;

/**
 *
 * @author vinet
 */
public class Horario {
    private Date inicioDateTime;           //hora y fecha
    private Date horaFinal;
    private Pelicula pelicula;      
    private Sala sala;

    public Horario(Date inicioDateTime, Date horaFinal, Pelicula pelicula, Sala sala) {
        this.inicioDateTime = inicioDateTime;
        this.horaFinal = horaFinal;
        this.pelicula = pelicula;
        this.sala = sala;
    }

    public Date getInicioDateTime() {
        return inicioDateTime;
    }

    public void setInicioDateTime(Date inicioDateTime) {
        this.inicioDateTime = inicioDateTime;
    }

    public Date getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(Date horaFinal) {
        this.horaFinal = horaFinal;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
    
}
