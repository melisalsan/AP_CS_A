# 2 Objects - Instances of Classes
Java is an object-oriented programming language. That means that one of the primary ways of organizing our programs is in terms of objects. Objects are a kind of value that combines data and the code that operates on that data into a single unit. Objects are defined in Java by writing classes which provide a blueprint for creating objects of a certain kind, describing the data and code that all instances of that class have.

Classes define the attributes and behaviours of the objects we create. 

## 2.1 The relationship between classes and objects

An object is an instance of a class.
The object is the spesific entity made from that class that you can manipulate. 

We use vars to name these classes. 
When you think about making objects from a class, you can think of a class like a blueprint or a cookie cutter. It is used to create the cookies (objects) and can be used to create as many cookies (objects) as you want. As a blueprint, each class defines the attributes its objects have (the properties or what each object knows about itself) and the behaviors (what each object can do). In Java code, the attributes are written as instance variables in the class, and the behaviors are written as methods.

You can also think of a class defining a new type. Just like you use int to declare variables that can hold an whole number value, you can use Turtle to declare a variable whose value has to be an instance of the Turtle class. And just like the Java compiler will only let you do things with the values of int variables that make sense (like adding and multiplying them), it will only let you do things with values of a Turtle variable that make sense to do with turtles, namely accessing the instance variables and methods defined in the Turtle class.

## The dot operator (.)
The dot operator (.) is used to run an object’s method. You can think of the (.) as asking the object to do something (execute one of its methods). For example, yertle.forward() asks the turtle yertle to go forward. It doesn’t tell yertle how much to go forward, so it goes forward 100 pixels by default. The parentheses () after a method name are there in case you need to give the method arguments (some data) to do its job, for example to go forward 50 pixels instead of 100 in yertle.forward(50); Try changing the code above to go forward 50 pixels instead and then run it again.

* A class defines a new data type (a classification). It is the formal implementation, or blueprint, of the attributes and behaviors of the objects of that class.

* An object is a specific instance of a class with defined attributes. Objects are declared as variables of a class type.

* An attribute or instance variable is data the object knows about itself. For example a turtle object knows the direction it is facing or its color.

* A behavior or method is something that an object can do. For example a turtle object can go forward 100 pixels.

## 2.2. Creating and Initializing Objects: Constructors
A Java class defines what objects of the class know (attributes) and what they can do (behaviors). Each class has constructors which are used to initialize the attributes in a newly created object.

* There can be more than one constructor defined in a class. This is called overloading the constructor. There is usually a constructor that has no parameters (nothing inside the parentheses following the name of the constructor) . This is also called the no-argument constructor. The no-argument constructor usually sets the attributes of the object to default values.

* There can also be other constructors that take parameters. A parameter (also called actual parameter or argument) is a value that is passed into a constructor. It can be used to initialize the attribute of an object.

## null (go back to this in runstone 2.2)
You can also declare an object variable and initialize it to null (Turtle t1 = null;). An object variable holds a reference to an object. A reference is a way to find the object in memory. It is like a tracking number that you can use to track the location of a package.

## Signatures
When you use a class that someone has already written for you in a library that you can impor, you can look up how to use the constructors and methods in the documentation for that class. The documentation will list the signatures (or headers) of the constructors or methods which will tell you their name and parameter list. The parameter list, in the header of a constructor, lists the formal parameters, declaring the variables that will be passed in as values and their data types.

Constructors are overloaded when there are multiple constructors, but the constructors have different signatures. They can differ in the number, type, and/or order of parameters. For example, they make take different parameters. 

## Formal vs Actual Parameters
When a constructor like Date(2005,9,1) is called, the formal parameters, (year, month, day), are set to copies of the actual parameters (or arguments), which are (2005,9,1). This is call by value which means that copies of the actual parameter values are passed to the constructor. These values are used to initialize the object’s attributes.

