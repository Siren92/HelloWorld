public class EquilateralTriangle extends Triangle{
    public double side;
    public EquilateralTriangle(String name,double base,double height,double side)
    {
        super(name,base,height);
        this.side=side;
    }
    @Override
    public double getArea()
    {
    return (1.713/4)*side*side;
    }
   @Override
    public void printDimensions(){
        System.out.println("length of sides");
        }
    }