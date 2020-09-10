
public class Main
{
public static void main(String args[])  {
    Square square = new Square("square",5);
    String names=square.getName();
    double result=square.getArea();
    square.printDimensions();
    System.out.println(names+result);
     

    Circle circle = new Circle("Circle",5);
    String namec=circle.getName();
    double resultc=circle.getArea();
    circle.printDimensions();
    System.out.println(namec+resultc);
   

    Triangle triangle = new Triangle("Triangle",10,5);
    String namet=triangle.getName();
    double resultt=triangle.getArea();
    triangle.printDimensions();
    System.out.println(namet+resultt);
    

    EquilateralTriangle ET = new EquilateralTriangle("EquilateralTriangle",5,10,4);
    String nameet=ET.getName();
    double resultet=ET.getArea();
    ET.printDimensions();
    System.out.println(nameet+resultet);
    
  
 
 }
}