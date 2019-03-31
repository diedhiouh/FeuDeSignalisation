package panneau;

import java.awt.Graphics;

import javax.swing.JPanel;

//Classe de dessin
public class Mobile extends JPanel{
	
	public int postX=-30;
	public int postY=160;
	
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
		g.fillRect(postX, postY, 50, 100);
		g.fillRect(600, postX, 80, 100);
		//g.fillOval(postX, postY, 50, 60);
		System.out.println("Mobile");
	}
	public Mobile() {
		// TODO Auto-generated constructor stub
		JPanel pan=new JPanel();
	}

}
