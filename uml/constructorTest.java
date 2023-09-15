// pen class (constructor example from sedo)
// figure this out to then finish UML Projects


// works (lütfen dokunma)

class Pen 
{

private String color;
private boolean isErasable;

public Pen(String color, boolean isErasable) 
{
   
    this.color = color;
    this.isErasable = isErasable;

}

public String getColor() {
    return color;
} 

public boolean isErasable() {
    return isErasable;
}

public void setColor(String c){
    this.color = c;
}

public void setErasable(boolean e){
    this.isErasable = e;
}


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

    Pen Lamy = new Pen("blue", false); // CREATES OBJECT LAMY
    Pen Rotring = new Pen("red", true); // CREATES OBJECT ROTRING

    System.out.println(Lamy);
    System.out.println(Rotring);
}
}