
public class Loop {
    /* 
     * use a loop to print:
     * 12 midnight
     * 1 am
     * 2 am
     * ...
     * 11 pm
    */


    public static void main(String args[])
    {
        for ( int hour = 0; hour < 24; hour++) {
            
            if (hour == 0)
            {
                System.out.println("12 midnigth");
            
            }
            else if (hour > 0 && hour < 12)
            {
                System.out.println(hour + " am");
            }
            else if (hour == 12)
            {
                System.out.println(hour + " noon");
            }
            else if (hour > 12)
            {
            int hour2 = hour -12;
            System.out.println(hour2 + " pm");
            }

            }

        }
    }
