package encapsulation;

public class Author 
{
	public static String name,email;
	public static char gender;
	Author(String n,String e,char g)
	{
		name=n;
		email=e;
		gender=g;
	}
}
package encapsulation;

public class Book 
{
	String name1;
	String author;
	double price;
	int qtyInstock;
	Book(String n1)
	{
		name1=n1;
	}
	void setqtyInstock()
	{
		qtyInstock=10;
	}
	void setprice()
	{
		price=150.0;
	}
	double getprice()
	{
		return price;
	}
	int getqtyInstock()
	{
		return qtyInstock;
	}
	String getname1()
	{
		return name1;
	}
	void getAuthor()
	{
		System.out.println("Author name is :+Author.name");
		System.out.println("Mail id is :+Author.email");
		System.out.println("Gender is :+Author.gender");
	}

}

package encapsulation;

public class Books 
{
	public static void main(String args[])
	{
		Book b=new Book("Digital System Design");
		Author a=new Author("maya","maya14@rnd.ac.in",'f');
		b.setprice();
		b.setqtyInstock();
		System.out.println("Name of the book is :"+b.getname1());
		System.out.println("price of the book is :"+b.getprice());
		System.out.println("stock is:"+b.getqtyInstock());
	
	}

}

