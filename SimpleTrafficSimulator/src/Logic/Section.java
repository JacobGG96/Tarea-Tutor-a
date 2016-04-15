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
public class Section {
    
    private final String _identifier;
    private final int _sectionPosition;
    private final int _distance;
    private int _direction;
    private int _radius;
    private final int _speedLim;
    private final double _incline;
    private final int _way;
    private final int _lanesWay;

    public Section(String pIdentifier, int pSectionPosition,int pDistance, int pDirection, int pRadius, int pSpeedLim, double pIncline, int pWay, int pLanesWay) {
        this._identifier = pIdentifier;
        this._sectionPosition = pSectionPosition;
        this._distance = pDistance;
        this._speedLim = pSpeedLim;
        this._incline = pIncline;
        this._way = pWay;
        this._lanesWay = pLanesWay;
        this.createSubSection(pDirection, pRadius);
    }
    
    /**
     * 
     * @param pDirection
     * @param pRadius 
     */
    private void createSubSection(int pDirection, int pRadius){
        if (){
            this._direction = pDirection;
            
        }
        else{
            this._radius = pRadius;
        }
        
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
    public int getSectionPosition() {
        return _sectionPosition;
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
     * @return 
     */
    public int getDirection() {
        return _direction;
    }

    /**
     * 
     * @return 
     */
    public int getRadius() {
        return _radius;
    }

    /**
     * 
     * @return 
     */
    public int getSpeedLim() {
        return _speedLim;
    }

    /**
     * 
     * @return 
     */
    public double getIncline() {
        return _incline;
    }

    /**
     * 
     * @return 
     */
    public int getWay() {
        return _way;
    }

    /**
     * 
     * @return 
     */
    public int getLanesWay() {
        return _lanesWay;
    }

    /**
     * 
     * @param _direction 
     */
    public void setDirection(int _direction) {
        this._direction = _direction;
    }

    /**
     * 
     * @param _radius 
     */
    public void setRadius(int _radius) {
        this._radius = _radius;
    }
        
}
