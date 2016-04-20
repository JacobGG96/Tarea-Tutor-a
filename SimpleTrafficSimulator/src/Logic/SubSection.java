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
public class SubSection {
    
    public int _maxSpeed;
    public int _incline;
    public int _lanesWay;
    private int _distance;

    public SubSection() {
    }

    /**
     * 
     * @return 
     */
    public int getMaxSpeed() {
        return _maxSpeed;
    }

    /**
     * 
     * @return 
     */
    public int getIncline() {
        return _incline;
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
     * @param pMaxSpeed 
     */
    public void setMaxSpeed(int pMaxSpeed) {
        this._maxSpeed = pMaxSpeed;
    }

    /**
     * 
     * @param pIncline 
     */
    public void setIncline(int pIncline) {
        this._incline = pIncline;
    }

    /**
     * 
     * @param pLanesWay 
     */
    public void setLanesWay(int pLanesWay) {
        this._lanesWay = pLanesWay;
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
     * @param pDistance 
     */
    public void setDistance(int pDistance) {
        this._distance = pDistance;
    }
    
    
    
}
