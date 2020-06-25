package inheritance;

public class Person {
	String VariableName;

	}
	class Employee extends Person{
		double AnnualSalary;
		int year;
		String InsurenceNumber;
	}
	class GetSet extends Employee
	{
		GetSet(String VariableName)
		{
			this.VariableName=VariableName;
		}
		GetSet(double AnnualSalary,int Year,String InsurenceNumber)
		{
			this.AnnualSalary=AnnualSalary;
			this.year=Year;
			this.InsurenceNumber=InsurenceNumber;
		}
		void getPerson()
		{
			System.out.println("Member Variable name:"+VariableName);
		}
		void getEmp()
		{
			System.out.println("Annual Salary is:"+AnnualSalary);
			System.out.println("Year the Employee started to work:"+year);
			System.out.println("The national insurence number:+InsurenceNumber");
			
		}
	}

	package inheritance;

	public class TestEmployee 
	{
		public static void main(String args[])
		{
			GetSet gs1=new GetSet("Siri");
			GetSet gs2=new GetSet(100000,2021,"WTN4");
			gs1.getPerson();
			gs2.getEmp();
		}

}
