public strictfp class VarConstant {
    // public static strictfp void main(String[] args) {
    public static void main(String[] args) {
        int firstNumber = 10; // camelCase
        int secondNumber = 20;
        int result = firstNumber + secondNumber;// int + int(Addition)
        System.out.println("Sum is " + result);// String + int(Concate)
        double x = 10.20;
        float y = 100.20f;// float Literal
        float z = 100.20F;
        float t = (float) 100.20;// Typecast
        byte e = 100; // -128 to 127
        e = (byte) 130;// forcefully so 130-127=3, -128_1, -127_2, -126_3
        System.out.println(e);
        long t2 = 1000000L;// 1000000l; long literal
        char w = 'A';
        char w2 = 'न';
        System.out.println(w2);

        String message = "सुबह की महिमा";// collection of chars
        System.out.println(message);
        boolean att = true;
        String message2 = "           ";
        System.out.println(message2.length());
        char p = 65;
        System.out.println(p);
        int tt = 'A';// ascii code
        System.out.println(tt);

        /*
         * C:\Users\Asus>jshell
         * | Welcome to JShell -- Version 19.0.1
         * | For an introduction type: /help intro
         * 
         * jshell> int x = 10;
         * x ==> 10
         * 
         * jshell> x+2;
         * $2 ==> 12
         * 
         * jshell> x;
         * x ==> 10
         * 
         * jshell> x = x+2;
         * x ==> 12
         *
         * 
         * jshell> byte x = 129;
         * | Error:
         * | incompatible types: possible lossy conversion from int to byte
         * | byte x = 129;
         * | ^-^
         * 
         * jshell> int x = 4632165461561564654165;
         * | Error:
         * | integer number too large
         * | int x = 4632165461561564654165;
         * | ^
         * 
         * jshell> byte x = 127;
         * x ==> 127
         * 
         * jshell> x++
         * $2 ==> 127
         * 
         * jshell> x
         * x ==> -128
         * 
         * jshell>
         */
    }
}
