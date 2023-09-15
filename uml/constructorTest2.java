// dog class 
// figure this out to then finish UML Projects

// class yarat
class Dog 
{

   // instance variables
private String name;
private String breed;
private int age;


   // constructor
public Dog(String name, String breed, int age) 
{

   // abimin özellikler
    this.age = age;
    this.breed = breed;
    this.name = name;

}

   // accessors
public String getName() {
    return name;
} 

public int getAge() {
    return age;
}

public String getBreed() {
    return breed;
}

   // mutators
public void setBreed(String b){
    this.breed = b;
}

public void setName(String n){
    this.name = n;
}

public void setAge(int a){
    this.age = a;
}


// to string
public String toString() {
   
        return "The dog is a " + breed + " , " + age + " years old, and his name is " + name;
}

}

// main method bakalım
public class constructorTest2 {

public static void main(String[] args)
{
    System.out.print("\033c");

   // objeleri yaratalım customized
    Dog dog1 = new Dog("joni", "matlese", 4); // creates dog1
    Dog dog2 = new Dog("kerim", "yakisikli", 2); // CREATES OBJECT kerim
    Dog dog3 = new Dog("uraz", "insan", 3); // creates object uraz


   //basmaca
    System.out.println(dog1);
    System.out.println(dog2);
    System.out.println(dog3);
    

    
}
}
