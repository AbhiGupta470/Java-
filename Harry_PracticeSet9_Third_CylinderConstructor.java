public class CwhPracticeSet9 {
    public static void main(String[] args) {
        Cylinder obj = new Cylinder(4,5);
        System.out.println("The value of the radius is:"+obj.radius+" The value of the height is: "+ obj.height);
    }
}
class Cylinder
{
    int radius,height;
    public Cylinder(int radius,int height)
    {
        this.radius = radius;
        this.height = height;
    }
}
