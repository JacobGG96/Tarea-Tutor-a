package Logic;

import Listas.*;



/**
 *
 * @author gustavo
 */
@SuppressWarnings({ "rawtypes", "unchecked","unused" })
public class GoLogic {
    
    
	public static void main (String args[]){
        
        GenericListSec lista = new GenericListSec();
        GenericListSS listass = new GenericListSS();
        GenericListSS listass2 = new GenericListSS();
        
        listass.insertarAlFinal("SubSeccion1", 80, 0, 2, 25);
        listass.insertarAlFinal("SubSeccion2", 90, 1, 3, 25);
        
        listass2.insertarAlFinal("SubSeccion3", 80, 0, 2, 25);
        listass2.insertarAlFinal("SubSeccion4", 90, 1, 3, 25);
        
        lista.insertarAlFinal("Recta", 160, 0, listass, 5, 5, 30, 30, 50);
        lista.insertarAlFinal("Curva", 0, 10, listass2, 6, 6, 31, 31, 50);
        
        Highway carretera1 = new Highway("SJ-Cartago", 1000, 2, lista);
    }

}
