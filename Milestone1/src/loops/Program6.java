package loops;

public class Program6 {
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			String gender=args[0];
			int age=Integer.parseInt(args[1]);
			if(gender.equals("Female")){
				if(age>=1 && age<=58)
					System.out.println("Interst is 8.2%");
				else if(age>=59 && age<=100)
					System.out.println("Interst is 9.2%");
					
			}
			else if(gender.equals("Male")){
				
				 if(age>=59 && age<=100)
					System.out.println("Interst is 10.3%");
					
			}
					

		}

	}

