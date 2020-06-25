package arrays;

public class Example4 {
	public static void main(String args[])
	{
		int num[]= {119,120,98,115};
		String str=null;
		for(int i:num)
		{
			str=Character.toString((char)i);
			System.out.print( str);
		}
	}

}
