package threading;

public class Demo {

	public static void main(String[] args)
	{
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		Thread3 t3=new Thread3();
		Thread x=new Thread(t1);
		Thread y=new Thread(t2);
		Thread z=new Thread(t3);
     x.start();
        y.start();
        z.start();
     for(int i = 0;i<=10;i++)
{
    	 try
    	 {
    		 Thread.sleep(100);
	Thread t=Thread.currentThread();
	t.setName("main ");
	System.out.println("Thread name: "+t.getName());
}
	 catch(Exception e)
	 {
		e.printStackTrace(); 
	 }
	}

}
}