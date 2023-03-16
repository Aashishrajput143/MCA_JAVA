enum Language{
    English,Hindi
}
public class SwitchCase {
    public static void main(String[] args) {
        // System.out.println("Enter your Choice: ");
        // System.out.println("Press 1 for English");
        // System.out.println("Press 2 for Hindi");
        // int Choice = 1;
        // switch (Choice) {
        //     case 1:
        //         System.out.println("You choose English");
        //         break;
        //     case 2:
        //         System.out.println("You choose Hindi");
        //         break;
        //     default:
        //         System.out.println("enter valid choice");
        //         break;
        // }

        System.out.println("Enter your Choice: ");
        System.out.println("Press 1 for English");
        System.out.println("Press 2 for Hindi");
        Language Choice = Language.English; 
        String en = "en";
        switch (en) {
            case "en":
                System.out.println("You choose en");
                break;
        
            default:
            System.out.println("enter valid choice");
                break;
        }
        switch (Choice) {
            case English:
                System.out.println("You choose English");
                break;
            case Hindi:
                System.out.println("You choose Hindi");
                break;
            default:
                System.out.println("enter valid choice");
                break;
        }
    }
}
