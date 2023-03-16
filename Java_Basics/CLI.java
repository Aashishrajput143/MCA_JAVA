public class CLI {
    public static void main(String[] args) {
        //String name = args[0];
        //System.out.println("Name is " + name);
        // PS E:\Technical Training\MCA_JAVA> javac CLI.java
        // PS E:\Technical Training\MCA_JAVA> java CLI Aashish
        // Name is Aashish
        // int fs = (int)args[0]; Not allowed here
        int fs = Integer.parseInt(args[0]);
        int fa = Integer.parseInt(args[1]);
        int result = fs+fa;
        System.out.println("Result = "+result);
        //PS E:\Technical Training\MCA_JAVA> javac CLI.java         
        //PS E:\Technical Training\MCA_JAVA> java CLI 20 30   
        //Result = 50
    }
}
