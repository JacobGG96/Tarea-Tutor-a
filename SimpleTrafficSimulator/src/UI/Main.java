package UI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import Listas.*;


public class Main extends JPanel{
	private static final long serialVersionUID = 1L;
	//Vehiculo v1 = new Vehiculo(30, 50);
	//Calle c1= new Calle(50,60,432,333);
	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.black);
	//	v1.paint(g2d);
	//	c1.paint(g2d);
		int cont;
		String name;
		String finaleName;
		cont=0;
		while (listaHw.getNext()!=null){
			tmpHw=listaHw.getHead();
			while (tmpHw.getTramos().getNext!=null){
				finaleName="c"+ Integer.toString(cont);
				tmpSec=tmpHw.getTramos();
				Calle finaleName =new Calle(tmp.getPosXi,tmp.getPosYi,tmp.getPosXf,tmp.getPosYf);
				finaleName.paint(g2d);
				cont++;	
			}
			tmpHw=temHw.getNext();
		}
	}
	
	public static void main(String[] args) {
            JFrame frame = new JFrame("Traffic");
            Main main = new Main();
            frame.add(main);
            frame.setSize(665, 500);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        
        
}
