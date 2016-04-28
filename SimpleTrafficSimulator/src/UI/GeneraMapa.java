package UI;

import Listas.*;
import XMLParser.XMLReader;
import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

public class GeneraMapa extends JPanel{
    private XMLReader _reader;
    private GenericListHw _listaDatos; 
    private GenericList _listaNodosSec;
    
    
    public GeneraMapa(){
        _reader = new XMLReader();
        _listaDatos = _reader.cargarXML();
        _listaNodosSec = new GenericList();
    }
    
    private void parseaDatos() {
        //GenericList listaNodosSec = new GenericList();
        try {
            while(!_listaDatos.isEmpty()){
                
                GenericNodeHw nodoHw = (GenericNodeHw) _listaDatos.eliminarDelFinal();
                
                while(nodoHw.getTramos().isEmpty()){
                    _listaNodosSec.insertarAlFinal(nodoHw.getTramos().eliminarDelFinal());
                }
            } 
        } catch (Exception ex) {
            Logger.getLogger(GeneraMapa.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    @Override
    public void paintComponent(Graphics h){
        super.paintComponent(h);
        this.setBackground(Color.WHITE);
        parseaDatos();
                
        while(!_listaNodosSec.isEmpty()){
            try {
                GenericNodeSec nodo_actual = (GenericNodeSec) _listaNodosSec.eliminarDelFinal();
                if((int)nodo_actual.getDireccion() != 0 && (int)nodo_actual.getRadio() == 0){
                    Calle a = new Calle((int) nodo_actual.getPosXi(),(int) nodo_actual.getPosYi(),
                    (int) nodo_actual.getPosXf(), (int) nodo_actual.getPosYf());
                    a.paint(h);
                } else{
                    
                }
                
            } catch (Exception ex) {
                Logger.getLogger(GeneraMapa.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }        
                
    }
    
}
