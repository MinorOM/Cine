
package model;

/**
 *
 * @author Minor Oreamuno
 */
public class Cartelera {
    private Horario horarios[];    

    public Cartelera(Horario[] horarios) {
        this.horarios = horarios;
    }

    public Horario[] getHorarios() {
        return horarios;
    }

    public void setHorarios(Horario[] horarios) {
        this.horarios = horarios;
    }
  
}
