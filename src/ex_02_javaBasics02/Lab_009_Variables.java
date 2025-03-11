package ex_02_javaBasics02;

public class Lab_009_Variables {
    // This program demonstrates the use of variables and different data types in Java.

        public static void main(String[] args) {

            // ====================== Primitive Data Types ======================

            // 1. Integer Data Types (Whole numbers)

            // 'byte' - Stores very small whole numbers (from -128 to 127).
            byte byteVariable = 100;
            System.out.println("===== Byte Data Type =====");
            System.out.println("Variable Name: byteVariable");
            System.out.println("Value: " + byteVariable);

            System.out.println(); // Print an empty line for better readability

            // 'short' - Stores small whole numbers (from -32,768 to 32,767).
            short shortVariable = 30000;
            System.out.println("===== Short Data Type =====");
            System.out.println("Variable Name: shortVariable");
            System.out.println("Value: " + shortVariable);

            System.out.println();

            // 'int' - Stores integers (whole numbers). Most commonly used for integers.
            int intVariable = 123456789;
            System.out.println("===== Integer Data Type (int) =====");
            System.out.println("Variable Name: intVariable");
            System.out.println("Value: " + intVariable);

            System.out.println();

            // 'long' - Stores very large integers. Use 'L' suffix to denote a long literal.
            long longVariable = 123456789012345L;
            System.out.println("===== Long Data Type =====");
            System.out.println("Variable Name: longVariable");
            System.out.println("Value: " + longVariable);

            System.out.println();

            // 2. Floating-Point Data Types (Decimal numbers)

            // 'float' - Stores single-precision floating-point numbers. Use 'f' or 'F' suffix.
            float floatVariable = 3.14159f; // 'f' suffix is important for float literals.
            System.out.println("===== Float Data Type =====");
            System.out.println("Variable Name: floatVariable");
            System.out.println("Value: " + floatVariable);

            System.out.println();

            // 'double' - Stores double-precision floating-point numbers. More precise than float and commonly used.
            double doubleVariable = 2.718281828459045;
            System.out.println("===== Double Data Type =====");
            System.out.println("Variable Name: doubleVariable");
            System.out.println("Value: " + doubleVariable);

            System.out.println();

            // 3. Character Data Type

            // 'char' - Stores a single Unicode character. Enclosed in single quotes ''.
            char charVariable = 'J';
            System.out.println("===== Character Data Type (char) =====");
            System.out.println("Variable Name: charVariable");
            System.out.println("Value: " + charVariable);

            System.out.println();

            // 4. Boolean Data Type

            // 'boolean' - Stores a logical value, either 'true' or 'false'.
            boolean booleanVariable = true;
            System.out.println("===== Boolean Data Type =====");
            System.out.println("Variable Name: booleanVariable");
            System.out.println("Value: " + booleanVariable);

            System.out.println();


            // ====================== Reference Data Type (String) ======================

            // 'String' - Stores sequences of characters (text). Enclosed in double quotes "".
            // Note: String is a class in Java, not a primitive type, but it's very commonly used.
            String stringVariable = "Hello, Java Variables!";
            System.out.println("===== String Data Type (Reference Type) =====");
            System.out.println("Variable Name: stringVariable");
            System.out.println("Value: " + stringVariable);

        } // End of main method
    } // End of DataTypesExample class


/*
Explanation of Key Concepts in this Program:

1. Variables:
   - Variables are named storage locations in the computer's memory used to hold data.
   - In Java, you must declare a variable before you can use it, specifying its data type and name.
   - Variable names should be descriptive and follow Java naming conventions (camelCase for variables, start with a letter, $, or _, etc.).

2. Data Types:
   - Java is a strongly-typed language, meaning every variable must have a declared data type.
   - Data types categorize the kind of values a variable can hold.
   - Java has two main categories of data types:
     a) Primitive Data Types:  Represent single values directly. They are built-in to Java.
        - Integer Types: byte, short, int, long (for whole numbers of different ranges)
        - Floating-Point Types: float, double (for decimal numbers with different precision)
        - Character Type: char (for single characters)
        - Boolean Type: boolean (for logical true/false values)
     b) Reference Data Types:  Hold references (memory addresses) to objects. Examples include:
        - String: For text strings (sequences of characters). Note: String is a class, not primitive, but very fundamental.
        - Arrays, Classes, Interfaces, etc. (You'll learn about these later).

3. Declaration and Initialization:
   - Declaration:  `dataType variableName;` (e.g., `int age;`) - Tells Java the variable's name and type.
   - Initialization: `variableName = value;` (e.g., `age = 25;`) or combined with declaration: `dataType variableName = value;` (e.g., `int age = 25;`) - Assigns an initial value to the variable.

4. Printing Variables:
   - `System.out.println()` is used to display output to the console.
   - We use the '+' operator for string concatenation to combine text with the values of our variables when printing.
   - `variable.getClass().getSimpleName()` (for Objects like String) and `TypeName.TYPE.getSimpleName()` (for primitives) are used to get the simple name of the data type of a variable and print it.

How to Run this Program:
1. Save the code as 'DataTypesExample.java'.
2. Compile: Open Terminal/Command Prompt, navigate to the directory, and run 'javac DataTypesExample.java'.
3. Run: In the same Terminal, run 'java DataTypesExample'.

You will see the output printed to the console, showing each variable's name, value, and data type.  This program illustrates the different fundamental data types you'll use when programming in Java.
*/

