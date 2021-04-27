package studentDatabaseApp;
import java.util.Scanner;

public class StudentDatabaseDriver {

	public static void main(String[] args) {
		/*
		Student st1=new Student();
		st1.enrollStudent();
		st1.tuitionPayment();
		System.out.println(st1.toString());
		// TODO Auto-generated method stub       */
		
		
		System.out.print("Enter NUmber of Student To Enroll");
		
		Scanner sc=new Scanner(System.in);
		
		int noOfStudent=sc.nextInt();
		
		Student[] stu=new Student[noOfStudent];
		
		for(int i=0;i<noOfStudent;i++)
		{
			stu[i]  =new Student();
			stu[i].enrollStudent();
			stu[i].tuitionPayment();
		}
		
		for(int j=0;j<noOfStudent;j++)
		{
			System.out.println(stu[j].toString());
			
		}

	}

}
