
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Vehiculo {
	private static final int width = 5;
	private static final int height = 5;
	private int posX;
	private int posY;
	private Ventana ventana;

	public Vehiculo(int posX, int posY){
		this.posX=posX;
		this.posY=posY;
		this.ventana=ventana;
	}


	public int getPosY() {
		return posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}	
	
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(posX,posY,width,height);
	}
	
}
