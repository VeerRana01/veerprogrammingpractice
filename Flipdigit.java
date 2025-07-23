public class Flipdigit {

    public static void main(String args[]){
        int num=32145;
        int position=0;
        int sum=0;
        while(num !=0){
            int singledigit=num%10;//5
            position++;//1
            int pow=(int)Math.pow(10,singledigit-1);//10^4
            sum=sum+position*pow;//10^4
            num=num/10;
        }
        System.out.println(sum);
    }
}
