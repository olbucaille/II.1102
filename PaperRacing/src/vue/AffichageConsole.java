package vue;

import modele.Terrain;
import controleur.Couple;
import controleur.Partie;

public class AffichageConsole {
	
	public static void afficherTerrain()
	{
		for(int i=0;i<Terrain.HAUTEUR_TERRAIN;i++)
		{
			for(int j=0;j<Terrain.LARGEUR_TERRAIN;j++)
			{
				
				
				if(Partie.joueur1.getPosition().getX() == i && Partie.joueur1.getPosition().getY() == j )
					System.out.print("V");
				else
					System.out.print(Partie.t.getCase(new Couple(i,j)).toString());
				
				
			}
			System.out.print("\n");
		}
	}
	

}
