package studentDatabaseApp;
import java.util.Scanner;

public class Student {
private String firstname;
private String lastname;
private int gradeYear;
private static String studentId;
private String courses="";
private int tuitionBalance=0;
private int courseFee=600;
private int startStudentId=1000;

	public Student()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student First Name :- ");
		this.firstname=sc.nextLine();
		
		System.out.print("Enter Student Last Name :- ");
		this.lastname=sc.nextLine();
		
		System.out.print("Enter Student Year Level :-\n "+"1. 1st Year\n"+
		                                                    " 2. 2nd Year\n"+
				                                            " 3. 3rd Year\n"+ 
		                                                    " 4. 4th Year");
		int choice=sc.nextInt();
		if(choice==1) {this.gradeYear= 1;}
		else if(choice==2) {this.gradeYear=2;}
		else if(choice==3) {this.gradeYear=3;}
		else {this.gradeYear=4;}
	
		// Setter Method for studentId
		
		setStudentID();
		
		System.out.println("Student Name is : "+firstname+" "+lastname+" , Year Level is : "+gradeYear+" and Student ID is : "+ studentId);
		
		
		
	}
	
	
	public void setStudentID()
	{
		startStudentId++;
		
		 this.studentId=gradeYear+""+startStudentId;
		
	}
	
	
	public void enrollStudent()
	{
		String course;
		System.out.println("Student Enrollment For Courses : " );
		do {
		
		System.out.println("Enter Type Of Courses " + "(Q for Quit)");
		Scanner sc1=new Scanner(System.in);
		 course=sc1.nextLine();
					 if(!course.toUpperCase().equals("Q"))
					 {
					 courses=courses+"\n"+course;
					 tuitionBalance=tuitionBalance+courseFee;
					 }
		}while( !course.toUpperCase().equals("Q"));
		
		System.out.println("All Courses registered is/are :"+courses+"\n"+
				"Outstanding Balance For Payment is :"+ tuitionBalance);
		
	}
	
	public void getTuitionBalance()
	{
		System.out.println("Tuition Balance is : "+ tuitionBalance);
	}
	
	
	public void  tuitionPayment()
	{
		getTuitionBalance();
		System.out.print("Payment Amount Is: $");
		Scanner sc2=new Scanner(System.in);
		int payment=sc2.nextInt();
		tuitionBalance=tuitionBalance-payment;
		getTuitionBalance();
		
		
	}
	
	public String toString()

	{
		return "Student Name is "+firstname +" "+lastname+"\n"+
	           "Enrolled Courses is/are "+courses+"\n"+
				"Tuition Balance is $"+tuitionBalance;
	}
	
}
