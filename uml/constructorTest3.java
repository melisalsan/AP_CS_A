// band class 
// figure this out to then finish UML Projects

class Band 
{

private String artist;
private int year;

public Band(String artist, int year) 
{
   
    this.artist = artist;
    this.year = year;
}

public String getArtist() {
    return artist;
} 

public int getYear() {
    return year;
}


public void setArtist(String a){
    this.artist = a;
}

public void setYear(int y){
    this.year = y;
}



public String toString() {
   
        return "The artist is " + artist + " and the year is " + year;
}

}

// main method bakalım
public class constructorTest3 {

    public static void main(String[] args)
    {
        System.out.print("\033c");

        Band duman = new Band("Duman", 2014); // creates duman
        Band ACDC = new Band("ACDC", 2016); // creates ACDC

        System.out.println(duman);
        System.out.println(ACDC);
    
        
    }
}