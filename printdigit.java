import java.util.*;
import java.lang.*;
public class printdigit
{
    public static void main(String[] args) {
        int num=12345;
        int copy=num;
        int count=0;
        while(copy!=0){
            count++;
            copy=copy/10;
        }
        while(num!=0){
            int pwr=(int)Math.pow(10,count-1);
            System.out.println(num/pwr);
            num=num % pwr;
            count--;
        }
    }
}