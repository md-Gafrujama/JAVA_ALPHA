import java.util.*;
public class evenodd {
    public static void checkOddEven(int n){
        int bitMask=1;
        if((n & bitMask)==0){
            System.out.println("number is even");
        }else{
            System.out.println("odd");
        }

    }
    public static void main(String args[]){
        checkOddEven(5);

    }
    
}
