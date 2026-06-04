import java.util.Objects;
import java.util.Scanner;
public class Testing {
    public static void main(String[] args) {
        Scanner yellow = new Scanner(System.in);
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
                System.out.println("The number input is none of the day");
        }

    }
}
