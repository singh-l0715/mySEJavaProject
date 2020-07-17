package lovepreet_0715_SEproject;

import java.util.Scanner;

public class BankAccount {
	
	
    public static double Balance=0;
    public static String UserName;
    public static int UserId;
    public static double prevTransaction=0;
    

    static MakeTransaction MT=new MakeTransaction();
    
    static ViewTransactions VT=new ViewTransactions();
    
    static CalculateInterest CI=new CalculateInterest();
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner cin=new Scanner(System.in);
		
		System.out.println("*************Welcome to JBanking Application**************");
		
	    System.out.println("Please enter your User Name");
	    
	    UserName=cin.nextLine();
	   
	    System.out.println("Please enter your user Id");
	    
	    UserId=cin.nextInt();
	    
	    Menu();
	}
	
	public static void checkBalance()
	{
		System.out.println("Balance is $"+Balance);
		return;
	}
	
	public static void Menu()
	{
		Scanner cin=new Scanner(System.in);
		
		char option='\0';
		
		System.out.println("Welcome "+UserName);
		
		System.out.println("Please choose from the following options");
		
		System.out.println("To Check Balance : A ");
		
		System.out.println("To Deposit Amount : B ");
		
		System.out.println("To Withdraw Amount : C ");
		
		System.out.println("To Calculate Interest : D ");
		
		System.out.println("To View Transactions : V ");
		
		System.out.println("To Exit : E ");
		
		do {
			
			System.out.println("Enter an option");
			
			option=cin.next().charAt(0);
			
			System.out.println("\n");
			
			switch(option)
			{
			case 'A':
				checkBalance();
				break;
			case 'B':
				MT.Deposit();
				break;
			case 'C':
				MT.Withdraw();
				break;
			case 'D':
				CI.FindInterest();
				break;
			case 'V':	
				VT.ViewTransaction();
				break;
				
			default:
				System.out.println("Invalid Option Please try again");
				break;
			
			 
			
			}
			
		}while(option!='E');
		
		System.out.println("Thank You For Using JBanking");
		
		
	}

}
