package Listas;

public class GenericListSec<T> {
	private GenericNodeSec _head;
    private GenericNodeSec _tail;
    
    /**
     * 
     */
    public GenericListSec(){      
        _head = _tail = null;
    }
    
    /**
     * 
     * @return 
     */
    public boolean isEmpty(){
        return _head == null;        
    }
    
    /**
     * 
     * @param pElemento 
     * @param pElemento2 
     * @param pElemento3
     * @param pElemento4 
     */
    public void insertarAlFrente(T pElemento, T pElemento2, T pElemento3, T pElemento4) {
        if(isEmpty()) {
            _head = _tail = new GenericNodeSec(pElemento, pElemento2, pElemento3, pElemento4);
        }
        else {
            GenericNodeSec nodo = new GenericNodeSec(pElemento, pElemento2, pElemento3, pElemento4, _head);//tengo una referencia al head
            _head = nodo;          
        }
    }
    
    /**
     * 
     * @param pElemento
     * @param pElemento2
     * @param pElemento3
     * @param pElemento4
     */
    public void insertarAlFinal(T pElemento, T pElemento2, T pElemento3, T pElemento4) {
        if (isEmpty()) {
            _head = _tail = new GenericNodeSec(pElemento, pElemento2, pElemento3, pElemento4);
        }
        else {
            GenericNodeSec nodo = new GenericNodeSec(pElemento, pElemento2, pElemento3, pElemento4);
            _tail.set_next(nodo);
            _tail = _tail.getNext();
        }
    }
    
    public Object eliminarDelFrente() throws Exception {
        if (isEmpty()) {
            throw new Exception("No hay elementos en la lista");
        }
        else {
            Object elemento = _head.get_id();
            if (_head == _tail) {
                _head = _tail = null;
            }
            else {
                _head = _head.getNext();
            }
            return elemento;
        }
    }
    
    public Object eliminarDelFinal() throws Exception {
        if (isEmpty()) {
            throw new Exception("No hay elementos en la lista");
        }
        else {
            Object elemento = _tail.get_id();
            if (_head == _tail) {
                _head = _tail = null;
            }
            else {
                GenericNodeSec actual = _head, temporal;
                while (actual.getNext() != _tail) {
                    temporal = actual.getNext();
                    actual.set_next(temporal);
                    //actual.setSiguienteNodo(actual.getSiguienteNodo());
                }
                _tail = actual;
                actual.set_next(null);
            }
            return elemento;
        } 
    }
    
    /**
     * 
     */
    public void imprimir() {
        if (isEmpty()) {
            System.out.println("La lista esta vacia");
        }
        else {
            GenericNodeSec actual = _head;
            while (actual != null) {
                System.out.println((String)actual.get_id() + (Integer)actual.get_direccion() + (Integer)actual.get_radio() + (Integer)actual.get_subtramos());
                actual = actual.getNext();
            }
        }  
        System.out.println("");
    }

    public GenericNodeSec getHead() {
        return _head;
    }
    
    
}