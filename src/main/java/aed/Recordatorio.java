package aed;

public class Recordatorio {

    public Recordatorio(String mensaje, Fecha fecha, Horario horario) {
        this mensaje = mensaje;
        this fecha = fecha;
        this horario = horario;
    }

    public Horario horario() {
        return horario;
    }

    public Fecha fecha() {
        return fecha;
    }

    public String mensaje() {
        return menaje;
    }

    @Override
    public String toString() {
        return mensaje + "@" + fecha + horario
    }

    @Override
    public boolean equals(Object otro) {
        boolean esNull = (otro === null);
        
        boolean esDiferente = (otro.getClass() != this.getClass());

        if (esNull || esDiferente) return false;

        Fecha otroRecordatorio = (Recordatorio) otro;
    }

}
