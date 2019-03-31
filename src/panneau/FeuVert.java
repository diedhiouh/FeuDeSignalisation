package panneau;

import java.awt.Color;

public class FeuVert extends EtatFeu{
	
	
	protected  Color feu=Color.GREEN;
	public FeuVert() {
		// TODO Auto-generated constructor stub
		super();
	}

	
	@Override
    public Color Niveau() {
	    // TODO Auto-generated method stub
	    return feu;
    }


	@Override
    public void ChangeNiveau(Panneau p) {
	    // TODO Auto-generated method stub
	    p.setFeu(new FeuOrange());
	    p.setNiveau(2);
	    feu=Color.ORANGE;
	    p.setCouleur(feu);
    }



	

}
