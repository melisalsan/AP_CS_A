
  import java.util.Scanner;
  

 

  public static void main(String[] args){

  
  Scanner scan = new Scanner(System.in);  
  int counter = 0;
  
  String animal[] = { "balık", "turtle", "dog", "ördek", "frog"};
  
  
  while(counter <= 4) {
    System.out.println("0-4 arası bir sayı giriniz ==>> ");
    
    
    int sayi = scan.nextInt();
    
    System.out.println(animal[sayi]);
    
    counter += 1;

        System.out.println("points scored:" + counter);
    } // while end
    
    scan.close();

  }
