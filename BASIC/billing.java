import java.util.*;
import java.io.*;
public class billing {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float pencil=sc.nextFloat();
        float pen=sc.nextFloat();
        float eraser=sc.nextFloat();
        float total=pencil+pen+eraser;
        System.out.println("total price:"+total);



        // 18%gst
        float newtotal=total+(0.18f*total);
        System.out.println(" new total bill is:"+newtotal);
    }
    
}
