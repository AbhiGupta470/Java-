public class Circle {
    private float radius,area,perimeter; //Implements Data Hiding
    public void setRadius(float radius)
    {
        this.radius = radius;
    }
    public void SetArea(float area)
    {
        this.area = 3.14f*radius*radius;
        if(this.area==area)
            System.out.println("Correct area inserted");
        else
            System.out.println("Wrong area inserted");
    }
    public void SetPerimeter(float perimeter)
    {
        this.perimeter = 2*3.14f*radius;
        if(this.perimeter==perimeter)
            System.out.println("Correct Perimeter inserted");
        else
            System.out.println("Wrong perimeter inserted");
    }

    public static void main(String[] args) {
        Circle obj = new Circle();
        obj.setRadius(4.0f);
        obj.SetArea(50.24f);
        obj.SetPerimeter(25.12f);
   }
}
