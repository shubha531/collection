package collect_1;

import java.util.HashMap;
import java.util.Iterator;

public class map_demo
{

	public static void main(String[] args)
	{
		HashMap<String,String> hm=new HashMap<String, String>();
		hm.put("a1","kannauj");
		hm.put("a2","Mathura");	
		hm.put("a3","Agra");
		hm.put("a4","Kanpur");	
		hm.put("a5","Lucknow");
		hm.put("a6","Delhi");
		System.out.println("city details: ");
		
		Iterator<String> it=hm.keySet().iterator();
		while(it.hasNext())
		{
			String key=it.next();
			System.out.println("-----------------");
			System.out.println("City Code: "+key);
			System.out.println("\tCity Name : "+hm.get(key));
		}
}
}