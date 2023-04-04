public class StudentDetails {
    int roll;
    String name;
    String course;
    double fees;
    String collegename;

    // void takeinput(int roll, String name, String course, double fees, String
    // collegename) {
    // // this.Instance variable = local variable
    // this.roll = roll;
    // this.name = name;
    // this.course = course;
    // this.fees = fees;
    // this.collegename = collegename;
    // }

    void showDetails() {
        // java internally use this
        // this.roll
        // this.name
        // optional
        // this - it is used to refer current object
        System.out.println("roll " + this.roll);
        System.out.println("name " + name);
        System.out.println("course " + course);
        System.out.println("fees " + this.fees);
        System.out.println("collegename " + collegename);
    }

    // Default Constructor
    // Constructor :-
    // - it is called when we create an object of a class
    // need :-
    // - it is used to initialize instance varibles

    // Default Constructor
    public StudentDetails() {
        this.collegename = "DIT";
    }

    // Parameterized Constructor
    public StudentDetails(int roll, String name, String course, double fees) {
        // Constructor Chaining
        this(); // It call default Constructor
        this.roll = roll;
        this.name = name;
        this.course = course;
        this.fees = fees;
    }
}
