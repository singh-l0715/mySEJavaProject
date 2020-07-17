package lovepreet_0715_SEproject;

import java.util.Scanner;

public class MakeTransaction extends BankAccount {

	
	public static double Amount;
	
	Scanner cin=new Scanner(System.in);
	
	public void Deposit()
	{
		System.out.println("Please enter the Amount to Deposit");
		Amount=cin.nextDouble();
		Balance=Balance+Amount;
		prevTransaction=Amount;
		System.out.println("Balance After Deposit $:"+Balance);
		
	}
	
	public void Withdraw()
	{
		System.out.println("Please enter the Amount to Withdraw");
		Amount=cin.nextDouble();
		Balance=Balance-Amount;
		prevTransaction=-Amount;
		System.out.println("Balance Remaining $:"+Balance);
	}
}
