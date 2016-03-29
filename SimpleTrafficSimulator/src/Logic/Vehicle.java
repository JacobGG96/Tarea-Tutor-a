/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author gustavo
 */
public class Vehicle extends Thread{
    
    private String Type_v;
    private int Lenght_v;
    private int Width_v;
    private int MaxSpeed_v;
    private int ActualSpeed_v;
    private boolean InHighway_v;
    private int DamageProbability_v;
    
    /**
     * 
     */
    public Vehicle(){
        
        this.InHighway_v = false;
        this.Lenght_v = 10;
        this.Width_v = 5;
        this.Type_v = "Automovil";

    }
    
    /**
     * 
     * @param increase_mv 
     */
    public void SpeedUp_v(int increase_mv){
        
        this.ActualSpeed_v = this.ActualSpeed_v + increase_mv;
    }
    
    /**
     * 
     * @param decrease_mv 
     */
    public void SpeedDown_v(int decrease_mv){
        
        this.ActualSpeed_v = this.ActualSpeed_v - decrease_mv;
    }
    
    /**
     * 
     */
    public void Crash_v(){
        
        this.ActualSpeed_v = 0;
    }
    
    /**
     * 
     */
    @Override
    public void run(){
        
    }
    
    /**
     * 
     * @return 
     */
    public String getType_v() {
        return Type_v;
    }
    
    /**
     * 
     * @return 
     */
    public int getLenght_v() {
        return Lenght_v;
    }
    
    /**
     * 
     * @return 
     */
    public int getWidth_v() {
        return Width_v;
    }
    
    /**
     * 
     * @return 
     */
    public int getMaxSpeed_v() {
        return MaxSpeed_v;
    }
    
    /**
     * 
     * @return 
     */
    public int getActualSpeed_v() {
        return ActualSpeed_v;
    }
    
    /**
     * 
     * @return 
     */
    public boolean isInHighway_v() {
        return InHighway_v;
    }
    
    /**
     * 
     * @return 
     */
    public int getDamageProbability_v() {
        return DamageProbability_v;
    }
    
    /**
     * 
     * @param type_mv 
     */
    public void setType_v(String type_mv) {
        this.Type_v = type_mv;
    }
    
    /**
     * 
     * @param lenght_mv 
     */
    public void setLenght_v(int lenght_mv) {
        this.Lenght_v = lenght_mv;
    }
    
    /**
     * 
     * @param width_mv 
     */
    public void setWidth_v(int width_mv) {
        this.Width_v = width_mv;
    }
    
    /**
     * 
     * @param maxSpeed_mv 
     */
    public void setMaxSpeed_v(int maxSpeed_mv) {
        this.MaxSpeed_v = maxSpeed_mv;
    }
    
    /**
     * 
     * @param actualSpeed_mv 
     */
    public void setActualSpeed_v(int actualSpeed_mv) {
        this.ActualSpeed_v = actualSpeed_mv;
    }
    
    /**
     * 
     * @param inHighway_mv 
     */
    public void setInHighway_v(boolean inHighway_mv) {
        this.InHighway_v = inHighway_mv;
    }
    
    /**
     * 
     * @param damageProbability_mv 
     */
    public void setDamageProbability_v(int damageProbability_mv) {
        this.DamageProbability_v = damageProbability_mv;
    }
       
}
