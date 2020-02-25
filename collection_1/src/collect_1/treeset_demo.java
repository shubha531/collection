package collect_1;

import java.util.Iterator;
import java.util.TreeSet;

public class treeset_demo 
{
	public static void main(String[] args) {
		TreeSet<String> ll=new TreeSet<String>();
		ll.add("Anshi");
		ll.add("sanju");
		ll.add("shubhi");
		ll.add("Manshi");
		ll.add("Anshi");
		ll.add("Manshi");
		System.out.println("display information: ");
		System.out.println(ll);
		Iterator it=ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
