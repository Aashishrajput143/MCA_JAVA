interface Iplayer{
    void walk();// public abstract void walk
    void run();
    void jump();
    void kick();
    void punch();
}
abstract class CommonUtils implements Iplayer{
    @Override
    public void walk(){
        System.out.println("Walk");
    }
    @Override
    public void run(){
        System.out.println("run");
    }
    @Override
    public void jump(){
        System.out.println("jump");
    }
}
class King extends CommonUtils implements Iplayer{
    @Override
    public void kick(){
        System.out.println("kick");
    }
    @Override
    public void punch(){
        System.out.println("punch");
    }
}
class Pawl extends CommonUtils implements Iplayer{
    @Override
    public void kick(){
        System.out.println("kick");
    }
    @Override
    public void punch(){
        System.out.println("punch");
    }
}
// class Pawl implements Iplayer{
//     @Override
//     public void walk(){
//         System.out.println("Walk");
//     }
//     @Override
//     public void run(){
//         System.out.println("run");
//     }
//     @Override
//     public void jump(){
//         System.out.println("jump");
//     }
//     @Override
//     public void kick(){
//         System.out.println("kick");
//     }
//     @Override
//     public void punch(){
//         System.out.println("punch");
//     }
// }
public class Interface {

    public static void main(String[] args) {
        King k = new King();
        k.run();
        Iplayer pl = new Pawl();
        pl.jump();
    }
}
