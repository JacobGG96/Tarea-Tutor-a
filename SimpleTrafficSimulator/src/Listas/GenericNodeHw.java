package Listas;

/**
 * Clase para nodos genéricos
 * 
 * @param <T> tipo de dato del elemento
 */
public class GenericNodeHw<T> {
    private GenericNodeHw _next;
    private T _id;
    private T _distancia;
    private T _sentidos;
    private T _tramos;
    
    public GenericNodeHw (T pId, T pDistancia, T pSentidos, T pTramos){
        this._next = null;
        this._id = pId;
        this._distancia = pDistancia;
        this._sentidos = pSentidos;
        this._tramos = pTramos;
    }
    
    public GenericNodeHw (T pId, T pDistancia, T pSentidos, T pTramos, GenericNodeHw pNode){
        this._id = pId;
        this._distancia = pDistancia;
        this._tramos = pTramos;
        this._sentidos = pSentidos;
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
    public T getDistancia() {
        return _distancia;
    }

    /**
     * 
     * @return 
     */
    public T getSentidos() {
        return _sentidos;
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
    public void setDistancia(T pDistance) {
        this._distancia = pDistance;
    }

    /**
     * 
     * @param pSentidos 
     */
    public void setSentidos(T pSentidos) {
        this._sentidos = pSentidos;
    }
    
    /**
     * 
     * @param pTramos 
     */
    public void setTramos(T pTramos) {
        this._tramos = pTramos;
    }

    
}