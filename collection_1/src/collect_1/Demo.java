package collect_1;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo 
{

	public static void main(String[] args) 
	
	{
		ArrayList al=new ArrayList();
        al.add("hello");
        al.add(101);
        al.add(3.14);
        al.add(true);
        al.add('*');
        System.out.println("Method First");
        System.out.println(al);
        System.out.println("Method second");
        for(int i=0;i<al.size();i++)
        {
        	System.out.println(al.get(i));
        	
        }
         System.out.println("method third ");
        Iterator it=al.iterator();// to implement or to use hash or to implement any function iterator is used
        while (it.hasNext())
        {
        	System.out.println(it.next());
        }
		/*
        ArrayList al=new ArrayList();
        al.add("hello");
        al.add(new Integer(101));
        al.add(new Double(3.14));
        al.add(new Boolean(true));//wrapping of the class but this is internal method 
        and we do not need to implement it but if we want to make sure that the particular no 
        shouble double than we use it
        
        al.add(new Character('*'));
        System.out.println("Method First");
        System.out.println(al);
        */
        
        
       

	}

}
