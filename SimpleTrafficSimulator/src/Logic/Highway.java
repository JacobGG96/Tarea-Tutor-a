package Logic;

import Listas.QueueArray;

/**
 *
 * @author gustavo
 */
public class Highway {
    
    private String _identifier;
    private int _distance;

    private QueueArray<Vehicle> newHighway;

    public Highway(String pIdentifier, int pDistance, int pStraights, int pCurves) {
        this._identifier = pIdentifier;
        this._distance = pDistance;
        this.newHighway = new QueueArray(Vehicle.class ,pStraights+pCurves);
        
    }

    /**
     * 
     * @return 
     */
    public QueueArray<Vehicle> getNewHighway() {
        return newHighway;
    }
   
    
    /** 
     * 
     * @return 
     */
    public String getIdentifier_hw() {
        return _identifier;
    }
    
    /**
     * 
     * @return 
     */
    public int getDistance_hw() {
        return _distance;
    }
    
    
    /**
     * 
     * @param pIdentifier 
     */
    public void setIdentifier_hw(String pIdentifier) {
        this._identifier = pIdentifier;
    }
    
    /**
     * 
     * @param pDistance 
     */
    public void setDistance_hw(int pDistance) {
        this._distance = pDistance;
    }
    

    
    
}
