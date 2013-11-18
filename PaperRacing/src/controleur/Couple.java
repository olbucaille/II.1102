package controleur;

public class Couple {
	int x;
	int y;
	
	public Couple(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	

	public Couple()
	{
		x=0;
		y=0;
	}
	
	public void setToZero()
	{
		x = 0;
		y=0;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	

}
