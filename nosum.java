import java.util.*;
class nosum
{
    public static void main(String args[])
{
int number=125;
int sum=0;
while(number!=0)
{
    int lastnumber=number%10;
    number=number/10;
    sum= sum+ lastnumber;
}
    System.out.println(sum);
}
}