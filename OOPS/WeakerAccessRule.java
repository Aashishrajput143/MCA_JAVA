//public > protected > default > private
// low to high
// high to low not
class A1{
    protected void show(){
        System.out.println("A1");
    }
}
class B1 extends A1{
    @Override
    public void show(){

    }
}
public class WeakerAccessRule {
    public static void main(String[] args) {
        
    }
}
