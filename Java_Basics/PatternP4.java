public class PatternP4 {
    public static void main(String[] args) {
        // **********
        // ****--****
        // ***----***
        // **------**
        // *--------*
        // **------**
        // ***----***
        // ****--****
        // **********
        int n = 10;
        // Upper half
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) { 
                System.out.print("*");
            }
            for (int k = 1; k <= 2*i; k++) {
                System.out.print(" ");
            }
            for (int l = 0; l < n-i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower half
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 2*i; j < 2*n - 2; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
