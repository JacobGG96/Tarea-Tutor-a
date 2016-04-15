package Logic;

/**
 *
 * @author gustavo
 */
public class Vehicle extends Thread{
    
    private String _type;
    private int _lenght;
    private int _width;
    private int _maxSpeed;
    private int _actualSpeed;
    private boolean _inHighway;
    private int _damageProbability;
    private int _remainDistance;
    private int _delay;
    

    public Vehicle(String pType, int pLenght, int pWidth, int pMaxSpeed, int pActualSpeed, boolean pInHighway, int pDamageProbability) {
        this._type = pType;
        this._lenght = pLenght;
        this._width = pWidth;
        this._maxSpeed = pMaxSpeed;
        this._actualSpeed = pActualSpeed;
        this._inHighway = pInHighway;
        this._damageProbability = pDamageProbability;
    }
    
    /**
     * 
     */
    
        
    /**
     * 
     * @param increase_mv 
     */
    public void SpeedUp_v(int pIncrease){
        
        this._actualSpeed = this._actualSpeed + pIncrease;
    }
    
    /**
     * 
     * @param decrease_mv 
     */
    public void SpeedDown_v(int pDecrease){
        
        this._actualSpeed = this._actualSpeed - pDecrease;
    }
    
    /**
     * 
     */
    public void Crash_v(){
        
        this._actualSpeed = 0;
    }
    
    /**
     * 
     */
    @Override
    public void run(){      
        while (this._inHighway == true){
            this.setDelay(_delay);
            
        }
    }
    
    /**
     * 
     * @return 
     */
    public String getType_v() {
        return _type;
    }
    
    /**
     * 
     * @return 
     */
    public int getLenght_v() {
        return _lenght;
    }
    
    /**
     * 
     * @return 
     */
    public int getWidth_v() {
        return _width;
    }
    
    /**
     * 
     * @return 
     */
    public int getMaxSpeed_v() {
        return _maxSpeed;
    }
    
    /**
     * 
     * @return 
     */
    public int getActualSpeed_v() {
        return _actualSpeed;
    }
    
    /**
     * 
     * @return 
     */
    public boolean isInHighway_v() {
        return _inHighway;
    }
    
    /**
     * 
     * @return 
     */
    public int getDamageProbability_v() {
        return _damageProbability;
    }
    
    /**
     * 
     * @param pType 
     */
    public void setType_v(String pType) {
        this._type = pType;
    }
    
    /**
     * 
     * @param pLenght 
     */
    public void setLenght_v(int pLenght) {
        this._lenght = pLenght;
    }
    
    /**
     * 
     * @param pWidth 
     */
    public void setWidth_v(int pWidth) {
        this._width = pWidth;
    }
    
    /**
     * 
     * @param pMaxSpeed 
     */
    public void setMaxSpeed_v(int pMaxSpeed) {
        this._maxSpeed = pMaxSpeed;
    }
    
    /**
     * 
     * @param pActualSpeed 
     */
    public void setActualSpeed_v(int pActualSpeed) {
        this._actualSpeed = pActualSpeed;
    }
    
    /**
     * 
     * @param pInHighway 
     */
    public void setInHighway_v(boolean pInHighway) {
        this._inHighway = pInHighway;
    }
    
    /**
     * 
     * @param pDamageProbability 
     */
    public void setDamageProbability_v(int pDamageProbability) {
        this._damageProbability = pDamageProbability;
    }
    
    /**
     * 
     * @return 
     */
    public int getRemainDistance() {
        return _remainDistance;
    }
    
    /**
     * 
     * @return 
     */
    public int getDelay() {
        return _delay;
    }
    
    /**
     * 
     * @param pRemainDistance 
     */
    public void setRemainDistance(int pRemainDistance) {
        this._remainDistance = pRemainDistance;
    }
    
    /**
     * 
     * @param pDelay 
     */
    public void setDelay(int pDelay) {
        this._delay = pDelay;
    }
    
    
       
}
