
 public class Circle extends Shape{

    public double radius;
    public Circle(String name,double radius)
    {
        super(name);
        this.radius=radius;
    }
   @Override
    public double getArea()
    {
    return 3.14*radius*radius;
    }
   @Override
    public void printDimensions(){
        System.out.println("Radius");
       
    }
 }