// pen class (constructor example from sedo)
// figure this out to then finish UML Projects


// works (lütfen dokunma)

class Pen // create class pen
{
   
// instance variables
private String color; // private var decleration
private boolean isErasable; // private var declaration

public Pen(String color, boolean isErasable)  // obje constructoru
{
   // 
    this.color = color; // objenin renk zımbırtısı
    this.isErasable = isErasable; // objenin özelligi

}

   // accessors 
public String getColor() {
    return color;
} 

public boolean isErasable() {
    return isErasable;
}

   // mutators
public void setColor(String c){
    this.color = c;
}

public void setErasable(boolean e){
    this.isErasable = e;
}

// to string zımbırtsı
public String toString() {
    if(isErasable)
    {
        return "Pen is " + color + " and can be erased.";
    }
    return "Pen is " + color + " and can not be erased.";
}
}

// main method bakalım
public class constructorTest {



public static void main(String[] args)
{
    System.out.print("\033c");

   // lamy ve rotring objelerini oluşturmaca
    Pen Lamy = new Pen("blue", false); // CREATES OBJECT LAMY
    Pen Rotring = new Pen("red", true); // CREATES OBJECT ROTRING

   // basmaca
    System.out.println(Lamy);
    System.out.println(Rotring);
}
}
