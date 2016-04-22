package Logic;

import Listas.*;



/**
 *
 * @author gustavo
 */
public class GoLogic {
    
    public static void main (String args[]){
        
        GenericListSec lista = new GenericListSec();
        GenericListSS listass = new GenericListSS();
        
        lista.insertarAlFinal("Recta", 160, 0, 500, listass);
        lista.insertarAlFinal("Curva", 0, 10, 500, listass);
        Highway carretera = new Highway("SJ-Cartago", 1000, 2, lista);
    }
    
    /**
    public GoLogic() {
        
        
    }
    */ 
}
