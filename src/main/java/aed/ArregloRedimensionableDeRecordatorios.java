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
    if (size == elements.length) {
    
        Recordatorio[] newArray = new Recordatorio[elements.length + 1];

        for(int j = 0; j < elements.length; j++) {
            newArray[j] = elements[j];
        }

        elements = newArray;
    }
    
    elements[size] = i;
    size++;
    }


    public Recordatorio obtener(int i) {
        return elements[i];
    }

    public void quitarAtras() {
    
    size--; 
    
    Recordatorio[] newArray = new Recordatorio[elements.length - 1];

    for (int i = 0; i < size; i++) {
        newArray[i] = elements[i];
    }
    
    elements = newArray; 
    }


    public void modificarPosicion(int indice, Recordatorio valor) {
        
        elements[indice] = valor;

    }

    public ArregloRedimensionableDeRecordatorios copiar() {
        throw new UnsupportedOperationException("No implementada aun");
    }

}
