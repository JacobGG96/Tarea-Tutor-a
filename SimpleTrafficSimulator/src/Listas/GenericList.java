package Listas;

public class GenericList {
    private GenericNode _head;
    private GenericNode _tail;
    
    public GenericList(){
        _head = _tail = null;
    }
    
    public boolean isEmpty(){
        return _head == null;        
    }
    
    public void insertarAlFrente(IDato pElemento) {
        if(isEmpty()) {
            _head = _tail = new GenericNode(pElemento);
        }
        else {
            GenericNode nodo = new GenericNode(pElemento, _head);//tengo una referencia al head
            _head = nodo;          
        }
    }
    
    
    
    
}
