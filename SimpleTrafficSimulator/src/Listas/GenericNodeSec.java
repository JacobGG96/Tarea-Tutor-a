package Listas;

@SuppressWarnings({ "rawtypes" })
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

    public T getId() {
	return _id;
    }

    public void setId(T pId) {
    	this._id = pId;
    }

    public T getDireccion() {
    	return _direccion;
    }

    public void setDireccion(T pDireccion) {
    	this._direccion = pDireccion;
    }

    public T getRadio() {
    	return _radio;
    }

    public void setRadio(T pRadio) {
    	this._radio = pRadio;
    }
    
    public GenericListSS getSubtramos() {
    	return _subtramos;
    }

    public void setSubtramos(GenericListSS pSubtramos) {
    	this._subtramos = pSubtramos;
    }

    public T getPosXi() {
    	return _posXi;
    }

    public void setPosXi(T pPosXi) {
	this._posXi = pPosXi;
    }

    public T getPosYi() {
    	return _posYi;
    }

    public void setPosYi(T pPosYi) {
    	this._posYi = pPosYi;
    }

    public T getPosXf() {
    	return _posXf;
    }

    public void setPosXf(T pPosXf) {
    	this._posXf = pPosXf;
    }

    public T getPosYf() {
    	return _posYf;
    }

    public void setPosYf(T pPosYf) {
 	this._posYf = pPosYf;
    }
    
    public T getDistancia() {
    	return _distancia;
    }

    public void setDistancia(T pDistancia) {
    	this._distancia = pDistancia;
    }
    

}
