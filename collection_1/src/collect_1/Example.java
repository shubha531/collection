package collect_1;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter the radius: ");
	double r=sc.nextDouble();
	demo1 obj=new demo1();
	obj.setRadius(r);
	obj.area();
	
	}

}
