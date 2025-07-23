class shape
{
    public void display()
    {
        System.out.println("Welcome to devraj house");
    }
}
class rectangle extends shape
{
    public void area()
    {
        System.out.println("Devraj is a bad boy");
    }
}
class cube extends rectangle{
    public void volume()
    {
        System.out.println("Devraj is very talkitive");
    }
}
public class ilit 
{
public static void main(String args[])
{
    cube obj=new cube();
    obj.display();
    obj.area();
    obj.volume();
}    
}
