
import java.util.Scanner;
// to get responses etc

import java.util.ArrayList;
// to store students because in java apparently arrays contian a spesific number of items

class Student 
{
    
   // instance variables name and age for object student
   //private vars 
private String name;
private int age;
private String gender;


   // constructor 
    public Student(String name, int age, String gender) 
    {

    // abimin özellikler
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

   // accessors (getters)
   // non void method
    public String getName() {
        return name;
    } 

    public int getAge() {
        return age;
    }

    public String getGender(){
        return gender;
    }

   // mutators (degistirenzi)
   // 2 void method

   // this keywordu
    public void setName(String name){
        this.name = name;
    }

       // this keywordu

    public void setAge(int age){
        this.age = age;
    }

       // this keywordu
    public void setGender(String gender){
        this.gender = gender;
    }


// to string metodu
// nonvoid method
    public String toString() {
    
            return " (Student name: " + name + " , Student age: " + age + ", Student gender: " + gender + ")" ;
    }


    public static void main(String[] args)
    {
        // mekanı temizleyelim: 
        System.out.print("\033c");
        Scanner sc = new Scanner(System.in);


// storing data in an array list so i can add more
    ArrayList<Student> studentList = new ArrayList<Student>();

    ArrayList<Student> maleList = new ArrayList<Student>();

    ArrayList<Student> femaleList = new ArrayList<Student>();

   // creates an object using the constructor above. 

    Student b = new Student("melis", 17, "f");

    // devin abi tam puan ver
    Student c = new Student("devin", 18, "m");


// adding the students from above to the list. 
// manually adding the objects i created to test the constructors and the code. the rest of the objects are added to these array lists via the loop and conditional statements. 

  studentList.add(b);
  femaleList.add(b);
  maleList.add(c);
  studentList.add(c);

  // setting the string val of resart to "" so that it asks the same question each time it is answered. 

    String restart = "";

  while(true){

    //.equals methodu
    // while loops

    System.out.println("want to create a new student? (type y for yes, n for no)");
    restart = sc.nextLine();

    // if else statements

    if(restart.equals("y")){
        System.out.println("What is the name of the student you want to add?");
        String newName = sc.nextLine();

        System.out.println("How old is the student?");
        int newAge = sc.nextInt();

        // clearing input buffer 
        sc.nextLine();

        System.out.println("What is the sutdent's biological gender? (m or f)");
        String newGender = sc.nextLine();


        System.out.print("\033c");

        // creating object with the input entered by user. 
        Student a = new Student(newName, newAge, newGender);
        System.out.println("Student created successfully." + a.toString());

        // adding object to the list to store values. 
        studentList.add(a);

        if (newGender.equalsIgnoreCase("m")) {
                    maleList.add(a);
                } else if (newGender.equalsIgnoreCase("f")) {
                    femaleList.add(a);
                }


        System.out.println("New student appended to the ArrayList StudentList successfully.");
        
        //resetting the string value for restart so that the programs asks the user if they want to continue adding students or break from the loop
        restart = "";

 }
 else if(restart.equals("n")) {

    // ciao
            System.out.println("ok bye .)");

            // ending scanner session
             sc.close();

             // breaking from while loop so we dont end up in an infinite loop
             break;
            
 }
}
     // hello world
 System.out.println("Current List of Students:" + studentList);


 // seperated (grouped lists)
        System.out.println("List of Male Students: " + maleList);
        System.out.println("List of Female Students: " + femaleList);

        System.out.println("Number of students in the Students List: " + studentList.size());
        System.out.println("Number of students in the Male Students List: " + maleList.size());
        System.out.println("Number of students in the Female Students List: " + femaleList.size());

        // now we compare the male to female ratio to determine whether more girls or boys should be added to this class to ensure a balanced environment. 

        // if else else if
        // comparisons (operators)
        if (maleList.size() > femaleList.size()) {
            System.out.println("More female students must be added to the class to create a balanced environment.");

        } else if (femaleList.size() > maleList.size()){
             System.out.println("More male students must be added to the class to create a balanced environment.");
        }
        else if (maleList.size() == femaleList.size());
         System.out.println("The class is balanced.");


         System.out.println("thank you sir have a good day .)");

    }


}
