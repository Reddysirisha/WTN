package arrays;

public class Example10 {
	public static void main(String args[])
	{
		int []a=new int[] {1,0,1,0,0,1,1};
		int k=0;
		int[]b=new int[a.length];
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
		{
			b[k]=a[i];
			k++;
		}
	}
	for(int j=0;j<a.length;j++)
	{
		if(a[j]%2!=0)
		{
			b[k]=a[j];
			k++;
		}
	}
	for(int i=0;i<a.length;i++)
		System.out.print(b[i]+" ");
	}
	

}
