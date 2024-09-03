import java.util.Arrays;

public class SuffixSum {
    public static void main(String[] args) {
        int a[]={3,4,2,7,5,2,1,3,4};

        int[] suffix = SuffixMax(a);
        System.out.println(Arrays.toString(suffix));
    }

    static int[] SuffixMax(int[] ar){
        int n=ar.length;
        int[] suffix=new int[n];
        suffix[n-1]= ar[n-1];
        for (int i = n-2; i >= 0; i--) {
            suffix[i]=Math.max(suffix[i+1],ar[i]);
        }
        return suffix;
    }
}
