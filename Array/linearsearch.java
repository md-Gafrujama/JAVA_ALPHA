import java.util.*;
import java.io.*;
public class linearsearch {
    public static void main(String args[]){
        int number[]={2,4,6,8,10,12,14,16};
        int key=10;
       int index  =search(number,key);
       if(index==-1){
        System.out.println("not found");
       }else{
        System.out.println("key is at :"+index);
       }

    }
    
    public static int search(int number[],int key){
        for(int i=0;i<=number.length-1;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }
}
