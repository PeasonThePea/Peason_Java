import java.util.Objects;
import java.util.Scanner;
public class Testing
{
    static int sum(int k){
            if (k > 0) {
                return k + sum(k - 1);
            }
            else {
                return 0;
            }
    }


    public static void main(String[] args) {
        Scanner yellow = new Scanner(System.in);
        int result = sum(10);
        System.out.println(result);


    }
}
