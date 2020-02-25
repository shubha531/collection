package collect_1;

import java.util.*;

public class Demo_8 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	for(int i=1;i<=3;i++)
	{
		try
		{
		System.out.println("Enter first and second value");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a/b;
		System.out.println("Result: "+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(InputMismatchException e)
		
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("program continue..");
		}
	}

	}

}
