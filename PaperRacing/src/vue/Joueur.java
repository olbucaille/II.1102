package vue;

import java.util.Scanner;

import modele.Pilote;

import controleur.Couple;


public class Joueur extends Pilote {

	@Override
	public Couple Update() {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("entrez une acceleration et position entre 1 et 9");
		return GererDecision(sc.nextInt());

	}

	private Couple GererDecision(int decision)
	{
		Couple cp = new Couple();
		switch(decision)
		{
		case 7 : cp.setX(1);
				 cp.setY(1);
				 break;
				 
		case 8 : cp.setX(1);
				 cp.setY(0);
				 break;
				 
		case 9 : cp.setX(-1);
				 cp.setY(1);
				 break;
				 
		case 4 : cp.setX(-1);
				 cp.setY(0);
				 break;
				 
		case 5 : cp.setX(0);
				 cp.setY(0);
				 break;
				 
		case 6 : cp.setX(1);
				 cp.setY(0);
				 break;
				 
		case 1 : cp.setX(-1);
				 cp.setY(-1);
				 break;
				 
		case 2 : cp.setX(-1);
				 cp.setY(0);
				 break;
				 
		case 3 : cp.setX(-1);
				 cp.setY(+1);
				 break;
				 
		default :  cp.setX(0);
				   cp.setY(-1);
				   break;
		}
		return cp;
	}

}
