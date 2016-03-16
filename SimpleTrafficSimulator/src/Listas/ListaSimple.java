package Listas;

public class ListaSimple {
    private Nodo primerNodo;
    private Nodo ultimoNodo;
    
    public ListaSimple() {
        primerNodo = ultimoNodo = null;
    }
    
    public boolean estaVacia() {
        return primerNodo == null;
    }
    
    public void insertarAlFrente(Object elemento) {
        if(estaVacia()) {
            primerNodo = ultimoNodo = new Nodo(elemento);
        }
        else {
            Nodo nodo = new Nodo(elemento, primerNodo);
            primerNodo = nodo;          
        }
    }
    
    public void insertarAlFinal(Object elemento) {
        if (estaVacia()) {
            primerNodo = ultimoNodo = new Nodo(elemento);
        }
        else {
            Nodo nodo = new Nodo(elemento);
            ultimoNodo.setSiguienteNodo(nodo);
            ultimoNodo = ultimoNodo.getSiguienteNodo();
        }
    }
    
    public Object eliminarDelFrente() throws Exception {
        if (estaVacia()) {
            throw new Exception("No hay elementos en la lista");
        }
        else {
            Object elemento = primerNodo.getDatos();
            if (primerNodo == ultimoNodo) {
                primerNodo = ultimoNodo = null;
            }
            else {
                primerNodo = primerNodo.getSiguienteNodo();
            }
            return elemento;
        }
    }
    
    public Object eliminarDelFinal() throws Exception {
        if (estaVacia()) {
            throw new Exception("No hay elementos en la lista");
        }
        else {
            Object elemento = ultimoNodo.getDatos();
            if (primerNodo == ultimoNodo) {
                primerNodo = ultimoNodo = null;
            }
            else {
                Nodo actual = primerNodo, temporal;
                while (actual.getSiguienteNodo() != ultimoNodo) {
                    temporal = actual.getSiguienteNodo();
                    actual.setSiguienteNodo(temporal);
                    //actual.setSiguienteNodo(actual.getSiguienteNodo());
                }
                ultimoNodo = actual;
                actual.setSiguienteNodo(null);
            }
            return elemento;
        } 
    }
    
    public void imprimir() {
        if (estaVacia()) {
            System.out.println("La lista esta vacia");
        }
        else {
            Nodo actual = primerNodo;
            while (actual != null) {
                System.out.println(actual.getDatos());
                actual = actual.getSiguienteNodo();
            }
        }  
        System.out.println("");
    }
 }
