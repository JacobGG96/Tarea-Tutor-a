package Logic;


/**
 *
 * @author gustavo
 */
public class Highway {
    
    private String _identifier;
    private int _distance;
    private int _ways;

    public Highway() {
        
        
    }
 
    /** 
     * 
     * @return 
     */
    public String getIdentifier() {
        return _identifier;
    }
    
    /**
     * 
     * @return 
     */
    public int getDistance() {
        return _distance;
    }
    
    
    /**
     * 
     * @param pIdentifier 
     */
    public void setIdentifier(String pIdentifier) {
        this._identifier = pIdentifier;
    }
    
    /**
     * 
     * @param pDistance 
     */
    public void setDistance(int pDistance) {
        this._distance = pDistance;
    }

    /**
     * 
     * @return 
     */
    public int getWays() {
        return _ways;
    }

    /**
     * 
     * @param pWays 
     */
    public void setWays(int pWays) {
        this._ways = pWays;
    }
    
    

    
    
}
