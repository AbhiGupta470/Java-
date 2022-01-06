/*Create a class Box that uses a parameterized constructor to initialize the dimensions of a box.
The dimensions of the Box are width, height, depth. 
The class should have a method that can return the volume of the box. 
Create an object of the Box class and test the functionalities.
*/
public class Main 
{
    float length;
    float width;
    float height;
    Main(float l,float w,float h)
    {
        length = l;
        width = w;
        height = h;
    }
    float Volume()
    {
        float volume = length*width*height;
        return volume;
    }
    public static void main(String[] args)
    {
        Main obj = new Main(3.5f,5.6f,7.8f);
        System.out.println(obj.Volume());
    }
}
