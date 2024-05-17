package aed;

public class Horario {

    private int hora;
    private int minutos;

    public Horario(int hora, int minutos) {
        this.hora = hora;
        this.minutos = minutos;
    }

    public int hora() {
        return hora;
    }

    public int minutos() {
        return minutos;
    }

    @Override
    public String toString() {
        return hora + ":" + minutos;
    }

    @Override
    public boolean equals(Object otra) {
        if (otra == null) {
            return false;
        }
        if (this == otra) {
            return true;
        }
        if (this.getClass() != otra.getClass()) {
            return false;
        }
        Horario otroHorario = (Horario) otra;
        return this.hora == otroHorario.hora && this.minutos == otroHorario.minutos;
    }
}
