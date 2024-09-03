import java.util.*;
public class overloadingfunction {
    // function1
    public static int sum(int a,int b){
        return a+b;

    }
    // function 2
    public static float sum(float a,float b){
        return a+b;
    }
    public static void main(String args[]){
       
        System.out.println(sum(5,3));
        System.out.println(sum(5.8f,2.2f));

    }
    
}
