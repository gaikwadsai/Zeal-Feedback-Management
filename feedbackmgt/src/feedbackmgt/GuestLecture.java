package feedbackmgt;
import java.util.Scanner;

public class GuestLecture{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean bool = true;
		Feedback sd= new Feedback();		
		while(bool){
			System.out.println("----------------------------------");
			System.out.println("|    Welocome To Zeal College    |");
			System.out.println("|        FEEDBACK SYSTEM         |");
			System.out.println("----------------------------------");
			System.out.println("1. Student \n2. Admin \n3. Exit");
			System.out.println("Select the user type: ");
			int select = sc.nextInt();
			switch(select) {
				case 1:	
					System.out.println("----------------------------------");
					System.out.println("    Welcome to Student Pannel     ");
					sd.StudentActivity();
					break;
				case 2:
						Scanner scanner = new Scanner(System.in);

					    System.out.print("Enter username: ");
					    String username = scanner.nextLine();

					    System.out.print("Enter password: ");
					    String password = scanner.nextLine();

					    if (username.equals("sai_1234") && password.equals("Looser")) {
					      System.out.println("Welcome, admin!");
					      System.out.println("----------------------------------");
							System.out.println("    Welcome to Admin Pannel       ");
							System.out.println("----------------------------------");
							new Admin(sd);
					    } else {
					      System.out.println("Invalid username or password.");
					    }

					
					break;
				case 3:
					bool=false;
					break;
			}
		}

	}
	
}
