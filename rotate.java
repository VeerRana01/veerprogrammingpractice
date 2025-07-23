public class rotate {
    public static void main(String args[]){
        int num=12345;
        int rotation=2;
        int count=0;
        int pow=(int)Math.pow(10,rotation);
        int lhs=num/pow;
        int rhs=num%pow;
        while(num!=0){
            count++;
            num/=10;
        }
            int pow2=(int)Math.pow(10,count-rotation);
            int result=rhs*pow2 +lhs;
            System.out.println(result);
    }
}
