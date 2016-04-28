package XMLParser;

import Listas.*;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.jdom2.Document;         // |
import org.jdom2.Element;          // |\ Librerías
import org.jdom2.JDOMException;    // |/ JDOM
import org.jdom2.input.SAXBuilder;

@SuppressWarnings({ "rawtypes", "unchecked" })

public class XMLReader {
	
    public int tamañolista;
    public int tamañotramo;
    public int tamañosubtramo;
    GenericListHw Highway1 = new GenericListHw();
	GenericListSS Subsection1 = new GenericListSS();
    GenericListSec section1 = new GenericListSec();
 
	
    //Se crea un SAXBuilder para poder parsear el archivo
    SAXBuilder builder = new SAXBuilder();
    Element a;
    Element b;
    File xmlFile = new File( "src/XMLParser/Carreteras.xml" );  

    
    public GenericListHw<GenericListHw> cargarXML(){
    
        try{
            //Se crea el documento a traves del archivo
            Document document = (Document) builder.build(xmlFile);
               
            //Se obtiene la raiz 'carreteras'
            Element rootNode = document.getRootElement();

            //Se obtiene la lista de hijos de la raiz 'carreteras'
            tamañolista = rootNode.getChildren( "carretera" ).size();
            tamañotramo = ((Element) rootNode.getChildren( "carretera" )).getChildren().size();
            System.out.println("La cantidad de carreteras es: " + tamañolista + "\n");
            
            //Se recorre la lista de hijos de 'carreteras'
            for ( int i = 0; i < tamañolista; i++ ){
                //Se obtiene el elemento 'carretera'
            	a = (Element) rootNode.getChildren().get(i);
                //Se obtiene el atributo 'nombre' que esta en el tag 'carretera'
                String _idhw = a.getAttributeValue("id");
                String _distancia = a.getAttributeValue("distancia");
                String _sentido = a.getAttributeValue("sentido");
                getsectiondata(a);
                Highway1.insertarAlFrente(_idhw, _distancia, _sentido, section1);
               }
            
        }

        catch(IOException | JDOMException io ) {
            System.out.println( io.getMessage() );
        }
        System.out.println(Highway1);
		return Highway1;
        
        
        
    
    }

	private void getsectiondata(Element a) {
		
		for ( int i = 0; i < tamañotramo; i++ ){
            //Se obtiene el elemento 'carretera'
        	b = a.getChildren().get(i); 
        	// TODO Auto-generated method stub
        	String _idsec = ((Element) b.getChildren()).getAttributeValue("id");
        	String _direccion=  ((Element) b.getChildren()).getAttributeValue("direccion");
        	String _radio =  ((Element) b.getChildren()).getAttributeValue("radio");
        	String _posXi = ((Element) b.getChildren()).getAttributeValue("PosXi");
        	String _posYi = ((Element) b.getChildren()).getAttributeValue("PosYi");
        	String _posXf = ((Element) b.getChildren()).getAttributeValue("PosXf");
        	String _posYf = ((Element) b.getChildren()).getAttributeValue("PosYf");
        	String _distancia = ((Element) b.getChildren()).getAttributeValue("Distancia");
        	getsubsectiondata(a);
        	section1.insertarAlFrente(_idsec,_direccion, _radio, Subsection1, _posXi, _posYi, _posXf, _posYf, _distancia);
        
		
			}
	}
	private void getsubsectiondata(Element a) {
		for ( int i = 0; i < tamañotramo; i++ ){
            //Se obtiene el elemento 'carretera'
        	b = a.getChildren().get(i);
        	// TODO Auto-generated method stub
        	String _idss = ((Element) ((Element) b.getChildren()).getChildren()).getAttributeValue("id");
        	String _velocidad =  ((Element) ((Element) b.getChildren()).getChildren()).getAttributeValue("velocidad");
        	String _inclinacion = ((Element) ((Element) b.getChildren()).getChildren()).getAttributeValue("inclinacion");
        	String _cantcarri = ((Element) ((Element) b.getChildren()).getChildren()).getAttributeValue("CantCarri");
        	String _distancia = ((Element) ((Element) b.getChildren()).getChildren()).getAttributeValue("Distancia");
        	Subsection1.insertarAlFrente( _idss, _velocidad, _inclinacion, _cantcarri, _distancia);
		}
	}
}