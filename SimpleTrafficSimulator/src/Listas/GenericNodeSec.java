package Listas;

public class GenericNodeSec<T> {
	private GenericNodeSec _next;
    private T _id;
    private T _direccion;
    private T _radio;
    private GenericListSS _subtramos;
    private T _posXi;
    private T _posYi;
    private T _posXf;
    private T _posYf;
    private T _distancia;
    
    public GenericNodeSec (T pId, T pDireccion, T pRadio, GenericListSS pSubtramos, T pPosXi,T pPosYi, T pPosXf, T pPosYf, T pDistancia){
        this._next = null;
        this._id = pId;
        this._direccion = pDireccion;
        this._radio = pRadio;
        this._distancia = pDistancia;
        this._subtramos = pSubtramos;
        this._posXi = pPosXi;
        this._posYi = pPosYi;
        this._posXf = pPosXf;
        this._posYf = pPosYf;
        
    }
    
    public GenericNodeSec (T pId, T pDireccion, T pRadio,GenericListSS pSubtramos, T pPosXi, T pPosYi, T pPosXf, T pPosYf, GenericNodeSec pNode, T pDistancia){
        this._id = pId;
        this._direccion = pDireccion;
        this._radio = pRadio;
        this._distancia = pDistancia;
        this._subtramos = pSubtramos;
        this._posXi = pPosXi;
        this._posYi = pPosYi;
        this._posXf = pPosXf;
        this._posYf = pPosYf;
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
    public void setNext(GenericNodeSec pNext) {
        this._next = pNext;
    }

	public GenericNodeSec get_next() {
		return _next;
	}

	public void set_next(GenericNodeSec _next) {
		this._next = _next;
	}

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

	public GenericListSS get_subtramos() {
		return _subtramos;
	}

	public void set_subtramos(GenericListSS _subtramos) {
		this._subtramos = _subtramos;
	}

	public T get_posXi() {
		return _posXi;
	}

	public void set_posXi(T _posXi) {
		this._posXi = _posXi;
	}

	public T get_posYi() {
		return _posYi;
	}

	public void set_posYi(T _posYi) {
		this._posYi = _posYi;
	}

	public T get_posXf() {
		return _posXf;
	}

	public void set_posXf(T _posXf) {
		this._posXf = _posXf;
	}

	public T get_posYf() {
		return _posYf;
	}

	public void set_posYf(T _posYf) {
		this._posYf = _posYf;
	}

	public T get_distancia() {
		return _distancia;
	}

	public void set_distancia(T _distancia) {
		this._distancia = _distancia;
	}

    /**
     * 
     * @return 
     */
	

}
