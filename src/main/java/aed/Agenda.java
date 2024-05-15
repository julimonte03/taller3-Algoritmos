package aed;

public class Agenda {
    private Fecha fechaActual;
    private Recordatorio[] recordatorios;
    private int size;

    public Agenda(Fecha fechaActual) {
        return this.fechaActual;
    }

    public void agregarRecordatorio(Recordatorio recordatorio) {

        if(size == recordatorios.length){
            Recordatorio[] newArray = Recordatorio[recordatorios.length + 1];
            for(int i; i < size; i++){
                newArray[i] = recordatorio[i];
            }
            recordatorios = newArray;
        }
        recordatorios[size++] = recordatorio;

    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("No implementada aun");

    }

    public void incrementarDia() {
        throw new UnsupportedOperationException("No implementada aun");

    }

    public Fecha fechaActual() {
        throw new UnsupportedOperationException("No implementada aun");
    }

}
