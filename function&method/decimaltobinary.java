import java.util.*;
import java.io.*;
public class decimaltobinary {
    public static void dectTobinary(int n){
        int mynum=n;
        int pow=0;
        int decNum=0;
        while(n>0){
            int rem=n%2;
            decNum=decNum+(rem*(int)Math.pow(10,pow));
            pow++;
            n/=2;
        }
        System.out.println(mynum+" ="+decNum );
    }
    public static void main(String args[]){
        dectTobinary  (5);

    }
    
}
