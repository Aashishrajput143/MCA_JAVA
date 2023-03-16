public class RefDemo {
    public static void main(String[] args) {
        //String name = "Aashish";//name has Aashish reference
        //String name3 = name;//name3 has same Reference
        //String name2 = "Chauhan";
        //System.out.println(name==name3);
        //String a = "Amit";//String Literal(1 object)
        String a = "Amit".intern();//when u write String a="Amit";//Internally it use intern()
        //First check in a String Pool that String is exist or not
        //if string is not exist so create a new string object in a pool and point to it.
        //otherwise point the existing one.
        String b = "Amit";//(0 object)
        //String c = new String("Amit");
        String c = new String("Amit").intern();//it create inside the pool

        System.out.println(a==b);//true (a and b point to the same string in a pool)
        //System.out.println(a==c);//false (a is in the pool and c outside the pool)
        System.out.println(a==c);//if we use intern() it will give true. 
        //new  always create a new memory
        //new is a keyword

        //if we want to compare the value
        // equals is the pre defines function
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
    }
}
