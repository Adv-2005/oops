package lab3;

public class volume {
		public static void main(String args[]) {
			box b1= new box();
			box b2= new box();
			b1.para (10,20,30);
			b2.para(20,30,40);
			int vol1= b1.volume();
			int vol2=b2.volume();
			System.out.println("Volume1 :" + vol1);
			System.out.println("Volume2 :" + vol2);
			
		}
		
	}


