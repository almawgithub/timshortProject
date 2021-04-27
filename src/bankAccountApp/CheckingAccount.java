package bankAccountApp;

public class CheckingAccount extends Account{
	
	// List properties specific to Checking Account
	
		private long debitCardNumber;
		private int debitCardPin;
		
	//Constructor to initialize Checking Account specific properties
		
		public CheckingAccount(String fName,String lName,String socialNum,double initDeposit)
		{
			super(fName,lName,socialNum,initDeposit);
			
			accountNumber="2"+accountNumber;
			
			setDebitCard();
			setDebitCardPin();
			
			//System.out.println("Customer Name : "+fName);
			//System.out.println("The Acount Number is : "+accountNumber);
			//System.out.println("New Checking Account Created !!!");
		
			
		}
		
		
		
		
		
		private void setDebitCardPin() {
		// TODO Auto-generated method stub
			debitCardPin=(int) (Math.random()  *  Math.pow(10,4));
	}





		private void setDebitCard() {
			
			debitCardNumber=(long) (Math.random() * Math.pow(10,12));
			
			
		// TODO Auto-generated method stub
		
	}





		// List any method specific to checking account class
		public void showInfo() {
			super.showInfo();
			System.out.println("Checking Account !!!"+ " Interest Rate is : "+interestRate+"%");
			System.out.print("\nDebit Card Number is : "+debitCardNumber);
			System.out.print("\nDebit Card PIN Number is : "+debitCardPin +"\n");
		}





		@Override
		public void setRate() {
			
			interestRate=getRate()*.15;
			//System.out.println("Implementation Of Checking Account !!! ");
			// TODO Auto-generated method stub
			
		}
		
		

}

