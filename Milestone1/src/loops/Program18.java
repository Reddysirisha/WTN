package loops;


	import java.util.Scanner;

	public class Program18 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int number,reverse=0,temp;
			System.out.println("Enter the number to be reversed :");
			Scanner s=new Scanner(System.in);
			number=s.nextInt();
			s.close();
			temp=number;
			while(number!=0) {
				reverse=reverse*10+(number%10);
				number=number/10;
			}
			if(temp==reverse)
				System.out.println(temp+" "+"is a palindrome");
			else
				System.out.println(temp+" "+"is not a palindrome");

		}

	}



