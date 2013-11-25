import java.util.Scanner;


public class Koch {
	
	public final static float X_MAX= 130;
	public final static float Y_MAX= 130;
	
	public static float size= 0.2f; 
	static int PAUSE = 50;

	
	public static void main (String [] args){

			StdDraw.setXscale(-size, X_MAX + size);
		StdDraw.setYscale(-size, Y_MAX+size);
		
		Superkoch(5);

			
		
	}
	
	
	public static void Superkoch( int detail)
	{
		koch (new Couple(0,90), new Couple(90,90),detail);
		koch (new Couple(45,25),new Couple(0,90),detail);
		koch (new Couple(90,90),new Couple(45,25),detail);
	}

		
	private static void koch(Couple debut,Couple fin, int detail)
	{
					
		if(detail == 0)
			StdDraw.line(debut.x,debut.y, fin.x,fin.y);
		else
		{
		
		 Couple Aa,Bb,Cc;
			 
			Aa = computeAa(debut, fin);
			Bb = computeBb(debut, fin);
			Cc = computeCc(Aa, Bb);
		
			koch(debut, Aa,detail-1);
			koch(Aa, Cc,detail-1);
			koch(Cc, Bb,detail-1);
			koch(Bb, fin,detail-1);
		}
		
			
		
	}
	
	private static Couple computeAa(Couple debut, Couple fin)
	{
		return new Couple(debut.x+(fin.x-debut.x)/3, debut.y+(fin.y-debut.y)/3);	
	}


	
	private static Couple computeBb(Couple debut, Couple fin)
	{
		return new Couple(debut.x+2*(fin.x-debut.x)/3, debut.y+2*(fin.y-debut.y)/3);	
	}

  private static Couple computeCc(Couple Aa, Couple Bb)
	

  {
	  double x = ((Aa.x+Bb.x)*Math.cos(Math.toRadians(60)))-((Bb.y-Aa.y)*Math.sin(Math.toRadians(60)));
	  double y = ((Aa.y+Bb.y)*Math.cos(Math.toRadians(60)))+((Bb.x-Aa.x)*Math.sin(Math.toRadians(60)));		 
	  return new Couple(x,y);	
	}




	
	


		
		
		
	}


