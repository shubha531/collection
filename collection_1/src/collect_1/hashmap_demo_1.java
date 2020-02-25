package collect_1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hashmap_demo_1 
{
	public static void main(String[] args)
	{
		HashMap<Integer,Students> hm=new HashMap<Integer, Students>();
		Students s1=new Students();
		s1.setSname("Shubhi");
		s1.setCourse("B.Tech");
		s1.setEmail("Shubhi@121");
		s1.setMobile("9935366784");
		hm.put(101, s1);
		System.out.println("student details: ");
		Iterator it=hm.keySet().iterator();
		while(it.hasNext())
		{
			Integer key=(Integer)it.next();
			System.out.println("-----------------");
			System.out.println("Roll No: "+key);
			Students s=hm.get(key);
			System.out.println("Student Name: "+s.getSname());
			System.out.println("Course: "+s.getCourse());
			System.out.println("E-mail: "+s.getEmail());
			System.out.println("Mobile: "+s.getMobile());
		}
		System.out.println("Student details: ");
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println("-----------------");
			System.out.println("Roll No: "+m.getKey());
			Students ss=(Students)m.getValue();
			System.out.println("Student Name: "+ss.getSname());
			System.out.println("Course: "+ss.getCourse());
			System.out.println("E-mail: "+ss.getEmail());
			System.out.println("Mobile: "+ss.getMobile());
			
		}
}
}
