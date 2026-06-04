import java.util.Objects;
import java.util.Scanner;
import java.util.Random;
// When a compute executes program code, it odes it one command at a time (line by line)
public class Simple_Java {
    public static void main(String[] args) {
        //print
        // The statements used by the program are placed here
        System.out.println("Welcome to the course - you will learn to program!");
        System.out.println("Peashooter is the best plant in pvz.");


        /*
        User input to a variable
         */

        //Variable
        String message = "Hello World!"; //string
        System.out.println(message);
        int number = 100; //integer
        double price = 6.7676767; //float
        boolean trueOrFalse = true; //boolean
        System.out.println(number);
        float hello = 69.420f;
        char myLetter = 'B';
        //When you do not want a variable's value to change, use the final keyword.
        final int MINUTES_PER_HOUR = 60;
        final int BIRTHYEAR = 1980;

        //change value assigned to a variable
        int value = 10;
        value = 123;
        System.out.println(value);
        //But you can't change the variable type
        // Once a variable's type has been declared, it can no longer be changed.
        // boolean integerAssignmentWillWork = false;
        // integerAssignmentWillWork =42; or integerAssignmentWillWork = value; Does not work (with value is an int)
        //But an integer can be assigned to a variable of a double type (float) (Notice not integer to float)
        double floatingPoint = 0.42;
        System.out.println(floatingPoint);
        floatingPoint = 1;
        System.out.println(floatingPoint);
        int value2 = 10;
        floatingPoint = value2;
        System.out.println(floatingPoint);

        //user input
        // Create a tool for reading user input and name it scanner  //Important
        Scanner yellow = new Scanner(System.in);
        // Just normal print
        System.out.println("What is your name?");
        //Read the string written by user, and assign it
        // to program memory "String name = (string that was given as input)"
        String name = yellow.nextLine();
        System.out.println("What is your age?");
        int age = yellow.nextInt();
        yellow.nextLine();  // Fix the problem nextInt() reads only the 25, but it does NOT read the Enter key (⏎). That leftover Enter key is still sitting in the input buffer.
        System.out.println(name);
        System.out.println(age);
        //converts a string to an integer with command (Integer.valueOf)
        String valueAsString = "42";
        int value3 = Integer.valueOf(valueAsString);
        System.out.println(value3);
        //Ask user for an int value, double and boolean
        int value4 = Integer.valueOf(yellow.nextLine());
        System.out.println("You wrote an integer: " + value4 );
        double value5 = Double.valueOf(yellow.nextLine());
        System.out.println("You wrote a float: " + value5);
        boolean value6 = Boolean.valueOf(yellow.nextLine());
        System.out.println("You wrote a boolean has value of: " + value6);

        //Combining (String and variable with "+")
        System.out.println("Hello I'm " + name + " and I'm " + age + " years old.");

        //Calculating with numbers
        // "+", "-", "*", "/" and "%"
        //An expression is a combination of values that is turned into another value through a calculation or evaluation.
        int first = 2;
        int second = 4;
        System.out.println(first + second);
        System.out.println(2 + second - first - second);
        System.out.println("Length " + first + second); // We must use parenthesis to do the calculation else it would just print the two number
        System.out.println("Length "+ (first + second));
        int third = Integer.parseInt(yellow.nextLine());
        double num = (third*third);
        System.out.printf("%.2f",num); // maximum of number is 2 power 31 -1
        int fourth = 3;
        int fifth = 2;
        int result = (fourth/fifth); // result 1
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


        //Java Math
        System.out.println("Input 2 numbers to compare");
        float input_int1 = yellow.nextFloat();
        float input_int2 = yellow.nextFloat();
        System.out.println(Math.max(input_int1, input_int2)); //The Math.max(x,y) method can be used to find the highest value of x and y
        System.out.println(Math.min(input_int1, input_int2)); //The Math.min(x,y) method can be used to find the lowest value of x and y
        System.out.println(Math.sqrt(input_int1)); //The Math.sqrt(x) method returns the square root of x
        System.out.println(Math.abs(input_int1)); //The Math.abs(x) method returns the absolute (positive) value of x
        System.out.println(Math.pow(input_int1, input_int2)); //The Math.pow(x, y) method returns the value of x raised to the power of y
        //Rouding Method
        System.out.println(Math.round(input_int1)); //- rounds to the nearest integer
        System.out.println(Math.ceil(input_int2)); //- rounds up (returns the smallest integer greater than or equal to x)
        System.out.println(Math.floor(input_int1)); //- rounds down (returns the largest integer less than or equal to x)
        //Random number
        System.out.println(Math.random());
        int randomNum = (int) (Math.random() * 101); // 0 to 100



        // Conditional Statement
        /*
        && (AND) - all conditions must be true
        || (OR) - at least one condition must be true
        ! (NOT) - reverses a condition (true = false, false = true)
        */
        //String
        String question;
        question = (String.valueOf(yellow.nextLine()));
        if (Objects.equals(question, "No")) {
            System.out.print("Negative");
        }
        else if (Objects.equals(question, "Yes")) {
            System.out.println("Positive");
        } else {
            System.out.println("Something went wrong");
        }
        int number1 = (Integer.valueOf(yellow.nextLine()));
        System.out.println("Are you gay");
        String answer1 = yellow.nextLine();
        if (answer1.equalsIgnoreCase("Yes")) {
            System.out.println("You are gay.");
        }
        else{
            System.out.println("You lied.");
        }
        //Number
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
        //boolean
        int number2 = (Integer.valueOf(yellow.nextLine()));
        int number3 = (Integer.valueOf(yellow.nextLine()));
        boolean isLessThan = number2 <= number3; // the boolean is going to be either True or False depend on the number
        if (isLessThan) {
            System.out.println(number2 + " Is less than or equal to " + number3);
        }
        int number4 = (Integer.valueOf(yellow.nextLine()));
        if (number4 < 0 || number4>100 ) {
            System.out.println(number4 + " Is out of range");
        }
        else {
            System.out.println(number4 + " is in the range from 0 to 100");
        }
        //Short Hand if...else
        // variable = (condition) ? expressionTrue :  expressionFalse;
        int time = Integer.valueOf(yellow.nextLine());
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
        //If, else if and else of short hand if else
        int time2 = Integer.valueOf(yellow.nextLine());
        String message2 = (time2 < 12) ? "Good morning." //if
                : (time2 < 18) ? "Good afternoon." // else if
                : "Good evening."; //else
        System.out.println(message2);


        //Java Switch
        //Instead of writing many if..else statements, you can use the switch statement.
        int day = Integer.valueOf(yellow.nextLine());
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

        //For loop and While loop
        int numberRead = 0;
        while (true) {  // While true will create an infinite loop
            if (numberRead == 5) {
                break; //The loop can be broken out of with command 'break'. (in this case if the value is 5,
                // or you can do it in the condition of the while loop) as an example for number count
            }
            System.out.print("Input a number that's larger than 67: ");
            double number5 = Double.valueOf(yellow.nextLine());
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




    }
}