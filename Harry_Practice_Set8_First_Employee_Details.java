public class Employee
{
	int Salary;
	public int getSalary()
	{
		return Salary;
	}
	String name;
	public String getName()
	{
		return name;
	}
	public String setName(String new_name)
	{
		name = new_name;
		return name;
	}

	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.Salary = 20000;
		obj.name = "Ashtuosh";
		System.out.println("The name of the employee is: "+obj.getName());
		System.out.println("The salary of the employee is: "+obj.getSalary());
		System.out.println("The new name of the employee is: "+obj.setName("Shantam"));
	}
}
