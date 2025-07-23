import java.util.Scanner;
public class Arr10 {
    public static void main(String args[])
    {
        int a[]=new int[10];
        int i,j,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 elements of array");
        for(i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Entered elements are =");
        for(i=0;i<10;i++)
        {
            System.out.print(a[i]+"\t");
        }
        for(i=0;i<10;i++){
            for(j=0;j<j-i;j++){
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted list in ascending order is=");
        for(i=0;i<10;i++)
        {
            System.out.println(a[i]+"\t");
        }
    }
}

