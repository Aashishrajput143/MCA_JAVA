public class PatternP3 {
    public static void main(String[] args) {
        // *********
        // -*******
        // --*****
        // ---***
        // ----*
        int n =8;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <((n*2)-(2*i-1)); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("========================================");

        // *********
        // -*-----*
        // --*---*
        // ---*-*
        // ----*
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <=(n*2-(2*i-1)); k++) {
                //i == 1 - first row
                // k==1 - first col
                // k==(n*2-(2*i-1)) - last col
                if(i==1 || k==1 || k==(n*2-(2*i-1))){
                    System.out.print("*");
                }
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("========================================");
    }
}
