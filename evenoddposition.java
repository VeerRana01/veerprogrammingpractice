import java.util.*;
import java.lang.*;
public class evenoddposition {
    public static void main(String args[]){
        int num=8765;
        int position=0;
        int evensum=0;
        int oddsum=0;
        while(num!=0)
        {
            int lastnum=num%10;
            position++;
            if(position%2==0)
            {
                evensum=evensum+lastnum;
            }
            else{
                oddsum=oddsum+lastnum;
            }
            num=num%10;
        }
        System.out.println("Even sum="+evensum);
        System.out.println("oddsum="+oddsum);
    }
}
