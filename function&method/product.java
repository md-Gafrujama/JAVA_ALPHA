import java.util.*;
import java.io.*;

public class product {
    public static int calculateproduct(int num1,int num2){
        int product=num1*num2;
       
        return product;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
      System.out.println ( calculateproduct(a,b));
    }
    
}
