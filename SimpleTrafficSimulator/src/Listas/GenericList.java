package Listas;

/**
 * 
 * @author 
 * @param <T> 
 */
public class GenericList<T> {
    private GenericNode _head;
    private GenericNode _tail;
    
    /**
     * 
     */
    public GenericList(){      
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
     */
    public void insertarAlFrente(T pElemento) {
        if(isEmpty()) {
            _head = _tail = new GenericNode(pElemento);
        }
        else {
            GenericNode nodo = new GenericNode(pElemento, _head);//tengo una referencia al head
            _head = nodo;          
        }
    }
    
    /**
     * 
     * @param elemento 
     */
    public void insertarAlFinal(T elemento) {
        if (isEmpty()) {
            _head = _tail = new GenericNode(elemento);
        }
        else {
            GenericNode nodo = new GenericNode(elemento);
            _tail.setNext(nodo);
            _tail = _tail.getNext();
        }
    }
    
    public Object eliminarDelFrente() throws Exception {
        if (isEmpty()) {
            throw new Exception("No hay elementos en la lista");
        }
        else {
            Object elemento = _head.getDato();
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
            Object elemento = _tail.getDato();
            if (_head == _tail) {
                _head = _tail = null;
            }
            else {
                GenericNode actual = _head, temporal;
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
            GenericNode actual = _head;
            while (actual != null) {
                System.out.println(actual.getDato());
                actual = actual.getNext();
            }
        }  
        System.out.println("");
    }

    public GenericNode getHead() {
        return _head;
    }
    
    
}
