package Logic;

/**
 * 
 * @author gustavo
 */
public class Signal {
    
    private String Type_sg;
    private int State_sg;

    public Signal() {
 
    }

    public String getType_sg() {
        return Type_sg;
    }

    public int getState_sg() {
        return State_sg;
    }

    public void setType_sg(String type_msg) {
        this.Type_sg = type_msg;
    }

    public void setState_sg(int state_msg) {
        this.State_sg = state_msg;
    }

}
