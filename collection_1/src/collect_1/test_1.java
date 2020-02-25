package collect_1;

import java.util.Scanner;

public class test_1 {

	public static void main(String[] args) throws Exception 
	{
		try 
		{
			Scanner sc=new Scanner(System.in);
		System.out.println("enter the marks: "); 
		int m=sc.nextInt();
		if(m==100)
		{
			throw new ShubhiException();
		}
		else if(m>=40)
		{
		System.out.println("pass");	
		}
		else 
		{
			System.out.println("fail.");
		}

	     }
		catch(ArithmeticException e)
		{
			System.out.println("exception case.");
		}

}
}
