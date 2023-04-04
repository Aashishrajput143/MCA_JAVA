interface Iplayer{
    //void walk();// public abstract void walk
    //void run();
    //void jump();
    void kick();
    void punch();
    // static void walk(){

    //}
    default void walk(){
        System.out.println("walk");
    }
    default void run(){
        System.out.println("run");
    }
    default void jump(){
        System.out.println("jump");
    }
}
class King implements Iplayer{
    @Override
    public void kick(){
        System.out.println("kick");
    }
    @Override
    public void punch(){
        System.out.println("punch");
    }
}
class Pawl implements Iplayer{
    @Override
    public void kick(){
        System.out.println("kick");
    }
    @Override
    public void punch(){
        System.out.println("punch");
    }
}
public class Interface2 {
    public static void main(String[] args) {
        King k = new King();
        k.run();
        Iplayer pl = new Pawl();
        pl.jump();
    }
}
