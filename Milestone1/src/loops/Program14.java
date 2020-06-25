package loops;


	import java.util.Scanner;

	public class Program14 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int number,count=0;
			System.out.println("Please enter an integer number");
			Scanner s=new Scanner(System.in);
			number=s.nextInt();
			s.close();
			for(int i=2;i<=number/2;i++) {
				if(number%i==0)
					count=1;
			}
			if(number==1)
				System.out.println("1 is neither prime nor composite");
			else if(number==0)
				System.out.println("0 is neither prime nor composite");
			else if(count==0)
				System.out.println(number+" "+"is a prime number");
			else
				System.out.println(number+" "+"is not a prime number");
				

		}




		}





