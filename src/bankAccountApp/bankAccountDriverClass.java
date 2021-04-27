package bankAccountApp;

import java.util.ArrayList;
import java.util.List;

public class bankAccountDriverClass {

	public static void main(String[] args) {
		
		
		
		/*CheckingAccount ckAct1=new CheckingAccount("Abathun","Almaw","41236985",1500);
		
		
		SavingAccount saAct1=new SavingAccount("Aresema","Abathun","78965421",2500);
		
				
		SavingAccount saAct2=new SavingAccount("Selam","Abathun","78965452",2500);
		
		ckAct1.compound();
		ckAct1.showInfo();
		
		System.out.println("*************************************************************************");
		
		saAct1.compound();
		saAct1.showInfo();
		
		System.out.println("*************************************************************************");
		saAct2.compound();
		saAct2.showInfo();
		
		
		ckAct1.deposit(5000);
		ckAct1.withdraw(200);
		ckAct1.transfer("Brokage",3000);
		*/
		// TODO Auto-generated method stub
		
		            String file="C:\\Users\\selam\\Desktop\\NewBankAccounts.csv";
		            
					List<String[]> newCustomer=utilities.ReadFromCsvFile.readDataFromFile(file);
					
					List<Account> accounts=new ArrayList<Account>();
		
					//List<Account> accounts;//=new Account<Account>();
					
					for(String[] customerArray:newCustomer)
					{
					
						String fname=customerArray[0];
						String lname=customerArray[1];
						String sSN=customerArray[2];
						String typeOfAcc=customerArray[3];
						double initDeposit=Double.parseDouble(customerArray[4]);
						
						
						
						if(typeOfAcc.equals("Savings"))
						{
							System.out.println(" Saving Account is Opened !!! ");
						
						   accounts.add(new SavingAccount(fname,lname,sSN,initDeposit));
						 
						}
						else if(typeOfAcc.equals("Checking"))
						{
							System.out.println("Open Checking Account !!! ");
						accounts.add(new CheckingAccount(fname,lname,sSN,initDeposit));
						}
						else
							System.out.println(" Error in reading files !!! ");
						
						//System.out.println(fname+" "+lname +" "+sSN+" "+typeOfAcc+" "+initDeposit);
						
						
						
						/*System.out.println("First Name : "+ customerArray[0]);
					System.out.println("Last Name : "+ customerArray[1]);
					System.out.println("Social Security Number : "+ customerArray[2]);
					System.out.println("Type of Account : "+ customerArray[3]);
					System.out.println("Account Balance : "+ customerArray[4]);
					System.out.println("*************************************************************************");
				*/
				    }
					
				for(Account newAct:accounts)
				{
					newAct.showInfo();
					
				}
					
					
					
	}
}
