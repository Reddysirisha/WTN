package loops;

public class Program19 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0,i=1;
		while(i<1000) {
			if((i%2==0 &&i%3==0)&&i%5==0) {
				System.out.println(i);
				count++;
				if(count==5)
					break;
				
			}i++;
		}
	}

}
