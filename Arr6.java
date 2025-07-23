import java.util.Scanner;
public class Arr6 {
    public static void main(String args[]){
        int a[][]=new int[3][3];
        int i,j,sumld=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Elements Of Matrix:");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The matrix is as=");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(+a[i][j]+"\t");
            }
            System.out.print("\n");
        }
        System.out.println("The left diagnol matrix=");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                if((i==j))
                {
                    System.out.println(a[i][j]);
                    sumld=sumld+a[i][j];
                }
            }
        }
        //System.out.println("the ld sum="+sumld);
        System.out.println("The right diagnol matrix=");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                if((i+j)==2)
                {
                    System.out.println(a[i][j]);
                }
            }
        }
        System.out.println("the upper triangular matrix=");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                if(i<j)
                {
                    System.out.println(a[i][j]);
                }
            }
        }
        System.out.println("the lower triangular matrix=");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                if(i>j)
                {
                    System.out.println(a[i][j]);
                }
            }
        }
        System.out.println("the ld sum="+sumld);       
    }
}
    