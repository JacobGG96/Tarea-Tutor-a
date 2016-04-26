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
        GenericListSS listass2 = new GenericListSS();
        
        listass.insertarAlFinal("Seccion1", 80, 0, 2, 250);
        listass.insertarAlFinal("Seccion2", 90, 1, 3, 250);
        
        listass2.insertarAlFinal("Seccion3", 80, 0, 2, 250);
        listass2.insertarAlFinal("Seccion4", 90, 1, 3, 250);
        
        lista.insertarAlFinal("Recta", 160, 0, listass, 5, 5, 30, 30, 500);
        lista.insertarAlFinal("Curva", 0, 10, listass2, 6, 6, 31, 31, 500);
        
        Highway carretera1 = new Highway("SJ-Cartago", 1000, 2, lista);
    }
    
    /**^
    public GoLogic() {
        
        
    }
    */ 
}
