package threading;

public class Thread2 implements Runnable
{

	public void run()
	{
	     for(int i = 0;i<=10;i++)
	    
	     try
	     {
	    	 Thread.sleep(1000);
	     	Thread t=Thread.currentThread();
	     	t.setName("Second");
	     	System.out.println("thread name: "+t.getName());
	   
	  }
	 catch(Exception e)
	 {
		e.printStackTrace(); 
	 }
		
	}

}
