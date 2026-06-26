import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

import static java.lang.System.arraycopy;


public class Testing {
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        //Sixth Example
        int[] myList = {1,2,3,4,5,6,7,6,7};
        printArray(new int[] {3, 2, 1 ,4 ,6});
        System.out.println();
        printArray(myList);
    }
}


