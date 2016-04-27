
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Ventana extends JPanel{
	Vehiculo v1 = new Vehiculo(30, 50);
	//Agregar arreglo de vehiculos
	
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.black);
		//Este siguiente es solo para hacer una pruebba
		v1.paint(g2d);
		//Hacer un while para pintar los vehiculos tipo:
		// while lista i != null{
		//		lista i.paint(g2d)
	}
	

	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Simulator");
		Ventana ventana = new Ventana();
		frame.add(ventana);
		frame.setSize(665, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
