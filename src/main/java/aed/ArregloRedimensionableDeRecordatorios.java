package aed;

class ArregloRedimensionableDeRecordatorios implements SecuenciaDeRecordatorios {

    private Recordatorio[] elements;
    private int size;

    public ArregloRedimensionableDeRecordatorios() {
        elements = new Recordatorio[]; //que tamaño le pongo?
        size = 0;
    }

    public ArregloRedimensionableDeRecordatorios(ArregloRedimensionableDeRecordatorios vector) {
        this.elements = new Recordatorio[vector.elements.length];
        for (int i = 0; i < vector.size; i++) {
            this.elements[i] = vector.elements[i];
        }
        this.size = vector.size;
    }

    public int longitud() {
        return size;
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
        ArregloRedimensionableDeRecordatorios copia = new ArregloRedimensionableDeRecordatorios();
    
        for (int i = 0; i < this.size; i++) {
            copia.elements[i] = this.elements[i];
        }
    
        copia.size = this.size;
    
        return copia;
    }
    
}
