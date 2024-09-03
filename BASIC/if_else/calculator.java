package if_else;
import java .util.*;
import java.io.*;
public class calculator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        char operator=sc.next().charAt(0);
        switch(operator){
            case '+':System.out.println("Addition of number is:"+a+b);
            break;
            //case '-':System.out.println("less of number is:"+a-b);
          // break;
            case '*':System.out.println("multiplication of number is:"+a*b);
            break;
            case '/':System.out.println("division of number is:"+a/b);
            break;
            case '%':System.out.println("modlous of number is:"+a%b);
            break;
        }
    }
    
}
