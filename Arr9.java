import java.util.Scanner;
public class Arr9 {
    public static void main(String args[])
    {
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int c[][]=new int[3][3];
        int i,j,k;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Elements Of first Matrix:");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter The Elements Of second Matrix:");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("the multiplication of two matrix=");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                c[i][j]=0;
                for(k=0;k<3;k++)
                {
                    c[i][j]=c[i][j]+a[i][k]*b[k][j];
                }
                System.out.print(c[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
}
