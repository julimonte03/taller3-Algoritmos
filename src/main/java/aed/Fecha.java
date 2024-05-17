package aed;

public class Fecha {
    
    private int dia;
    private int mes;

    public Fecha(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
    }

    public Fecha(Fecha fecha) {
        this.dia = fecha.dia;
        this.mes = fecha.mes;
    }

    public Integer dia() {
        return dia;
    }

    public Integer mes() {
        return mes;
    }

    @Override
    public String toString() {
        return dia + "/" + mes;
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
        Fecha otraFecha = (Fecha) otra;
        return this.dia == otraFecha.dia && this.mes == otraFecha.mes;
    }

    public void incrementarDia() {
        int diaActual = dia();
        int mesActual = mes();

        int diasEnMes = diasEnMes(mesActual);

        if (diaActual == diasEnMes) {
            diaActual = 1;
            mesActual++;
            if (mesActual > 12) {
                mesActual = 1;
            }
        } else {
            diaActual++;
        }

        this.dia = diaActual;
        this.mes = mesActual;
    }

    private int diasEnMes(int mes) {
        int dias[] = {
                // ene, feb, mar, abr, may, jun
                31, 28, 31, 30, 31, 30,
                // jul, ago, sep, oct, nov, dic
                31, 31, 30, 31, 30, 31
        };
        return dias[mes - 1];
    }
}
