package panneau;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Panneau extends JFrame{

	//Etat du feu de signalisation	
	public EtatFeu feu;
	
	//Couleur de signalisation
	public  Color couleur=Color.GREEN;
	
	public Color getCouleur() {
		return couleur;
	}
	public void setCouleur(Color couleur) {
		this.couleur = couleur;
	}
	//Niveau de feu de signalisation du panneau
	public int niveau=1;
	
	public int getNiveau() {
		return niveau;
	}
	public void setNiveau(int niveau) {
		this.niveau = niveau;
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
	
	JButton vert=new JButton();
	JButton orange=new JButton();
	JButton rouge=new JButton();
	
	//Construction de fenetre graphique
	public Panneau() {
		// TODO Auto-generated constructor stub
		this.setSize(900,600);
		this.setTitle("Panneau de signalisation ");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setContentPane(mob);
		JPanel pl=new JPanel();
		
		vert.setPreferredSize(new Dimension(50,50));
		
		pl.setLayout(new GridLayout(3,1));
		vert.setBackground(Color.GREEN);
		orange.setBackground(Color.ORANGE);
		rouge.setBackground(Color.RED);
		
		pl.add(rouge);
		pl.add(orange);
		pl.add(vert);
		
		//Ecouteur de boutons
		vert.addActionListener(this::FVert);
		orange.addActionListener(this::FVert);
		rouge.addActionListener(this::FVert);
		
		this.add(pl);
		this.setVisible(true);
		demarre();
	}
	private void FVert(ActionEvent e) {
	    // TODO Auto-generated method stub
		Panneau pan=new Panneau(null);
		
		FeuVert f=new FeuVert();
	   if(e.getSource()==vert){
//		   System.out.println("VERT clique");
		   f.ChangeNiveau(pan);
		   mob.setCoulx(123);
		   mob.setCouly(460);
		   mob.setColo(Color.GREEN);
		   
	   }
	   if(e.getSource()==orange){
//		   System.out.println("orange clique");
		   f.ChangeNiveau(pan);
		   mob.setCoulx(123);
		   mob.setCouly(382);
		   
		   mob.setColo(f.Niveau());
	   }
	   if(e.getSource()==rouge){
//		   System.out.println("rouge clique");
		   f.ChangeNiveau(pan);
		   mob.setCoulx(123);
		   mob.setCouly(306);
		   mob.setColo(Color.RED);
	   }
	   
			
    }
	
	//Fonction d'objet mobile
	public void demarre(){
		
		int X=mob.getPostX();
		int Y=mob.getPostY();
		int a=this.getWidth();
		int b=this.getHeight();
		
		//Point du panneau de la route
		int panne=540;
		for(int i=0;i<a;i++){
	
			if(mob.getColo()==Color.GREEN){
				mob.setPostX(X+=8);
				mob.repaint();
				if(X>=a){
					break;
				}
			}
			if(mob.getColo()==Color.ORANGE && (mob.getPostY()-panne<5)){
				mob.setPostX(X+=3);
				mob.repaint();
				if(X>=a){
					break;
				}
			}
			if(mob.getColo()==Color.RED && (mob.getPostX()-(panne)<5 )){
				mob.setPostX(X+=3);
				mob.repaint();
				if(X>=a){
					break;
				}
			}
			try {
		        Thread.sleep(100);
	        } catch (InterruptedException e) {
		        // TODO Auto-generated catch block
		        e.printStackTrace();
	        }
//		System.out.println(mob.getPostX()+" Y=>"+mob.getPostY());
		}
	
	}

}
