# Unite 1 Primitive Type RT
Notes from runeStone academy & College Board: 
'Primitive Type Unite 1 Reading Section' --done

College Board Unit 1 --done

## First Java Notes:

In Java every open curly brace { must have a matched close curly brace }. These are used to start and end class definitions and method definitions.

You must name the file the same name as the class name with “.java” as the extension. All code (programs) in Java must be defined inside a class in a source file, and the name of the class must match the file name.

## Methods to Print Output on the Screen
Java has two different methods to print output to the screen:

> System.out.println(value);
prints the value followed by a new line (ln)

> System.out.print(value) ;
prints the value without advancing to the next line

> System.out.println("Hi there!");
prints out the characters between the first " and the second " followed by a new line. The "Hi there!" is called a string literal, and it can have zero to many characters enclosed in starting and ending double quotes.

Special words—also called keywords—such as public, class, and if must be in lowercase, but class names such as System and String are capitalized. Lines in a Java program that express a complete action such as assigning a value to a variable must end with a semicolon (;). Such a line is called a statement. You can think of the semicolon (;) in Java like a period (.) in English. The same way you use a period to end a sentence in English, you use a semicolon to end a statement in Java.

#Syntax Errors and Debugging
Computers don’t actually speak Java so we have to compile (translate) Java source files that we write into class files which is code that a computer can understand and run.
Syntax errors are reported to you by the compiler if your Java code is not correctly written. Examples of syntax errors are a semicolon ; missing or if the code has a open curly brace { or open quote ", but no close curly brace } or close quote ". Informally, a syntax error is called a bug, and the process of removing errors is called debugging.

The compiler tries to run your code, but if your code has syntax errors, you will see error messages displayed below the code. Compiler error messages will tell the line number that the compiler found the error and the type of error. The error messages are not always easy to understand and sometimes the actual error is before the line that the compiler says is the problem.


## Variables

A variable is a name associated with a memory location in the computer, where you can store a value that can change or vary.
When you play a game, it will often have a score. Scores often start at 0 and increase, so they can change. A score can be stored in a variable.

## Data Types

There are two types of variables in Java: **primitive variables** that hold primitive types and object or reference variables that hold a reference to an object of a class. A reference is a way to find the object (like a UPS tracking number helps you find your package). The primitive types on the Advanced Placement Computer Science A exam are:

**int** - which store integers (numbers like 3, -76, 20393)

**double** - which store floating point numbers (decimal numbers like 6.3 -0.9, and 60293.93032)

**boolean** - which store Boolean values (either true or false).

**String is one of the object types** on the exam and is the name of a class in Java. A string object has a sequence of characters enclosed in a pair of double quotes - like “Hello”.

> A type is a set of values (a domain) and a set of operations on them. For example, you can do addition with int’s and double’s but not with booleans and Strings.

There are limits to the data that can be stored in variables. 
- int max: Integer.MAXVALUE
- int min: Integer.MINVALUE

- double: up to 14-15 digits
- boolean: true or false



**To create a variable**, you must tell Java its data type and its name. Creating a variable is also called declaring a variable. The type is a keyword like int, double, or boolean, but you get to make up the name for the variable. When you create a primitive variable Java will set aside enough bits in memory for that primitive type and associate that memory location with the name that you used.

Computers store all values using bits (binary digits). A bit can represent two values and we usually say that the value of a bit is either 0 or 1. When you declare a variable, you have to tell Java the type of the variable because Java needs to know how many bits to use and how to represent the value. The 3 different primitive types all require different number of bits. An integer gets 32 bits of memory, a double gets 64 bits of memory and a boolean could be represented by just one bit.

When you are printing out variables, you can use the string concatenation operator + to add them to another string inside System.out.print. Never put variables inside quotes "" because that will print out the variable name letter by letter. You do not want to print out the variable name, but the value of the variable in memory. If you’re not sure what this means, try putting quotes around the variable and see what happens. In the print out, if you want spaces between words and variables, you must put the space in the quotes. If you forget to add spaces, you will get smushed output like “HiJose” instead of “Hi Jose”.

## Assignment Statements & Operators

Assignment statements initialize or change the value stored in a variable using the assignment operator =. An assignment statement always has a single variable on the left hand side. The value of the expression (which can contain math operators and other variables) on the right of the = sign is stored in the variable on the left.

- Instead of saying equals for the = in an assignment statement, say “gets” or “is assigned” to remember that the variable gets or is assigned the value on the right. 

- Java uses the standard mathematical operators for addition (+), subtraction (-), and division (/). The multiplication operator is written as *, as it is in most programming languages, since the character sets used until relatively recently didn’t have a character for a real multiplication sign, ×, and keyboards still don’t have a key for it. Likewise no ÷.

- You may be used to using ^ for exponentiation, either from a graphing calculator or tools like Desmos. Confusingly ^ is an operator in Java, but it has a completely different meaning than exponentiation and isn’t even exactly an arithmetic operator. You will learn how to use the Math.pow method to do exponents in Unit 2.

- Arithmetic expressions can be of type int or double. An arithmetic expression consisting only of int values will evaluate to an int value. An arithmetic expression that uses at least one double value will evaluate to a double value. (You may have noticed that + was also used to combine String and other values into new Strings. More on this when we talk about Strings more fully in Unit 2.)

- Java uses the operator == to test if the value on the left is equal to the value on the right and != to test if two items are not equal. Don’t get one equal sign = confused with two equal signs ==. They mean very different things in Java. One equal sign is used to assign a value to a variable. Two equal signs are used to test a variable to see if it is a certain value and that returns true or false as you’ll see below. Also note that using == and != with double values can produce surprising results. Because double values are only an approximation of the real numbers even things that should be mathematically equivalent might not be represented by the exactly same double value and thus will not be ==. 

- The operator % in Java is the remainder operator. Like the other arithmetic operators is takes two operands. Mathematically it returns the remainder after dividing the first number by the second, using truncating integer division. For instance, 5 % 2 evaluates to 1 since 2 goes into 5 two times with a remainder of 1.

**Compound assignment** operators are shortcuts that do a math operation and assignment in one step. For example, x += 1 adds 1 to the current value of x and assigns the result back to x. It is the same as x = x + 1. This pattern is possible with any operator put in front of the = sign, as seen below. If you need a mnemonic to remember whether the compound operators are written like += or =+, just remember that the operation (+) is done first to produce the new value which is then assigned (=) back to the variable. So it’s operator then equal sign: +=.

Since changing the value of a variable by one is especially common, there are two extra concise operators ++ and --, also called the plus-plus or increment operator and minus-minus or decrement operator that set a variable to one greater or less than its current value.

Thus x++ is even more concise way to write x = x + 1 than the compound operator x += 1. You’ll see this shortcut used a lot in loops when we get to them in Unit 4. Similarly, y-- is a more concise way to write y = y - 1. These shortcuts only exist for + and - as they don’t really make sense for other operators.

## Casting and Range of Values

In Java, type casting is used to convert values from one type to another. By casting we don’t mean something to do with fishing, but it is a similar idea to casting a bronze, without needing to heat anything to 913 degrees Celsius. But like molten bronze is reshaped by melting it and pouring it into a mold, our data is reshaped via a cast operator. In Java when you cast you are changing the “shape” (or type) of the value.

The cast operator, which looks like (int) and (double) placed before any expression (a literal, a number, a variable, or more complex expression in parentheses) produces a value of the given type by converting the value of the original expression to the new type.

When Java divides two ints, it produces an int result by truncating the actual mathematical result, removing anything after the decimal point. Thus 9 / 10 evaluates to 0, not 0.9. It also does not evaluate to 1; truncating is not the same as rounding!

But in any expression involving a double, the double is “contagious” and will cause the value of that expression to also be a double. Thus the expression 9.0 / 10 is evaluated as if it had been written 9.0 / 10.0 and produces the double value 0.9.

Casting an int to double, as shown in the code above, produces a double value which will then causes any expression it is part of to produce a double. 

**A conversion from int to double is called a widening conversion because a double can represent any int value but not vice versa; thus a double is considered a wider data type than an int.**



# Summary

- A Java program starts with public class NameOfClass { }. If you are using your own files for your code, each class should be in a separate file that matches the class name inside it, for example NameOfClass.java.

- Most Java classes have a main method that will be run automatically. It looks like this: public static void main(String[] args) { }.

- The System.out.print() and System.out.println() methods display information given inside the parentheses on the computer monitor.

- System.out.println moves the cursor to a new line after the information has been displayed, while System.out.print does not.

- A string literal is enclosed in double quotes (’’ ‘’).

- Java statements end in ; (semicolon). { } are used to enclose blocks of code. // and /* */ are used for comments.

- A compiler translates Java code into a class file that can be run on your computer. Compiler or syntax errors are reported to you by the compiler if the Java code is not correctly written. Some things to check for are ; at end of lines containing complete statements and matching { }, (), and "".

- Type casting is used to convert value from one type to another.

- The casting operators (int) and (double) can be used to create a temporary value converted to a different data type.

- Casting a double value to an int causes the digits to the right of the decimal point to be truncated (cut off and thrown away).

- In expressions involving doubles, the double values are contagious, causing ints in the expression to be automatically converted to the equivalent double value so the result of the expression can be computed as a double.

- Values of type double can be rounded to the nearest integer by (int)(x + 0.5) or (int)(x – 0.5) for negative numbers.

- Integer values in Java are represented by values of type int, which are stored using a finite amount (4 bytes) of memory. Therefore, an int value must be in the range from Integer.MIN_VALUE to Integer.MAX_VALUE, inclusive.

- If an expression would evaluate to an int value outside of the allowed range, an integer overflow occurs. This could result in an incorrect value within the allowed range.

XOXO
melso .)


