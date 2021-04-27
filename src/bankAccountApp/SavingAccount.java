package bankAccountApp;

public class SavingAccount extends Account{

	// List properties specific to Saving Account
	
	private String safetyDepositBoxId="";
	private String safetyDepositBoxKey="";
	
	
	//Constructor to initialize Checking Account specific properties
	
	public SavingAccount(String fName,String lName,String socialNum,double initDeposit)
		{
			super(fName,lName,socialNum,initDeposit);  //Parent class 4 instance variables common to 
			                                           //Saving and Checking class
			
			accountNumber="1"+accountNumber;      //Parent class 1 instance variables common to
			                                      //Saving and Checking class
			
			safetyDepositBox();
				
			
			
									//System.out.println("Customer Name :"+fName);
									//System.out.println("The Acount Number is : "+accountNumber);
									//System.out.println("New Saving Account Created !!!");
		}
	
	
	private void safetyDepositBox() {
		
		//For safetyDepositBoxId *****************************************************************
		
		int[] arry=new int[3];
		int max = 9;
        int min = 0;
        int range = max - min + 1;
		
        for(int n=0;n<3;n++)
			{
					arry[n]=(int)(Math.random()*range )+min;
				
					safetyDepositBoxId=safetyDepositBoxId+ arry[n];
			
			}
		//For safetyDepositBoxKey *****************************************************************
       
        int[] arry2=new int[4];
        int max2 = 9;
        int min2 = 0;
        int range2 = max2 - min2 + 1;
		
        for(int n=0;n<4;n++)
			{
					arry2[n]=(int)(Math.random()*range2 )+min2;
				
					safetyDepositBoxKey=safetyDepositBoxKey+ arry2[n];
			
			}
        

	}


	//List any method specific to Saving Account Class
	
	public void showInfo() {
		super.showInfo();
		System.out.println("Saving Account !!!");
		System.out.println("Saving Features !!!"+" Interest Rate is : "+ interestRate+"%"+ " Safety Deposit Box ID is : "+safetyDepositBoxId+ 
				" and Safety Deposit Box Key is : "+ safetyDepositBoxKey );
	}


	@Override
	public void setRate() {
		interestRate=getRate() -.25;
		//System.out.println("Implementation of Saving Rate !!!");
		// TODO Auto-generated method stub
		
	}
}
