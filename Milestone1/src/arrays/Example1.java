package arrays;

public class Example1 {
	public static void main(String args[])
		{
			int []elements=new int[] {1,2,3,4,5};
			int length=elements.length;
			int sum=0;
			for(int i=0;i<length;i++)
			{
		     sum=sum+elements[i];
		}
			System.out.println("sum of elements in array is"+sum);
			System.out.println("average of elements in the array is"+(sum/length));

	}
	}


