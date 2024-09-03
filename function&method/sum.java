import java.util.*;
public class sum {
    public static int calculatesum(int num1,int num2){
        int sum=num1+num2;
       
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
    System.out.println( calculatesum(a,b));
       
    }
    
}
