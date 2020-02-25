package collect_1;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo_3 {

	public static void main(String[] args) 
	{
	ArrayList<Student> al=new ArrayList<Student>(); 
	Student obj=new Student();
	obj.setRoll(101);
	obj.setName("ravi");
	Student obj1=new Student();
	obj1.setRoll(102);
	obj1.setName("ajay");
	al.add(obj);
	al.add(obj1);
	System.out.println("display student informations");
	Iterator it=al.iterator();
	while(it.hasNext())
	{
			Student s=(Student)it.next();
			System.out.println(s.getRoll());
			System.out.println(s.getName());
		}

	}
	}


