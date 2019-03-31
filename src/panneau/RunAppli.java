package panneau;


public class RunAppli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Panneau pan=new Panneau();
		FeuVert f=new FeuVert();
		FeuOrange o=new FeuOrange();
		
		System.out.println(pan.couleur);
		
		f.ChangeNiveau(pan);
		System.out.println(pan.couleur);
		
		System.out.println(pan.couleur);
		o.ChangeNiveau(pan);
		System.out.println(pan.couleur);
		
//		System.out.println(o.Niveau());
		
		
		
//		System.out.println(o.Niveau());
		
	}

}
