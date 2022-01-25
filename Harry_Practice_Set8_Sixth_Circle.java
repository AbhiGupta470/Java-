public class Practice
{
    float c_side;
    public void initialise(float c_side)
    {
        this.c_side = c_side;
    }
    public float CircleArea()
    {
        return 3.14f*c_side*c_side;
    }
    public float CirclePerimeter()
    {
        return 2*3.14f*c_side;
    }

    public static void main(String[] args) {
        Practice obj = new Practice();
        obj.c_side = 4.0f;
        obj.initialise(obj.c_side);
        System.out.println(obj.CircleArea());
        System.out.println(obj.CirclePerimeter());
    }
}
