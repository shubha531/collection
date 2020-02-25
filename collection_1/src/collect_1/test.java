package collect_1;

public class test
{
private int first;
private int second;
public void setValue(int x,int y)
{
	first=x;
	second=y;
	
}
public int result()
{
	return first/second;
	
}
public void display()
{
	System.out.println("Reult: "+result());
}
}