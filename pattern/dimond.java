import java.util.*;
import java.io.*;
public class dimond {
    public static void Dimond(int n){
    for(int i=1;i<=n;i++){
        for (int j=1;j<=n-i;j++){
            System.out.print(" ");
        }

        for(int j=1;j<=(2*i)-1;j++){
            System.out.print("*");
        }
        System.out.println();

    }
    for(int i=n-1;i>=1;i--){
        for (int j=1;j<=n-i;j++){
            System.out.print(" ");
        }

        for(int j=1;j<=(2*i)-1;j++){
            System.out.print("*");
        }
        System.out.println();
    }

    }

    public static void main(String args[]){
        Dimond(6);
    
    }
}