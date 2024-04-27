package aed;

public class Fecha {
    
    private int dia;
    private int mes;

    public Fecha(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
    }

    public Fecha(Fecha fecha) {
        throw new UnsupportedOperationException("No implementada aun");
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

        boolean esNull = (otra == null);
        
        boolean esDiferente = (otra.getClass() != this.getClass());

        if (esNull || esDiferente){
            return false;
        }

        Fecha otraFecha = (Fecha) otra;

        return otraFecha.dia == this.dia && otraFecha.mes == this.mes;
    }

    public void incrementarDia() {
        int diaActual = dia();
        int mesActual = mes();

        int diasEnMes = diasEnMes(mesActual);

        if(diaActual  == diasEnMes && mesActual != 12){

            diaActual = 1;
            mesActual++;

            if (mesActual == 12) {
                mesActual = 1;
            }

        }else{
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
