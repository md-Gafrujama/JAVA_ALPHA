public class tagate {
    public static int indexTarget(int arr[], int tar) {
       for(int i=0; i<arr.length; i++) {
        if(arr[i]==tar) {
            return i;
        }
       }
       return -1;
        
    }
    public static void main(String[] args) {
        int nums []= {4,5,6,7,0,1,2};
        int key = 0;
        
        System.out.println("index is : "+indexTarget(nums, key));
    }
    
}
