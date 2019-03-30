package panneau;


public class RunAppli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Panneau pan=new Panneau();
		FeuVert f=new FeuVert();
		f.ChangeNiveau(pan);
		System.out.println(f.Niveau());
		
		//Win fenetre=new Win();
	}

}
