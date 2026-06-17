import java.util.Objects;
import java.util.Scanner;
import java.util.Random;
// When a compute executes program code, it odes it one command at a time (line by line)
public class Simple_Java {
    public static void main(String[] args) {
        // I. print
        // The statements used by the program are placed here
        System.out.println("Welcome to the course - you will learn to program!");
        System.out.println("Peashooter is the best plant in pvz.");

        // II. Variable
        // 1. Simple Variable
        String message = "Hello World!"; //string
        System.out.println(message);
        byte numByte = 127; //8-bit signed (-128 to 127) (-2 power 7 to 2 power 7 -1)
        short numShort = 32767; //16-bit signed (-32768 to 32767) (-2 power 15 to 2 power 15 -1)
        int number = 2147483647; //integer //32-bit signed (-2147483648 to 2147483647) (- 2 power 31 to 2 power 31-1)
        long numLong = (long) Math.pow(2, 63) - 1; //64-bit signed ( -2 power 63 to 2 power 63 - 1)
        double price = 6.7676767; //float //64-bit IEEE 754 //15-17 significant digit
        float hello = 69.420f; //float //32-bit IEEE 754 //6-9 significant digit
        boolean trueOrFalse = true; //boolean
        System.out.println(number);
        char myLetter = 'B';
        // 2. Constant Variable
        // When you do not want a variable's value to change, use the final keyword.
        final int MINUTES_PER_HOUR = 60;
        final int BIRTHYEAR = 1980;
        // 3. Rule of name for variable
        // Use lowercase for variables and methods
        // If a name consists of several words, concatenate them into one, making the first word lowercase and capitalizing the first letter of each subsequent word
        //Capitalize the first letter of each word in a class name—for example, the class names ComputeArea and System.
        //Capitalize every letter in a constant, and use underscores between words—for example, the constants PI and MAX_VALUE.
        // 4. Rule for assigning new value for a variable
        int value = 10;
        value = 123;
        System.out.println(value);
        // You can't change the variable type; once a variable's type has been declared, it can no longer be changed.
        // Example:
        // boolean integerAssignmentWillWork = false;
        // integerAssignmentWillWork =42; or integerAssignmentWillWork = value; Does not work (with value is an int)
        // But an integer can be assigned to a variable of a double type (float) (Notice not integer to float)
        double floatingPoint = 0.42;
        System.out.println(floatingPoint);
        floatingPoint = 1;
        System.out.println(floatingPoint);
        int value2 = 10;
        floatingPoint = value2;
        System.out.println(floatingPoint);
        // 5. Some Simple Parts
        int number6 = 67, number7 = 420; //You can also use a shorthand form to declare and initialize variables of the same type together.
        int number8, number9, number10; //If variables are the same type, they can be declared together
        number8 = number9 = number10 = 420;// you can use chained assignment like this to assign variable value
        // 6.Literal Number
        // A literal is a constant value that appears directly in a program.
        int c = 100; //Decimal (Base 10): Standard numbers using digits 0–9.
        int d = 0b1010; //Binary (Base 2): Prefixed with 0b or 0B //represent 10
        int e = 0146; //Octal (Base 8): Prefixed with a leading 0. //represents 102
        int f = 0x123Face; //Hexadecimal (Base 16): Prefixed with 0x or 0X
        long distance = 2000L; // or 2000l // Long Type: To specify a long (64-bit) literal, you must append the suffix L or l
        //Float Literal
        double price1 = 19.99; //standard decimal //you can also add d or D at the end like float //it will display 16 digits after .
        double price2 = 3.44e10; // Science notation // use e or E to represent powers of 10 //represents 3.44 * 10 power 10
        float temp = 98.6f; // Float Type: To assign a value to a float variable, you must append the suffix f or F. //will display 8 digits after .
        //To improve readability, Java allows you to use underscores to separate digits in a number literal. For example, the following literals are correct.
        long value0 = 232_45_4519;
        double amount = 23.24_4545_4519_3415;


        // III. Casting (change value assigned to a variable)
        //Java Type casting means converting one data type into another.
        // 1. Widening Casting
        // Widening Casting (automatic) - converting a smaller type to a larger type size
        // This works because there is no risk of losing information.
        // byte -> short -> char -> int -> long -> float -> double
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println(myInt);    // Outputs 9
        System.out.println(myDouble); // Outputs 9.0
        // 2. Narrowing Casting
        // Narrowing Casting (manual) - converting a larger type to a smaller type size
        // Narrowing casting must be done manually by placing the type in parentheses () in front of the value.
        // This is required because narrowing may result in data loss
        // double -> float -> long -> int -> char -> short -> byte
        double myDouble1 = 9.78d;
        int myInt1 = (int) myDouble; // Manual casting: double to int
        System.out.println(myDouble1); // Outputs 9.78
        System.out.println(myInt1);    // Outputs 9
        // 3. converts a string to an integer with command (Integer.valueOf)
        String valueAsString = "42";
        int value3 = Integer.parseInt(valueAsString); // Or int value3 = Integer.valueOf(valueAsString);
        System.out.println(value3);


        // IV. User_input
        // Create a tool for reading user input and name it scanner  //import java.util.Scanner; insert this line for it to work
        Scanner input = new Scanner(System.in);
        // 1. Old way to ask user for input
        int value4 = Integer.valueOf(input.nextLine()); // Integer
        System.out.println("You wrote an integer: " + value4 );
        double value5 = Double.valueOf(input.nextLine()); // Double
        System.out.println("You wrote a float: " + value5);
        boolean value6 = Boolean.valueOf(input.nextLine()); // Boolean
        System.out.println("You wrote a boolean has value of: " + value6);
        // 2. New way to ask user for input
        System.out.println("What is your name?");
        String name = input.nextLine(); // String // to program memory "String name = (string that was given as input)"
        System.out.println("What is your age?");
        int age = input.nextInt(); // Integer
        System.out.println(name);
        System.out.println(age);
        // input.nextLine();  // Problem might occur with valueOf(input.nextLine())
        // Fix the problem nextInt() reads only the 25, but it does NOT read the Enter key (⏎).
        // That leftover Enter key is still sitting in the input buffer.



        // V. Combining (String and variable with "+")
        System.out.println("Hello I'm " + name + " and I'm " + age + " years old.");


        // VI. Calculating with numbers
        // "+", "-", "*", "/" and "%"
        //An expression is a combination of values that is turned into another value through a calculation or evaluation.
        int first = 2;
        int second = 4;
        System.out.println(first + second);
        System.out.println(2 + second - first - second);
        System.out.println("Length " + first + second); // We must use parenthesis to do the calculation else it would just print the two number
        System.out.println("Length "+ (first + second));
        int third = Integer.parseInt(input.nextLine());
        double num = (third*third);
        System.out.printf("%.2f",num); // maximum of number is 2 power 31 -1
        int fourth = 3;
        int fifth = 2;
        int result = (fourth/fifth); // result 1
        // Type Casting Apply with Calculation
        double result2 = (double) (fourth/fifth); // result 1 because the division is done before the type cast
        double result3 = fourth / (double) fifth; // result 1.5
        double result4 = (double) fourth/ fifth; // result 1.5
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        int dividend = 3;
        int divisor = 2;
        double result5 =1.0 * dividend / divisor; // We multiply with a float first // result 1.5
        double result6 = dividend / divisor * 1.0; // The multiply by float is later // result 1
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(6%3); // This will print remainder
        System.out.println(3%2);


        // VII. Java Math, Mathematical Functions
        System.out.println("Input 2 numbers to compare");
        float input_int1 = input.nextFloat();
        float input_int2 = input.nextFloat();
        // 1.Max, min and absolute value
        System.out.println(Math.max(input_int1, input_int2)); //The Math.max(x,y) method can be used to find the highest value of x and y
        System.out.println(Math.min(input_int1, input_int2)); //The Math.min(x,y) method can be used to find the lowest value of x and y
        System.out.println(Math.abs(input_int1)); //The Math.abs(x) method returns the absolute (positive) value of x
        // 2.Rounding Method
        // x is rounded up to its nearest integer. This integer is returned as a double value.
        System.out.println(Math.ceil(input_int2)); //- rounds up (returns the smallest integer greater than or equal to x)
        // x is rounded down to its nearest integer. This integer is returned as a double value.
        System.out.println(Math.floor(input_int1)); //- rounds down (returns the largest integer less than or equal to x)
        // x is rounded to its nearest integer. If x is equally close to two integers, the even one is returned as a double value.
        System.out.println(Math.rint(input_int2));
        // Returns (int)Math.floor(x + 0.5) if x is a float and returns (long)Math.floor(x + 0.5) if x is a double.
        System.out.println(Math.round(input_int1)); //- rounds to the nearest integer
        // 3. Random number
        System.out.println(Math.random());
        int randomNum = (int) (Math.random() * 101); // 0 to 100 // Return a random integer between a and b -1
        int a = input.nextInt();
        int b = input.nextInt();
        int randomNum2 = a +(int) (Math.random() * b); // Return a random integer between a and a+b-1
        System.out.println(randomNum);
        System.out.println(randomNum2);
        // 4.Trigonometric Method
        System.out.println(Math.toDegrees(Math.PI / 2)); //returns 90.0 //Returns the angle in radians for the angle in degrees.
        System.out.println(Math.toRadians(30)); //returns 0.5236 (same as π/6) //Returns the angle in degrees for the angle in radians.
        // Returns the trigonometric of an angle in radians.
        System.out.println(Math.sin(0)); //returns 0.0
        System.out.println(Math.sin(Math.toRadians(270))) ;//returns −1.0
        System.out.println(Math.sin(Math.PI / 6)); //returns 0.5
        System.out.println(Math.sin(Math.PI / 2)); //returns 1.0
        System.out.println(Math.cos(0)); //returns 1.0
        System.out.println(Math.cos(Math.PI / 6)); //returns 0.866
        System.out.println(Math.cos(Math.PI / 2)); //returns 0
        System.out.println(Math.tan(Math.PI ));
        // Returns the angle in radians for the inverse of sine, cosine and tangent.
        System.out.println(Math.asin(0.5)); //returns 0.523598333 (same as π/6)
        System.out.println(Math.acos(0.5)); //returns 1.0472 (same as π/3)
        System.out.println(Math.atan(1.0)); //returns 0.785398 (same as π/4)
        // 5.Exponent Method
        // exp(x) Returns e raised to power of x (e^x)
        System.out.println(Math.exp(3.5)); //which returns 33.11545
        //log(x) Returns the natural logarithm of x (ln(x = log e (x)))
        System.out.println(Math.log(3.5)); //which returns 1.25276
        //log10(x) Returns the base 10 logarithm of x (log 10 (x).)
        System.out.println(Math.log10(3.5)); //which returns 0.544
        //pow(a, b) Returns a raised to the power of b (a^b)
        System.out.println(Math.pow(4.5, 2.5)); // return 42.9567 //The Math.pow(x, y) method returns the value of x raised to the power of y
        //sqrt(x) Returns the square root of x (for x >= 0)
        System.out.println(Math.sqrt(10.5)); // return 3.24 //The Math.sqrt(x) method returns the square root of x



        // VIII. Conditional Statement
        /*
        Logical Operators
        && (AND) - all conditions must be true
        || (OR) - at least one condition must be true
        ! (NOT) - reverses a condition (true = false, false = true)
        ^ (XOR) - true if only one condition is true, false if both are true or both are false (exclusive or)
        */
        // 1. String
        String question;
        question = (String.valueOf(input.nextLine()));
        if (Objects.equals(question, "No")) {
            System.out.print("Negative");
        }
        else if (Objects.equals(question, "Yes")) {
            System.out.println("Positive");
        } else {
            System.out.println("Something went wrong");
        }
        System.out.println("Are you gay");
        String answer1 = input.nextLine();
        if (answer1.equalsIgnoreCase("Yes")) {
            System.out.println("You are gay.");
        }
        else{
            System.out.println("You lied.");
        }
        // 2. Number
        int number1 = input.nextInt();
        if (number1 > 50){
            System.out.println("the number is larger than 50");
            if (number1 == 67){
                System.out.println("The number is 67676767676767676767");
            }
        } else {
            System.out.println("the number is lower than 50");
        }
        if (number1 != 67){
            System.out.println("The number is not 67");

        }
        // 3. Boolean
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        boolean isLessThan = number2 <= number3; // the boolean is going to be either True or False depend on the number
        if (isLessThan) {
            System.out.println(number2 + " Is less than or equal to " + number3);
        }

        int number4 = input.nextInt();
        if (number4 < 0 || number4>100 ) {
            System.out.println(number4 + " Is out of range");
        }
        else {
            System.out.println(number4 + " is in the range from 0 to 100");
        }

        // 4. Short Hand if...else or Conditional Operator
        // variable = (condition) ? expressionTrue :  expressionFalse;
        int time = input.nextInt();
        /* Instead of
            int time = 20;
            if (time < 18) {
                    System.out.println("Good day.");
             } else {
                  System.out.println("Good evening.");}
         */
        String result7 = (time < 18) ? "Good day" : "Good evening";
        System.out.println(result7);
        System.out.println((time < 18) ? "Good day." : "Good evening.");
        // 5. If, else if and else of short hand if else
        int time2 = input.nextInt();
        String message2 = (time2 < 12) ? "Good morning." //if
                : (time2 < 18) ? "Good afternoon." // else if
                : "Good evening."; //else
        System.out.println(message2);


        // IX. Java Switch
        //Instead of writing many if...else statements, you can use the switch statement.
        int day = input.nextInt();
        switch (day) { // The switch statement selects one of many code blocks to be executed. The switch expression is evaluated once.
            case 1: //The result is compared with each case value. If there is a match, the matching block of code runs.
                System.out.println("Sunday");
                break; //The break statement stops the switch after the matching case has run.
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default: //The default statement runs if there is no match.
                System.out.println("The number input is none of the day.");
        }


        // X. While loop
        // 1. Increment and decreasement a variable by 1
        // i++(Post-increment) //Increment I by 1, but use the original x value in the statement
        // ++i(Pre-increment) //Increment I by 1, and use the new x value in the statement
        // j--(Post-decrement) //Increment J by 1, and use the new x value in the statement
        // --j(Pre-decrement) //Decrement J by 1, and use the new x value in the statement
        int numberRead = 0;
        while (true) {  // While true will create an infinite loop. Inside the ()
            // We can also do while loop with false condition to start a while loop and have i++ to stop it
            if (numberRead == 5) {
                break; //The loop can be broken out of with command 'break'. (in this case if the value is 5,
                // or you can do it in the condition of the while loop as an example for number count
            }
            System.out.print("Input a number that's larger than 67: ");
            double number5 = input.nextDouble();
            if (number5 <= 67) {
                System.out.println(number5 + " is not larger than 67");
                numberRead++; // +1 for value of number reader
                continue; //You can also return to the beginning from other places besides the end with the command continue.
                // When the computer executes the command continue, the execution of the program moves to the beginning of the loop.
                //The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.
            }
            System.out.print(number5 + " is larger than 67");
            break; // if there is a number that larger than 67 the loop will break
        }
        // 2. Java do-while loop
        //The do/while loop is a variant of the while loop. This loop will execute the code block once, before checking if the condition is true.
        // Then it will repeat the loop as long as the condition is true.
        int i1 = 0;
        do {
            System.out.println(i1);
            i1++;
        } while (i1<9);


        // XI. For loop |  for (statement 1; statement 2; statement 3){ }
        // 1. Normal For Loop
        //We use while loop when we know exactly how many loop through a block of code
        //Statement 1 is executed (one time) before the execution of the code block.
        //Statement 2 defines the condition for executing the code block.
        //Statement 3 is executed (every time) after the code block has been executed.
        for (int i = 0; i < 5; i++){
            System.out.println(i);
        }
        for (int j = 0; j <=16; j = j+2) {
            System.out.println(j);
            String[] seat = {"Jenny", "Duy", "Larry", "Angie"};
            for (int g = 0; g < seat.length; g++){
                System.out.println("Seat number " + g + " got taken by " + seat[g]);
            }
        }
        // 2. "for-each" loop (Will use for array which will be introduced in section XI.)
        // which is used exclusively to loop through elements in an array (or other data structures)
        String[] minecraftPotion ={"Strength", "Speed", "Jump", "Resistance"};
        for (String Potion:minecraftPotion){
            System.out.println(Potion);
        }


        // XII. Array (A different version of list like in python)
        // Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
        // To declare an array, define the variable type with square brackets [ ]
        // We have now declared a variable that holds an array of strings.
        // To insert values to it, you can place the values in a comma-separated list, inside curly braces { }
        // 1. Single-Dimension Array
        String[] car = {"BMW", "Volvo", "Ford", "Mazda", "Lamborghini", "Ferrari"}; //List of string
        int[] myNum = {12, 232, 243, 765, 456}; //List of number
        System.out.println(car[0]); //Array indexes start with 0: [0] is the first element. [1] is the second element, etc.
        car[0] = "Toyota"; //change an array element
        System.out.println(car.length); //This will print the array length
        String[] minecraftWeapon = new String[4];// Size is 4 //You can also create an array by specifying its size with new.
        // This makes an empty array with space for a fixed number of elements, which you can fill later
        minecraftWeapon[0] = "Sword";
        minecraftWeapon[1] = "Spear";
        minecraftWeapon[2] = "Mace";
        minecraftWeapon[3] = "Axe";
        // Loop through an array
        for (int z = 0; z < minecraftWeapon.length; z++) {
            System.out.println(minecraftWeapon[z]);
        }
        int sumOfNum = 0;
        for (int y = 0; y < myNum.length; y++) {
            sumOfNum += myNum[y];
        }
        System.out.println("The sum is " + sumOfNum);
        // 2. Multi-Dimension Arrays
        int[][] myNumbers = {{0,2,4,6},{1,3,5,7}};

        }
}