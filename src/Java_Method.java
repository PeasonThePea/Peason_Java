import java.util.Scanner;
// Most content is from W3School

// A method is a block of code which only runs when it is called.
// You can pass data, known as parameters, into a method.
// They are also known as functions (Which is the same name in python)
// Why use methods? To reuse code: define the code once, and use it many times.
public class Java_Method {
    //A method need to be defines within a class.
    //I. Define a method:
    static void myMethod(){
                // Name_of_method() {}
                // static means that the method belongs to the Main class and not an object of the Main class.
                // void means that this method does not have a return value.
        //Block of code
        System.out.println("This print is included in the block of code of the method.");

    }
    // Define the second method
    // II. Parameters and Arguments
    // Information can be passed to methods as a parameter. Parameters act as variables inside the method.
    // Parameters are specified after the method name, inside the parentheses.  You can add as many parameters as you want, just separate them with a comma.
    static void myMethod2(String name){
        System.out.println(name + " is included in the guest list.");
    }

    // III. Return Value
    // In the previous page, we used the void keyword in all examples (like static void myMethod(int x))
    // , which indicates that the method should not return a value.
    // If you want the method to return a value, you can use a primitive data type (such as int, char, etc.)
    // instead of void, and use the return keyword inside the method:
    static int square(int number) {
        return number * number;
    }
    static void notReturn(int number) {
        // return number * number; This will be an error
        number = number * number;
    }

    // IV. Method overload
    // This will not work on python, the method will be overwritten instead
    // With method overloading, multiple methods can have the same name with different parameters
    // Normally:
    static int plusMethodInt(int x, int y) {
        return x + y;
    }
    static double plusMethodDouble(double x, double y) {
        return x + y;
    }
    // Instead of defining two methods that should do the same thing, it is better to overload one.
    // Overload: // Method with the same name
    static int plusMethod(int x, int y) {
        return x + y;
    }
    static double plusMethod(double x, double y) {
        return x + y;
    }

    // V. Java Scope (Not only Method)
    // In Java, variables are only accessible inside the region where they are created. This is called scope.
    // 1. Method Scope
    // Variables declared directly inside a method are available anywhere in the method following the line of code in which they were declared:
    static void myMethod3() {
        int x = 100;
        int y = 900;
        System.out.println(x + y);
    }
    // 2. Block Scope
    //A block of code refers to all of the code between curly braces { }.
    /*
    public class Main {
        public static void main(String[] args) {
            // Code here CANNOT use x
            { // This is a block
              // Code here CANNOT use x
              int x = 100;
              // Code here CAN use x
              System.out.println(x);
            } // The block ends here
            // Code here CANNOT use x
        }
     }
     */
    // 3. Loop Scope
    // Variables declared inside a for loop only exist inside the loop:
    /*
    public class Main {
        public static void main(String[] args) {
            for (int i = 0; i < 5; i++) {
                System.out.println(i); // i is accessible here
            }
            // i is NOT accessible here
        }
    }
     */
    // The for loop has its own block ({ ... }).
    // The variable i declared in the loop header (int i = 0) is only accessible inside that loop block.
    // Once the loop ends, i is destroyed, so you can't use it outside.
    // Loop variables are not available outside the loop.
    // You can safely reuse the same variable name (i, j, etc.) in different loops in the same method

    // VI. Java Recursion
    // Recursion is like method in method
    // It will loop infinitely unless you add a limit or base case
    // Example for sum from 0 to k
    public static int sumMethod(int k) { // Define the method
        if (k > 0) {
            //Recursive case: The part of the method where it calls itself with a modified, smaller argument. This input must progress closer to the base case.
            return k + sumMethod(k - 1);
            // Return the k + sumMethod(k-1) --> Since sumMethod(k-1) has not been run yet, it will run again with this time k-1
            // Then it will loop over and over if there is not for the condition or base case
        }
        // Base Case: The condition that stops the recursion from running indefinitely. It returns a direct value without making another method call.
        // If your method lacks a base case, it will cause StackOverflowError
        else {
            return 0;
        }
    }
    //Example for factorial (n!)
    public static int factorialMethod(int k) {
        // Base case
        if (k <= 1) {
            return 1;
        }
        // Recursive case
        return k * factorialMethod(k-1);
        // k * (factorialMethod+1) --> k * (k - 1) * (factorialMethod(k - 1 - 1)) --> until base case is met and return one value
    }
    //Example of CountDown
    static void countdown(int n) {
        if (n > 0) { // Base case
            System.out.print(n + " ");
            countdown(n - 1); // Recursive case
            // This is not for the purpose of returning value 
        }
    }

    // VII. Passing Array Through Method
    // When passing an array to a method, the reference of the array is passed to the method.
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    // Example of output
    //Call the method:
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //First example
        myMethod(); // Way to cal the method

        //Second example
        while (true) {
            String name = input.nextLine();
            if (name.isEmpty()) {
                break;
            }
            myMethod2(name);
        }

        //Third example
        // 1
        System.out.println(square(5));
        // 2
        int number;
        notReturn(5);
        // System.out.println(number); // Will be an error

        // Fourth example
        // 1
        int myNum1 = plusMethodInt(8, 5);
        double myNum2 = plusMethodDouble(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
        // 2 so instead of just one we have the ability of both method that has the same name
        int myNum3 = plusMethod(8, 5);
        double myNum4 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);

        // Fifth example
        // 1.
        myMethod3();
        // System.out.println("int: " + x + y); // x and y will cause an error
        // 2.
        while (true) {
            int z = 100;
            System.out.println(square(z));
            break;
        }
        // System.out.println(square(z)); // z will cause an error
        // 3.
        // Loop 1 using i
        for (int i = 0; i < 9; i++) {
            System.out.println("Loop 1: " + i);
        }
        // Loop 2 using i
        for (int i = 0; i < 9; i++) {
            System.out.println("Loop 2: " + i);
        }
        double i = 100;
        System.out.println(i);
        System.out.println(sumMethod(5));
        System.out.println(factorialMethod(3));
        System.out.println(factorialMethod(5));
        countdown(5);

        //Sixth Example
        printArray(new int[] {3, 2, 1 ,4 ,6});
        int[] myList = {1,2,3,4,5,6,7,6,7};
        System.out.println();
        printArray(myList);


    }
}
