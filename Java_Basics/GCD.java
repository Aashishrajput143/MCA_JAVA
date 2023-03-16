//HCF
public class GCD {
    public static void main(String[] args) {
        int x = 28 , y = 16;
        //int min = 0;
        //if(x<y){
        //    min = x;
        //}
        //else
        //min = y;
        /* int min = x<y?x:y;
        for(int i = min;i>0;i--){
            if(x%i==0 && y%i==0){
                System.out.println("GCD is "+i);
                break;
            }
        } */
        int itrr=0;
        while(x!=y){
            if(x>y){
                x = x-y;
            }else
            y = y-x; 
            itrr++;     
        }
        System.out.println("GCD is "+x);
        System.out.println(itrr);
    }
}
