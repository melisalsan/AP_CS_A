

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = 1.0;
        
        for(int i = 0; i < a; i++) {
            c = c*b;
        }
        System.out.println(c);
        
        sc.close();
        
    }
}
