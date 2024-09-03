import java.util.*;
import java.io.*;
public class hallowrectangle{
    public static void hollow_rectangle(int TOrow,int TOcolumn){
        for(int i=1;i<=TOrow;i++){
            for(int j=1;j<=TOcolumn;j++){
                if(i==1||i==TOrow||j==1||j==TOcolumn)
                    System.out.print("*");
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
        
    }
    public static void inverted_half(int n){
        for(int i=1; i<=n; i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
       
    }
    public static void inverted_number(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static  void floyds_tringle (int n){
       int counter=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();

        }
    }
    public static void binarytringle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(" 1");
                }else{
                    System.out.print(" 0");
                }
            }
            System.out.println();
        }
    }
    public static void butterflyTringle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
        for(int i=n; i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
       //hollow_rectangle(4,5);
       //inverted_half(10);
       //inverted_number(20);
       floyds_tringle(5);
      // binarytringle(5);
       //butterflyTringle(4);

    }

}