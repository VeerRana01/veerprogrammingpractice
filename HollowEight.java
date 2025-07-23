public class HollowEight {
    public static void main(String args[]){
        int size=8;
        for(int i=1;i<=size*2;i++){
            for(int j=1;j<=size;j++){
                if((i==1||i==size||i==(size*2)-1)&&(j==1||j==size)){
                    System.out.print(" ");
                }
                else if(i==1||i==size||i==(size*2)-1||j==1||j==size){
                   System.out.print("*"); 
                }
                else{
                   System.out.println(" ");  
                }
            }
        }
    }
}
