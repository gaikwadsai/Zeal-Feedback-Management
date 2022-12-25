package feedbackmgt;
import java.util.ArrayList;
import java.util.Scanner;

public class Feedback{
	ArrayList<Student> fd = new ArrayList<Student>();
	Scanner sc = new Scanner(System.in);


	public void StudentActivity() {
		boolean bool = true;
		while(bool){
			System.out.println("----------------------------------");
			System.out.println("1. Give Feedback");		
			System.out.println("2. Exit");
			System.out.println("Enter your choice:");
			int n = sc.nextInt();
			switch(n){
				case 1:
					addStudent();
					break;
				case 2:
					bool = false;
					break;					
			}
		
		}
	}
	
	public void addStudent() {
		Student fb = new Student();
		Scanner sc=new Scanner(System.in);
		fb.studentid= Student.sid++;
		System.out.println("Enter Your Name  :");
		fb.studentname = (sc.nextLine());
		
		System.out.println("Enter Your Class  :");
		fb.studentclass = (sc.nextLine());
		
		System.out.println("Enter Your Phone No  :");
		fb.studentphoneno = (sc.nextLine());
		

		System.out.println("Q1.What was your overall satisfaction with this presentation?");
		System.out.println("1.Excellent \n2.Good \n3.Average \n4.Bad \n5.Worst ");
		System.out.println("Enter Your Choice : ");
		addFeed(sc.nextInt(),1,fb);
		
		System.out.println("Q2.Was the presentation informative?");
		System.out.println("1.Excellent \n2.Good \n3.Average \n4.Bad \n5.Worst ");
		System.out.println("Enter Your Choice : ");
		addFeed(sc.nextInt(),2,fb);
		
		System.out.println("Q3.Was the information clearly presented?");
		System.out.println("1.Excellent \n2.Good \n3.Average \n4.Bad \n5.Worst ");
		System.out.println("Enter Your Choice : ");
		addFeed(sc.nextInt(),3,fb);
		
		System.out.println("Q4.Did the presentation take too much, too little, or about the right amount of time?");
		System.out.println("1.Excellent \n2.Good \n3.Average \n4.Bad \n5.Worst");
		System.out.println("Enter Your Choice : ");
		addFeed(sc.nextInt(),4,fb);
		
		System.out.println("Q5. Did you enjoy using group time to hear a presentation?");
		System.out.println("1.Excellent \n2.Good \n3.Average \n4.Bad \n5.Worst ");
		System.out.println("Enter Your Choice : ");
		addFeed(sc.nextInt(),5,fb);			
		
		fd.add(fb);
    }

	public ArrayList<Student> getFeedback(){
		return fd;
	}
	public int getCount(){
		return fd.size();
	}
		
	public void addFeed(int opt,int ind,Student fb){
		switch(ind){
			case 1:
				if(opt==1)
					fb.ans1="Excellent";
				if(opt==2)
					fb.ans1="Good";
				if(opt==3)
					fb.ans1="Average";
				if(opt==4)
					fb.ans1="Bad";
				if(opt==5)
					fb.ans1="Wrost";
				break;
			case 2:
				if(opt==1)
					fb.ans2="Excellent";
				if(opt==2)
					fb.ans2="Good";
				if(opt==3)
					fb.ans2="Average";
				if(opt==4)
					fb.ans2="Bad";
				if(opt==5)
					fb.ans2="Wrost";
				break;
			case 3:
				if(opt==1)
					fb.ans3="Excellent";
				if(opt==2)
					fb.ans3="Good";
				if(opt==3)
					fb.ans3="Average";
				if(opt==4)
					fb.ans3="Bad";
				if(opt==5)
					fb.ans3="Wrost";
				break;
			case 4:
				if(opt==1)
					fb.ans4="Excellent";
				if(opt==2)
					fb.ans4="Good";
				if(opt==3)
					fb.ans4="Average";
				if(opt==4)
					fb.ans4="Bad";
				if(opt==5)
					fb.ans4="Wrost";
				break;
			case 5:
				if(opt==1)
					fb.ans5="Excellent";
				if(opt==2)
					fb.ans5="Good";
				if(opt==3)
					fb.ans5="Average";
				if(opt==4)
					fb.ans5="Bad";
				if(opt==5)
					fb.ans5="Wrost";
				break;
		}
	}
}
	
