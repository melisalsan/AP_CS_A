class Student 
{

   // instance variables
private String name;
private int age;


   // constructor
    public Student(String name, int age) 
    {

    // abimin özellikler
        this.age = age;
        this.name = name;

    }

   // accessors
    public String getName() {
        return name;
    } 

    public int getAge() {
        return age;
    }

   // mutators

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }


// to string
    public String toString() {
    
            return "Student name: " + name + " , Student age: " + age;
    }

    public static void main(String[] args)
    {
        System.out.print("\033c");

    // objeleri yaratalım customized
        Student melis = new Student("melis", 17); // creates melis
        Student sera = new Student("sera", 17); // creates 
        Student Alice = new Student("Alice", 18); // creates 
    


    //basmaca
        System.out.println(melis);
        System.out.println(sera);
        System.out.println(Alice);

        

        
    }
}