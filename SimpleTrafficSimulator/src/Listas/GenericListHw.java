package Listas;

/**
 * 
 * @author 
 * @param <T> 
 */

@SuppressWarnings({ "rawtypes", "unchecked" })
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
     * @param pId 
     * @param pDistance 
     * @param pSentidos 
     * @param pTramos 
     */
    public void insertarAlFrente(T pId, T pDistance, T pSentidos, GenericListSec pTramos) {
        if(isEmpty()) {
            _head = _tail = new GenericNodeHw(pId,pDistance, pSentidos, pTramos);
        }
        else {
            GenericNodeHw nodo = new GenericNodeHw(pId, pDistance, pSentidos, pTramos, _head);//tengo una referencia al head
            _head = nodo;          
        }
    }
    
    /**
     * 
     * @param pId
     * @param pDistance
     * @param pSentidos
     * @param pTramos
     */
    public void insertarAlFinal(T pId, T pDistance, T pSentidos, GenericListSec pTramos) {
        if (isEmpty()) {
            _head = _tail = new GenericNodeHw(pId,pDistance, pSentidos, pTramos);
        }
        else {
            GenericNodeHw nodo = new GenericNodeHw(pId,pDistance, pSentidos, pTramos);
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
                System.out.println((String)actual.getId() + " " + (Integer)actual.getDistancia() + " " + (GenericListSec)actual.getTramos());
                actual = actual.getNext();
            }
        }    
    }

    public GenericNodeHw getHead() {
        return _head;
    }
    
    
}
