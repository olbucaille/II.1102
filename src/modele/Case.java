package modele;

public class Case {
	
	Element elt;
	
	public Case()
	{
	
		elt = new Route();
	}
	public void affecter(char val)
	{
		if(val == ' ')
			elt = new Route();
		if(val == '.')
			elt = new Herbe();
		if(val == 'x')
			elt = new Obstacle();
		if(val == 'S')
			elt = new Route();
		
		
	}

	@Override
	public String toString() {
		return ""+elt.nom;
	}
	
	

}
