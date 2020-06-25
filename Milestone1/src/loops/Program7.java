package loops;
import java.util.Scanner;
	public class Program7 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			char ch;
			Scanner s=new Scanner(System.in);
			ch=s.next().charAt(0);
			s.close();
			if(ch>='a' && ch<='z')
				System.out.println(Character.toUpperCase(ch));
			else if(ch>='A' && ch<='Z')
				System.out.println(Character.toLowerCase(ch));

		}

	}


