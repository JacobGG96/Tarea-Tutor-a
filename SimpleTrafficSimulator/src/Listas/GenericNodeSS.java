package Listas;

public class GenericNodeSS<T> {
    
    private GenericNodeSS _next;
    private T _id;
    private T _velocidad;
    private T _inclinacion;
    private T _cantcarri;
    
    public GenericNodeSS (T pId, T pVelocidad, T pInclinacion, T pCantcarri){
        this._next = null;
        this._id = pId;
        this._velocidad = pVelocidad;
        this._inclinacion = pInclinacion;
        this._cantcarri = pCantcarri;
    }
    
    public GenericNodeSS (T pId, T pVelocidad, T pInclinacion, T pCantcarri, GenericNodeSS pNode){
        this._id = pId;
        this._velocidad = pVelocidad;
        this._inclinacion = pInclinacion;
        this._cantcarri = pCantcarri;
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

	public GenericNodeSS get_next() {
		return _next;
	}

	public void set_next(GenericNodeSS _next) {
		this._next = _next;
	}
	
    /**
     * Devuelve el dato del nodo
     * @return T el dato del nodo
     */
	public T get_id() {
		return _id;
	}

	public void set_id(T pId) {
		this._id = pId;
	}
	
	public T get_velocidad() {
		return _velocidad;
	}

	public void set_velocidad(T pVelocidad) {
		this._velocidad = pVelocidad;
	}

	public T get_inclinacion() {
		return _inclinacion;
	}

	public void set_inclinacion(T pInclinacion) {
		this._inclinacion = pInclinacion;
	}

	public T get_cantcarri() {
		return _cantcarri;
	}

	public void set_cantcarri(T pCantcarri) {
		this._cantcarri = pCantcarri;
	}	 
}