The type of the values being passed in as arguments have to match the type of the formal parameter variables. We cannot give a constructor a String object when it is expecting an int. The order of the arguments also matters. If you mix up the month and the day in the Date constructor, you will get a completely different date, for example January 9th (1/9) instead of Sept. 1st (9/1).

(the order of the parameters and the type of the parameters)

* Constructors initialize the attributes in newly created objects. They have the same name as the class.

* A constructor signature is the constructor name followed by the parameter list which is a list of the types of the parameters and the variable names used to refer to them in the constructor.

* Overloading is when there is more than one constructor. They must differ in the number, type, or order of parameters.

* New is a keyword that is used to create a new object of a class. The syntax is new ClassName(). It creates a new object of the specified class and calls a constructor.

* A no-argument constructor is a constructor that doesn’t take any passed in values (arguments).

* Parameters allow values to be passed to the constructor to initialize the newly created object’s attributes.

* The parameter list, in the header of a constructor, is a list of the type of the value being passed and a variable name. These variables are called the formal parameters.

* Actual parameters are the values being passed to a constructor. The formal parameters are set to a copy of the value of the actual parameters.

* Formal parameters are the specification of the parameters in the constructor header. In Java this is a list of the type and name for each parameter (World(int width, int height).

* Call by value means that when you pass a value to a constructor or method it passes a copy of the value.

## 2.3. Calling Methods Without Parameters

Methods are a set of instructions that define behaviors for all objects of a class. 
To use an object’s method, you must use the object name and the dot (.) operator followed by the method name.
These are called object methods or non-static methods. An object method must be called on an object of the class that the method is defined in. Object methods work with the attributes of the object.

Every method call is followed by parentheses. The parentheses () after method names are there in case you need to give the method parameters (data) to do its job.

## 2.3.1. Procedural Abstraction 
Procedural abstraction allows a programmer to use a method and not worry about the details of how it exactly works. For example, we know that if we hit the brakes, the car will stop, and we can still use the brakes even if we don’t really know how they work.

Methods inside the same class can call each other using just methodName(), but to call non-static methods in another class or from a main method, you must first create an object of that class and then call its methods using object.methodName().

Before you call a method from main or from outside of the current class, you must make sure that you have created and initialized an object. Remember that if you just declare an object reference without setting it to refer to a new object the value will be null meaning that it doesn’t reference an object. If you call a method on a variable whose value is null, you will get a NullPointerException error, where a pointer is another name for a reference.

* Methods are a set of instructions that define the behaviors for all objects of the class.

* Use dot notation to execute an object’s method. This is the object’s name followed by the dot (.) operator followed by the method name and parentheses: object.method();

* A method signature is the method name followed by the parameter list which gives the type and name for each parameter. Note that methods do not have to take any parameters, but you still need the parentheses after the method name.

* Procedural abstraction allows a programmer to use a method by knowing in general what it does without knowing what lines of code execute. This is how we can drive a car without knowing how the brakes work.

* A method or constructor call interrupts the sequential execution of statements, causing the program to first execute the statements in the method or constructor before continuing. Once the last statement in the method or constructor has executed or a return statement is executed, the flow of control is returned to the point immediately following the method or constructor call.

* A NullPointerException will happen if you try to call an object method on an object variable whose value is null. This usually means that you forgot to create the object using the new operator followed by the class name and parentheses.

* An object method or non-static method is one that must be called on an object of a class. It usually works with the object’s attributes.

* A static method or class method method is one that doesn’t need to be called on an object of a class.

## 2.4. Calling Methods With Parameters

The parentheses () after method names when we call a method are there in case you need to give the method actual parameters or arguments (some data) to do its job.

Although some people use the words parameters and arguments interchangeably, there is a subtle difference. When you create your own method, the variables you define for it are called formal parameters. When you call the method to do its job, you give or pass in arguments or actual parameters to it that are then saved in the parameter variables. 

Methods are said to be overloaded when there are multiple methods with the same name but a different method signature, where it requires a different number or type of parameters. For example, we have two different forward methods, forward() with no parameters and forward(100) which has a parameter that tells it how much to move forward. If there is more than one parameter, then the values given to the method need to correspond to the order and types in the method signature.

* Methods define the behaviors or functions for objects.

* To use an object’s method, you must use the object name and the dot (.) operator followed by the method name, for example object.method();

* Some methods take parameters/arguments that are placed inside the parentheses object.method(arguments).
Formal parameters are the default.
Actual parameters are the arguments you pass in once you call the method. 

* Values provided in the parameter list need to correspond to the order and type in the method signature.

## Methods with return values .)
Void methods: Because a void method doesn’t return any value, the only point of calling one is because it does something that can be observed by the user or by other code—it changes the state of the object or maybe causes something to happen like drawing a line on the screen. Or both. These things they do are sometimes called “effects”.

In contrast, methods with a return type of anything other than void are called non-void methods. These methods return a value that the code calling the method can use. And because methods are called on an object, these methods can be used to return values that tell us things about an object’s internal state.

 To put it another way, void methods do things while non-void methods produce values.

## 2.5.1. Accessors / Getters

A simple kind of method that returns a value is what is formally called an accessor because it accesses a value in an object. In the real world everyone calls them getters. A getter is a method that takes no arguments and has a non-void return type. In Java they are almost always named something that starts with get, and they usually just return the value of one of the object’s instance variables. 

## 2.5.2. Methods with Arguments and a Return Value
Since getters take no arguments, all they can do is return a value based on the current state of the object. But often it’s useful to have methods that compute values based on both the current state of the object and some arguments.

Methods that take arguments and return values are somewhat like mathematical functions. Given some input, they return a value.
Notice that the return statement in a method returns the value, and it must match declared return type of the method. The calling method must then do something useful with that value.

## String is not a primitive type... 
Strings in Java are objects of the String class that hold sequences of characters (a, b, c, $, etc). Remember that a class (or classification) in Java defines the data that all objects of the class have (the fields) and the behaviors, the things that objects know how to do (the methods).

You can declare a variable to be of type String.
Class names in Java, like String, begin with a capital letter. All primitive types: int, double, and boolean, begin with a lowercase letter. This is one easy way to tell the difference between primitive types and class types.

The code above declares an object variable named greeting and sets the value of greeting to the Java keyword null to show that it doesn’t refer to any object yet. So System.out.println(greeting); will print null.

In Java there are two ways to create an object of the String class. You can use the new keyword followed by a space and then the class constructor and then in parentheses you can include values used to initialize the fields of the object. This is the standard way to create a new object of a class in Java.

' ' '
String greeting = new String("Hello");
' ' '

In Java you can also use just a string literal, which is a set of characters enclosed in double quotes ("), to create a String object.

' ' '
String greeting = "Hello";
' ' '

 A class can inherit object fields and methods from a parent class, just like you might inherit musical ability from a parent.

 ## 2.6.1. String Operators - Concatenation
Strings can be added to each other to create a new string using the + or += operator . This is also called appending or concatenating. You can also add any other kind of value to a String with + or += and the other value will be converted to a String automatically.

Remember, however, that Strings are immutable, just like ints and doubles. So when we add two Strings (or a String and another value converted to a String) we get a new String without making any change to the values being added together just like when we add 1 + 2 the original 1 and 2 aren’t changed. When we use += we are making a new String by adding something to the current value of a variable and then assigning that new value back into the variable, again just like with numbers.

Note that spaces are not added between strings automatically. If you want a space between two strings then add one using + “ “ +. If you forget to add spaces, you will get smushed output like “HiJose” instead of “Hi Jose”. And remember that variables are never put inside the quotes (“”) since this would print the variable name out letter by letter instead of its value.

You can even add other items to a string using the + operator. Primitive values like int and boolean will be converted to a String like what you would type into a Java program and objects will be converted to String using the toString method discussed in the previous section. All objects inherit a toString method that returns a String representation of the object and many classes override it to produce a useful human-readable value.

* Strings in Java are objects of the String class that hold sequences of characters.

* String objects can be created by using string literals (String s = “hi”;) or by calling the String class constructor (String t = new String(“bye”);).

* new is used to create a new object of a class.

* null is used to indicate that an object reference doesn’t refer to any object yet.

* String objects can be concatenated using the + or += operator, resulting in a new String object.

* Primitive values can be concatenated with a String object. This causes implicit conversion of the values to String objects.

* Escape sequences start with a backslash \ and have special meaning in Java. Escape sequences used in this course include \", \\, and \n to print out a quote, backslash, and a new line.

## String methods
A string holds characters in a sequence. Each character is at a position or index which starts with 0 as shown below. An index is a number associated with a position in a string. The length of a string is the number of characters in it including any spaces or special characters. 

String methods to know!
* int length() method returns the number of characters in the string, including spaces and special characters like punctuation.

* String substring(int from, int to) method returns a new string with the characters in the current string starting with the character at the from index and ending at the character before the to index (if the to index is specified, and if not specified it will contain the rest of the string).

* int indexOf(String str) method searches for the string str in the current string and returns the index of the beginning of str in the current string or -1 if it isn’t found.

* int compareTo(String other) returns a negative value if the current string is less than the other string alphabetically, 0 if they have the same characters in the same order, and a positive value if the current string is greater than the other string alphabetically.

* boolean equals(String other) returns true when the characters in the current string are the same as the ones in the other string. This method is inherited from the Object class, but is overridden which means that the String class has its own version of that method.

## 2.7.2. CompareTo and Equals
We can compare primitive types like int and double using operators like == and < or >, which you will learn about in the next unit. However, with reference types like String, you must use the methods equals and compareTo, not == or < or >.

The method compareTo compares two strings character by character. If they are equal, it returns 0. If the first string is alphabetically ordered before the second string (which is the argument of compareTo), it returns a negative number. And if the first string is alphabetically ordered after the second string, it returns a positive number. (The actual number that it returns does not matter, but it is the distance in the first letter that is different, e.g. A is 7 letters away from H.)

The equals method compares the two strings character by character and returns true or false. Both compareTo and equals are case-sensitive. There are case-insensitive versions of these methods, compareToIgnoreCase and equalsIgnoreCase, which are not on the AP exam.

## API's
An Application Programming Interface (API) is a library of prewritten classes that simplify complex programming tasks for us. These classes are grouped together in a package like java.lang and we can import these packages (or individual classes) into our programs to make use of them. For instance, we have just discussed the String library built into the default java.lang package - it takes care of the detailed work of manipulating strings for us. There are many other useful library packages as well, both in the java.lang package and in other packages. Documentation for APIs and libraries are essential to understanding how to use these classes.

## Mistakes with Strings: Look Out!
Here is a list of common mistakes made with Strings.

* Thinking that substrings include the character at the last index when they don’t.

* Thinking that strings can change when they can’t. They are immutable.

* Trying to access part of a string that is not between index 0 and length -1. This will throw an IndexOutOfBoundsException.

* Trying to call a method like indexOf on a string reference that is null. You will get a null pointer exception.

* Using == to test if two strings are equal. This is actually a test to see if they refer to the same object. Usually you only want to know if they have the same characters in the same order. In that case you should use equals or compareTo instead.

* Treating upper and lower case characters the same in Java. If s1 = "Hi" and s2 = "hi" then s1.equals(s2) is false.


## Strings Summary
* index - A number that represents the position of a character in a string. The first character in a string is at index 0.
* length - The number of characters in a string.
* substring - A new string that contains a copy of part of the original string.
* A String object has index values from 0 to length – 1. Attempting to access indices outside this range will result in an IndexOutOfBoundsException.
* String objects are immutable, meaning that String methods do not change the String object. Any method that seems to change a string actually creates a new string.
* The following String methods and constructors, including what they do and when they are used, are part of the AP CSA Java Quick Reference Sheet that you can use during the exam:
* String(String str) : Constructs a new String object that represents the same sequence of characters as str.
* int length() : returns the number of characters in a String object.
* String substring(int from, int to) : returns the substring beginning at index from and ending at index (to -1).
* String substring(int from) : returns substring(from, length()).
* int indexOf(String str) : searches for str in the current string and returns the index of the first occurrence of str; returns -1 if not found.
* boolean equals(String other) : returns true if this (the calling object) is equal to other; returns false otherwise.
* int compareTo(String other) : returns a value < 0 if this is less than other; returns zero if this is equal to other; returns a value > 0 if this is greater than other.
* str.substring(index, index + 1) returns a single character at index in string str.

## 2.8. Wrapper Classes - Integer and Double
For every primitive type in Java, there is a built-in object type called a wrapper class. The wrapper class for int is called Integer, and for double it is called Double. Sometimes you may need to create a wrapped object for a primitive type so that you can give it to a method that is expecting an object. To wrap a value, call the constructor for the wrapper class in earlier versions of Java. In Java 9 on, this is deprecated which means it’s not the best way to do this anymore, and you should instead just set it equal to a value.

These wrapper classes (defined in the java.lang package) are also useful because they have some special values (like the minimum and maximum values for the type) and methods that you can use. 

The int type in Java can be used to represent any whole number from -2147483648 to 2147483647. Why those numbers? Integers in Java are represented in 2’s complement binary and each integer gets 32 bits of space. In 32 bits of space with one bit used to represent the sign you can represent that many values. Why is there one more negative number than positive number? It is because 0 is considered a positive number.

Java will actually return the maximum integer value if you try to subtract one from the minimum value. This is called underflow. And, Java will return the minimum integer value if you try to add one to the maximum. This is called overflow. It is similar to how odometers work – in a really old car that reaches the maximum miles possible on the odometer, the odometer rolls over back to 0, the minimum value. In Java, any int value that surpasses 32 bits gets rolled over, so that the Integer.MAX_VALUE 2147483647 incremented (+1) returns -2147483648 which is the Integer.MIN_VALUE.

*Autoboxing* is the automatic conversion that the Java compiler makes between primitive types and their corresponding object wrapper classes. This includes converting an int to an Integer and a double to a Double. The Java compiler applies autoboxing when a primitive value is passed as a parameter to a method that expects an object of the corresponding wrapper class or assigned to a variable of the corresponding wrapper class. Here’s an example of autoboxing.

*Unboxing* is the automatic conversion that the Java compiler makes from the wrapper class to the primitive type. This includes converting an Integer to an int and a Double to a double. The Java compiler applies unboxing when a wrapper class object is passed as a parameter to a method that expects a value of the corresponding primitive type or assigned to a variable of the corresponding primitive type.

## Wrapper Classes Summary
* The Integer class and Double class are wrapper classes that create objects from primitive types.

* The following Integer methods and constructors, including what they do and when they are used, are part of the Java Quick Reference.

* Integer(value): Constructs a new Integer object that represents the specified int value.

* Integer.MIN_VALUE : The minimum value represented by an int or Integer.

* Integer.MAX_VALUE : The maximum value represented by an int or Integer.

* int intValue() : Returns the value of this Integer as an int.

* The following Double methods and constructors, including what they do and when they are used, are part of the Java Quick Reference Guide given during the exam:

  Double(double value) : Constructs a new Double object that represents the specified double value.

  double doubleValue() : Returns the value of this Double as a double.

 > Autoboxing is the automatic conversion that the Java compiler makes between primitive types and their corresponding object wrapper       classes. This includes converting an int to an Integer and a double to a Double. The Java compiler applies autoboxing when a primitive value is:
* Passed as a parameter to a method that expects an object of the corresponding wrapper class.
* Assigned to a variable of the corresponding wrapper class.

  > Unboxing is the automatic conversion that the Java compiler makes from the wrapper class to the primitive type. This includes converting an Integer to an int and a Double to a double. The Java compiler applies unboxing when a wrapper class object is:
  * Passed as a parameter to a method that expects a value of the corresponding primitive type.
  * Assigned to a variable of the corresponding primitive type

## Hello Math in Java
These methods are in the Math class defined in the java.lang package. These are static methods which means you can call them by just using ClassName.methodName() without creating an object. This is why we can just say Math.random() instead of having to define an object of the class Math.

Static methods (also called class methods) are called using the class name and the dot operator (.) followed by the method name. You do not need to create an object of the class to use them. You can use ClassName.methodName() or just methodName() if they are called from within the same class.

Math Functions:
The Math class contains the following methods that are in the AP CSA subset. There are more Math methods, outside of what you need on the AP exam, that you can find in the Math class Javadocs.

* int abs(int) : Returns the absolute value of an int value (which is the value of a number without its sign, for example Math.abs(-4) = 4).

* double abs(double) : Returns the absolute value of a double value.

* double pow(double, double) : Returns the value of the first parameter raised to the power of the second parameter.

* double sqrt(double) : Returns the positive square root of a double value.

* double random() : Returns a double value greater than or equal to 0.0 and less than 1.0 (not including 1.0!).

The Math.random() method returns a double number greater than or equal to 0.0, and less than 1.0. When we talk about ranges of numbers sometimes we need to be precise about whether the ends of the range are part of the range. For example, Math.random returns a number between 0 and 1, but does that mean it can return exactly 0? Or exactly 1? As it turns out it can return 0 but never returns 1.

When we need to be precise about this we’d say that it returns a number between 0, inclusive, and 1, exclusive, meaning include 0 but exclude 1. Lots of ranges in Java are expressed this way, as you’ll see later on with an inclusive bottom and exclusive top.

The value Math.random returns is like the initial amount of money in your pocket, always a bit less than $1. If you multiply that value by any amount, it will stretch it into the range you want.

# Unit 2 Wrap-up

Conceptually;
* class - defines a new data type. It is the formal implementation, or blueprint, of the attributes and behaviors of the objects of that class.

* object - a specific instance of a class with defined attributes. Objects are declared as variables of a class type.

* constructors - code that is used to create new objects and initialize the object’s attributes.

* new - keyword used to create objects with a call to one of the class’s constructors.

* instance variables - define the attributes for objects.

* methods - define the behaviors or functions for objects.

* dot (.) operator - used to access an object’s methods.

* parameters (arguments) - the values or data passed to an object’s method inside the parentheses in the method call to help the method do its job.

* return values - values returned by methods to the calling method.

* immutable - String methods do not change the String object. Any method that seems to change a string actually creates a new string.

* wrapper classes - classes that create objects from primitive types, for example the Integer class and Double class.

Careful;
Here are some common mistakes... 
* Forgetting to declare an object to call a method from main or from outside of the class, for example object.method();

* Forgetting () after method names when calling methods, for example object.method();

* Forgetting to give the right parameters in the right order to a method that requires them.

* Forgetting to save, print, or use the return value from a method that returns a value, for example int result = Math.pow(2,3);

* Using == to test if two strings or objects are equal. This is actually a test to see if they refer to the same object. Usually you only want to know if they have the same characters in the same order. In that case you should use equals(String) or compareTo(String) instead.

* Treating upper and lower case characters the same in Java. If s1 = "Hi" and s2 = "hi" then s1.equals(s2) is false.

* Thinking that substrings include the character at the last index when they don’t.

* Thinking that strings can change when they can’t. They are immutable.

* Trying to call a method like str1.indexOf(str2) with a string reference str1 that is null. You will get a null pointer exception.

  




