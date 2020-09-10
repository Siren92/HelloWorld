public class Square extends Shape {
        private double side;
        public Square(String name,double side)
        {
           
            super(name);
            this.side=side;
        }
       @Override
        public double getArea()
        {
        return side*side;
        }
       @Override
        public void printDimensions(){
            System.out.println("side");
            }
        }
        
    

