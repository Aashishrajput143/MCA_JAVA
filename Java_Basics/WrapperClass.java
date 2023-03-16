public class WrapperClass {
    public static void main(String[] args) {
        // Wrapper - Wraps primitive data types/ Encapsulate primitive
        //Boxing - convert primitive data types to object
        int x = 12;
        //x. No method
        Integer x1 = 13;
        //x. it has method
        // Auto Boxing
        int y = x1;//Unboxing
        Integer y1 = y;//Boxing
        //Types of Type Casting
        //(type conversion - Compiler is handling) Widening - Automatically - Smaller data type to larger data type 
        //(type casting - Developer is handling) Narrowing - Manually - larger data type to smaller data type
        double a = 4.5;
        int b = (int)a;//Type Casting in java, narrowing- it manually operates
        
        double c = 5;//Type Casting in java, Widening- it automatically operates
    }
}
