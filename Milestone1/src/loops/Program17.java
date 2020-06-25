package loops;
import java.util.Scanner;
	public class Program17 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int number,reverse=0;
			System.out.println("Enter the number to be reversed :");
			Scanner s=new Scanner(System.in);
			number=s.nextInt();
			s.close();
			while(number!=0) {
				reverse=reverse*10+(number%10);
				number=number/10;
			}
			System.out.println(reverse);

		}

	}


