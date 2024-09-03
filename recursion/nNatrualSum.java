public class nNatrualSum {
    public static int sumofNatrual(int n){
        if(n==1){
            return 1;
        }
       int sm1=sumofNatrual(n-1);
       int sn=n+sm1;
       return sn;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(sumofNatrual(n));
    }
    
}
