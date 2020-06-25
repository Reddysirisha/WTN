package arrays;

public class Example6 {
	public static void main(String args[])
{
	int[] ar=new int[] {23,5,86,45,16};
	int temp=0;
	for(int i=0;i<ar.length;i++)
	{
		for(int j=i+1;j<ar.length;j++)
		{
			if(ar[i]>ar[j])
			{
				temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
			}
		}
	}
	for(int i=0;i<ar.length;i++)
	{
		System.out.print(ar[i]+" ");
	}
}
}
