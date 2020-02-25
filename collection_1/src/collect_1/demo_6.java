package collect_1;

import java.util.ArrayList;
import java.util.Iterator;

public class demo_6 
{
	public static void main(String[] args) 
	{
	ArrayList<book> al=new ArrayList<book>(); 
	book b=new book();
	book b1=new book();
	b.setBname("faith");
	b.setId(102);
	b.setPrice(200.15);
	b.setQty(2);
	b.setWritter("R.K Narayan");
	b1.setBname("belief");
	b1.setId(121);
	b1.setPrice(303.15);
	b1.setQty(3);
	b1.setWritter("d.K Narayan");
	al.add(b);
	al.add(b1);
	Iterator it=al.iterator();
	while(it.hasNext())
			{
		book obj=(book)it.next();
		System.out.println("book name: "+obj.getBname()+" ,book id: "+obj.getId()+" ,Book price: "+obj.getPrice()+" ,Quantity: "+obj.getQty()+"  ,writter: "+obj.getWritter());
			}
}
}