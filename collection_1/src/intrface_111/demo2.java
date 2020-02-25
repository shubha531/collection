package intrface_111;

public class demo2 implements Rectangle
{
private int length,breadth;
public int getLength() {
	return length;
}
public void setLength(int length) {
	this.length = length;
}
public int getBreadth() {
	return breadth;
}
public void setBreadth(int breadth) {
	this.breadth = breadth;
}
{

}
@Override
public void area() {
	// TODO Auto-generated method stub
	double a=breadth*length;
	System.out.println("Area of rectangle: "+a);
}
}