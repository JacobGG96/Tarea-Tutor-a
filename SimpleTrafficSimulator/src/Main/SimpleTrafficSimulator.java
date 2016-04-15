package Main;

import Logic.Highway;
import Logic.Vehicle;
import XMLParser.XMLWriter;

public class SimpleTrafficSimulator extends XMLWriter {

    public static void main(String[] args) {
    	
        Highway newHighway = new Highway("SJ-CA",70,80, 0.7,1,2);
        
        Vehicle vehiculo1 = new Vehicle("Automovil",10,5,240,80,true,40);
        Vehicle vehiculo2 = new Vehicle("Camion",10,5,240,80,true,40);
        Vehicle vehiculo3 = new Vehicle("Camion",10,5,240,80,true,40);
        
        newHighway.getNewHighway().enqueue(vehiculo1);
        newHighway.getNewHighway().enqueue(vehiculo2);
        newHighway.getNewHighway().enqueue(vehiculo3);
        
        System.out.println(newHighway.getNewHighway().dequeue().getType_v());
		
	}
    
}
