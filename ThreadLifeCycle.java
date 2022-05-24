class MyThread extends Thread
{ 
	boolean execute = true;
	MyThread(String n)
	{
		super(n); 
		System.out.println(n + " Created. ");
	}

	public void run()
	{
	int min = 1;
	int max = 4999;
	try
	{
		while(execute){
			int x = (int)(Math.random() * max) + min;
			System.out.println( " Sleep time for Thread " + getName() + " "+ x);
			sleep(x);
			

		}
		System.out.println( " Thread " + getName() + " is going to die ");
	}
	catch(Exception e)
	{}
	}
	public void stopExecuting() {
		this.execute = false;
	}

}
public class ThreadLifeCycle
{
	public static void main(String args[]) throws Exception
	{
		String threadName = " MyThread ";
		MyThread t1=new MyThread(threadName);
		t1.start();
		try 
		{
			Thread.currentThread().sleep(5000);
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.stopExecuting();
		Thread.currentThread().sleep(5000);
	
		if(!t1.isAlive()){
			System.out.println(  threadName + " is died ");
		}

	}
}
