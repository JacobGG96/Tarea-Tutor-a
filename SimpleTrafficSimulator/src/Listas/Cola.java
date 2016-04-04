package Listas;

public class Cola {
    private GenericList _listaCola;
    
    public Cola(){
        _listaCola = new GenericList();
    }
    
    public void enqueue(IDato pDato){
        this._listaCola.insertarAlFinal(pDato);
    }
    
   
}
