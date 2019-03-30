package panneau;

public class FeuRouge extends EtatFeu{

	public FeuRouge() {
		// TODO Auto-generated constructor stub
	}

	@Override
    public String Niveau() {
	    // TODO Auto-generated method stub
	    return null;
    }

	@Override
    public void ChangeNiveau(Panneau p) {
	    // TODO Auto-generated method stub
	    p.setFeu(new FeuVert());
    }

}
