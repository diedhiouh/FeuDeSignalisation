package panneau;

import java.awt.Color;

public class FeuOrange extends EtatFeu{
	
	protected  Color feu=Color.ORANGE;
	public FeuOrange() {
		// TODO Auto-generated constructor stub\
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
	    p.setFeu(new FeuRouge());
	    feu=Color.RED;
	    p.setCouleur(feu);
    }



	

}
