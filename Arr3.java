
import java.util.Scanner;
public class Arr3 {
    public static void main(String args[])
    {
        int a[]=new int[4];
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the digits:");
        for(i=0;i<4;i++)
        {
            a[i]=sc.nextInt();
        }
        
        for(i=0;i<4;i++)
        {
            int num=a[i];
            int temp=num;
            int sum=0,rev=0,r,q;
            while(temp>0)
            {
                
                r=temp%10;
                sum=sum+r;
                q=temp/10;
                rev=rev*10+r;
                temp/=10;
            } 
            System.out.println("\nthe numbers of "+(i) + "element="+num);   
            System.out.println("\nthe sum of "+(i) + "element="+sum);
            System.out.println("\nthe reverse of "+(i) + "element="+rev);
    }
    //System.out.println("\nthe reverse of "+(i) + "element="+rev);
}
}