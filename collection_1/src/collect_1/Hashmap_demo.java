package collect_1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hashmap_demo {

	public static void main(String[] args)
	{
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("Shubhi",101);
		hm.put("Sanju",102);	
		hm.put("Manshi",103);
		hm.put("Shivi",104);	
		hm.put("Sandhya",105);
		hm.put("Zahra",106);
		System.out.println("student details: ");
		Iterator it=hm.keySet().iterator();
		while(it.hasNext())
		{
			String key=(String)it.next();
			System.out.println("-----------------");
			System.out.println("Roll No: "+key);
			System.out.println("Student Name: "+hm.get(key));
		}
		/*System.out.println("Student details: ");
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println("-----------------");
			System.out.println("Roll No: "+m.getKey());
			System.out.println("Student Name: "+m.getValue());
			
		}*/
	}

}
