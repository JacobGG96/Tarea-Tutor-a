package Logic;

/**
 *
 * @author gustavo
 */
public class Highway {
    
    private int _identifier;
    private int _distance;
    private int _speedLim;
    private int _incline;
    private int _way;
    private int _lanesWay;
    
    /**
     * 
     * @return 
     */
    public int getIdentifier_hw() {
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
     * @return 
     */
    public int getSpeedLim_hw() {
        return _speedLim;
    }
    
    /**
     * 
     * @return 
     */
    public int getIncline_hw() {
        return _incline;
    }
    
    /**
     * 
     * @return 
     */
    public int getWay_hw() {
        return _way;
    }

    public int getLanesWay_hw() {
        return _lanesWay;
    }
    
    /**
     * 
     * @param pIdentifier 
     */
    public void setIdentifier_hw(int pIdentifier) {
        this._identifier = pIdentifier;
    }
    
    /**
     * 
     * @param pDistance 
     */
    public void setDistance_hw(int pDistance) {
        this._distance = pDistance;
    }
    
    /**
     * 
     * @param pSpeedLim 
     */
    public void setSpeedLim_hw(int pSpeedLim) {
        this._speedLim = pSpeedLim;
    }
    
    /**
     * 
     * @param pIncline 
     */
    public void setIncline_hw(int pIncline) {
        this._incline = pIncline;
    }
    
    /**
     * 
     * @param pWay 
     */
    public void setWay_hw(int pWay) {
        this._way = pWay;
    }
    
    /**
     * 
     * @param pLanesWay 
     */
    public void setLanesWay_hw(int pLanesWay) {
        this._lanesWay = pLanesWay;
    }
    
    
}
