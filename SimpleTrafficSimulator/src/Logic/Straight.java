package Logic;

/**
 *
 * @author gustavo
 */
public class Straight {
    
    private int _direction;

    public Straight(int _direction, String pIdentifier, int pDistance, int pSpeedLim, double pIncline, int pWay, int pLanesWay) {
        super(pIdentifier, pDistance, pSpeedLim, pIncline, pWay, pLanesWay);
        this._direction = _direction;
    }


    /**
     * 
     * @return 
     */
    public int getDirection_st() {
        return _direction;
    }
    
    /**
     * 
     * @param pDirection 
     */
    public void setDirection_st(int pDirection) {
        this._direction = pDirection;
    }
    
    
    
    
}
