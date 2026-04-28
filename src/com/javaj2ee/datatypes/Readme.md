# Datatypes(Primitive DataTypes)
These are snapshots of different data types in java.
![img.png](img.png)

###  Primitive types.
1. Java is a strong-typed language.
2. Java compiler checks for type compatibility in code.
3. If compatibility is not matched,compiler throws error.
4. Normal decimal literal like(1.2,3.24 etc.) are considered as double.
5. Similarly, 2_000_00_000 literals are considered as integer.
6. To specify the compiler f,l,d etc. are mentioned after literal.
7. for datatype conversion, a bigger size datatype can hold smaller size datatype.
8. if we need to convert from smaller size data to bigger size data, we need to typecast.
9. In the above case,there is a chance of overflow.
10. Assigning integer literals to its wrapper class is autoboxing and vice-verse is unboxing.

###  Number System.
1. There are decimal, binary,octal and hexadecimal number system.
2. in Java numbers are by default decimal.Binary,octal and hexadecimal numbers need to be represented differently.

### Arrays
1. Arrays are collections of elements of primitive data types.
2. In java,arrays are of fixed length.
3. Each element of array is initialized by default value of the primitive data type.
4. Arrays class is used to do operations on array like print and sort.
5. 2D arrays are not defined in java explicitly. It is defined as arrays of arrays.

### Operators and Operations.
1. Unary operators like ++, -- are used in prefix and suffix.
2. Prefix is one in which the operations are performed and result is assigned.
3. Suffix is one in which the operations are performed after the result is assigned.
4. logical operation have two types of operations.
   1. Short circuit logical operation.
   2. Non-short circuit logical operation.
5. Short circuit logical operation is one in which the second operand is not evaluated if the first operand is sufficient to determine the result of the expression.
6. Non-short circuit logical operation is one in which the second operand is evaluated even if the first operand is sufficient to determine the result of the expression.
7. Bitwise operators are used to perform operations on bits and binary numbers.
8. Ternary operator is used to evaluate a boolean expression and return one of the two values based on the result of the expression.
9. Assignment operators are used to assign values to variables. They include simple assignment operator(=) and compound assignment operators(+=, -=, *=, /=, %=, &=, |=, ^=, <<=, >>=, >>>=).
10. Operator precedence is the order in which operators are evaluated in an expression. 
11. It is determined by the rules of operator precedence and associativity. 
11. Operators with higher precedence are evaluated before operators with lower precedence. 
12. If two operators have the same precedence, their associativity determines the order of evaluation. 
13. Left-associative operators are evaluated from left to right, while right-associative operators are evaluated from right to left.

### BigDecimal and BigInteger.
1. BigDecimal and BigInteger are classes in java that are used to represent and perform operations on large numbers with high precision.
2. BigDecimal is used for representing decimal numbers with arbitrary precision, while BigInteger is used for representing integers with arbitrary precision.
3. Both classes provide methods for performing arithmetic operations, such as addition, subtraction, multiplication, and division, as well as methods for comparing and manipulating the values.
4. BigDecimal is used when we need to perform operations on currency values like calculating credit card payment etc.

### Maths class.
1. The Math class in Java provides a collection of static methods for performing mathematical operations such as basic arithmetic, trigonometric functions, logarithmic functions, and more.
2. Some commonly used methods in the Math class include:
   1. `Math.abs()`: Returns the absolute value of a number.
   2. `Math.sqrt()`: Returns the square root of a number.
   3. `Math.pow()`: Returns the value of the first argument raised to the power of the second argument.
   4. `Math.max()`: Returns the maximum of two values.
   5. `Math.min()`: Returns the minimum of two values.
3. The Math class also provides constants such as `Math.PI` and `Math.E` for representing the mathematical constants pi and e, respectively.
4. The Math class is part of the `java.lang` package, which is automatically imported in every Java program, so you can use its methods without needing to import it explicitly. 


### Type of Expression in Java.