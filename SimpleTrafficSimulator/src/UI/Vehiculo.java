package UI;
import UI.Main;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Vehiculo {
	private static final int width = 30;
	private static final int height = 50;
	private int posX;
	private int posY;
	private Main main;

	public Vehiculo(Main main, int posX, int posY){
		this.main=main;
		this.posX=posX;
		this.posY=posY;
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
	
	public void paint(Graphics2D g) {
		g.fillRect(posX,posY,width,height);
	}
	
	public Rectangle getBounds() {
		return new Rectangle(this.posX,this.posY,width,height);
	}
}
