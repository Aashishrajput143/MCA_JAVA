public class PatternP1 {
    public static void main(String[] args) {
        // *****
        for (int i = 0; i < 5; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println("========================================");

        // *****
        // *****
        // *****
        // *****
        // *****
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("========================================");

        // *
        // **
        // ***
        // ****
        // *****
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("========================================");

        // *****
        // ****
        // ***
        // **
        // *
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("========================================");

        // *****
        // ****
        // ***
        // **
        // *

        // i=0 5-0=5 *****
        // i=1 5-1=4 ****
        // i=2 5-2=3 ***
        // i=3 5-3=2 **
        // i=4 5-4=1 *

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("========================================");

        // ----*
        // ---**
        // --***
        // -****
        // *****
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("========================================");

        // *****
        // -****
        // --***
        // ---**
        // ----*
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 5-i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("========================================");

        // **********
        // ****--****
        // ***----***
        // **------**
        // *--------*
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("  ");
            }
            for (int l = 0; l < 5-i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
