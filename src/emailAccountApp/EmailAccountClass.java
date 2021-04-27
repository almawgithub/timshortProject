package emailAccountApp;
import java.util.Scanner;

public class EmailAccountClass {

	private String firstname;
	private String lastname;
	private String password;
	private String department;
	private int mailBoxCapacity=700;
	private String alternateEmail;
	private int passwordLength=10;
	private String email;
	private String companyName="abcLion.com";
	
	//Constructor to receive firstname and lastname
	
	public EmailAccountClass(String firstname, String lastname)
	{
		this.firstname=firstname;
		this.lastname=lastname;
		
		System.out.println("New Employee :- "+"First Name is :"+ firstname+ " and Last Name is:"+lastname);
		
		//Ask for Department
		this.department=setDepartment();
		System.out.println("Your Department is :- "+ department);
		//Generate random password
		this.password=setRandomPassword(passwordLength);       ////private String setRandomPassword()
		System.out.println("The Temporary Password is :- "+ password);
		
		// Generate email address after all data collected
		this.email=firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department+ "." + companyName;
		System.out.println("The email created is : "+ email);
		
	}
	
	
	
	private String setDepartment()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Select Your Department:-\n 1. Sales\n 2. Development\n 3. Accounting\n 4. None\n ");
		int choice=sc.nextInt();
		if(choice==1) {return "Sales";}
		else if(choice==2) {return "dev";}
		else if(choice==3) {return "accnt";}
		else {return "";}
	
	}
	
	private String setRandomPassword(int length)
	{
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@$#?";
		char[] password=new char[length];
		for(int i=0;i<length;i++)
		{
			int rand=(int)(Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		
		return new String(password);
	}
	
	// ****************   SETTER METHODS    *********************
	//Set  the mailbox capacity 
	
	public void setMailBoxCapacity(int capacity)
	{
		this.mailBoxCapacity=capacity;
		
	}
	
	//Set the alternate email
	
	public void setAlternateEmail(String alternatePassword)
	{
		this.alternateEmail=alternatePassword;
		
	}
	
	//Change password
	
	public void setChangePassword(String password2)
	{
		this.password=password2;
		
	}
	
	// ****************   GETTER METHODS    *********************
	
	
	public int getMailBoxCapacity() {return mailBoxCapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getChangedPassword() {return password;}
	
	
	public String showinfo()
	{
        		
		return "Employee Name :- "+firstname+" "+lastname+"\n"
		+"Comany Email is "+email+"\n"
		+"EmailBoxCapacity is "+ mailBoxCapacity;
	}

}
