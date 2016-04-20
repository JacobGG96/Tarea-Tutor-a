package Main;

import Logic.Highway;
import Logic.Vehicle;
import XMLParser.XMLWriter;
import Listas.*;

public class SimpleTrafficSimulator extends XMLWriter {

    public static void main(String[] args) {
    	
        GenericListSec lista = new GenericListSec();
        lista.insertarAlFinal("San Jose", 1000, 3,4);
	lista.insertarAlFinal("San Jose2", 1000, 3,4);
        lista.insertarAlFinal("San Jose3", 1000, 3,4);
        
        lista.imprimir();
	}
    
}
