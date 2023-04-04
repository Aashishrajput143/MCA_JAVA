import java.util.ArrayList;

//SAM- single Abstract method- Functional Interface
@FunctionalInterface
interface Calc {
    int add(int x, int y);
}

// interface Calc{
// int add(int x, int y);
// int sub(int x, int y);
// }

// class way
// class MYCalc implements Calc{
// @Override
// public int add(int x,int y){
// return x+y;
// }
// }
//
public class InterfaceUseWays {
    public static void main(String[] args) {
        // Anonymous class
        // generate extra byte code
        // Calc obj = new Calc() {

        // @Override
        // public int add(int x, int y) {
        // return x+y;
        // }

        // @Override
        // public int sub(int x, int y) {
        // return x-y;
        // }

        // };
        // System.out.println(obj.add(20,30));
        // System.out.println(obj.sub(30,20));

            // Lambda Expression
            // (a,b) - arguments
            // a + b - return statement
            // Generally we can use Lambda Expression with Functional Interface
        Calc c = (a,b) -> a+b;
        System.out.println(c.add(12,25));

        Calc c1 = (a,b) -> {
            System.out.println("Inside Add....");
            return a+b;
        };
        System.out.println(c1.add(10,25));

        ArrayList<String> list = new ArrayList<>();
        list.add("Ram");
        list.add("Shyam");
        list.add("Gopal");

        list.forEach(name ->{
            System.out.println(name);
        });
    }
}
