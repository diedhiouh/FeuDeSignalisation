package panneau;

import java.awt.Color;

public class FeuRouge extends EtatFeu{

	protected  Color feu=Color.RED;
	public FeuRouge() {
		// TODO Auto-generated constructor stub
	}
	@Override
	    public Color Niveau() {
	 // TODO Auto-generated method stub
		    return feu;
	    }

	@Override
    public void ChangeNiveau(Panneau p) {
	    // TODO Auto-generated method stub
	    p.setFeu(new FeuVert());
	    feu=Color.GREEN;
	    p.setCouleur(feu);
    }


	

}
