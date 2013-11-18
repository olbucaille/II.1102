package modele;

import controleur.Couple;
import controleur.Partie;

public class Herbe extends Element {
	 
	
	
	public Herbe()
	{
		nom = ".";
		
	}
	
	public void update( Couple Acceleration) {
		Partie.joueur1.Vitesse.setX( Partie.joueur1.Vitesse.getX()+Acceleration.getX());
		Partie.joueur1.Vitesse.setY( Partie.joueur1.Vitesse.getY()+Acceleration.getY());
		if(Partie.joueur1.position.getX()<=1)
			Partie.joueur1.position.setX( Partie.joueur1.position.getX()+Partie.joueur1.Vitesse.getX());
		else
			Partie.joueur1.position.setX( Partie.joueur1.position.getX()-1);
		
		if(Partie.joueur1.position.getY()<=1)
			Partie.joueur1.position.setY( Partie.joueur1.position.getY()+Partie.joueur1.Vitesse.getY());
		else
			Partie.joueur1.position.setY( Partie.joueur1.position.getY()-1);
		
	}

	

}
