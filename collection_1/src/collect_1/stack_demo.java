package collect_1;

import java.util.Stack;

public class stack_demo 
{

	public static void main(String[] args) 
	{
		Stack<String> ll=new Stack<String>();
		ll.push("sanju");
		ll.push("shubhi");
		ll.push("manshi");
		System.out.println("print in reverse: ");
		System.out.println(ll.pop());
		System.out.println(ll.pop());
		System.out.println(ll.pop());

}
}