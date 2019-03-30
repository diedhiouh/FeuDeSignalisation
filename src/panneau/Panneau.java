package panneau;

public class Panneau {

	//Etat du feu de signalisation
	
	public EtatFeu feu;
	public int getNiveau() {
		return niveau;
	}
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	public int niveau;
	
	public Panneau(EtatFeu feu) {
	    super();
	    this.feu = new FeuVert();
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
