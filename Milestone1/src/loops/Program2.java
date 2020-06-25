package loops;
  import java.util.Scanner;
	public class Program2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int Input;
			System.out.println("Enter Input value :");
			Scanner s=new Scanner(System.in);
			Input=s.nextInt();
			s.close();
			if(Input %2==0) 
				System.out.println("Even");
			
			else
				System.out.println("Odd");
				

		}

	}


