package collect_1;

public class demo1 implements capable
{
private double radius;
public double getRadius() 
{
	return radius;
}
	public void area()//annotation it represent whole file here we represent class it is a collection 
	                 //of meta data
	{
		
		double area=PI*radius*radius;
		System.out.println("area: "+area);
		
	}
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
}
