package aed;

public class Recordatorio {

    private String mensaje;
    private Fecha fecha;
    private Horario horario;

    public Recordatorio(String mensaje, Fecha fecha, Horario horario) {
        this.mensaje = mensaje;
        this.fecha = new Fecha(fecha);  // Crear una copia para evitar aliasing
        this.horario = horario;
    }

    public String mensaje() {
        return mensaje;
    }

    public Fecha fecha() {
        return new Fecha(fecha);  // Devolver una copia para evitar aliasing
    }

    public Horario horario() {
        return horario;
    }

    @Override
    public String toString() {
        return mensaje + " @ " + fecha + " " + horario;
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
        Recordatorio otroRecordatorio = (Recordatorio) otra;
        return this.mensaje.equals(otroRecordatorio.mensaje) &&
                this.fecha.equals(otroRecordatorio.fecha) &&
                this.horario.equals(otroRecordatorio.horario);
    }
}
