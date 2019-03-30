package panneau;

public class FeuRouge extends EtatFeu{

	protected  String feu="Rouge";
	public FeuRouge() {
		// TODO Auto-generated constructor stub
	}

	@Override
    public String Niveau() {
	    // TODO Auto-generated method stub
	    return "Rouge";
    }

	@Override
    public void ChangeNiveau(Panneau p) {
	    // TODO Auto-generated method stub
	    p.setFeu(new FeuVert());
	    p.setCouleur("Vert");
	    p.setNiveau(1);
    }

}
