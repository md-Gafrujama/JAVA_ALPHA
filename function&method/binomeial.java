import java.util.*;
import java.io.*;
public class binomeial {
    
    public static int calculatefactorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f*=i;

        }
        return f;
    }
    public static int binocooficent(int n,int r){
        
        int factorial_n=calculatefactorial(n);
        int factorial_r=calculatefactorial(r);
        int factorial_nmr=calculatefactorial(n-r);
        int binocooficent =factorial_n/(factorial_r*factorial_nmr);

     return  binocooficent;
    }
    public static void main (String args[]){
        int n=5;
        int r=2;
    System.out.println   ( binocooficent(5,2));
    }
    
}
