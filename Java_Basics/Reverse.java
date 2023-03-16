public class Reverse {
    public static void main(String[] args) {
        int num = 12345;
        int temp = num;
        int rev = 0;
        int rem = 0;
        while(num>0){
            rem = num % 10;
            num = num / 10;
            rev = rev*10 + rem;
        }
        System.out.println("Number is "+temp +" and reverse of the number is "+ rev);
    }
}
