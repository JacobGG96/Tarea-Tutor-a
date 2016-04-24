package XMLParser;

import Listas.*;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.jdom2.Document;         // |
import org.jdom2.Element;          // |\ Librerías
import org.jdom2.JDOMException;    // |/ JDOM
import org.jdom2.input.SAXBuilder;

public class XMLReader {
    //Se crea un SAXBuilder para poder parsear el archivo
    SAXBuilder builder = new SAXBuilder();
    File xmlFile = new File( "src/XMLParser/Carreteras.xml" );
    static GenericList listaGeneral = new GenericList();  
    public int tamañolista;
    
    public GenericList<GenericList> cargarXML(){
    
        try{
            //Se crea el documento a traves del archivo
            Document document = (Document) builder.build(xmlFile);
               
            //Se obtiene la raiz 'carreteras'
            Element rootNode = document.getRootElement();

            //Se obtiene la lista de hijos de la raiz 'carreteras'
            tamañolista = rootNode.getChildren( "carretera" ).size();
            
            System.out.println("La cantidad de carreteras es: " + tamañolista + "\n");
            
            //Se recorre la lista de hijos de 'carreteras'
            for ( int i = 0; i < tamañolista; i++ ){
                //Se obtiene el elemento 'carretera'
                Element a = (Element) rootNode.getChildren().get(i);

                //Se obtiene el atributo 'nombre' que esta en el tag 'carretera'
                String nombreCarretera = a.getAttributeValue("nombre");
                String distanciaCarretera = a.getAttributeValue("distancia");
                
                GenericList listaDatos = new GenericList();
                listaDatos.insertarAlFinal(nombreCarretera);
                listaDatos.insertarAlFinal(distanciaCarretera);
                
                listaGeneral.insertarAlFinal(listaDatos);
            }
            
        }

        catch(IOException | JDOMException io ) {
            System.out.println( io.getMessage() );
        }
        
        
        return listaGeneral;
    
    }
}
