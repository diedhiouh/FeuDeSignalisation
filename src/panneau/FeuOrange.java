package panneau;

public class FeuOrange extends EtatFeu{
	protected final String feu="orange";
	public FeuOrange() {
		// TODO Auto-generated constructor stub\
		super();
	}

	@Override
    public String Niveau() {
	    // TODO Auto-generated method stub
	    return "Orange";
    }

	@Override
    public void ChangeNiveau(Panneau p) {
	    // TODO Auto-generated method stub
	    p.setFeu(new FeuRouge());
	    p.setCouleur("Rouge");
	    p.setNiveau(3);
    }

	

}
