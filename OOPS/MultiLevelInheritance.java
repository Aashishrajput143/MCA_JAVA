class GrandFather{
    int x = 10;
}
class Father extends GrandFather{
    int x = 20;
}
class Son extends Father{
    int x = 30;
    public Son(int x){
        System.out.println("GrandFather : "+((GrandFather)(this)).x);
        System.out.println("Father : "+super.x);
        System.out.println("Son : "+this.x);
        System.out.println("Local Variable : "+x);

        int total = x+this.x+super.x+((GrandFather)(this)).x;
        System.out.println("total : "+total);
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args) {
        Son obj = new Son(50);
    }
}
