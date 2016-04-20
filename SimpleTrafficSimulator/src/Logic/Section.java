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
    
    private String _id;
    private int _direction;
    private int _radius;
    private int _distance;
    private int _freeSpace;

    public Section() {
    }

    /**
     * 
     * @return 
     */
    public String getId() {
        return _id;
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
     * @param pId 
     */
    public void setId(String pId) {
        this._id = pId;
    }

    /**
     * 
     * @param pDirection 
     */
    public void setDirection(int pDirection) {
        this._direction = pDirection;
    }

    /**
     * 
     * @param pRadius 
     */
    public void setRadius(int pRadius) {
        this._radius = pRadius;
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

    public int getFreeSpace() {
        return _freeSpace;
    }

    public void setFreeSpace(int pFreeSpace) {
        this._freeSpace = pFreeSpace;
    }
    
    
    
}
