public class CwhPracticeSet9 {
    public static void main(String[] args) {
        Cylinder mycyliner = new Cylinder();
       mycyliner.SetRadiusAndSetHeight(4,5);
        System.out.println("Radius Value is:"+mycyliner.GetRadius()+" Height Value is:"+mycyliner.GetHeight());
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
}
