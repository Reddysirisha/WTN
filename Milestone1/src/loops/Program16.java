package loops;


	import java.util.Scanner;
	public class Program16 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int number;
			Scanner s=new Scanner(System.in);
			number=s.nextInt();
			s.close();
			for(int i=0;i<number;i++) {
				for(int j=0;j<number;j++) {
					if(i>=j)
						System.out.print("* ");
				}
				System.out.print("\n");
			}

		}

	}



