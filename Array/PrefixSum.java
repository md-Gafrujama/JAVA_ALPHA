import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int ar[]={4,5,3,6,9,50,23};

        int[] prefix = prefixMax(ar);
        System.out.println(Arrays.toString(prefix));
    }

    static int[] prefixMax(int[] ar){
        int [] prefix=new int[ar.length];
            prefix[0]=ar[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i]=Math.max(prefix[i-1],ar[i]);
        }

        return prefix;
    }
}
