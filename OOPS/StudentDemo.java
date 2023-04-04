// OOPs
// Class and Object

// Class:-
// - Blueprint / Template / Structure

// Object:-
// - instance of a class 
// - has some unique characterstics and features

// S.O.L.I.D
// SRP :- Single Responsiblity Principle
// DRY :- Dont repeat yourself

// Encapsulation :- Binding of data and method od single unit known as class
class Student {
    // Instance variable
    int roll;
    String name;
    String course;
    double fees;
    String collegename;
    // Student stu = new Student();

    void takeinput(int roll, String name, String course, double fees, String collegename) { 
        // this.Instance variable = local variable
        this.roll = roll;
        this.name = name;
        this.course = course;
        this.fees = fees;
        this.collegename = collegename;
    }

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
}

public class StudentDemo {
    public static void main(String[] args) {
        Student ram = new Student();
        // datatype , reference variable/object , allocates new memory for object ,
        // Constructor
        // ram.stu.fees;

        // ram.roll = 21;
        // ram.name = "Aashish";
        // ram.course = "MCA";
        // ram.fees = 20000;
        // ram.collegename = "DIT";

        ram.takeinput(21, "Aashish", "MCA", 200000, "DIT");

        ram.showDetails();

        // System.out.println("roll "+ram.roll);
        // System.out.println("name "+ram.name);
        // System.out.println("course "+ram.course);
        // System.out.println("fees "+ram.fees);
        // System.out.println("collegename "+ram.collegename);

        Student shyam = new Student();

        // shyam.roll = 21;
        // shyam.name = "shyam";
        // shyam.course = "MCA";
        // shyam.fees = 50000;
        // shyam.collegename = "DIT";
        System.out.println("----------------------------------------------------");
        shyam.takeinput(21, "Shyam", "MCA", 500000, "DIT");

        shyam.showDetails();
        // System.out.println("roll "+shyam.roll);
        // System.out.println("name "+shyam.name);
        // System.out.println("course "+shyam.course);
        // System.out.println("fees "+shyam.fees);
        // System.out.println("collegename "+shyam.collegename);
    }
}
