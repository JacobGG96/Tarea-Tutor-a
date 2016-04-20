package Listas;

public class GenericNodeSS<T> {
    
	private GenericNodeSS _next;
	private T _id;
    private T _velocidad;
    private T _inclinacion;
    private T _cantcarri;
    
    public GenericNodeSS (T pDato, T pDato2, T pDato3, T pDato4){
        this._next = null;
        this._id = pDato;
        this._velocidad = pDato2;
        this._inclinacion = pDato3;
        this._cantcarri = pDato4;
    }
    
    public GenericNodeSS (T pDato, T pDato2, T pDato3, T pDato4, GenericNodeSS pNode){
        this._id = pDato;
        this._velocidad = pDato2;
        this._inclinacion = pDato3;
        this._cantcarri = pDato4;
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

	public void set_id(T _id) {
		this._id = _id;
	}
	
	public T get_velocidad() {
		return _velocidad;
	}

	public void set_velocidad(T _velocidad) {
		this._velocidad = _velocidad;
	}

	public T get_inclinacion() {
		return _inclinacion;
	}

	public void set_inclinacion(T _inclinacion) {
		this._inclinacion = _inclinacion;
	}

	public T get_cantcarri() {
		return _cantcarri;
	}

	public void set_cantcarri(T _cantcarri) {
		this._cantcarri = _cantcarri;
	}	 
}