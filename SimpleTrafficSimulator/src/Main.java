package vehiculos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import Listas.*;


public class Main extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Vehiculo v1 = new Vehiculo(this, 30, 50);
	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.black);
		v1.paint(g2d);
	}
	
	public static void main(String[] args) {
		/**JFrame frame = new JFrame("Traffic");
		frame.setSize(665, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
            QueueArray<Integer> a = new QueueArray(Integer.class, 5);
            
            a.enqueue(1);
            a.enqueue(2);
            a.enqueue(3);
            a.enqueue(4);
            a.enqueue(5);
            
            a.imprimir();
            


}
}
