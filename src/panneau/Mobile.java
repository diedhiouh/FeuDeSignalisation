package panneau;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

//Classe de dessin
public class Mobile extends JPanel{
	
	//Variable couleur feux lumineux
	public int coulx=123;
	public int couly=460;
	public Color colo=Color.GREEN;
	
	public Color getColo() {
		return colo;
	}
	public void setColo(Color colo) {
		this.colo = colo;
	}
	public int getCoulx() {
		return coulx;
	}
	public int getCouly() {
		return couly;
	}
	public void setCoulx(int coulx) {
		this.coulx = coulx;
	}
	public void setCouly(int couly) {
		this.couly = couly;
	}

	//Variable elements route et image
	public int postX=-30;
	public int postY=170;
	
	public int getPostX() {
		return postX;
	}
	public int getPostY() {
		return postY;
	}
	public void setPostX(int postX) {
		this.postX = postX;
	}
	public void setPostY(int postY) {
		this.postY = postY;
	}
	public void paintComponent(Graphics g){
		
//		g.fillRect(600, postX, 80, 100);
		
		//Fonction de tracage de route
		g.setColor(Color.BLACK);
		g.fillRect(-30, 168, 900, 100);
		g.fillRect(600, -30, 80, 700);
		
		//Image du panneau lumineux
		try{
			Image img= ImageIO.read(new File("feux.jpg"));
			g.drawImage(img,10,280,this);
		}catch(IOException e){
			e.printStackTrace();
			System.out.println(e);
		}
		
		//Feu du panneau
		g.setColor(colo);
		g.fillOval(coulx, couly, 70, 70);
	
		g.setColor(Color.white);
		g.fillOval(postX, postY, 50, 50);
		
		//Panneau de Signalisation de la route
		g.setColor(Color.red);
		g.drawOval(580, 150, 15, 15);
		g.setColor(Color.WHITE);
		g.drawLine(600, 170, 600, 200);
		
		
		//Texte d'incation de la commande des feu
		g.setColor(Color.BLACK);
		g.drawString("Changer les feux de signalisation ici ->", 200, 30);
	}
	
	public Mobile() {
		// TODO Auto-generated constructor stub
		JPanel pan=new JPanel();
	}

}
