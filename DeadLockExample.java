package threads;

public class DeadLockExample {

	public static void main(String[] args) {
		
		final String resource1="vimal";
		final String resource2="priya";
		
		Thread t1=new Thread() {
			
			public void run()
			{
				synchronized(resource1)
				{
					System.out.println("Thread1 locked resource1");
				
					try {
						Thread.sleep(100);
					}
					catch(Exception e)
					{
						
					}
					
					synchronized(resource2)
					{
						System.out.println(" Thread1 locked resource2");
					}
				}
		}
		};
		
		//t2 tries to look resource2 then resource1
		
		Thread t2=new Thread() {
			public void run()
			{
				synchronized(resource1)
				{
					System.out.println("Thread2 locked resource1");
					
					try {
						Thread.sleep(100);
					}
					catch(Exception e)
					{
						
					}
					
					synchronized(resource2)
					{
						System.out.println(" Thread2 locked resouce2");
					}
				}
				}
				};
				
				// second thread is waiting for an object lock
				//that is acquired by the first thread
				
				t1.start();
				t2.start();
				
		}
	}
				
	


