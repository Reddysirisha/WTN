package inheritance;

public class Animal {
	void eat()
	{
		System.out.println("Eat");
	}
	void sleep()
	{
		System.out.println("sleep");
	}
	}
	class Bird extends Animal
	{
		void fly()
		{
			System.out.println("Fly");
		}
}
	package inheritance;

	public class Inheritance_1 {
		public static void main(String[] args) {
				Animal A=new Animal();
				Bird B=new Bird();
				A.eat();
				A.sleep();
				B.fly();
				B.sleep();
				B.eat();
			}
	}