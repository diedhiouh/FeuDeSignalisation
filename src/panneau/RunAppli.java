package panneau;


public class RunAppli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Panneau pan=new Panneau();
		FeuVert f=new FeuVert();
		FeuOrange o=new FeuOrange();
		
		System.out.println(pan.getCouleur());
		
		f.ChangeNiveau(pan);
		System.out.println(pan.getCouleur());
		
		System.out.println(pan.getCouleur());
		o.ChangeNiveau(pan);
		System.out.println(pan.getCouleur());
		
//		System.out.println(o.Niveau());
		
		
		
//		System.out.println(o.Niveau());
		
	}

}
