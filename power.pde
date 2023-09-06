
import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double a2 = (a * a);
        double a3 = (a * a * a);
        System.out.println("squared a = " + a2);
        System.out.println("cubed a =" + a3);
        
        sc.close();
        
    }
}
