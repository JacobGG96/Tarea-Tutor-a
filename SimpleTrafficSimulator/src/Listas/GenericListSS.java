package Listas;

@SuppressWarnings({ "rawtypes", "unchecked" })
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
     * @param pDistancia
     */
    public void insertarAlFrente(T pId, T pVelocidad, T pInclinacion, T pCantcarri, T pDistancia) {
        if(isEmpty()) {
            _head = _tail = new GenericNodeSS(pId, pVelocidad, pInclinacion, pCantcarri, pDistancia);
        }
        else {
            GenericNodeSS nodo = new GenericNodeSS(pId, pVelocidad, pInclinacion, pDistancia, _head);//tengo una referencia al head
            _head = nodo;          
        }
    }
    
    /**
     * 
     * @param pId
     * @param pVelocidad
     * @param pInclinacion
     * @param pCantcarri
     * @param pDistancia
     */
    public void insertarAlFinal(T pId, T pVelocidad, T pInclinacion, T pCantcarri, T pDistancia) {
        if (isEmpty()) {
            _head = _tail = new GenericNodeSS(pId, pVelocidad, pInclinacion, pCantcarri, pDistancia);
        }
        else {
            GenericNodeSS nodo = new GenericNodeSS(pId, pVelocidad, pInclinacion, pCantcarri, pDistancia);
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
            GenericNodeSS actual = _head;
            while (actual != null) {
                System.out.println((String)actual.getId() + " " + (Integer)actual.getVelocidad() + " " +
                        (Integer)actual.getInclinacion() + " " + (Integer)actual.getCantcarri() + " " + (Integer)actual.getDistancia());
                actual = actual.getNext();
            }
        }  
    }

    public GenericNodeSS getHead() {
        return _head;
    }
    
    
}