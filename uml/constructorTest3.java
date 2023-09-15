// band class 
// öğrendik artık


// create class
class Band 
{

   //instance vars 
private String artist;
private int year;

   // constructor for obje
public Band(String artist, int year) 
{
   // varlar
    this.artist = artist;
    this.year = year;
}


   //accessors
public String getArtist() {
    return artist;
} 

public int getYear() {
    return year;
}


   // mutators
public void setArtist(String a){
    this.artist = a;
}

public void setYear(int y){
    this.year = y;
}


// tostring
public String toString() {
   
        return "The artist is " + artist + " and the year is " + year;
}

}

// main method bakalım
public class constructorTest3 {

    public static void main(String[] args)
    {
        System.out.print("\033c");

       // create 2 new obje
        Band duman = new Band("Duman", 2014); // creates duman
        Band ACDC = new Band("ACDC", 2016); // creates ACDC

       //basmaca
        System.out.println(duman);
        System.out.println(ACDC);

       // mutator ve accessor test
        duman.setYear(2018);
        System.out.println(duman.getYear());
        System.out.println(ACDC.getArtist());
        


        
    }
}
