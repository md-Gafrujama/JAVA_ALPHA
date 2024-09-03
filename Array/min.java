import java.util.*;

public class min {
    public static int smallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public static void main(String args[]) {
        int numbers[] = { 22, 2, 3, 4, 5, 6, 7, 8, 9, 8, 8, 23, 44, 55, 56 };
        System.out.println("Smallest is: " + smallest(numbers));
    }
}
