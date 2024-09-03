import java.util.*;
import java.io.*;
public class primenumber {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1){
            System.out.println(" n is not a prime number prime number");
        }else{
            boolean isprime=true;
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    isprime=false;
                }
            }
            if(isprime==true){
                System.out.println(" n is prime number");
            }else{
                System.out.println(" n is no prime number");
            }
        }
    }
    
}
