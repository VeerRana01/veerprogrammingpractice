import java.util.Scanner;

public class Arr7 {
    public static void main(String args[])
    {
        int a[][]=new int[3][3];
        int i,j,sumr=0,sumc=0,r,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The number of rows and columns of Matrix:");
        r=sc.nextInt();
        c=sc.nextInt();
        System.out.println("Enter The Elements Of Matrix:");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<r;i++)
        {
            sumr=0;
            for(j=0;j<c;j++)
            {
                sumr=sumr+a[i][j];
            }
            System.out.println("sum of " +(i+1) + "row is="+sumr);
        }
        for(j=0;j<c;j++)
        {
            sumc=0;
            for(i=0;i<r;i++)
            {
                sumc=sumc+a[i][j];
            }
            System.out.println("sum of " +(j+1) + "columns is="+sumc);
        }
    }
}
