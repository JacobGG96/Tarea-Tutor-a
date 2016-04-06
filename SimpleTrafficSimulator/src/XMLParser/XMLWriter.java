package XMLParser;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.Text;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;



public class XMLWriter {
	
	public static void writeXML(){
		try{
			
		Document highway = new Document();
		
		Element theRoot = new Element("Highway");
		highway.setRootElement(theRoot);
		
		Element highway1 = new Element("Highway1");
		Element name = new Element("name");
		Element km = new Element("km");
		Element posX = new Element("posX");
		Element posY = new Element("posY");
		Element curve = new Element("curve");
		Element maxVel = new Element("maxVel");
		
		name.setAttribute("Name_id", "HW_SJ-C");
		name.addContent(new Text("San Jose - Cartago"));
		km.setAttribute("Km", "50");
		km.addContent(new Text("km"));
		posX.setAttribute("PosX", "500");
		posX.addContent(new Text("posY"));
		posY.setAttribute("PosY", "500");
		posY.addContent(new Text("posY"));
		curve.setAttribute("Radio", "50");
		curve.addContent(new Text("curve"));
		maxVel.setAttribute("VelMax", "100Km/h");
		maxVel.addContent(new Text("maxVel"));
		
		highway1.addContent(name);
		highway1.addContent(km);
		highway1.addContent(posX);
		highway1.addContent(posY);
		highway1.addContent(curve);
		highway1.addContent(maxVel);
		
		theRoot.addContent(highway1);
		
		XMLOutputter xmlOutput = new XMLOutputter(Format.getPrettyFormat());
		xmlOutput.output(highway, new FileOutputStream(new File("Prueba1.xml")));
		System.out.println("Hecho");
	}
	 catch(Exception ex){
		 ex.printStackTrace();
	 }
		
	}
}

