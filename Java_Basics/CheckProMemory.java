import java.util.ArrayList;
public class CheckProMemory{
    public static void main(String[] args) throws Exception {
        //String arr[] = new String[100000000];//Fixed Size array
        //Dynamic Array
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Program Runs......");
        while(true){
        String a = new String("Hello");
        list.add(a);
        Thread.sleep(50);//Sleep Program
        }
    }
}