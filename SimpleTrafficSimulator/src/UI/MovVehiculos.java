package UI;

import Listas.QueueArray;

@SuppressWarnings({ "rawtypes", "unchecked","unused"})
public class MovVehiculos {
    
    
    int sub_hip = 0;
    
    private QueueArray nueva_pos(int pActualx, int pActualy, int pNuevox, int pNuevoy,
            int pVelactual){
        double cateto1 = Math.abs(pNuevox - pActualx);
        double cateto2 = Math.abs(pNuevoy - pActualy);
        double distancia_hip = Math.sqrt(Math.pow(cateto2, 2) + Math.pow(cateto1, 2));
        double angulo = Math.toDegrees(Math.atan(cateto2 / cateto1)); 
        sub_hip += convertTo(pVelactual);
        QueueArray nueva_posicion = new QueueArray(Integer.class, 2);
        
        nueva_posicion.enqueue(calc_catetox(sub_hip, angulo));
        nueva_posicion.enqueue(calc_catetoy(sub_hip, angulo));
        
        return nueva_posicion;
    }
    
    private int convertTo(int velocidad){
        return (velocidad * (1 / 300) * 2);        
    }
    
    private double calc_catetox(int hipotenusa, double angulo){
        return (hipotenusa * Math.cos(Math.toRadians(angulo)));
    }
    
    private double calc_catetoy(int hipotenusa, double angulo){
        return (hipotenusa * Math.sin(Math.toRadians(angulo)));
    }
    
}
