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
    File xmlFile = new File( "Carreteras.xml" );
    GenericList lista = new GenericList();  
    
    public void cargarXML(){
    
        try{
            //Se crea el documento a traves del archivo
            Document document = (Document) builder.build(xmlFile);
               
            //Se obtiene la raiz 'tables'
            Element rootNode = document.getRootElement();

            //Se obtiene la lista de hijos de la raiz 'tables'
            int tamañolista = rootNode.getChildren( "carretera" ).size();
            
            System.out.println(tamañolista);
            //Se recorre la lista de hijos de 'tables'
            for ( int i = 0; i < tamañolista; i++ ){
                //Se obtiene el elemento 'tabla'
                Element a = (Element) rootNode.getChildren().get(i);

                //Se obtiene el atributo 'nombre' que esta en el tag 'tabla'
                String nombreCarretera = a.getAttributeValue("nombre");
                
                lista.insertarAlFinal(nombreCarretera);
                
                lista.imprimir();
                
            }
        }

        catch(IOException io ) {
            System.out.println( io.getMessage() );
        }

        catch ( JDOMException jdomex ) {
            System.out.println( jdomex.getMessage() );
        }
    
    }
}
