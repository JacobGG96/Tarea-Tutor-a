package DataStructures;


public class RealStructure implements IStructure{

    @Override
    public GenericList getStructure() {
        return new GenericList();        
    }

    @Override
    public void insertElement(String element) {
        getStructure().insertarAlFinal(element);
        
    }

    @Override
    public String deleteElement() {
        getStructure
    }
    
}
