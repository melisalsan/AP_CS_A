import java.util.Scanner;


// 25 lines of code challenge 
// sincerely,

public class 25Lines {
    public static voic main(String[] args){
        
        Scanner input = new Scanner(System.in);
        // starts new scanner

        System.out.println("What is your name?");

        String name = input.nextLine();

        System.out.println("Hello " + name);
        System.out.println("How are you?");

        String how = input.nextLine();
        System.out.println("you have replied that you feel" + how);
        // closes the scanner
        input.close();
    }
}
