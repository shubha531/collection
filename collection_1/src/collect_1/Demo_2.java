package collect_1;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo_2 
{

	public static void main(String[] args) 
	
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(111);
        al.add(101);
        al.add(222);
        al.add(333);
        al.add(444);
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
        System.out.println("method fourth");
        for(int x:al)
        {
        	System.out.println();
        }
	}
}
