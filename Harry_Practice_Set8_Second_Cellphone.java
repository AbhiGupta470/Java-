public class Cellphone
{
	public void Ringing()
	{
		System.out.println("The cellphone is ringing.");
	}
	public void Vibrating()
	{
		System.out.println("The cellphone is vibrating.");
	}

	public static void main(String[] args) {
		Cellphone obj = new Cellphone();
		obj.Ringing();
		obj.Vibrating();
	}
}
