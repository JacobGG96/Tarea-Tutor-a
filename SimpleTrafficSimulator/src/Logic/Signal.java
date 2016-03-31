package Logic;

/**
 * 
 * @author gustavo
 */
public class Signal {
    
    private String _type;
    private int _state;

    public Signal() {
 
    }
    
    /**
     * 
     * @return 
     */
    public String getType_sg() {
        return _type;
    }
    
    /**
     * 
     * @return 
     */
    public int getState_sg() {
        return _state;
    }
    
    /**
     * 
     * @param pType 
     */
    public void setType_sg(String pType) {
        this._type = pType;
    }

    /**
     * 
     * @param pState 
     */
    public void setState_sg(int pState) {
        this._state = pState;
    }

}
