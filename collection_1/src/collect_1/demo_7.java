package collect_1;

import java.util.Iterator;
import java.util.LinkedList;

public class demo_7 
{

	public static void main(String[] args) 
	{
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("sanju");
		ll.add("shubhi");
		ll.add("manshi");
		System.out.println("display information: ");
		Iterator it=ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
