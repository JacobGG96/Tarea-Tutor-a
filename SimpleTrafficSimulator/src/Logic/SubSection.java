/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Listas.QueueArray;

/**
 *
 * @author gustavo
 */
public class SubSection {
    
    private String _id;
    private int _maxSpeed;
    private int _incline;
    private int _lanesWay;
    private int _distance;
    private int _freeSpace;

    public SubSection(String pId, int pMaxSpeed, int pIncline, int pLanesWay, int pDistance) {
        
        this._id = pId;
        this._maxSpeed = pMaxSpeed;
        this._incline = pIncline;
        this._lanesWay = pLanesWay;
        this._distance = pDistance;
        this._freeSpace = pDistance;   

        QueueArray<Integer> subsection = new QueueArray(Integer.class, pDistance/5);  

        //for (int i=0;i<((pDistance/5)+1);i++){

          // subsection.enqueue(i);           
        //}
        //subsection.imprimir();
        
        
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

    /**
     * 
     * @return 
     */
    public String getId() {
        return _id;
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
     * @return 
     */
    public int getFreeSpace() {
        return _freeSpace;
    }

    /**
     * 
     * @param pFreeSpace 
     */
    public void setFreeSpace(int pFreeSpace) {
        this._freeSpace = pFreeSpace;
    }
    
}
