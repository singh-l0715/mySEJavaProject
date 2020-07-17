package lovepreet_0715_SEproject;

public class ViewTransactions extends BankAccount {

	public void ViewTransaction()
	{
		if(prevTransaction<0)
		{
			System.out.println("Amount Withdrawn $"+ prevTransaction);
		}
		else
			System.out.println("Amount Deposited $"+ prevTransaction);
	}
	
}
