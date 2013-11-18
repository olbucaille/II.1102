package modele;

import javax.swing.text.Position;

import controleur.Couple;
import controleur.Partie;

public class Route extends Element {
	public Route ()
	{
		nom = " ";
		
	}

	@Override
	public void update( Couple Acceleration) {
		Partie.joueur1.Vitesse.setX( Partie.joueur1.Vitesse.getX()+Acceleration.getX());
		Partie.joueur1.Vitesse.setY( Partie.joueur1.Vitesse.getY()+Acceleration.getY());

		Partie.joueur1.position.setX( Partie.joueur1.position.getX()+Partie.joueur1.Vitesse.getX());
		Partie.joueur1.position.setY( Partie.joueur1.position.getY()+Partie.joueur1.Vitesse.getY());
		
		
	}
	
	

}
