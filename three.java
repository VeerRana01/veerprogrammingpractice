class single
{
    int x;
    void getx()
    {
        x=100;
        System.out.println("the value of x"+x);
    }
}
class two extends single
{
    int y,total;
    void gety()
    {
        y=290;
        System.out.println("The value of y"+y);
    }
    void sum()
    {
        total=x+y;
        System.out.println("the addition is"+total);
    }
}
public class three 
{
public static void main(String[] args) {
    two obj=new two();
    obj.getx();
    obj.gety();
    obj.sum();
}    
}
