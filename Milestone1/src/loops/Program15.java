package loops;
import java.util.Scanner;
	public class Program15 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int number,sum=0,n;
			System.out.println("Enter the number :");
			Scanner s=new Scanner(System.in);
			number=s.nextInt();
			s.close();
			for(sum=0;number>0;number=number/10) {
				n=number%10;
				sum=sum+n;
				
			}
			System.out.println(sum);
			

		}

	}



