public class Triangle extends Shape{

    public double base,height;
    public Triangle(String name,double base,double height)
    {
        super(name);
        this.base=base;
        this.height=height;
    }
    @Override
    public double getArea()
    {
    return 0.5*base*height;
    }
   @Override
    public void printDimensions(){
        System.out.println("base and height");
        }
    }
