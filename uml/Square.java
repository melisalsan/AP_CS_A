public class Square extends Rectangle {
    
    public Square () {  // constructor
       super(side , side);

    }

    public double getSide() { // non-void method
        return getLength();
    }

      public void setSide(double side) {// void method
        setLength(side);
        setWidth(side);

    }
 
   public String toString() {
        return "Square Side Length: " + getSide();
    }


    public boolean equals(Square other) { // equals şeyi
        if (this.side == other.side) 
        {
            return "yes, they are equal";
        }
        else {
            return "no, they are not";
        }
    }


    public static void main(String[] args) {
        Square s1 = new Square(5.0); // create 1
        Square s2 = new Square(5.0); // create 1


        // for square 1: 
        System.out.println("Square 1:");
        System.out.println("Length: " + s1.getLength());
        System.out.println("Width: " + s1.getWidth());
        System.out.println("Area: " + s1.getArea());
        System.out.println("Perimeter: " + s1.getPerimeter());


        // for square 2: 
        System.out.println("\n Square 2:");
        System.out.println("Length: " + s2.getLength());
        System.out.println("Width: " + s2.getWidth());
        System.out.println("Area: " + s2.getArea());
        System.out.println("Perimeter: " + s2.getPerimeter());

    }
}