package Main;

import Logic.*;
import Listas.*;


public class SimpleTrafficSimulator {

    public static void main(String[] args) {
        QueueArray<Integer> a = new QueueArray(Integer.class, 5);
            
            a.enqueue(1);
            a.enqueue(2);
            a.enqueue(3);
            a.enqueue(4);
            a.enqueue(5);
            
            a.dequeue();
            a.dequeue();
            a.dequeue();
            a.dequeue();
            
            a.enqueue(6);
            a.enqueue(7);
            
           // a.dequeue();
           // a.dequeue();
            //a.dequeue();
            
            a.imprimir();

    }
    
}
