package Listas;

public class GenericListSS<T> {
	private GenericNodeSS _head;
    private GenericNodeSS _tail;
    
    /**
     * 
     */
    public GenericListSS(){      
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
            _head = _tail = new GenericNodeSS(pElemento, pElemento2, pElemento3, pElemento4);
        }
        else {
            GenericNodeSS nodo = new GenericNodeSS(pElemento, pElemento2, pElemento3, _head);//tengo una referencia al head
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
            _head = _tail = new GenericNodeSS(pElemento, pElemento2, pElemento3, pElemento4);
        }
        else {
            GenericNodeSS nodo = new GenericNodeSS(pElemento, pElemento2, pElemento3, pElemento4);
            _tail.setNext(nodo);
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
                GenericNodeSS actual = _head, temporal;
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
            GenericNodeSS actual = _head;
            while (actual != null) {
                System.out.println((String)actual.get_id() + (Integer)actual.get_velocidad() + (Integer)actual.get_inclinacion() + (Integer)actual.get_cantcarri());
                actual = actual.getNext();
            }
        }  
        System.out.println("");
    }

    public GenericNodeSS getHead() {
        return _head;
    }
    
    
}