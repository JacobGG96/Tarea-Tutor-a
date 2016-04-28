package UI;

import Listas.*;
import Logic.Highway;
import XMLParser.XMLReader;
import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 * Clase que pinta las lineas y arcos que representan las rectas
 * y curvas
 * 
 */
public class GeneraMapa extends JPanel{
    private XMLReader _reader;
    private GenericListHw _listaDatos; 
    private GenericList _listaNodosSec;
    
    /**
     * Constructor de la clase GeneraMapa
     */
    public GeneraMapa(){
        _reader = new XMLReader();
        _listaDatos = getListaXML();//_reader.cargarXML();
        _listaNodosSec = new GenericList();
    }
    
    /**
     * Crea una lista para usar de prueba 
     * @return GenericListHw
     */
    public GenericListHw getListaXML(){
        GenericListSec lista = new GenericListSec();
        GenericListSS listass = new GenericListSS();
        GenericListSS listass2 = new GenericListSS();
        GenericListHw carreteras = new GenericListHw();
        
        listass.insertarAlFinal("SubSeccion1", 80, 0, 2, 25);
        listass.insertarAlFinal("SubSeccion2", 90, 1, 3, 25);
        
        listass2.insertarAlFinal("SubSeccion3", 80, 0, 2, 25);
        listass2.insertarAlFinal("SubSeccion4", 90, 1, 3, 25);
        
        lista.insertarAlFinal("Recta", 160, 0, listass, 5, 5, 30, 30, 50);
        lista.insertarAlFinal("Curva", 0, 10, listass2, 6, 6, 31, 31, 50);
        
        carreteras.insertarAlFinal("SJ-Cartago", 1000, 2, lista);
        
        return carreteras;
    }
    
    /**
     * Método que parsea los datos de la estructura de datos
     * que contiene la información del XML.
     */
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
    /**
     * Método que pinta las tramos
     * @param h objeto de la clase Graphics
     */
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