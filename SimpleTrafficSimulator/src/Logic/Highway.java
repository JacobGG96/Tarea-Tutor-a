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
public class Highway {
    
    private int Identifier_hw;
    private int Distance_hw;
    private int SpeedLim_hw;
    private int Incline_hw;
    private int Way_hw;
    private int LanesWay_hw;
    
    public Highway(){
        
    }

    public int getIdentifier_hw() {
        return Identifier_hw;
    }

    public int getDistance_hw() {
        return Distance_hw;
    }

    public int getSpeedLim_hw() {
        return SpeedLim_hw;
    }

    public int getIncline_hw() {
        return Incline_hw;
    }

    public int getWay_hw() {
        return Way_hw;
    }

    public int getLanesWay_hw() {
        return LanesWay_hw;
    }

    public void setIdentifier_hw(int identifier_mhw) {
        this.Identifier_hw = identifier_mhw;
    }

    public void setDistance_hw(int distance_mhw) {
        this.Distance_hw = distance_mhw;
    }

    public void setSpeedLim_hw(int speedLim_mhw) {
        this.SpeedLim_hw = speedLim_mhw;
    }

    public void setIncline_hw(int incline_mhw) {
        this.Incline_hw = incline_mhw;
    }

    public void setWay_hw(int way_mhw) {
        this.Way_hw = way_mhw;
    }

    public void setLanesWay_hw(int lanesWay_mhw) {
        this.LanesWay_hw = lanesWay_mhw;
    }
    
    
}
