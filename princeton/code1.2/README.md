# Built-in Types of Data

**Characters and strings.**  A char is an alphanumeric character or symbol, like the ones that you type. We usually do not perform any operations on characters other than assigning values to variables. A String is a sequence of characters. The most common operation that we perform on strings is known as concatenation: given two strings, chain them together to make a new string.

**Integers.**  An int is an integer (whole number) between −231 and 231 − 1   (−2,147,483,648 to 2,147,483,647). We use ints frequently not just because they occur frequently in the real world, but also they naturally arise when expressing algorithms.

**Floating-point numbers.** The double type is for representing floating-point numbers, e.g., for use in scientific applications. The internal representation is like scientific notation, so that we can compute with real numbers in a huge range. We can specify a floating point number using either a string of digits with a decimal point, e.g., 3.14159 for a six-digit approximation to the mathematical constant pi, or with a notation like scientific notation, e.g., 6.022E23 for Avogadro's constant 6.022 × 1023. 

**Booleans.** The boolean type has just two values: true or false. The apparent simplicity is deceiving—booleans lie at the foundation of computer science. The most important operators defined for the boolean are for and, or, and not.

**Comparisons.** The comparison operators are mixed-type operations that take operands of one type (e.g., int or double) and produce a result of type boolean. These operations play a critical role in the process of developing more sophisticated programs.

*Type conversion.*
We often find ourselves converting data from one type to another using one of the following approaches.

- Explicit type conversion. Call methods such as Math.round(), Integer.parseInt(), and Double.parseDouble().

- Automatic type conversion. For primitive numeric types, the system automatically performs type conversion when we use a value whose type has a larger range of values than expected.
  
- Explicit casts. Java also has some built-in type conversion methods for primitive types that you can use when you are aware that you might lose information, but you have to make your intention using something called a cast. 

- Automatic conversions for strings. The built-in type String obeys special rules. One of these special rules is that you can easily convert any type of data to a String by using the + operator.


> XOXO melso .)
