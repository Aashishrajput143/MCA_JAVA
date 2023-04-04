class SimpleUser{

}
class PrimeUser extends SimpleUser{

}
class SimpleLogin{
    SimpleUser show(){
        SimpleUser obj = new SimpleUser();
        return obj;
    }
}
class primeLogin extends SimpleLogin{
    @Override// due to inheritance, you can change datatype of the method and it would be override
    PrimeUser show(){
        PrimeUser obj = new PrimeUser();
        return obj;
    }
}
public class CovarientReturnType {
    public static void main(String[] args) {
        
    }
}
