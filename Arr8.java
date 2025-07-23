import java.util.Scanner;
public class Arr8 
{
    public static void main(String args[])
    {
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int c[][]=new int[3][3];
        int i,j;
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
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                c[i][j]=2*a[i][j]+3*b[i][j];
                System.out.print(c[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
}
