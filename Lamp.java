class Lamp {

// instance variables
private boolean isOn;
private String color;


// constructor
public Lamp(boolean isOn, String color) {
    this.isOn = isOn;
    this.color = color;
}

// void method
public void turnOn(boolean isOn) {
    this.isOn = true;
    System.out.println("Lamp is turned on.");
}

public void turnOff(boolean isOn) {
    this.isOn = false;
    System.out.println("Lamp is turned off.");
}

//void method
public void setColor(String color) {
    this.color = color;
    System.out.println("Lamp color is reset to:" + getColor());
}

public String getColor(){
    return color;
}

public static void main(String[] args)
{
    System.out.print("\033c");
    Lamp lamp1 = new Lamp(true, "pink");
    Lamp lamp2 = new Lamp(false, "blue");

    System.out.println(lamp1);
    lamp1.turnOff(false);
    lamp1.setColor(" purple");

    System.out.println(lamp2.getColor());
    lamp2.setColor(" yellow");
    
    lamp1.turnOn(false);
    System.out.println(lamp1.isOn);
 
    
}

}
