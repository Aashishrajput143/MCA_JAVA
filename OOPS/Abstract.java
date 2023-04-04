abstract class Loan{
    void ApplyForLoan(){
        System.out.println("Loan");
    }
    abstract void emi();
}
class HomeLoan extends Loan{
    double interest = 10.0;
    @Override
    void emi(){

    }
}
class EduLoan extends Loan{
    double interest = 11.5;
    @Override
    void emi(){
        
    }
}
class PersonalLoan extends Loan{
    double interest = 8.5;
    @Override
    void emi(){
        
    }
}
//class AutoLoan extends Loan{

//}
public class Abstract {
    public static void main(String[] args) {
        //Loan L = new Loan();
    }
}
