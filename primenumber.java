import java.util.*;
public class primenumber{
    public static void main(String args[]){
        int num=10;
        int count=0;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                System.out.println("it is not a prime number");
                return;
            }
            else{
                System.out.println("prime number");
                return;
            }
        }
        //System.out.println("prime number");
    }
}
