class p1{
    int x;
    p1(){
        x=10;
        System.out.println("P1 default constructor");
    }
}
class c1 extends p1{
    int x;
    c1(){
        super();// internally java has written super 
        System.out.println("C1 default constructor");
        x=20;
    }
    c1(int x){
        //local variable + instance variable + parent class variable
        int total = x+this.x+super.x;
        System.out.println("Total : "+total);
    }
}
public class SuperVsThis{
    public static void main(String[] args) {
        c1 obj = new c1(50);
    }
}