/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebaHerencia;

/**
 *
 * @author gustavo
 */
public class Madre {
    
    private String _identifier;
    private int _distance;
    private int _speedLim;
    private double _incline;
    private int _way;
    private int _lanesWay;

    public Madre(String _identifier, int _distance, int _speedLim, double _incline, int _way, int _lanesWay) {
        this._identifier = _identifier;
        this._distance = _distance;
        this._speedLim = _speedLim;
        this._incline = _incline;
        this._way = _way;
        this._lanesWay = _lanesWay;
    }
    
    

    public String getIdentifier() {
        return _identifier;
    }

    public int getDistance() {
        return _distance;
    }

    public int getSpeedLim() {
        return _speedLim;
    }

    public double getIncline() {
        return _incline;
    }

    public int getWay() {
        return _way;
    }

    public int getLanesWay() {
        return _lanesWay;
    }

    public void setIdentifier(String _identifier) {
        this._identifier = _identifier;
    }

    public void setDistance(int _distance) {
        this._distance = _distance;
    }

    public void setSpeedLim(int _speedLim) {
        this._speedLim = _speedLim;
    }

    public void setIncline(double _incline) {
        this._incline = _incline;
    }

    public void setWay(int _way) {
        this._way = _way;
    }

    public void setLanesWay(int _lanesWay) {
        this._lanesWay = _lanesWay;
    }
    
    
    
}
