import java.util.*;

public class revarray {
    public static void Reversearray(int arr[], int size) {
        int start = 0;
        int last = size - 1; // Adjusted to represent the last index properly

        int temp;

        while (start < last) {
            temp = arr[last];
            arr[last] = arr[start];
            arr[start] = temp;

            start++;
            last--;
        }
    }

    public static void main(String args[]) {
        int arr[] = { 2, 4, 6, 8, 10 }; 
        Reversearray(arr, arr.length);

        System.out.print("\nReversed array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
