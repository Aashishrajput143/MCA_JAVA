public class PatternP6 {
    public static void main(String[] args) {
        // ****
        //   ***
        //     **
        //       *
        //       *
        //     **
        //   ***
        // ****
        int n = 4;
        // Upper half
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= 2*i-2; j++) { 
                System.out.print(" ");
            }
            for (int k = i; k <= n; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (2*n-(2*i)); j++) { 
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
