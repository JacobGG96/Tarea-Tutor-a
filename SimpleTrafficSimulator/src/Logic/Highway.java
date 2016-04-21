package Logic;

import Listas.*;

/**
 *
 * @author gustavo
 */
public class Highway {
    
    private String _identifier;
    private int _distance;
    private int _ways;
    private GenericList _sections;

    public Highway(String pId, int pDistance, int pWays, GenericListSec pSections) {
        
        this._identifier = pId;
        this._distance = pDistance;
        this._ways = pWays;  
                          
        this._sections = generateSectionsList(pSections);
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
    public int getDistance() {
        return _distance;
    }
    
    
    /**
     * 
     * @param pIdentifier 
     */
    public void setIdentifier(String pIdentifier) {
        this._identifier = pIdentifier;
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
    public int getWays() {
        return _ways;
    }

    /**
     * 
     * @param pWays 
     */
    public void setWays(int pWays) {
        this._ways = pWays;
    }

    /**
     * 
     * @return 
     */
    public GenericList getSections() {
        return _sections;
    }

    /**
     * 
     * @param _sections 
     */
    private GenericList generateSectionsList(GenericListSec pSections) {
        
        GenericList<Section> ListaSec = new GenericList();
        
        GenericNodeSec actual = pSections.getHead();
        
        while (actual!= null){
            
            Section seccion = new Section(actual.get_id(),actual.get_direccion(),actual.get_radio(),actual.get_subtramos());
            ListaSec.insertarAlFinal(seccion);
            actual = actual.getNext();
      
        }
        
        GenericNode nodoimprimir = ListaSec.getHead();
        while (nodoimprimir != null){
            Section objeto;
            objeto = (Section) nodoimprimir.getDato();
            System.out.println(objeto.getId());
            System.out.println(objeto.getDistance());
            System.out.println(objeto.getDirection());
            System.out.println(objeto.getRadius());
            nodoimprimir = nodoimprimir.getNext();
        }
        return ListaSec;
    }
    
    

    
    
}
