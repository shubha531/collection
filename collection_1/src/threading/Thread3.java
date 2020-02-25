package threading;

public class Thread3 implements Runnable
{
	public void run()
	{
		System.out.println("fibbonacci: "+1);
		System.out.println("fibbonacci: "+1);
	     for(int i = 0;i<=10;i++)
	     {
	    try
	   {
	        Thread.sleep(1000);
	     	Thread t=Thread.currentThread();
	     	t.setName("Third");
	     	System.out.println("Thread name: "+t.getName());
	    }
	    	 catch(Exception e)
	    	 {
	    		e.printStackTrace(); 
	    	 }
		
	}
	}}
