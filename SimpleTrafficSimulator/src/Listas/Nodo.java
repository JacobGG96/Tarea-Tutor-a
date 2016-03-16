package Listas;

public class Nodo {
    private Object datos;
    private Nodo siguienteNodo;

    Nodo(Object objeto) {
        this.datos = objeto;
        this.siguienteNodo = null;        
    }
    
    Nodo(Object objeto, Nodo nodo) {
        this.datos = objeto;
        this.siguienteNodo = nodo;
    }

    public void setDatos(Object datos) {
        this.datos = datos;
    }

    public void setSiguienteNodo(Nodo siguienteNodo) {
        this.siguienteNodo = siguienteNodo;
    }
    
    public Object getDatos() {
        return datos;
    }

    public Nodo getSiguienteNodo() {
        return siguienteNodo;
    }
}

