package Com.day13;

public class SynchronizationDriver {
	
public static void main(String[] args) throws InsufficientBalanceException {
		
		Account raj=new Account(1001, "Rajesh", 45000);
		
		System.out.println(raj);
		//heti.withdraw(7865);
		
		AccountThread t[]=new AccountThread[10];
		for(int i=0;i<10;i++)
		{
			t[i] = new AccountThread(raj, 1000 * (i+1));
		}
		
		try {
			for(int i=0;i<10;i++)
			{
				t[i].join();
			}
		}
		
		catch(InterruptedException e)
		{
			System.err.println(e.getMessage());
		}
		
		System.out.println("-----------------------------------------------");
		System.out.println(anu);

	} 

}
