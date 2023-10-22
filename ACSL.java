
public class ACSL {
    
/*
 * PROBLEM: Given a number less than 1050, answer various questions about the number.
INPUT: There will 5 lines of input. Each will contain a positive integer less than 1050.
OUTPUT: For each line of input, answer the corresponding question below:

1. For Input Line #1, how many digits are in the number?
2. For Input Line #2, what is the sum of all of the digits in the number?
3. For Input Line #3, what is the sum of the digits at the odd locations
(the leftmost digit is Location #1)?
4. For Input Line #4, how many times does the digit 4 appear?
5. For Input Line #5, what is the middle digit? (If the length of the number, N, is even,
find the N/2 number (again, the leftmost digit is the 1st one).


SAMPLE INPUT (http://www.datafiles.acsl.org/2019/contest1/jr-sample-input.txt):
1325678945
987654
456160
143295823976154
123456


SAMPLE OUTPUT:
1. 10
2. 39
3. 16
4. 2
5. 3
 */

public static void main(String args[])

 // line 1 için: How many digits are in a number? 

/*
 * x is integer
 * c is count
 * z is x/c
 * c is printed
 */

{
int x = 3311331; //integer almakla uğraşmadım (scannerı hayal ediyoruz, bu da input)
int c = 0;

for (int i = 1; i < x; i *= 10)
  {
int z = x/i;
if (z > 1);
{
c++;
 }

}
System.out.println(c);

// line 2: what is the sum of all of the digits in the number?
/*
 * sum is sum
 * N is the remainder aka the last digit of what was left from x
 * x is the initial number
 */

int sum = 0;
int N;
int b = 10;

while (x>0)
{
    N = x % b;
    sum = sum + N;

    x = x/10;

   
 }
System.out.println(sum);

// line 3: what is the sum of the digits at the odd locations?
// line 4: how many times does the digit 4 appear?
// line 5: what is the middle digit? (If the length of the number, N, is even, find the N/2 number (again, the leftmost digit is the 1st one).




}

}



