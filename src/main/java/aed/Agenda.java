package aed;

public class Agenda {
    private Fecha fechaActual;
    private Recordatorio[] recordatorios;
    private int size;

    public Agenda(Fecha fechaActual) {
        this.fechaActual = new Fecha(fechaActual);
        this.recordatorios = new Recordatorio[10];
        this.size = 0;
    }

    public void agregarRecordatorio(Recordatorio recordatorio) {
        if (size == recordatorios.length) {
            Recordatorio[] newArray = new Recordatorio[recordatorios.length * 2];
            for (int i = 0; i < size; i++) {
                newArray[i] = recordatorios[i];
            }
            recordatorios = newArray;
        }
        recordatorios[size++] = recordatorio;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(fechaActual.toString()).append("\n=====\n");
        for (int i = 0; i < size; i++) {
            if (recordatorios[i].fecha().equals(fechaActual)) {
                result.append(recordatorios[i].toString()).append("\n");
            }
        }
        return result.toString();
    }

    public void incrementarDia() {
        this.fechaActual.incrementarDia();
    }

    public Fecha fechaActual() {
        return new Fecha(this.fechaActual);
    }
}
