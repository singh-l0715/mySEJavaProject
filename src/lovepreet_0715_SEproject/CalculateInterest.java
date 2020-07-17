package lovepreet_0715_SEproject;

import java.util.Scanner;
/*  
 * Author: Lovepreet Singh
 * 
 * ID: 300310715
 * 
 * 
 * */

public class CalculateInterest extends BankAccount{

	double rate=1.5;
	double time;
	double interest;
	double amount;
	Scanner cin=new Scanner(System.in);
	
	public void FindInterest()
	{
		System.out.println("Please enter the time period");
		time=cin.nextDouble();
		
		interest=(rate*Balance*time)/100;
		
		amount=Balance+interest;
		
		System.out.println("Balance At the end of Period will be $"+amount);
	}
	
	
	
	
}
