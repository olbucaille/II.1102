 package modele;

import controleur.Couple;

public abstract class Element {

	String nom = "?";





	public abstract void update( Couple Acceleration);

	@Override
	public String toString() {
		return "" + nom ;
	}




}
