package Main;

import Logic.Highway;
import Logic.Vehicle;
import XMLParser.XMLWriter;
import Listas.*;

public class SimpleTrafficSimulator extends XMLWriter {

    public static void main(String[] args) {
    	
        GenericListHw lista = new GenericListHw();
        lista.insertarAlFinal("San Jose", 1000, 3);
	lista.insertarAlFinal("San Jose2", 1000, 3);
        lista.insertarAlFinal("San Jose3", 1000, 3);
        
        lista.imprimir();
	}
    
}
