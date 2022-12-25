package feedbackmgt;

import java.util.ArrayList;
import java.util.Scanner;

public class Admin{
	Feedback fb;
	Scanner sc=new Scanner(System.in);
	
	
	
	Admin(Feedback fb) {
		this.fb=(Feedback)fb;
		System.out.println("1.View Student \n2.View Feedback ");
		int select;
		System.out.println("Enter Your Choice : ");
		select = sc.nextInt();
		switch(select) {
			case 1:
				System.out.println("+------------------------------------------------------------------------------+");
				System.out.println("                               Student Information                              ");
				System.out.println("+------------------------------------------------------------------------------+");
				System.out.println("+---------------+------------------------------+---------------+---------------+");
				System.out.println("| StudentID     | StudentName                  | StudentClass  | SMobileNo     |");
				System.out.println("+---------------+------------------------------+---------------+---------------+");
				viewstudent();
				break;
			case 2:
				System.out.println("+------------------------------------------------------------------------------------------------------------------------------+");
				System.out.println("                                              Feedback Information                                                              ");
				System.out.println("+------------------------------------------------------------------------------------------------------------------------------+");
				System.out.println("+---------------+------------------------------+---------------+---------------+---------------+---------------+---------------+");
				System.out.println("| StudentID     | StudentName                  | Question1     | Question2     | Question3     | Question4     | Question5     |");
				System.out.println("+---------------+------------------------------+---------------+---------------+---------------+---------------+---------------+");
				viewfeedback();
				break;
		}	
	}
	
	public void viewstudent() {
		if(fb.getCount()>0){
			ArrayList<Student> li = fb.getFeedback();
			li.forEach((f)->{
				  System.out.printf(" %-14d  %-30s  %-14s  %-15s %n", f.studentid, f.studentname, f.studentclass, f.studentphoneno);
				  System.out.println("+---------------+------------------------------+---------------+---------------+");
			});		
		}
	}

	public void viewfeedback() {
		if(fb.getCount()>0){
			ArrayList<Student> li = fb.getFeedback();
			li.forEach((f)->{
				System.out.printf(" %-14d  %-30s  %-15s  %-15s %-15s %-15s %-15s %n", f.studentid, f.studentname, f.ans1, f.ans2, f.ans3, f.ans4, f.ans5);
				System.out.println("+---------------+------------------------------+---------------+---------------+---------------+---------------+---------------+");
			});		
		}
	}
}	


