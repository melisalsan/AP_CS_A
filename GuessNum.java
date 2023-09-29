import java.util.Scanner;

public class GuessNum
{
  public static void main(String args[])
  {
   Scanner sc = new Scanner(System.in);

   int a = 1 + (int) (Math.random() * 1000);
   int guess;

   System.out.println("Guess a number from 1 to 1000");

   int b = 0;

   while(b != a){
       guess = sc.nextInt();
       b = guess; 
   if (guess > a)
   {  
     System.out.println("lower!");

   }
   else if (guess < a) 
   {
    System.out.println("higher!");

   }
   else 
   {
     System.out.println("Congratulations. ");
   }
   }
  }
}