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
     * @param pId 
     * @param pVelocidad 
     * @param pInclinacion
     * @param pCantcarri
     */
    public void insertarAlFrente(T pId, T pVelocidad, T pInclinacion, T pCantcarri) {
        if(isEmpty()) {
            _head = _tail = new GenericNodeSS(pId, pVelocidad, pInclinacion, pCantcarri);
        }
        else {
            GenericNodeSS nodo = new GenericNodeSS(pId, pVelocidad, pInclinacion, _head);//tengo una referencia al head
            _head = nodo;          
        }
    }
    
    /**
     * 
     * @param pId
     * @param pVelocidad
     * @param pInclinacion
     * @param pCantcarri
     */
    public void insertarAlFinal(T pId, T pVelocidad, T pInclinacion, T pCantcarri) {
        if (isEmpty()) {
            _head = _tail = new GenericNodeSS(pId, pVelocidad, pInclinacion, pCantcarri);
        }
        else {
            GenericNodeSS nodo = new GenericNodeSS(pId, pVelocidad, pInclinacion, pCantcarri);
            _tail.setNext(nodo);
            _tail = _tail.getNext();
        }
    }
    
    public Object eliminarDelFrente() throws Exception {
        if (isEmpty()) {
            throw new Exception("No hay elementos en la lista");
        }
        else {
            Object elemento = _head;
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
            Object elemento = _tail;
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
                System.out.println((String)actual.get_id() + " " + (Integer)actual.get_velocidad() + " " +
                        (Integer)actual.get_inclinacion() + " " + (Integer)actual.get_cantcarri());
                actual = actual.getNext();
            }
        }  
    }

    public GenericNodeSS getHead() {
        return _head;
    }
    
    
}