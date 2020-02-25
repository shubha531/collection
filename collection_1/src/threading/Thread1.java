package threading;

public class Thread1 implements Runnable 
{

	public void run()
	{
	     for(int i = 0;i<=50;i++)
	     {
	    	 try 
	    	 {
	    	 int count=0;
	    	 for(int j = 0;j<=50;j++)
	    	 {
	    		 if(i%j==0)
	    		 {
	    			 count++;
	    		 }
	    	 }
	    		 
	    	Thread.sleep(1000);	 
	     	Thread t=Thread.currentThread();
	     	t.setName("First");
	     	
	     	System.out.println("Thread Name: "+t.getName());
	     }
    	 catch(Exception e)
    	 {
    		e.printStackTrace(); 
    	 }
		
	}

	}}
