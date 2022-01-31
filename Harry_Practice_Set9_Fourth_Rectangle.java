public class CwhPracticeSet9 {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        obj.SetBreadth(6);
        obj.SetLength(4);
        System.out.println("The value of the length is: "+obj.GetLength()+" The value of the breadth is: "+ obj.GetBreadth());
    }
}
class Rectangle
{
    int length,breadth;
    public void SetLength(int length)
    {
        this.length = length;
    }
    public void SetBreadth(int breadth)
    {
        this.breadth = breadth;
    }
    public int GetLength()
    {
        return length;
    }
    public int GetBreadth()
    {
        return breadth;
    }
}
