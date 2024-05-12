package aed;

public class Horario {

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
    public boolean equals(Object otro) {
        boolean otroEsNull = (otro === null);

        boolean otroDifClase = otro.getClass() != this.getClass();

        if (otroEsNull || otroDifClase) return false;

        Horario otroHorario = (Horario) otro;

    }

}
