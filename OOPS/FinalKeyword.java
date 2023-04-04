//final class - cannot be inherited
//so that no one can access the class and modify any methods
// final class A{

// }
class A{
    // final method - metjhods cannot be overrided
    final void login(){
        System.out.println("Login function");
    }
}
class B extends A{
    // @Override
    // void login(){
    //     System.out.println("Login function");
    // }
}
public class FinalKeyword {
    public static void main(String[] args) {
        //final variable - no one can the value of the variable
        // it becomes constant or freeze
        final double pi = 3.14;
        //pi=5454.45;
    }
}
