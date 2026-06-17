import java.util.Objects;
import java.util.Scanner;


public class Testing {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine(); // String // to program memory "String name = (string that was given as input)"
        System.out.println("What is your age?");
        int age = input.nextInt(); // Integer
         // Fix the problem nextInt() reads only the 25, but it does NOT read the Enter key (⏎). That leftover Enter key is still sitting in the input buffer.
        System.out.println(name);
        System.out.println(age);
    }

    public static double max(int num1, double num2) {
        System.out.println("max(int, double) is invoked");
        if (num1 > num2)
            return num1;
        else
            return num2;
    }

    public static double max(double num1, int num2) {
        System.out.println("max(double, int) is invoked");
        if (num1 > num2)
            return num1;
        else
            return num2;
    }
}


