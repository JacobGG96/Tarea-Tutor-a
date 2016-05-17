package DataStructures;

/**
 * Clase para crear y manipular una lista
 * @author 
 * @param <T> 
 */
@SuppressWarnings({"rawtypes","unchecked"})
public class GenericList<T> {
    
    private GenericNode _head;
    private GenericNode _tail;
    
    /**
     * Constructor de la clase
     */
    public GenericList(){      
        _head = _tail = null;
    }
    
    /**
     * Verifica si la lista esta vacia
     * @return <code>true<code/> si la lista esta vacia
     * <code>false<code/> si no esta vacia 
     */
    public boolean isEmpty(){
        return _head == null;        
    }
    
    /**
     * 
     * @param pElemento 
     */
    public void insertarAlFrente(T pElemento) {
        if(isEmpty()) {
            _head = _tail = new GenericNode(pElemento);
        }
        else {
            GenericNode nodo = new GenericNode(pElemento, _head);//tengo una referencia al head
            _head = nodo;          
        }
    }
    
    /**
     * Inserta un elemento al final de la lista
     * @param elemento que se quiere ingresar
     */
    public void insertarAlFinal(T elemento) {
        if (isEmpty()) {
            _head = _tail = new GenericNode(elemento);
        }
        else {
            GenericNode nodo = new GenericNode(elemento);
            _tail.setNext(nodo);
            _tail = _tail.getNext();
        }
    }
    
    /**
     * Elimina el ultimo elemento ingresado a la lista
     * @return el elemento eliminado
     * @throws Exception cuando la lista esta vacia
     */
    public Object eliminarDelFinal() throws Exception {
        if (isEmpty()) {
            throw new Exception("No hay elementos en la lista");
        }
        else {
            Object elemento = _tail.getDato();
            if (_head == _tail) {
                _head = _tail = null;
            }
            else {
                GenericNode actual = _head, temporal;
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
     * Imprime todos los elementos de la lista
     */
    public void imprimir() {
        if (isEmpty()) {
            System.out.println("La lista esta vacia");
        }
        else {
            GenericNode actual = _head;
            while (actual != null) {
                System.out.println(actual.getDato());
                actual = actual.getNext();
            }
        }  
        System.out.println("");
    }

    public GenericNode getHead() {
        return _head;
    }
    
    
}
