package Logic;

/**
 * 
 * @author gustavo
 */
public class Curve extends Highway{
    
    private int _radius;

    public Curve(int _radius, String pIdentifier, int pDistance, int pSpeedLim, double pIncline, int pWay, int pLanesWay) {
        super(pIdentifier, pDistance, pSpeedLim, pIncline, pWay, pLanesWay);
        this._radius = _radius;
    }
    
      
    /**
     * 
     * @return 
     */
    public int getRadius_cv() {
        return _radius;
    }

    /**
     * 
     * @param pRadius 
     */
    public void setRadius_cv(int pRadius) {
        this._radius = pRadius;
    }
    
    
}
