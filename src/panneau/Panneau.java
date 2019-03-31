package panneau;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Panneau extends JFrame{

	//Etat du feu de signalisation
	
	public EtatFeu feu;
	public  String couleur="Vert";
	public int niveau=1;
	
	public int getNiveau() {
		return niveau;
	}
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public Panneau(EtatFeu feu) {
	    super();
	    this.feu = feu;
    }
	public EtatFeu getFeu() {
		return feu;
	}
	public void setFeu(EtatFeu feu) {
		this.feu = feu;
	}
	JPanel pan =new JPanel();
	Mobile mob=new Mobile();
	public Panneau() {
		// TODO Auto-generated constructor stub
		this.setSize(900,600);
		this.setTitle("Panneau de signalisation ");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		this.setContentPane(mob);
		this.setVisible(true);
		 demarre();
	}
	public void demarre(){
		int X=mob.getPostX();
		int Y=mob.getPostY();
		int a=this.getWidth();
		int b=this.getHeight();
		for(int i=0;i<a;i++){
//			X+=10;
			mob.setPostX(++X);
			mob.repaint();
			try {
		        Thread.sleep(1);
	        } catch (InterruptedException e) {
		        // TODO Auto-generated catch block
		        e.printStackTrace();
	        }
		System.out.println("Boucle");
		}
	}

}
