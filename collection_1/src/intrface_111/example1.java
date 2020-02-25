package intrface_111;

import java.util.Scanner;

public class example1 {

	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter length: ");
	int l=sc.nextInt();
	System.out.println("Enter breadth: ");
	int b =sc.nextInt();
	demo2 d=new demo2();
	d.setLength(l);
	d.setBreadth(b);
	d.area();
	}

}
