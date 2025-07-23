import java.util.*;
import java.util.Scanner;
public class Arr5 {
    public static void main(String args[])
    {
        int i,j,sum=0;
        int a[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements of 3*3 matrix:");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
    System.out.println("The entered elements are as=");
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            sum=sum+a[i][j];
            System.out.print(+a[i][j]+"\t");
        }
        System.out.print("\n");  
    }
    System.out.println("The sum is="+sum);
    for(i=0;i<3;i++)
    {
        for(i=0;i<3;i++)
        {
            sum=sum+a[i][j];
            System.out.print(+a[i][j]+"\t");
        }
        System.out.print("\n");  
    }
    System.out.println("The sum is="+sum);
    }
}
