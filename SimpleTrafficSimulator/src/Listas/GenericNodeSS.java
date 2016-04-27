package Listas;

@SuppressWarnings({ "rawtypes" })
public class GenericNodeSS<T> {
    
    private GenericNodeSS _next;
    private T _id;
    private T _velocidad;
    private T _inclinacion;
    private T _cantcarri;
    private T _distancia;
    
    public GenericNodeSS (T pId, T pVelocidad, T pInclinacion, T pCantcarri, T pDistancia){
        this._next = null;
        this._id = pId;
        this._velocidad = pVelocidad;
        this._inclinacion = pInclinacion;
        this._cantcarri = pCantcarri;
        this._distancia = pDistancia;
    }
    
    public GenericNodeSS (T pId, T pVelocidad, T pInclinacion, T pCantcarri, T pDistancia, GenericNodeSS pNode){
        this._id = pId;
        this._velocidad = pVelocidad;
        this._inclinacion = pInclinacion;
        this._cantcarri = pCantcarri;
        this._distancia = pDistancia;
        this._next = pNode;
    }

    /**
     * Devuelve el nodo siguiente
     * @return _next
     */
    public GenericNodeSS getNext() {
        return _next;
    }

    /**
     * Configura _next
     * @param pNext nodo generico
     */
    public void setNext(GenericNodeSS pNext) {
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
    public T getVelocidad() {
	return _velocidad;
    }

    /**
     * 
     * @param pVelocidad 
     */
    public void setVelocidad(T pVelocidad) {
	this._velocidad = pVelocidad;
    }

    /**
     * 
     * @return 
     */
    public T getInclinacion() {
	return _inclinacion;
    }
    
    /**
     * 
     * @param pInclinacion 
     */
    public void setInclinacion(T pInclinacion) {
	this._inclinacion = pInclinacion;
    }

    /**
     * 
     * @return 
     */
    public T getCantcarri() {
	return _cantcarri;
    }

    /**
     * 
     * @param pCantcarri 
     */
    public void setCantcarri(T pCantcarri) {
	this._cantcarri = pCantcarri;
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
     * @param pDistancia 
     */
    public void setDistancia(T pDistancia) {
        this._distancia = pDistancia;
    }
        
        
}