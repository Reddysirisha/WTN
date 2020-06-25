package loops;
import java.util.Scanner;
public class Example1 {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int input;
			Scanner s=new Scanner(System.in);
			System.out.println("Enter input value");
			input=s.nextInt();
			s.close();
			if(input > 0) {
				System.out.println("Positive");
			}
			else if(input < 0) {
				System.out.println("Negative");
				
			}
			else {
				System.out.println("Zero");
			}

		}

	}



