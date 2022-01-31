

public class CwhPracticeSet9 {
    public static void main(String[] args) {
        Sphere obj = new Sphere();
        obj.Setradius(5) ;
        obj.SetHeight();
        System.out.println("The value of the radius is: "+obj.GetRadius());
        System.out.println("The value of the height is: "+obj.GetHeight());
        obj.AreaOFSphere();
        obj.VolumeOfSphere();
    }
}
class Sphere
{
    int radius,height;
    public void Setradius(int radius)
    {
        this.radius = radius;
    }
    public void SetHeight()
    {
        this.height = 2*radius;
    }
    public int GetRadius()
    {
        return radius;
    }
    public int GetHeight()
    {
        return height;
    }
    public void AreaOFSphere()
    {
        double area  = 4*Math.PI*radius*radius;
        System.out.println("The area of the sphere is"+area);
    }
    public void VolumeOfSphere()
    {
        double volume = 4/3 * Math.PI * radius * radius* radius;
        System.out.println("The volume of the sphere is:"+volume);
    }
}
