class Book 
{

   // instance variables
private String title;
private String author;
private int pageCount;


   // constructor
    public Book(String title, String author, int pageCount) 
    {

    // abimin özellikler
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;


    }

   // accessors
    public String getTitle() {
        return title;
    } 

    public String getAuthor() {
        return author;
    } 

    public int getPageCount() {
        return pageCount;
    }

   // mutators

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setPageCount(int pageCount){
        this.pageCount = pageCount;
    }


// to string
    public String toString() {
    
            return "Book title: " + title + " , Book author: " + author + " Page Count: " + pageCount;
    }

    public static void main(String[] args)
    {
        System.out.print("\033c");

    // objeleri yaratalım customized
        Book book1 = new Book(" The Great Gatsby", "F. Scott Fitzgerald ", 250); // creates melis
     
    


    //basmaca
        System.out.println(book1);
     

        

        
    }
}