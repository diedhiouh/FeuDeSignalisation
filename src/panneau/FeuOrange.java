package panneau;

public class FeuOrange extends EtatFeu{
	protected  String feu="orange";
	public FeuOrange() {
		// TODO Auto-generated constructor stub\
		super();
	}

	@Override
    public String Niveau() {
	    // TODO Auto-generated method stub
	    return "orange";
    }

	@Override
    public void ChangeNiveau(Panneau p) {
	    // TODO Auto-generated method stub
	    p.setFeu(new FeuRouge());
    }

	

}
