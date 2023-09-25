/*   Write a program CartesianToPolar.java 
that converts from Cartesian to polar coordinates. 
Your program should take two real numbers x and y on the command line and print the polar coordinates r and θ.
 Use the Java method Math.atan2(y, x), which computes the arctangent value of y/x that is in the range from -π to π.*/


public class CartesianToPolar {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        double r     = Math.sqrt(x*x + y*y); // radical distance 
        double theta = Math.atan2(y, x); // is the counterclockwise angle from the x-axis

        System.out.println("r     = " + r);
        System.out.println("theta = " + theta);
    }

}