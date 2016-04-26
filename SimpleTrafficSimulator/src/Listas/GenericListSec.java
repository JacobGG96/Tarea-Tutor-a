package Listas;

public class GenericListSec<T> {
    private GenericNodeSec _head;
    private GenericNodeSec _tail;
    
    /**
     * 
     */
    public GenericListSec(){      
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
     * @param pDireccion 
     * @param pRadio
     * @param pDistancia
     * @param pSubtramos 
     */

    public void insertarAlFrente(T pId, T pDireccion, T pRadio, GenericListSS pSubtramos, T pPosXi,T pPosYi, T pPosXf, T pPosYf, T pDistancia) {
        if(isEmpty()) {
        	_head = _tail = new GenericNodeSec(pId, pDireccion, pRadio, pSubtramos, pPosXi, pPosYi, pPosXf, pPosYf, pDistancia);
        }
        else {
            GenericNodeSec nodo = new GenericNodeSec(pId, pDireccion, pRadio, pSubtramos, pPosXi, pPosYi, pPosXf, pPosYf, pDistancia);//tengo una referencia al head
            _head = nodo;          
        }
    }
    
    /**
     * 
     * @param pId
     * @param pDireccion
     * @param pRadio
     * @param pDistancia
     * @param pSubtramos
     */
    public void insertarAlFinal(T pId, T pDireccion, T pRadio, GenericListSS pSubtramos, T pPosXi,T pPosYi, T pPosXf, T pPosYf, T pDistancia) {

        if (isEmpty()) {
            _head = _tail = new GenericNodeSec(pId, pDireccion, pRadio, pSubtramos, pPosXi, pPosYi, pPosXf, pPosYf, pDistancia);

        }
        else {

            GenericNodeSec nodo = new GenericNodeSec(pId, pDireccion, pRadio, pSubtramos, pPosXi, pPosYi, pPosXf, pPosYf, pDistancia);
            _tail.set_next(nodo);
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
                GenericNodeSec actual = _head, temporal;
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
            GenericNodeSec actual = _head;
            while (actual != null) {
                System.out.println((String)actual.get_id() + " " + (Integer)actual.get_direccion() + " " + 
                        (Integer)actual.get_radio() + " " + (Integer)actual.get_distancia() + "" + (GenericListSS)actual.get_subtramos());
                actual = actual.getNext();
            }
        }  
    }

    public GenericNodeSec getHead() {
        return _head;
    }
    
    
}