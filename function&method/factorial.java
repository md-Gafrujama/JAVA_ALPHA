import java.util.*;
import java.io.*;
public class factorial {
    public static int calculatefactorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f*=i;
            
            

        }
        return f;
        
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0){
            System.out.println(1);
        }
        System.out.println (calculatefactorial( n));
       
    }
    
}
