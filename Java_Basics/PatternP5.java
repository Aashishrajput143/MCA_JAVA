public class PatternP5 {
    public static void main(String[] args) {
        //    ****
        //   ***
        //  **
        // *
        // *
        //  **
        //   ***
        //    ****
        int n = 4;
        // Upper half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) { 
                System.out.print(" ");
            }
            for (int k = i; k <= n; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower half
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i; j++) { 
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*"); 
            }
            System.out.println();
        }
    }
}
