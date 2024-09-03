public class searching2d{
    public static int[] search(int arr[][], int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == target) {
                    int ans[] = { i, j };
                    return ans;
                }
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String args[]) {
        int arr[][] = { { 3, 12, 9 },
                        { 5, 2, 89 },
                        { 90, 45, 22 } };
        int target = 89;
        int result[] = search(arr, target);

        if (result[0] == -1 && result[1] == -1) {
            System.out.println("Target not found in the array.");
        } else {
            System.out.println("Target found at position: (" + result[0] + ", " + result[1] + ")");
        }
    }
}
