//Object Oriented Style
public class Rectangle
{
   float length,breadth;
   public void initialize(float length,float breadth)
   {
       this.length = length;
       this.breadth = breadth;
   }
   public float RectangleArea()
   {
       return length*breadth;
   }
   public float RectanglePerimeter()
   {
       return 2*(length+breadth);
   }

    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        obj.length = 5.0f;
        obj.breadth = 4.0f;
        obj.initialize(obj.length,obj.breadth);
        System.out.println(obj.RectangleArea());
        System.out.println(obj.RectanglePerimeter());
    }
}
