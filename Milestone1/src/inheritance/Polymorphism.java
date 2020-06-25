package inheritance;

public class Polymorphism {

	public static void main(String args[])
	{
		Shape c=new circle();
		Shape  t=new Triangle();
		Shape s=new square();
		c.draw();
		c.erase();
		t.draw();
		t.erase();
		s.draw();
		s.erase();
	}

}
