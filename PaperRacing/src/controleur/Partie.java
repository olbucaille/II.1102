package controleur;
import java.io.File;

import vue.AffichageConsole;

import modele.Terrain;
import modele.Voiture;



public class Partie {
	public static Voiture joueur1;
	public static Terrain t;
	
	public static void main(String[] args)
	{
		Partie Mc = new Partie();
		Mc.LancerPartie();
		
		
		
	}
	
	public void LancerPartie()
	{
		t = new Terrain(this,new File("C:/Users/olbucaille/Documents/TMIsep/Trackmania-Isep-A1-master/tracks/grid2.txt"));
		
		while(true)
		{
				AffichageConsole.afficherTerrain();
				joueur1.Update();
				
		
		}
	}
	
	
	
}
