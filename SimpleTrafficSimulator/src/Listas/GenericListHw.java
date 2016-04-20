package Listas;

/**
 * 
 * @author 
 * @param <T> 
 */
public class GenericListHw<T> {
    private GenericNodeHw _head;
    private GenericNodeHw _tail;
    
    /**
     * 
     */
    public GenericListHw(){      
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
     */
    public void insertarAlFrente(T pElemento, T pElemento2, T pElemento3) {
        if(isEmpty()) {
            _head = _tail = new GenericNodeHw(pElemento,pElemento2,pElemento3);
        }
        else {
            GenericNodeHw nodo = new GenericNodeHw(pElemento, pElemento2, pElemento3, _head);//tengo una referencia al head
            _head = nodo;          
        }
    }
    
    /**
     * 
     * @param pElemento
     * @param pElemento2
     * @param pElemento3
     */
    public void insertarAlFinal(T pElemento, T pElemento2, T pElemento3) {
        if (isEmpty()) {
            _head = _tail = new GenericNodeHw(pElemento,pElemento2,pElemento3);
        }
        else {
            GenericNodeHw nodo = new GenericNodeHw(pElemento,pElemento2,pElemento3);
            _tail.setNext(nodo);
            _tail = _tail.getNext();
        }
    }
    
    public Object eliminarDelFrente() throws Exception {
        if (isEmpty()) {
            throw new Exception("No hay elementos en la lista");
        }
        else {
            Object elemento = _head.getId();
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
            Object elemento = _tail.getId();
            if (_head == _tail) {
                _head = _tail = null;
            }
            else {
                GenericNodeHw actual = _head, temporal;
                while (actual.getNext() != _tail) {
                    temporal = actual.getNext();
                    actual.setNext(temporal);
                    //actual.setSiguienteNodo(actual.getSiguienteNodo());
                }
                _tail = actual;
                actual.setNext(null);
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
            GenericNodeHw actual = _head;
            while (actual != null) {
                System.out.println((String)actual.getId() + (Integer)actual.getDistance() + (Integer)actual.getTramos());
                actual = actual.getNext();
            }
        }  
        System.out.println("");
    }

    public GenericNodeHw getHead() {
        return _head;
    }
    
    
}
