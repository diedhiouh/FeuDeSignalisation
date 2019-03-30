package panneau;

public class Panneau {

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
	public Panneau() {
		// TODO Auto-generated constructor stub
	}

}
