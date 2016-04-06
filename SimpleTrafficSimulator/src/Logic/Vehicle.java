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
    
    /**
     * 
     */
    public Vehicle(){

    }
    
    /**
     * 
     * @param increase_mv 
     */
    public void SpeedUp_v(int increase_mv){
        
        this._actualSpeed = this._actualSpeed + increase_mv;
    }
    
    /**
     * 
     * @param decrease_mv 
     */
    public void SpeedDown_v(int decrease_mv){
        
        this._actualSpeed = this._actualSpeed - decrease_mv;
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
       
}
