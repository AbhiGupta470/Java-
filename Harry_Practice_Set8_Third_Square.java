public class Square
{
	float side;
	public float Initialize(float declare_side)
	{
		side = declare_side;
		return side;
	}
	public void AreaOfTheSquare()
	{
		System.out.println("The area of the square is: "+side*side);
	}
	public void PerimeterOfTheSquare()
	{
		System.out.println("The perimeter of the square is: "+4*side);
	}

	public static void main(String[] args) {
		Sqaure obj = new Sqaure();
		obj.Initialize(2.0f);
		obj.AreaOfTheSquare();
		obj.PerimeterOfTheSquare();
	}
}
