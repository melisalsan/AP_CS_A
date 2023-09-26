class Circle 
{

   // instance variables
private double radius;

   // constructor
    public Circle(double radius) 
    {

    // abimin özellikler
        this.radius = radius;
       

    }

   // accessors
    public double getRadius() {
        return radius;
    } 


   // mutators

    public void setRadius(double radius){
        this.radius = radius;
    }



// to string
    public String toString() {
    
            return "Radius " + radius;
    }

    public static void main(String[] args)
    {
        System.out.print("\033c");

    // objeleri yaratalım customized
        Circle c1 = new Circle(5.0); // creates melis
     
    


    //basmaca
        System.out.println(c1);
     

        

        
    }
}