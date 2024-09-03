import java.util.*;
import java.io.*;
public class binarytodecimal {
    public static void binTodec(int binarynum){
        int mynum=binarynum;
        int pow=0;
        int decNum=0;
        while(binarynum>0){
            int lastDigit=binarynum%10;
            decNum=decNum+(lastDigit*(int)Math.pow(2,pow));
            pow++;
            binarynum/=10;
        }
        System.out.println(mynum+" = " +decNum);
    }
    public static void main(String args[]){
        binTodec(111);
    }
    
}
