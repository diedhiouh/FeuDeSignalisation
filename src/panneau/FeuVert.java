package panneau;

public class FeuVert extends EtatFeu{

	protected  String feu="vert";
	public FeuVert() {
		// TODO Auto-generated constructor stub
		super();
	}

	@Override
    public String Niveau() {
	    // TODO Auto-generated method stub
	    return feu;
    }

	@Override
    public void ChangeNiveau(Panneau p) {
	    // TODO Auto-generated method stub
	    p.setFeu(new FeuOrange());
    }

	

}
