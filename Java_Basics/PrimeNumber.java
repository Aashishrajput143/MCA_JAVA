public class PrimeNumber {
    public static void main(String[] args) {
        int num = 997;
        boolean isPrime = true;
        int ittr = 0;
        //for(int i=2;i<num;i++){
        //    ittr++;
        //    if(num %i==0){
        //        isPrime = false;
        //        break;
        //    }
        //}

        //for(int i=2;i<num/2;i++){
        //    ittr++;
        //    if(num %i==0){
        //        isPrime = false;
        //        break;
        //    }
        //}

        for(int i=2;i*i<num;i++){
            ittr++;
            if(num %i==0){
                isPrime = false;
                break;
            }
        }
        System.out.println(ittr);
        if(isPrime){
            System.out.println("Number is Prime");
        }
        else
        System.out.println("Number is Not Prime"); 
    }
}
