package lab3;
import java.util.Scanner;
public class data {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter  number of students:");
		int students= scanner.nextInt();
		
		Student[] data= new Student[10];
		
		for(int i=0; i<students; i++) {
				System.out.println("Enter Student details for Student "+ (i+1) + ":");
				System.out.println("Enter Student Id :");
				int id= scanner.nextInt();
				System.out.println("Enter Student year :");
				int year=scanner.nextInt();
				System.out.println("Enter Student cgpa :");
				int cgpa=scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter Student Section :");
				String Section= scanner.nextLine();
				
				data[i]= new Student(id,year,cgpa,Section);
				
				
				
		}
		
		 scanner.close();

	        
	        System.out.println("\nStudent Information:");
	        for (int i = 0; i < students; i++) {
	            data[i].display();
		
		

	}

	}
}
