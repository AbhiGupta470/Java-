/* Design an application in java that contains a class Student having properties name and percentage.
Create a class Test that declares three instances of Student class. 
The values are passed through constructor at the time of its object creation.
The output should be the name and percentage of the topper.
*/
class Student
{
	String name;
	 float percentage;
	Student(String nam,float percent)
	{
		name = nam;
		percentage = percent;
	}

}
public class Test1
{
	public static void main(String[] args) {
		Student obj1 = new Student("Shubh", 87.5f);
		Student obj2 = new Student("Aniket", 91.7f);
		Student obj3 = new Student("Harry", 97.4f);
		if(obj1.percentage>obj2.percentage && obj1.percentage>obj3.percentage)
		{
			System.out.println(obj1.name+"is topper whose percentage is"+obj1.percentage);
		}
		else if(obj2.percentage>obj1.percentage && obj2.percentage>obj3.percentage)
			System.out.println(obj2.name+"is the topper by percentage "+obj2.percentage);
		else
			System.out.println(obj3.name+" is the topper by percentage "+obj3.percentage);
	}
}
