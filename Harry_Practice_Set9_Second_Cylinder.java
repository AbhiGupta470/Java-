public class CwhPracticeSet9 {
    public static void main(String[] args) {
        Cylinder mycyliner = new Cylinder();
       mycyliner.SetRadiusAndSetHeight(4,5);
        System.out.println("Radius Value is:"+mycyliner.GetRadius()+" Height Value is:"+mycyliner.GetHeight());
        mycyliner.CylinderSurfaceArea();
        mycyliner.VolumeoftheCylinder();
    }
}
class Cylinder
{
    int radius,height;

    public void SetRadiusAndSetHeight(int radius,int height)
    {
        this.radius = radius;
        this.height = height;
    }
    public int GetRadius()
    {
        return radius;
    }
    public int GetHeight()
    {
        return height;
    }
    public void CylinderSurfaceArea()
    {
        float surface_area = 2*3.14f*radius*radius + 2*3.14f*radius*height;
        System.out.println("The Surface area of the cylinder is:"+surface_area);

    }
    public void VolumeoftheCylinder()
    {
        float volume = 3.14f*radius*radius*height;
        System.out.println("The volume of the cylinder is:"+volume);
    }
}
