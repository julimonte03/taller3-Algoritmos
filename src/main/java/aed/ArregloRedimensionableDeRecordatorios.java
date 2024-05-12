package aed;

class ArregloRedimensionableDeRecordatorios implements SecuenciaDeRecordatorios {

    private Recordatorio[] elements;
    private int size;

    public ArregloRedimensionableDeRecordatorios() {
        elements = new Recordatorio[10]; //que tamaño le pongo?
        size = 0;
    }

    public ArregloRedimensionableDeRecordatorios(ArregloRedimensionableDeRecordatorios vector) {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public int longitud() {
        return longitud;
    }

    public void agregarAtras(Recordatorio i) {

        if (longitud == elements.length()){

            Recordatorio[] newArray = new Recordatorio[elements.length() + 1];

            for(int i = 0; i < elements.length(); i++){
                
                newArray[i] = elements[i];
            }

            elements = newArray;
        }else{

            elements[size] = i;
            size++;
        }
    }

    public Recordatorio obtener(int i) {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public void quitarAtras() {
        throw new UnsupportedOperationException("No implementada aun");
    }

    public void modificarPosicion(int indice, Recordatorio valor) {
        throw new UnsupportedOperationException("No implementada aun");

    }

    public ArregloRedimensionableDeRecordatorios copiar() {
        throw new UnsupportedOperationException("No implementada aun");
    }

}
