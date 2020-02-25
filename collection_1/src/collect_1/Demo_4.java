package collect_1;

import java.util.ArrayList;

public class Demo_4 {

	public static void main(String[] args)
	{
		ArrayList<Student> al=new ArrayList<Student>(); 
		Student abhijeet=new Student();
		Student abhishekh=new Student();
		abhijeet.setRoll(101);
		abhishekh.setName("abhijeet verma");
	
		abhijeet.setRoll(102);
		abhishekh.setName("ajay verma");
		al.add(abhijeet);
		al.add(abhishekh);

	}

}
