
import java.util.Scanner;
  
public class BMI {
  public static void main(String args[]){

  
      Scanner scan = new Scanner(System.in);  
      
      double w = scan.nextDouble();
      double h = scan.nextDouble();
      
      double b = w / (h*h);
  
      System.out.println(b);
      scan.close();


  }

}
