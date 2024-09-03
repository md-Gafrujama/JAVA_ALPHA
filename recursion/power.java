public class power {
    public static int powerFnction(int x,int n){
        if(n==0){
            return 1;
        }
        int xm1=powerFnction(x,n-1);
        int xn=x*xm1;
        return xn;
    }
    public static void main(String[] args) {
        int x=2;
        int n=10;
        System.out.println(powerFnction(x,n));
    }
    
}
