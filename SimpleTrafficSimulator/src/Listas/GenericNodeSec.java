package Listas;

public class GenericNodeSec<T> {
	private GenericNodeSec _next;
    private T _id;
    private T _direccion;
    private T _radio;
    private T _subtramos;
    
    public GenericNodeSec (T pId, T pDireccion, T pRadio, T pSubtramos){
        this._next = null;
        this._id = pId;
        this._direccion = pDireccion;
        this._radio = pRadio;
        this._subtramos = pSubtramos;
    }
    
    public GenericNodeSec (T pId, T pDireccion, T pRadio, T pSubtramos, GenericNodeSec pNode){
        this._id = pId;
        this._direccion = pDireccion;
        this._radio = pRadio;
        this._subtramos = pSubtramos;
        this._next = pNode;
    }

    /**
     * Devuelve el nodo siguiente
     * @return _next
     */
    public GenericNodeSec getNext() {
        return _next;
    }

    /**
     * Configura _next
     * @param pNext nodo generico
     */

	public void set_next(GenericNodeSec _next) {
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

	public T get_direccion() {
		return _direccion;
	}

	public void set_direccion(T _direccion) {
		this._direccion = _direccion;
	}

	public T get_radio() {
		return _radio;
	}

	public void set_radio(T _radio) {
		this._radio = _radio;
	}

	public T get_subtramos() {
		return _subtramos;
	}

	public void set_subtramos(T _subtramos) {
		this._subtramos = _subtramos;
	}  
}
