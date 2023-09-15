
import java.util.Scanner;

public class slope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double x = a - c ;
        double y = b - d ;
        double m = Math.sqrt(x*x + y*y);
        
        System.out.println(m);
        
        sc.close();
        
    }
}
