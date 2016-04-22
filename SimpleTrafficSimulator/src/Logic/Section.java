/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Listas.*;

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
    private GenericList _subSections;

    public Section(String pId, int pDirection, int pRadius, int pDistance, GenericListSS pSubSections) {
        
        this._id = pId;
        this._direction = pDirection;
        this._radius = pRadius;
        this._distance = pDistance;
        this._freeSpace = pDistance;
        
        this._subSections = generateSubSection(pSubSections);
        
        
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

    private GenericList generateSubSection(GenericListSS pSubSections) {
        
        GenericList<SubSection> ListaSS = new GenericList();
        
        GenericNodeSS actual = pSubSections.getHead();
        
        while (actual!= null){
            
            SubSection subseccion = new SubSection((String)actual.getId(),(Integer)actual.getVelocidad(),(Integer)actual.getInclinacion(),
                    (Integer)actual.getCantcarri(),(Integer)actual.getDistancia());
            
            ListaSS.insertarAlFinal(subseccion);
            actual = actual.getNext();
      
        }
        
        GenericNode nodoimprimir = ListaSS.getHead();
        while (nodoimprimir != null){
            SubSection objeto;
            objeto = (SubSection) nodoimprimir.getDato();
            System.out.println(objeto.getId());
            System.out.println(objeto.getMaxSpeed());
            System.out.println(objeto.getIncline());
            System.out.println(objeto.getLanesWay());
            System.out.println(objeto.getDistance());
            nodoimprimir = nodoimprimir.getNext();
        }
        return ListaSS;
    }        
}
    
    
    

