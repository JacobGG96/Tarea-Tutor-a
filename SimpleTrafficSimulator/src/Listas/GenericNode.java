package Listas;

public class GenericNode {
    private GenericNode _next;
    private IDato _dato;
    
    public GenericNode (IDato pDato){
        _next = null;
        _dato = pDato;
    }
    
    public GenericNode (IDato pDato, GenericNode pNode){
        this._dato = pDato;
        this._next = pNode;
    }

    public GenericNode getNext() {
        return _next;
    }

    public void setNext(GenericNode _next) {
        this._next = _next;
    }

    public IDato getDato() {
        return _dato;
    }

    public void setDato(IDato _dato) {
        this._dato = _dato;
    }

    
}
