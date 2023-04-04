public class TypePromotion{
    void show(byte x){
        System.out.println("Byte");
    }
    // void show(int x){
    //     System.out.println("Int");
    // }
    // void show(float x){
    //     System.out.println("Float");
    // }
    void show(short x){
        System.out.println("Short");
    }
    // void show(long x){
    //     System.out.println("Long");
    // }
    // void show(Integer x){
    //     System.out.println("Integer Wrapper");
    // }
    void show(Float x){
        System.out.println("Float Wrapper");
    }
    void show(int ...x){
        System.out.println("Vars Args...");
    }

    public static void main(String[] args) {
        TypePromotion obj = new TypePromotion();
        //obj.show(23);// call int by default
        obj.show(23,25,48,5,6,956);
        obj.show((byte)23);
        obj.show((short)23);
        // int then long then Float then Integer Wrapper then Vars Args...
    }
}