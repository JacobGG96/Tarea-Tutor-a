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
public class Hija extends Madre{
    
    
    private int _direction;

    public Hija(int _direction, String _identifier, int _distance, int _speedLim, double _incline, int _way, int _lanesWay) {
        super(_identifier, _distance, _speedLim, _incline, _way, _lanesWay);
        this._direction = _direction;
    }

    public int getDirection() {
        return _direction;
    }

    public void setDirection(int _direction) {
        this._direction = _direction;
    }
    
}
