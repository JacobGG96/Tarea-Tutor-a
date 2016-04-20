package Listas;

/**
 * Clase para nodos genéricos
 * 
 * @param <T> tipo de dato del elemento
 */
public class GenericNodeHw<T> {
    private GenericNodeHw _next;
    private T _id;
    private T _distance;
    private T _tramos;
    
    public GenericNodeHw (T pDato, T pDato2, T pDato3){
        this._next = null;
        this._id = pDato;
        this._distance = pDato2;
        this._tramos = pDato3;
    }
    
    public GenericNodeHw (T pDato, T pDato2, T pDato3, GenericNodeHw pNode){
        this._id = pDato;
        this._distance = pDato2;
        this._tramos = pDato3;
        this._next = pNode;
    }

    /**
     * Devuelve el nodo siguiente
     * @return _next
     */
    public GenericNodeHw getNext() {
        return _next;
    }

    /**
     * Configura _next
     * @param pNext nodo generico
     */
    public void setNext(GenericNodeHw pNext) {
        this._next = pNext;
    }

    /**
     * Devuelve el dato del nodo
     * @return T el dato del nodo
     */
    public T getId() {
        return _id;
    }

    /**
     * 
     * @param pId
     */
    public void setId(T pId) {
        this._id = pId;
    }

    /**
     * 
     * @return 
     */
    public T getDistance() {
        return _distance;
    }

    /**
     * 
     * @return 
     */
    public T getTramos() {
        return _tramos;
    }

    /**
     * 
     * @param pDistance 
     */
    public void setDistance(T pDistance) {
        this._distance = pDistance;
    }

    /**
     * 
     * @param pTramos 
     */
    public void setTramos(T pTramos) {
        this._tramos = pTramos;
    }

    
}