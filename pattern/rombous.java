import java.util.*;
import java.io.*;
public class rombous {
    public static void SolidRombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void hollo_rectangle(int n){
        for(int i=1;i<=n;i++){
         // for spaces 
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }
           
        System.out.println();
        }
    }
    public static void main(String args[]){
        SolidRombus(4);
       // hollo_rectangle(10);

    }
    
}
