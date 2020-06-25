package arrays;

public class Example2 {
	public static void main(String args[])
	{
		int k[]=new int[] {30,36,52,64,98};
		int min=k[0];
		int max=k[0];
		for(int i=0;i<k.length;i++)
		{
			if(k[i]<min)
			{
				min=k[i];
			}
			if(k[i]>max)
			{
				max=k[i];
			}
		}
		System.out.println(min+","+max);
	}


}
