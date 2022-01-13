/* Design an application in java that contains a class Student having properties name and percentage.
Create a class Test that declares three instances of Student class. 
The values are passed through constructor at the time of its object creation.
The output should be the name and percentage of the topper.
*/
class Student
{
	String name;
	 float percentage;
	Student(String name,float percentage)
	{
		this.name = name;
		this.percentage = percentage;
	}

}
public class Test1
{
	public static void main(String[] args) {
		Student[] students = {new Student("Shubh",91.5f),new Student("Aniket",97.5f),new Student("Harry",98.5f)};  //New Concept using Array of Objects
		if(students[0].percentage>students[1].percentage && students[0].percentage>students[2].percentage)
			System.out.println(students[0].name+" is the topper with percentage "+students[0].percentage);
		else if(students[1].percentage>students[0].percentage && students[1].percentage>students[2].percentage)
			System.out.println(students[1].name+" is the topper with percentage "+students[1].percentage);
		else
			System.out.println(students[2].name+" is the topper with the percentage "+students[2].percentage);
	}
}
