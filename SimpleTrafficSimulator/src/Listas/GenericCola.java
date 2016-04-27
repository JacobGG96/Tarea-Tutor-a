package Listas;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class GenericCola<T> {
	private GenericList _listaCola;
    
    /**
     * 
     */
	public GenericCola(){
        _listaCola = new GenericList();
    }
    
    /**
     * 
     * @param pDato 
     */
    public void enqueue(T pDato){
        this._listaCola.insertarAlFinal(pDato);
    }
    
    /**
     * 
     * @return
     * @throws Exception 
     */
    public Object dequeue() throws Exception {
        return _listaCola.eliminarDelFrente();
    }
    
    /**
     * 
     * @return 
     */
    public boolean estaVacia() {
        return _listaCola.isEmpty();
    }
    
    /**
     * 
     */
    public void imprimir() {
        _listaCola.imprimir();
    }
   
}
