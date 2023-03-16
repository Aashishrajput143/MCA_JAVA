public class ArmStrong {
    public static void main(String[] args) {
        int num = 153;
        int temp = num;
        int rem = 0;
        int sum = 0;
        while(num>0){
            rem = num % 10;
            num = num / 10;
            sum = sum + (rem*rem*rem);
        }
        if(temp == sum){
            System.out.println("Number is ArmStrong");
        }
        else
        System.out.println("Not ArmStrong");
    }
}
