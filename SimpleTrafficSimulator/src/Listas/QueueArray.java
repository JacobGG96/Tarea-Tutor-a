package Listas;

import java.lang.reflect.Array;

/**
 * Clase arreglo tipo cola
 * 
 * @param <T> tipo de la clase
 */
public class QueueArray<T> {
    private T[] _queue;
    private int _queuesize;
    private int _index;
    private int _tail;
    private boolean _flag;
    private Class<T> _arrayclass;
    
    /**
     * Constructor de la clase
     * 
     * @param c tipo del objeto
     * @param pSize tamaño que va a tener el arreglo
     */
    public QueueArray (Class<T> c, int pSize){
        _queue = (T[]) Array.newInstance(c, pSize); //new T[pSize];
        _queuesize = pSize;
        _index = 0 ;
        _tail = 0 ; 
        _flag = true;
        this._arrayclass = c;
    }
    
    /**
     * Verifica si el arreglo esta lleno
     * @return <code>true:</code> si esta lleno, <code>false</code> de
     * lo contrario
     */
    public boolean isFull(){
        return (_flag && (_index == 0 && _tail == _queuesize)) ||
                (!_flag && _index == _tail);        
    }
    
    /**
     * Verifica si el arreglo esta vacio
     * @return 
     */
    public boolean isEmpty(){
        return ((_index == _tail) && _flag);
    }
    
    /**
     * Aumenta el tamaño del arreglo
     */
    private void resize(){
        int newsize = (_queuesize / 2) + _queuesize;
        T[] newqueue;
        newqueue = (T[]) Array.newInstance(_arrayclass, newsize);//new T[newsize];
        int j = _index;
        
        for(int i = 0;+ i < _queuesize ; i++ , j++){
            if(j == _queuesize)
                j = 0;
            newqueue[i] = _queue[j];   
        }
        
        _flag = true;
        _index = 0;
        _tail = _queuesize;
        _queuesize = newsize;
        _queue = newqueue;
    }
    
    /**
     * Agrega un elemento al final de la fila
     * @param pDato elemento que se agrega a la lista
     */
    public void enqueue (T pDato){
        if(isFull()){
            resize();
        }
        
        if(_tail == _queuesize && _index != 0){
            _tail = 0;
            _flag = false;
        }
        
        _queue[_tail++] = pDato;
        
    }
    
    /**
     * Elimina el primer elemento del arreglo
     * @return el primer elemento del arreglo
     */
    public T dequeue(){
        if(isEmpty())
            System.out.println("lleno");
        
        if(_index == _queuesize){
            _flag = true;
            _index = 0;
        }
        
        return _queue[_index++]; 
    }
    
    /**
     * Imprime los elementos del arreglo
     */
    public void imprimir(){
        
        if(isEmpty())
            System.out.println("Esta vacía, no hay mosntruos aqui");
        
        else{
            boolean a = _flag;
            
            for(int i = _index ; a && i < _tail ||
                !a && i >= _tail  || a && i < _tail; i++){    
                
                if(i == _queuesize){
                    i = 0;
                    a = true;
                }

                System.out.println(_queue[i]);              

            }    
                
        }    
    }
}
