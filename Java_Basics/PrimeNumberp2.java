public class PrimeNumberp2 {
    public static void main(String[] args) {
        int num = 997;
        //2     8       14      20
        //3     9       15      21
        //4     10      16      22
        //5,7   11,13   17,19   23,25
        //6     12      18      24
        boolean isPrime = true;
        if(num % 2 == 0 || num % 3 == 0){
            isPrime = false;
        }
        int ittr = 0;
        for(int i = 5;i*i<=num;i+=6){
            if(num % i == 0 || num % (i+2) == 0){
                isPrime = false;
                break;
            }
            ittr++;
        }
        System.out.println(ittr);
        if(isPrime){
            System.out.println("Number is Prime");
        }
        else
        System.out.println("Number is Not Prime");
    }
}
