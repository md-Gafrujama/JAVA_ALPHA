import java.util.*;
public class parisarrya {
    public static void printParis(int number[]){
        int tp=0;

        for(int i=0; i<number.length;i++){

            int curr=number[i];

            for(int j=i+1;j<number.length;j++){

                System.err.print("("+curr+" ,"+number[j]+")");
                tp++;
            }
            System.err.println();
        }
        System.err.println("total number of pair is:"+tp);
    }

    public static void main(String args[]){
        int number[]={2,4,6,8,10};
        printParis(number);
        
    }
    
}
