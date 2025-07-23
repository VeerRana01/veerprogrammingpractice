import java.util.*;
public class Arr2 {
    public static void main(String args[]){
        int a[]=new int [10];
        int sumeven=0;
        int sumodd=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 elements of array:");
        for(int i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("The Entered elements are as=");
        for(int i=0;i<10;i++)
        {
            if(i%2==0)
            {
                System.out.println(+a[i]+"\n");
                sumeven=sumeven+a[i];
            }
            else
            {
                System.out.println(+a[i]+"\n");
                sumodd=sumodd+a[i];
            }

        }
        System.out.println("the even sum is"+sumeven);
        System.out.println("the odd sum is"+sumodd);
    }
}
