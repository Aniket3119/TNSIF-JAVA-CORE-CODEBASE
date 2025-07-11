package Com.day7;

//constructor overloading

public class point {
	
	private float x;
	private float y;
	
	
	public void point()
	{
		x=0.0f;
		y=0.0f;
	}


	public Point(float x) {
		this.x = x; 
		this.y = y;
	}


	public void Point(float x, float y) {
		this.x = x;
		this.y = y;
	}


	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
		
	
}