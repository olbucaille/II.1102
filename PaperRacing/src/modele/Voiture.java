package modele;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import vue.Joueur;


import com.sun.accessibility.internal.resources.accessibility;

import controleur.*;


public class Voiture {
	
	Couple position;
	Couple Acceleration;
	Couple Vitesse;
	Pilote pilote;	
	
	
	public Voiture(Couple pos)
	{
		position = pos;
		pilote = new Joueur();		
		Acceleration   = new Couple();
		Vitesse = new Couple();
	}
	
	public void Update()
	{
		
		Couple cp = pilote.Update();
		Update(cp);
	
	
		
	}
	
	private void Update(Couple Acceleration)
	{
		Partie.t.getCase(position).elt.update(Acceleration);
	}

		public Couple getPosition()
	{
		return position;
	}
	

}
