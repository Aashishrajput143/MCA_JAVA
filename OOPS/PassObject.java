import java.util.Date;
import java.util.Scanner;
class Message{
    String id;
    String msg;
    Date date;
}
class view{
    void doLogin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your ID : ");
        String id = scanner.nextLine();

        System.out.println("Enter the password : ");
        String pwd = scanner.nextLine();

        DB db = new DB();
        //String msg = db.checkLogin(id, pwd);
       Message msg = db.checkLogin(id, pwd);
       //System.out.println(msg);
       System.out.println(msg.msg);
       System.out.println(msg.id);
       System.out.println(msg.date);

        scanner.close();
    }
    class DB{
        Message checkLogin(String id, String pwd){
            //String msg = "";
            Message msg = new Message();
            if(id.equals(pwd)){
                msg.msg = "Login Success";
            }
            else
                msg.msg = "Login Failed";
            msg.id = id;
            msg.date = new Date();
            return msg;
        }
    }
}
public class PassObject {
    public static void main(String[] args) {
        view vi = new view();
        vi.doLogin();
    }
}
