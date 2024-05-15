package aed;

public class Agenda {
    private Fecha fechaActual;
    private Recordatorio[] recordatorios;
    private int size;

    public Agenda(Fecha fechaActual) {
        this fechaActual = new Fecha(fechaActual);
        this.recordatorios = new Recordatorio[];
        this.size = 0;
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

        String result = fechaActual.toString() + "\n" + "=====\n";
        for (int i = 0; i < size; i++) {
            result += recordatorios[i].toString() + "\n";
        }
        return result;
    }
    

    public void incrementarDia() {
        this.fechaActual.incrementarDia();

    }

    public Fecha fechaActual() {
        return new Fecha(this.fechaActual);
    }

}
