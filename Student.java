package lab3;



public class Student {
	int ID;
	int year;
	int cgpa;
	String section;

	Student(int id, int year, int cgpa, String section){
		this.ID=id;
		this.year=year;
		this.cgpa=cgpa;
		this.section=section;
	}
	
	void display() {
		System.out.println("ID: " +ID + " Year:"+ year + " Cgpa:" + cgpa + " section:" + section);
	}
		
		
		
	}
	

