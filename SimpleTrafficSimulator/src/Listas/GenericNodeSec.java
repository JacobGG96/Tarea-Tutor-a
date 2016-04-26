package Listas;

public class GenericNodeSec<T> {
	private GenericNodeSec _next;
    private T _id;
    private T _direccion;
    private T _radio;
    private T _distancia;
    private T _posXi;
    private T _posYi;
    private T _posXf;
    private T _posYf;
    private T _subtramos;
    
    public GenericNodeSec (T pId, T pDireccion, T pRadio, T pDistancia, T pSubtramos, T pPosXi, T pPosYi, T pPosXf, T pPosYf){
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
    
    public GenericNodeSec (T pId, T pDireccion, T pRadio, T pDistancia, T pSubtramos, T pPosXi, T pPosYi, T pPosXf, T pPosYf, GenericNodeSec pNode){
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

    /**
     * 
     * @return 
     */
    public T getId() {
        return _id;
    }

    /**
     * 
     * @return 
     */
    public T getDireccion() {
        return _direccion;
    }

    /**
     * 
     * @return 
     */
    public T getRadio() {
        return _radio;
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
    public T getSubtramos() {
        return _subtramos;
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
     * @param pDireccion 
     */
    public void setDireccion(T pDireccion) {
        this._direccion = pDireccion;
    }

    /**
     * 
     * @param pRadio 
     */
    public void setRadio(T pRadio) {
        this._radio = pRadio;
    }

    /**
     * 
     * @param pDistancia 
     */
    public void setDistancia(T pDistancia) {
        this._distancia = pDistancia;
    }

    /**
     * 
     * @param pSubtramos 
     */
    public void setSubtramos(T pSubtramos) {
        this._subtramos = pSubtramos;
    }

    /**
     * 
     * @return 
     */
    public T getPosXi() {
        return _posXi;
    }

    /**
     * 
     * @return 
     */
    public T getPosYi() {
        return _posYi;
    }

    /**
     * 
     * @return 
     */
    public T getPosXf() {
        return _posXf;
    }

    /**
     * 
     * @return 
     */
    public T getPosYf() {
        return _posYf;
    }

    /**
     * 
     * @param pPosXi 
     */
    public void setPosXi(T pPosXi) {
        this._posXi = pPosXi;
    }

    /**
     * 
     * @param pPosYi 
     */
    public void setPosYi(T pPosYi) {
        this._posYi = pPosYi;
    }

    /**
     * 
     * @param pPosXf 
     */
    public void setPosXf(T pPosXf) {
        this._posXf = pPosXf;
    }

    /**
     * 
     * @param pPosYf 
     */
    public void setPosYf(T pPosYf) {
        this._posYf = pPosYf;
    }

    
        
}
