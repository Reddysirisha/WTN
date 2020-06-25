package loops;
import java.util.Scanner;
	public class Program12 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int number,count=0;
			System.out.println("Enter the number");
			Scanner s=new Scanner(System.in);
			number=s.nextInt();
			s.close();
			for(int i=2;i<=number/2;i++) {
				if(number%i==0)
					count=1;
			}
			if(number==1)
				System.out.println("Neither prime nor Composite");
			else if(count==0)
				System.out.println("Prime number");
			else
				System.out.println("Not a prime number");
				

		}

	}



