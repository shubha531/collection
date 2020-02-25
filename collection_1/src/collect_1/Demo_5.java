package collect_1;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo_5
{


	public static void main(String[] args) 
	{
	ArrayList<employee> al=new ArrayList<employee>(); 
	employee obj=new employee();
	employee obj1=new employee();
	obj.setEmp_id(101);
	obj.setEmp_name("shubhanshi");
	obj1.setEmp_id(202);
	obj1.setEmp_name("Sanjana");
	al.add(obj);
	al.add(obj1);
	System.out.println("display employee informations");
	Iterator it=al.iterator();
	while(it.hasNext())
	{
			employee e=(employee)it.next();
			System.out.println(e.getEmp_id());
			System.out.println(e.getEmp_name());
		}

	}
	}
