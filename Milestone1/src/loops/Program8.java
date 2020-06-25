package loops;
import java.util.Scanner;
	public class Program8 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			char ch;
			System.out.println("Enter Color code :");
			Scanner s=new Scanner(System.in);
			ch=s.next().charAt(0);
			s.close();
			switch(ch) {
			case 'B':
				System.out.println("Blue");
				break;
			case 'R':
				System.out.println("Red");
				break;	
			case 'G':
				System.out.println("Green");
				break;
			case 'O':
				System.out.println("Orange");
				break;
			case 'Y':
				System.out.println("Yellow");
				break;
			case 'W':
				System.out.println("White");
				break;
			default:System.out.println("Invalid Code");	
			}

		}

	}

