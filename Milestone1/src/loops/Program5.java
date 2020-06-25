package loops;

	import java.util.Scanner;
	public class Program5 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			char ch;
			Scanner s=new Scanner(System.in);
			System.out.println("Enter character :");
			ch=s.next().charAt(0);
			s.close();
			if((ch>='a'&& ch<='z')||(ch>='A'&&ch<='Z'))
				System.out.println("Alphabet");
			else if(ch>='0'&&ch<='9')
				System.out.println("Digit");
			else
				System.out.println("Special character");
				

		}

	}


