public class LCM {
    public static void main(String[] args) {
        int x = 28 , y = 16;
        //int a = x , b = y;
        // LCM = (x * y) / HCF or GCD 
        int max = x>y?x:y;
        for(int i = max;i>0;++i){
            if(i%x==0 && i%y==0){
                System.out.println("LCM is "+i);
                break;
            }
        }
        /* while(x!=y){
            if(x>y){
                x = x-y;
            }else
            y = y-x; 
        }
        int GCD = x;
        int LCM = (a * b) / GCD ;
        System.out.println("LCM is "+LCM); */
    }
}
