class Account{
    int acc_no;
    String Name;
    double Balance;
    void withdraw(){
        System.out.println("Limit to withdraw is 50k");
    }
    void deposit(){
        System.out.println("Limit of deposit is 1 lakh");
    }
}
class Saving_Account extends Account{
    void roi(){
        System.out.println("ROI on saving Account is 5%");
    }
    @Override
    void withdraw(){
        System.out.println("Limit to withdraw for SA is 1 Lakh");
    }
}
class Current_Account extends Account{
    void odLimit(){
        System.out.println("odLimit on current Account is 50k");
    }
    @Override
    void deposit(){
        System.out.println("Limit of deposit for CA is 3 lakh");
    }
}
public class ISA_Relation {
    //polymorphic form
    void caller(Account acc){
        acc.deposit();
        acc.withdraw();
        //Downcasting
        if(acc instanceof Saving_Account){
            Saving_Account sa = (Saving_Account)acc;
            sa.roi();
        }
        else if(acc instanceof Current_Account){
            Current_Account ca = (Current_Account)acc;
            ca.odLimit();
        }
    }
    
    public static void main(String[] args) {
        // Saving_Account sa = new Saving_Account();
        // sa.withdraw();// will call saving account withdraw()
        // sa.deposit();// will call account deposit()
        // sa.roi();// will call saving roi()

        // Current_Account ca = new Current_Account();
        // ca.deposit();//will call current account deposit()
        // ca.withdraw();// will call account withdraw()
        // ca.odLimit();// will call current odLimit()

        // we are still creating the object of saving_account class (Child class)
        // but the type of the object is Account class (parent class)
        //Upcasting 
        // now we can only access those methods which are defined inside parent class or we can access overrided methods
        // Account acc = new Saving_Account();
        // acc.withdraw();// will call saving account withdraw()
        // acc.deposit();// will call account deposit()
        //acc.roi();// will call saving roi()

        // acc = new Current_Account();
        // acc.deposit();//will accll current account deposit()
        // acc.withdraw();// will call account withdraw()
        //acc.odLimit();// will call current odLimit()

        ISA_Relation obj = new ISA_Relation();
        obj.caller(new Saving_Account());// for saving account withdraw and deposit method
        obj.caller(new Current_Account());// for current account withdraw and deposit method
        obj.caller(new Account());// for Account withdraw and depsoit method
    }
}
