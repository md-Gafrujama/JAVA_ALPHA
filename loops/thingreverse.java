public class thingreverse {
    public static void main (String args[]){
        int n=10899;
        int rev=0;
        while(n>0){

            int last_digit=n%10;
            rev=(rev*10)+last_digit;
             n=n/10;

        }
       System.out.println(rev);
    }
    
}
