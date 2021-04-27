package bankAccountApp;

public abstract class Account implements iRate{

	// List common properties for both saving and checking account
	
	private String firstname,lastname;
	private String sSN;
	private double balance;
	private static int UniqueFiveDigitNumber=10000;
	
	protected String accountNumber;
	protected double interestRate;
	
	
	// Constructor to initialize these common properties  and account number
	
		public Account(String fName,String lName,String sSNum,double initBalance)
		{
			this.firstname=fName;
			this.lastname=lName;
			this.sSN=sSNum;
			this.balance=initBalance;
			
			
			
			//Initialize account number
			UniqueFiveDigitNumber++;
			this.accountNumber=setAccountNumber();
			
			System.out.println(getRate());
			setRate();      //To initialize interest rate in each child class due to polymorphism
		}

		
		public abstract void setRate();   //Abstract method in the parent class to be implemented 
		                                  //in in each child class
		
		
		
		
	private String setAccountNumber() {
		
		
		String lastTwoDigitOfSsnumber=sSN.substring(sSN.length()-2,sSN.length());
		
		int randomNumberOfThreeDigit= (int)(Math.random()*1000);
		
		
		return lastTwoDigitOfSsnumber+(UniqueFiveDigitNumber-1)+randomNumberOfThreeDigit;
	}
	
	
	
	// List Common Methods - For Transaction
	
	public void deposit(double amount) {
		balance=balance+amount;
		System.out.println("Deposited Amount is : $"+amount);
		showBalance();
	}
	
	
	public void withdraw(double amount) {
		balance=balance-amount;
		System.out.println("Withdrawn Amount is : $"+amount);
		showBalance();
	}
	
	
	public void transfer(String toWhere, double amount) {
		balance=balance-amount;
		System.out.println("$"+amount+ " is transferred to : "+toWhere);
		showBalance();
	}
	
	public void compound() {
		double accruedInterest=balance*interestRate/100;
		balance=balance+accruedInterest;
		System.out.println("Accrues Interest Rate is : $"+accruedInterest);
	}
	// To print balance Information
	
	public void showBalance() {
		System.out.println("Your Balance is : $"+balance);
	}
	
	
	
	
	
	
	
	
	
	
	public void showInfo()
	{
		System.out.println("Customer Name is: "   +  firstname +  " "  + lastname  +  " , SSN is : " +   sSN   +  " and Initial"
				+ " Deposit is : "  +   balance + " and Account Number is : " +accountNumber);
	}
	
	
}
